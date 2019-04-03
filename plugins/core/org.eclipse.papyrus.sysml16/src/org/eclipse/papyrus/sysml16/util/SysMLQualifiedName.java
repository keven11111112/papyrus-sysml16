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

package org.eclipse.papyrus.sysml16.util;


public final class SysMLQualifiedName {

	private SysMLQualifiedName() {
		// to prevent instantiation
	}

	/**
	 * The qualified name of the property direction
	 * @deprecated
	 */
	@Deprecated
	public static final String STEREOTYPE_FLOWPORT_DIRECTION = "SysML::DeprecatedElements::FlowPort::direction"; //$NON-NLS-1$
	
	/** 
	 * QN of SysML::Requirement::Requirement::text. 
	 */
	public static final String SYSML_REQUIREMENTS_REQUIREMENT_TEXT_QN = "SysML::Requirements::Requirement::text"; //$NON-NLS-1$
}
