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

package org.eclipse.papyrus.sysml16.service.types.command.wrapper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

/**
 * This class is used to delegate the execution to a emf command as recording command...
 */
public abstract class EMFToIEditCommandWrapper extends EditElementCommand {

	/** the wrapped EMF command **/
	protected IEMFElementToEditCommand emfCommand;

	/**
	 * Constructor.
	 *
	 * @param label
	 * @param elementToEdit
	 *            the element to edit maybe different to the created element! it could be the container ...
	 * @param request
	 *            the {@link IEditCommandRequest}
	 * @param emfCommand
	 *            the EMF command that is wrapped see {@link IEMFElementToEditCommand}
	 */
	protected EMFToIEditCommandWrapper(EObject elementToEdit, IEditCommandRequest request, IEMFElementToEditCommand emfCommand) {
		super(emfCommand.getLabel(), elementToEdit, request);
		this.emfCommand = emfCommand;
	}


	/**
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 *
	 * @param arg0
	 * @param arg1
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1) throws ExecutionException {
		emfCommand.setElementToEdit(getEMFElementToEdit());
		if (emfCommand.canExecute()) {
			emfCommand.execute();
		}
		return CommandResult.newOKCommandResult(getEMFElementToEdit());
	}

	/**
	 * get the real element that will be created or modified not the container
	 */
	protected abstract EObject getEMFElementToEdit();
}
