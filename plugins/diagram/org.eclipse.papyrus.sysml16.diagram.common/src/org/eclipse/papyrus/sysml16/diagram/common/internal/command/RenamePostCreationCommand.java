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

package org.eclipse.papyrus.sysml16.diagram.common.internal.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.papyrus.infra.services.edit.utils.GMFCommandUtils;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Name an element after a creation command.
 * This class is internal since the element should be created with the correct name in the first place.
 * Currently the is a lack of naming strategy in Papyrus core framework.
 * (update name in applystereotypehelper, see Bug 497306)
 */
public class RenamePostCreationCommand extends ConfigureElementCommand {

	private ICommand creationCommand;

	private String newName;

	/**
	 * Constructor.
	 *
	 * @param request
	 *            configuration request
	 * @param partType
	 *            the featuring type of the part
	 * @param typeCreationCommand
	 *            if needed create the type
	 */
	public RenamePostCreationCommand(ConfigureRequest request, String newName, ICommand creationCommand) {
		super(request);
		this.newName = newName;
		this.creationCommand = creationCommand;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(final IProgressMonitor monitor, final IAdaptable info) throws ExecutionException {
		NamedElement newNamedElement = (NamedElement) GMFCommandUtils.getCommandEObjectResult(creationCommand);
		newNamedElement.setName(newName);
		return CommandResult.newOKCommandResult(getElementToEdit());
	}
}
