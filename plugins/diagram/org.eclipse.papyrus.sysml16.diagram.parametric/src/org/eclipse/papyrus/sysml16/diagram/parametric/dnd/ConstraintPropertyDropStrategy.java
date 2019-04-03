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
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeCompartmentEditPart;

/**
 * This strategy is a specialization in order to be able to drop Constraint inside constraint Property
 *
 */
public class ConstraintPropertyDropStrategy extends ExpansionElementDropStrategy implements IParametricDropStrategy {

	private static final int LOWEST_PRIORITY = -1000;
	/**
	 * ID tje internal Structure of a block
	 */
	private static final String INTERNAL_STRUCTURE_ID = ClassCompositeCompartmentEditPart.VISUAL_ID;

	@Override
	public String getCategoryID() {
		return PARAMETRIC_DROP_CATEGORY_ID;
	}

	@Override
	public String getCategoryLabel() {
		return PARAMETRIC_DROP_CATEGORY_LABEL;
	}	
	
	@Override
	public String getID() {
		return "org.eclipse.papyrus.sysml16.diagram.parametric.dnd.ConstraintPropertyDropStrategy";
	}
	
	@Override
	public String getLabel() {
		return "Constraint Property drag and drop inside parametric diagram";
	}

	@Override
	public String getDescription() {
		return "This strategy is is a specialization in order to be able to drop a Constraint Property inside Parametric diagram.";
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.dnd.strategy.ExpansionElementDropStrategy#getPriority()
	 *
	 * @return
	 */
	@Override
	public int getPriority() {
		return LOWEST_PRIORITY;
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
			final ISpecializationType constraintPropertyElementType = (ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTPROPERTY);
			// the target must me a constraint property
			if (INTERNAL_STRUCTURE_ID.equals(graphicalEditPart.getNotationView().getType())) {
				for (EObject sourceElement : sourceElements) {
					if (constraintPropertyElementType.getMatcher().matches(sourceElement)) {
						final ISpecializationType type = (ISpecializationType) ElementTypeRegistry.getInstance().getType(GraphicalSysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINT_PROPERTY_COMPOSITE);
						addCommandDrop(targetEditPart, cc, valuesToAdd, sourceElement, type);
					}

				}
			}
		}
		return cc.canExecute() ? new ICommandProxy(cc.reduce()) : null;
	}





}