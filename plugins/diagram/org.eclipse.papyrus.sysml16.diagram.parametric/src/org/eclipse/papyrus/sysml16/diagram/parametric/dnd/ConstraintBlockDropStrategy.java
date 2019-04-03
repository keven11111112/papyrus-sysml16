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

import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.papyrus.infra.gmfdiag.dnd.strategy.ExpansionElementDropStrategy;
import org.eclipse.papyrus.sysml16.diagram.parametric.command.ConstraintBlockParameterCreationCommand;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeCompartmentEditPart;

/**
 * This strategy is a specialization in order to be able to drop Constraint inside constraint Property
 *
 */
public class ConstraintBlockDropStrategy extends ExpansionElementDropStrategy implements IParametricDropStrategy {

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
		return "org.eclipse.papyrus.sysml16.diagram.parametric.dnd.ConstraintBlockDropStrategy"; //$NON-NLS-1$
	}

	@Override
	public String getLabel() {
		return "Constraint Block drag and drop inside parametric diagram"; //$NON-NLS-1$
	}

	@Override
	public String getDescription() {
		return "This strategy is is a specialization in order to be able to drop a Constraint Block inside Parametric diagram."; //$NON-NLS-1$
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

		final CompositeCommand cc = new CompositeCommand(getLabel());
		if (targetEditPart instanceof GraphicalEditPart) {
			IGraphicalEditPart graphicalEditPart = (IGraphicalEditPart) targetEditPart;
			List<EObject> sourceElements = getSourceEObjects(request);
			if (sourceElements.isEmpty()) {
				return null;
			}

			final ISpecializationType constraintPropertyElementType = (ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK);
			if (INTERNAL_STRUCTURE_ID.equals(graphicalEditPart.getNotationView().getType())) {


				final EObject targetElement = getTargetSemanticElement(targetEditPart);
				for (EObject sourceElement : sourceElements) {
					if (constraintPropertyElementType.getMatcher().matches(sourceElement)) {

						Point dropedPoint = null;
						if (request instanceof DropObjectsRequest) {
							dropedPoint = ((DropObjectsRequest) request).getLocation();
						}

						cc.add(new ConstraintBlockParameterCreationCommand("Create the corresponding constraint block parameter.", graphicalEditPart, targetElement, sourceElement, dropedPoint)); //$NON-NLS-1$
					}

				}
			}
		}
		return cc.canExecute() ? new ICommandProxy(cc.reduce()) : null;
	}





}