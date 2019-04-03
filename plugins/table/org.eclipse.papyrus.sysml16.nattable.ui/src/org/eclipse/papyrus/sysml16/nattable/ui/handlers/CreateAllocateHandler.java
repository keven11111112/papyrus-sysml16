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

/**
 * This handler allows to create an Allocate object, only if the table is a PapyrusSysMLAllocationTable
 */
public class CreateAllocateHandler extends AllocateHandler {

	/**
	 * the id used for the Papyrus SysML Allocation Table
	 */
	public static final String TABLE_ALLOCATION_TYPE = "PapyrusSysML16AllocationTable"; //$NON-NLS-1$

	/**
	 *
	 * @see org.eclipse.papyrus.sysml16.nattable.ui.handlers.AbstractSysmlNattableCreateCommandHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		Command command = getCommand();
		boolean isEnabled = command.canExecute();
		INattableModelManager tableManager = INattableModelManagerUtils.getTableManagerFromWorkbenchPart(getActiveWorkbenchPart());
		isEnabled = isEnabled && tableManager.getTable().getTableConfiguration().getType().equals(TABLE_ALLOCATION_TYPE);
		if (isEnabled) {
			IElementType newElementType = getElementTypeToCreate();
			String id = newElementType.getId();
			isEnabled = tableManager.canCreateRowElement(id);
		}
		setBaseEnabled(isEnabled);

	}
	
}
