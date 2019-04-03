/*****************************************************************************
 * Copyright (c) 2019 CEA LIST, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.sysml16.service.types.advice;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.service.types.command.UpdateNestedPathConnectorEnd;
import org.eclipse.papyrus.sysml16.service.types.util.ConnectorUtil;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.service.types.util.UMLConnectorUtils;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.service.types.utils.RequestParameterUtils;
import org.eclipse.uml2.uml.ConnectableElement;

/**
 * 8.3.2.3 Block
 * the service edit must implement the following constraints
 * isEncapsulated: Boolean [0..1]
 * If true, then the block is treated as a black box; a part typed by this black box can only be connected via its ports or
 * directly to its outer boundary. If false, or if a value is not present, then connections can be established to elements of
 * its internal structure via deep-nested connector ends.
 */
public class ConnectorCreationEditHelperAdvice extends AbstractEditHelperAdvice {

	private UMLConnectorUtils utils = new UMLConnectorUtils();

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getBeforeCreateRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getBeforeCreateRelationshipCommand(CreateRelationshipRequest request) {

		EObject source = request.getSource();
		EObject target = request.getTarget();
		EObject container = request.getContainer();
		View sourceView = RequestParameterUtils.getSourceView(request);
		View targetView = RequestParameterUtils.getTargetView(request);

		// Restrict this advice action to the end of Connector creation gesture (before clicking on target)
		// in order to add SysML specific constraint
		if ((Arrays.asList(request.getElementType().getAllSuperTypes()).contains(UMLElementTypes.CONNECTOR))
				&& (source != null) && (target != null) && (container != null)) {

			// Restrict action to SysML Connector (meaning owned by Block)
			if (((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_BLOCK)).getMatcher().matches(container)
				|| ((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK)).getMatcher().matches(container)) {
				// If the source or target view is enclosed in a structure encapsulated view, forbid creation.
				if (ConnectorUtil.isCrossingEncapsulation(sourceView, targetView)
						|| ConnectorUtil.isCrossingEncapsulation(targetView, sourceView)) {
					return UnexecutableCommand.INSTANCE;
				}
				if (canCreate(source, target, sourceView, targetView)) {
					request.setParameter(org.eclipse.papyrus.uml.service.types.utils.RequestParameterConstants.UML_STRICT, false);
				}
			}
		}
		return super.getBeforeCreateRelationshipCommand(request);
	}

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterCreateRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getAfterCreateRelationshipCommand(CreateRelationshipRequest request) {

		ICommand defaultCommand = super.getAfterCreateRelationshipCommand(request);

		EObject container = request.getContainer();
		View sourceView = RequestParameterUtils.getSourceView(request);
		View targetView = RequestParameterUtils.getTargetView(request);

		// Restrict this advice action to the end of Connector creation gesture (before clicking on target)
		// in order to add SysML specific constraint
		if ((Arrays.asList(request.getElementType().getAllSuperTypes()).contains(UMLElementTypes.CONNECTOR))
				&& (request.getSource() != null) && (request.getTarget() != null) && (container != null)) {
			// Restrict action to SysML Connector (meaning owned by Block)
			if (((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_BLOCK)).getMatcher().matches(container)
					|| ((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK)).getMatcher().matches(container)) {
				UpdateNestedPathConnectorEnd updateNestedPathConnectorEndSource = new UpdateNestedPathConnectorEnd("UpdateNestedPathConnectorEnd Source", sourceView, request, true);
				defaultCommand = CompositeCommand.compose(defaultCommand, updateNestedPathConnectorEndSource);
				UpdateNestedPathConnectorEnd updateNestedPathConnectorEndTarget = new UpdateNestedPathConnectorEnd("UpdateNestedPathConnectorEnd Target", targetView, request, false);
				defaultCommand = CompositeCommand.compose(defaultCommand, updateNestedPathConnectorEndTarget);
			}
		}

		return defaultCommand;
	}
	
	/**
	 * Test if the relationship creation is allowed.
	 *
	 * @param source
	 *            the relationship source can be null
	 * @param target
	 *            the relationship target can be null
	 * @param sourceView
	 *            the relationship graphical source can be null
	 * @param targetView
	 *            the relationship graphical target can be null
	 * @return true if the creation is allowed
	 */
	//FIXME test creation should be done in approve request
	private boolean canCreate(EObject source, EObject target, View sourceView, View targetView) {

		if ((source != null) && !(source instanceof ConnectableElement)) {
			return false;
		}

		if ((target != null) && !(target instanceof ConnectableElement)) {
			return false;
		}

		if ((sourceView != null) && (targetView != null)) {
			// Cannot create a connector from a view representing a Part to its own Port (or the opposite)
			if ((sourceView.getChildren().contains(targetView)) || (targetView.getChildren().contains(sourceView))) {
				return false;
			}

			// Cannot connect a Part to one of its (possibly indirect) containment, must connect to one of its Port.
			if (utils.getStructureContainers(sourceView).contains(targetView) || utils.getStructureContainers(targetView).contains(sourceView)) {
				return false;
			}
		}
		return true;
	}
	
}
