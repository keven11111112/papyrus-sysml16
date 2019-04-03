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

package org.eclipse.papyrus.sysml16.nattable.ui.filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.service.types.filter.ICommandFilter;

/**
 * Filter for available Sysml commands. Moved from oep.sysml.modelexplorer
 */
public class SysmlCommandFilter implements ICommandFilter {

	/**
	 * Singleton instance
	 */
	public static final SysmlCommandFilter INSTANCE = new SysmlCommandFilter();

	private List<IElementType> visibleCommands;
	
	private SysmlCommandFilter() {
		// to prevent instantiation
	}

	@Override
	public List<IElementType> getVisibleCommands() {
		if (visibleCommands == null) {
			List<IElementType> localVisibleCommands = new ArrayList<>();
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_BLOCK));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_FLOWPORT));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_FLOWPROPERTY));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_FLOWSPECIFICATION));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PROBLEM));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_RATIONALE));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_REQUIREMENT));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_UNIT));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_VALUETYPE));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_VIEW));
			localVisibleCommands.add(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_VIEWPOINT));

			// UMLElementTypes.PROPERTY is required by ConstraintBlock Parameter
			localVisibleCommands.add(UMLElementTypes.PROPERTY);
			this.visibleCommands = Collections.unmodifiableList(localVisibleCommands);
		}
		return visibleCommands;
	}
}
