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

package org.eclipse.papyrus.sysml16.diagram.parametric.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.diagram.common.util.GraphicalSysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.diagram.parametric.Activator;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * The command which allow to create a constraint block parameter.
 */
public class ConstraintBlockParameterCreationCommand extends AbstractCommand {

	/**
	 * The graphical target edit part where add the created constraint block parameter.
	 */
	protected IGraphicalEditPart targetEditPart;

	/**
	 * The container of the constraint block parameter to create.
	 */
	protected EObject targetElement;

	/**
	 * The type element of the constraint block parameter to create.
	 */
	protected EObject typeElement;

	/**
	 * The location point where add the block constraint parameter.
	 */
	protected Point point;

	/**
	 * The property creation command.
	 */
	protected CreateElementCommand propertyCreationCommand;

	/**
	 * Constructor.
	 *
	 * @param label
	 *            The operation label, should never be <code>null</code>.
	 * @param typeElement
	 *            The type element of the constraint block parameter to create.
	 * @param targetEditPart
	 *            The graphical target edit part where add the created constraint block parameter.
	 * @param targetElement
	 *            The container of the constraint block parameter to create.
	 * @param point
	 *            The location point where add the block constraint parameter.
	 */
	public ConstraintBlockParameterCreationCommand(final String label, final IGraphicalEditPart targetEditPart, final EObject targetElement, final EObject typeElement, final Point point) {
		super(label);
		this.targetEditPart = targetEditPart;
		this.targetElement = targetElement;
		this.typeElement = typeElement;
		this.point = point;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.common.core.command.AbstractCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(final IProgressMonitor progressMonitor, final IAdaptable info) throws ExecutionException {
		// Create the parameter corresponding to the ConstraintBlock
		final CreateElementRequest createPropertyCommand = new CreateElementRequest(targetElement, UMLElementTypes.PROPERTY);
		propertyCreationCommand = new CreateElementCommand(createPropertyCommand);
		propertyCreationCommand.execute(progressMonitor, info);

		CommandResult commandResult = propertyCreationCommand.getCommandResult();
		if (commandResult != null && commandResult.getStatus().isOK()) {
			// Set the parameter type with ConstraintBlock
			final EObject createdProperty = propertyCreationCommand.getNewElement();
			createdProperty.eSet(UMLPackage.eINSTANCE.getTypedElement_Type(), typeElement);

			final ISpecializationType type = (ISpecializationType) ElementTypeRegistry.getInstance().getType(GraphicalSysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINT_PROPERTY_COMPOSITE);

			// Create the node corresponding to the parameter
			final View notationView = targetEditPart.getNotationView();
			String semanticHint = ((IHintedType) type).getSemanticHint();
			Node node = ViewService.createNode(notationView, createdProperty, semanticHint, ((GraphicalEditPart) targetEditPart).getDiagramPreferencesHint());

			if (node == null) {
				Activator.log(IStatus.WARNING, "Impossible to create the view " + semanticHint);//$NON-NLS-1$
			} else {
				if (point != null && node.getLayoutConstraint() instanceof Bounds) {
					IFigure parentFigure = targetEditPart.getFigure().getParent();
					while (null != parentFigure) {
						point.translate(-(parentFigure.getBounds().x + parentFigure.getInsets().left), -(parentFigure.getBounds().y + parentFigure.getInsets().top));
						parentFigure = parentFigure.getParent();
					}
					((Bounds) node.getLayoutConstraint()).setX(point.x);
					((Bounds) node.getLayoutConstraint()).setY(point.y);
				}
			}
		}
		return commandResult;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.common.core.command.AbstractCommand#doRedoWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doRedoWithResult(final IProgressMonitor progressMonitor, final IAdaptable info) throws ExecutionException {
		if (propertyCreationCommand != null && propertyCreationCommand.canRedo()) {
			propertyCreationCommand.redo(progressMonitor, info);
		}
		return CommandResult.newOKCommandResult();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.common.core.command.AbstractCommand#doUndoWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doUndoWithResult(final IProgressMonitor progressMonitor, final IAdaptable info) throws ExecutionException {
		if (propertyCreationCommand != null && propertyCreationCommand.canUndo()) {
			propertyCreationCommand.undo(progressMonitor, info);
		}
		return CommandResult.newOKCommandResult();
	}

}
