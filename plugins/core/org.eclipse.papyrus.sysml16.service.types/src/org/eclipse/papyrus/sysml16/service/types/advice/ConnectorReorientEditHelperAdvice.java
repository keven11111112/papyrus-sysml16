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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.service.types.command.UpdateNestedPathConnectorEnd;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.service.types.utils.RequestParameterUtils;
import org.eclipse.uml2.uml.Connector;

/**
 * 8.3.2.3 Block
 * the service edit must implement the following constraints
 * isEncapsulated: Boolean [0..1]
 * If true, then the block is treated as a black box; a part typed by this black box can only be connected via its ports or
 * directly to its outer boundary. If false, or if a value is not present, then connections can be established to elements of
 * its internal structure via deep-nested connector ends.
 */
public class ConnectorReorientEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * Update the nested path from the NestedConnectorEnd stereotype
	 * ( Remove the stereotype if the new nested path is empty)
	 * 
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterReorientRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getAfterReorientRelationshipCommand(final ReorientRelationshipRequest request) {
		ICommand defaultCommand = super.getAfterReorientRelationshipCommand(request);
		Connector connector = (Connector) request.getRelationship();
		// Restrict action to SysML Connector (meaning owned by Block)
		EObject eContainer = connector.eContainer();
		if (((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_BLOCK)).getMatcher().matches(eContainer)
				|| ((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK)).getMatcher().matches(eContainer)) {
			View reconnectedEndView = RequestParameterUtils.getReconnectedEndView(request);
			if (reconnectedEndView != null) {
				boolean isSourceReorientation = request.getDirection() == ReorientRequest.REORIENT_SOURCE;
				UpdateNestedPathConnectorEnd updateNestedPathConnectorEndSource = new UpdateNestedPathConnectorEnd("UpdateNestedPathConnectorEnd Reconnected End", reconnectedEndView, request, isSourceReorientation);
				defaultCommand = CompositeCommand.compose(defaultCommand, updateNestedPathConnectorEndSource);
			}
		}
		return defaultCommand;
	}

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 *      After a re-configuration update the NestedPathConnectorEnd
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		ICommand defaultCommand = super.getAfterConfigureCommand(request);
		View sourceView = RequestParameterUtils.getSourceView(request);
		View targetView = RequestParameterUtils.getTargetView(request);
		if (request.getElementToConfigure() instanceof Connector) {
			Connector connector = (Connector) request.getElementToConfigure();
			EObject eContainer = connector.eContainer();
			if (((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_BLOCK)).getMatcher().matches(eContainer)
					|| ((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK)).getMatcher().matches(eContainer)) {
				if (sourceView != null) {
					UpdateNestedPathConnectorEnd updateNestedPathConnectorEndSource = new UpdateNestedPathConnectorEnd("UpdateNestedPathConnectorEnd Source", sourceView, request, true);
					defaultCommand = CompositeCommand.compose(defaultCommand, updateNestedPathConnectorEndSource);
				}
				if (targetView != null) {
					UpdateNestedPathConnectorEnd updateNestedPathConnectorEndTarget = new UpdateNestedPathConnectorEnd("UpdateNestedPathConnectorEnd Target", targetView, request, false);
					defaultCommand = CompositeCommand.compose(defaultCommand, updateNestedPathConnectorEndTarget);
				}
			}
		}
		return defaultCommand;
	}

}
