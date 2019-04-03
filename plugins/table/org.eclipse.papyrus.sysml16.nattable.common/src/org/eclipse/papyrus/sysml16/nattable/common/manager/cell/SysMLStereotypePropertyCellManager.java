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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Bug 545402
 *
 *****************************************************************************/

package org.eclipse.papyrus.sysml16.nattable.common.manager.cell;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.sysml16.service.types.matcher.FlowPortNAMatcher;
import org.eclipse.papyrus.sysml16.util.SysMLQualifiedName;
import org.eclipse.papyrus.uml.nattable.manager.cell.StereotypePropertyCellManager;
import org.eclipse.papyrus.uml.nattable.utils.Constants;
import org.eclipse.uml2.uml.Port;

/**
 * This cell manager manages the cell displaying the direction of the FlowPort.
 * If the flowport is not atomic, the cell is not editable and the direction is N/A.
 */
public class SysMLStereotypePropertyCellManager extends StereotypePropertyCellManager {

	/**
	 * the FlowPort isAtomicMatcher
	 */
	private static final FlowPortNAMatcher matcher = new FlowPortNAMatcher();

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.cell.manager.StereotypePropertyCellManager#handles(java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean handles(final Object columnElement, final Object rowElement, final INattableModelManager tableManager) {
		boolean isHandled = super.handles(columnElement, rowElement, tableManager);
		if (isHandled) {
			Entry<EObject, String> cellDefinition = getCellDefinition(columnElement, rowElement);
			if (cellDefinition != null && cellDefinition.getKey() instanceof Port) {
				final String propertyQualifiedNameString = cellDefinition.getValue().substring(Constants.PROPERTY_OF_STEREOTYPE_PREFIX.length(), cellDefinition.getValue().length());
				// We have to use the full name for Constants because of the previous one
				isHandled = SysMLQualifiedName.STEREOTYPE_FLOWPORT_DIRECTION.equals(propertyQualifiedNameString);
			}else {
				isHandled = false;
			}
		}
		return isHandled;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.cell.manager.StereotypePropertyCellManager#isCellEditable(java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean isCellEditable(final Object columnElement, final Object rowElement, final INattableModelManager tableManager) {
		boolean isEditable = super.isCellEditable(columnElement, rowElement, tableManager);
		if (isEditable) {
			Entry<EObject, String> cellDefinition = getCellDefinition(columnElement, rowElement);
			if (cellDefinition != null) {
				isEditable = !matcher.matches(cellDefinition.getKey());
			}
		}
		return isEditable;
	}

	/**
	 * @param columnElement
	 * @param rowElement
	 * @return Entry<EObject,propertyQualifiedName>
	 */
	// FIXME this method should be provided by the core API
	private Entry<EObject, String> getCellDefinition(final Object columnElement, final Object rowElement) {
		final List<Object> objects = organizeAndResolvedObjects(columnElement, rowElement, null);
		// The list must have 2 elements (row and column elements)
		if (objects != null && 2 == objects.size()) {
			if (objects.get(0) instanceof EObject && objects.get(1) instanceof String) {
				return new AbstractMap.SimpleEntry<>((EObject) objects.get(0), (String) objects.get(1));
			}
		}
		return null;
	}

}
