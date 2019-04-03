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

package org.eclipse.papyrus.sysml16.nattable.requirement.config;

import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.sysml16.util.SysMLQualifiedName;
import org.eclipse.papyrus.uml.nattable.richtext.celleditor.config.RichTextCellEditorConfiguration;
import org.eclipse.papyrus.uml.nattable.utils.UMLTableUtils;

/**
 * Cell Editor configuration for the Text field of Requirement table.
 */
public class RequirementTextStringCellEditorConfiguration extends RichTextCellEditorConfiguration {

	/** The ID of this cell editor. */
	private static final String ID = "org.eclipse.papyrus.sysml16.nattable.requirement.config.RequirementTextStringCellEditorConfiguration";//$NON-NLS-1$

	/** Requirement Text column ID in SysML Requirements table. */
	private static final String SYSML_REQUIREMENTS_REQUIREMENT_TEXT_ID = UMLTableUtils.PROPERTY_OF_STEREOTYPE_PREFIX + SysMLQualifiedName.SYSML_REQUIREMENTS_REQUIREMENT_TEXT_QN;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.configuration.IPapyrusNatTableConfiguration#getConfigurationId()
	 */
	@Override
	public String getConfigurationId() {
		return ID;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.configuration.IPapyrusNatTableConfiguration#getConfigurationDescription()
	 */
	@Override
	public String getConfigurationDescription() {
		return "This configuration provides a Rich Text Editor for the Text field of Requirement table"; //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.celleditor.config.ICellAxisConfiguration#handles(org.eclipse.papyrus.infra.nattable.model.nattable.Table, java.lang.Object)
	 */
	@Override
	public boolean handles(final Table table, final Object axisElement) {

		// Handle only the Requirement::text column in Requirement table
		return (SYSML_REQUIREMENTS_REQUIREMENT_TEXT_ID.equals(AxisUtils.getPropertyId(axisElement)));
	}
}
