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

package org.eclipse.papyrus.sysml16.nattable.ui.handlers;

import org.eclipse.emf.common.command.Command;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.utils.INattableModelManagerUtils;
import org.eclipse.papyrus.uml.nattable.menu.util.TableMenuUtils;
import org.eclipse.papyrus.uml.service.types.utils.ICommandContext;

/**
 * Abstract handler for the creation commands of Sysml elements in the Nattable editor.
 */
public abstract class AbstractSysmlNattableCreateCommandHandler extends AbstractSysmlCreateElementCommandHandler {

	/**
	 * <pre>
	 *
	 * Build the create command for an element creation in the selected container.
	 * The create command is given by the {@link org.eclipse.papyrus.infra.services.edit.service.IElementEditService} of selected
	 * element.
	 *
	 * &#64;return the composite creation command for current selection
	 *
	 * </pre>
	 */
	@Override
	protected Command buildCommand() {
		Command createCmd = super.buildCommand();
		return TableMenuUtils.buildNattableCreationCommand(createCmd, this.createRequest);
	}

	/**
	 * Obtain the context of the active table editor.
	 *
	 * @see org.eclipse.papyrus.uml.service.types.handlers.AbstractCommandHandler#getCommandContext()
	 *
	 * @return
	 */
	@Override
	protected ICommandContext getCommandContext() {
		return TableMenuUtils.getTableCreateElementCommandContext(INattableModelManagerUtils.getTableManagerFromWorkbenchPart(getActiveWorkbenchPart()));

	}

	/**
	 * Verify if this handler is currently active and the command can execute. Additionally, verify if this table can add this type of element.
	 *
	 * @see org.eclipse.papyrus.uml.service.types.handlers.AbstractCreateCommandHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		boolean isEnabled = false;
		INattableModelManager tableManager = INattableModelManagerUtils.getTableManagerFromWorkbenchPart(getActiveWorkbenchPart());
		IElementType elementTypeToCreate = getElementTypeToCreate();

		if (elementTypeToCreate != null) {
			String id = elementTypeToCreate.getId();
			if (id != null) {
				isEnabled = tableManager.canCreateRowElement(id);
				if (isEnabled) {
					// we test the enable of the super implementation
					super.setEnabled(evaluationContext);
					isEnabled = super.isEnabled();
				}
				setBaseEnabled(isEnabled);
			}
		}
	}

}
