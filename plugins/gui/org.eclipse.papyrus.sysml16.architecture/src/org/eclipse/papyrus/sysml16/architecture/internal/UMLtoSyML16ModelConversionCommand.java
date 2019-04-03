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

package org.eclipse.papyrus.sysml16.architecture.internal;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.IdentityCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.architecture.commands.IModelConversionCommand;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.emf.gmf.util.GMFUnsafe;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.infra.gmfdiag.style.PapyrusDiagramStyle;
import org.eclipse.papyrus.sysml16.architecture.util.SysML16chitectureUtil;

/**
 * Class to allow conversion to SysML 1.6 context.
 */
public class UMLtoSyML16ModelConversionCommand implements IModelConversionCommand {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.architecture.commands.IModelConversionCommand#convertModel(org.eclipse.papyrus.infra.core.resource.ModelSet)
	 */
	@Override
	public void convertModel(final ModelSet modelSet) {
		NotationModel model = (NotationModel) modelSet.getModel(NotationModel.MODEL_ID);
		CompositeCommand compositeCommand = new CompositeCommand("Conversion to SysML 1.6 context");
		for (Resource current : model.getResources()) {
			for (EObject element : current.getContents()) {
				if (element instanceof Diagram) {
					ICommand convertDiagram = convertDiagram((Diagram) element);
					compositeCommand.add(convertDiagram);
				}
			}
		}

		try {
			GMFUnsafe.write(modelSet.getTransactionalEditingDomain(), compositeCommand);
		} catch (ExecutionException | InterruptedException | RollbackException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Provide an ICommand for each diagram that need a conversion
	 * @param diagram
	 * @return
	 */
	public ICommand convertDiagram(Diagram diagram) {
		for (Object object : diagram.getStyles()) {
			if (object instanceof PapyrusDiagramStyle) {
				switch (((PapyrusDiagramStyle) object).getDiagramKindId()) {
				// FIXME: UML Representation kind ids should be provided by API core
				case "org.eclipse.papyrus.uml.diagram.package":
					return new SetPapyrusDiagramStyleCommand(diagram, SysML16chitectureUtil.DIAGRAM_PACKAGE_ID);
				case "org.eclipse.papyrus.uml.diagram.activity":
					return new SetPapyrusDiagramStyleCommand(diagram, SysML16chitectureUtil.DIAGRAM_ACTIVITY_ID);
				case "org.eclipse.papyrus.uml.diagram.stateMachine":
					return new SetPapyrusDiagramStyleCommand(diagram, SysML16chitectureUtil.DIAGRAM_STATE_MACHINE_ID);
				case "org.eclipse.papyrus.uml.diagram.useCase":
					return new SetPapyrusDiagramStyleCommand(diagram, SysML16chitectureUtil.DIAGRAM_USE_CASE_ID);
				default:// not conversion available
					break;
				}
			}
		}
		return IdentityCommand.INSTANCE;
	}

	///////////////////////////////////////////////////////////////////////////////
	/**
	 * FIXME: Should be provided as API by the core 
	 * TODO: should be undoable
	 * A command to set the diagram kind to a diagram
	 */
	private class SetPapyrusDiagramStyleCommand extends AbstractCommand {

		private Diagram diagram;
		private String diagramKind;

		public SetPapyrusDiagramStyleCommand(Diagram diagram, String newStyle) {
			super("Set new diagram kind for Papyrus Style");
			this.diagram = diagram;
			this.diagramKind = newStyle;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
				throws ExecutionException {
			for (Object object : diagram.getStyles()) {
				if (object instanceof PapyrusDiagramStyle) {
					((PapyrusDiagramStyle) object).setDiagramKindId(diagramKind);
				}
			}
			return CommandResult.newOKCommandResult();
		}

		@Override
		public boolean canUndo() {
			return false;
		}

		@Override
		public boolean canRedo() {
			return false;
		}

		@Override
		protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info)
				throws ExecutionException {
			throw new ExecutionException("Should not be called, canRedo false"); //$NON-NLS-1$
		}

		@Override
		protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info)
				throws ExecutionException {
			throw new ExecutionException("Should not be called, canUndo false"); //$NON-NLS-1$
		}
	}
	////////////////////////////////////////////////////////////////////////////////
}
