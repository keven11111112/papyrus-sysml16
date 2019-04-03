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

package org.eclipse.papyrus.sysml16.diagram.common.advices;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.sysml16.diagram.common.command.ConfigurePartCommand;
import org.eclipse.papyrus.sysml16.diagram.common.dialog.CreateOrSelectBlockPropertyTypeDialog;
import org.eclipse.papyrus.sysml16.diagram.common.internal.command.RenamePostCreationCommand;
import org.eclipse.papyrus.sysml16.service.types.advice.AfterConfigureCommandEditHelperAdvice;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;


/**
 * Add a popup to create or select a Block for the property type of the element using this advice
 */
public class CreateOrSelectBlockPropertyTypeEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getBeforeConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getBeforeConfigureCommand(ConfigureRequest request) {
		configureRequest(request);
		return super.getBeforeConfigureCommand(request);
	}

	/**
	 * @param request
	 */
	protected void configureRequest(ConfigureRequest request) {
		Map<String, Object> newParameters = new HashMap<String, Object>();

		ICommand configureCommand = null;

		Shell shell = Display.getDefault().getActiveShell();
		Property property = (Property) request.getElementToConfigure();
		Package owner = property.getNearestPackage();


		CreateOrSelectBlockPropertyTypeDialog dialog = new CreateOrSelectBlockPropertyTypeDialog(shell, owner);

		dialog.open();
		if (dialog.getReturnCode() == Window.OK) {

			final ICommand typeCreationCommand = dialog.getNewTypeCreateCommand();
			final String newTypeName = dialog.getSavedNewTypeNameText();
			final Type partType = (Type) dialog.getExistingType();

			// Abort if type creation command exists but is not executable
			if ((typeCreationCommand != null) && (!typeCreationCommand.canExecute())) {
				configureCommand = UnexecutableCommand.INSTANCE;
			} else {
				configureCommand = CompositeCommand.compose(configureCommand, typeCreationCommand);
			}

			// Create the configure command that will set the constraint property type
			ICommand setTypeCommand = new ConfigurePartCommand(request, partType, typeCreationCommand);
			configureCommand = CompositeCommand.compose(configureCommand, setTypeCommand);
			if (typeCreationCommand != null && typeCreationCommand.canExecute()) {
				RenamePostCreationCommand renamePostCreationCommand = new RenamePostCreationCommand(request, newTypeName, typeCreationCommand);
				configureCommand = CompositeCommand.compose(configureCommand, renamePostCreationCommand);
			}
		} else {
			throw new OperationCanceledException("Creation cancelled by user"); //$NON-NLS-1$
		}

		newParameters.put(AfterConfigureCommandEditHelperAdvice.AFTER_CONFIGURE_COMMAND, configureCommand);
		request.addParameters(newParameters);
	}
}
