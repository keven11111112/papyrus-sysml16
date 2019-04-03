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

package org.eclipse.papyrus.sysml16.diagram.parametric.dnd;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.papyrus.infra.gmfdiag.dnd.strategy.ExpansionElementDropStrategy;
import org.eclipse.papyrus.sysml16.diagram.common.util.GraphicalSysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * This strategy is a specialization in order to be able to drop Parameter inside Parameter Property.
 * this code is link to the parametric because the parameter as border item is only display in the parametric Diagram.
 */
public class ParameterDropStrategy extends ExpansionElementDropStrategy implements IParametricDropStrategy {

	@Override
	public String getCategoryID() {
		return PARAMETRIC_DROP_CATEGORY_ID;
	}

	@Override
	public String getCategoryLabel() {
		return PARAMETRIC_DROP_CATEGORY_LABEL;
	}

	@Override
	public String getLabel() {
		return "Parameter drag and drop";
	}

	@Override
	public String getID() {
		return "org.eclipse.papyrus.sysml16.diagram.parametric.dnd.ParameterDropStrategy"; //$NON-NLS-1$
	}

	@Override
	public String getDescription() {
		return "This strategy is is a specialization in order to be able to drop a Parameter.";
	}


	@Override
	public Command doGetCommand(Request request, final EditPart targetEditPart) {
		if (RequestConstants.REQ_MOVE_CHILDREN.equals(request.getType())) {
			return null;
		}

		CompositeCommand cc = new CompositeCommand(getLabel());
		if (targetEditPart instanceof GraphicalEditPart) {
			IGraphicalEditPart graphicalEditPart = (IGraphicalEditPart) targetEditPart;
			List<EObject> sourceElements = getSourceEObjects(request);
			if (sourceElements.isEmpty()) {
				return null;
			}

			final List<EObject> valuesToAdd = new ArrayList<>(sourceElements.size());
			final ISpecializationType parameterPropertyElementType = (ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTPROPERTY);
			if (null == parameterPropertyElementType) {
				return null;
			}
			// the target must be a Parameter property
			EObject target = graphicalEditPart.resolveSemanticElement();
			if (parameterPropertyElementType.getMatcher().matches(target) && target instanceof Property && ((Property) target).getType() != null) {
				Type targetType = ((Property) target).getType();
				for (EObject sourceElement : sourceElements) {
					if ((sourceElement instanceof Property) && sourceElement.eContainer().equals(targetType)) {
						addCommandDrop(targetEditPart, cc, valuesToAdd, sourceElement, (ISpecializationType) ElementTypeRegistry.getInstance().getType(GraphicalSysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PARAMETER_BORDER_ITEM));
					}
				}
				//
			} else {
				final ISpecializationType constraintBlockElementType = (ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK);
				if (null == constraintBlockElementType) {
					return null;
				}

				if (constraintBlockElementType.getMatcher().matches(target) && targetEditPart.getParent() instanceof GraphicalEditPart) {
					for (final EObject sourceElement : sourceElements) {
						addCommandDrop(targetEditPart.getParent(), cc, valuesToAdd, sourceElement, (ISpecializationType) ElementTypeRegistry.getInstance().getType(GraphicalSysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PARAMETER_BORDER_ITEM));
					}
				}
			}
		}
		return cc.canExecute() ? new ICommandProxy(cc.reduce()) : null;
	}

}
