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

import org.eclipse.papyrus.infra.ui.util.AbstractCreateMenuFromCommandCategory;

/**
 * Abstract menu for the creation of Sysml elements
 */
public abstract class AbstractCreateSysmlChildMenu extends AbstractCreateMenuFromCommandCategory {

	/** the cateogory of the command used to create SysML elements */
	public static final String SYSML_CREATION_COMMAND_CATEGORY = "org.eclipse.papyrus.sysml16.service.types.sysmlElementCreationCommands"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	public AbstractCreateSysmlChildMenu() {
		super(SYSML_CREATION_COMMAND_CATEGORY);
	}
}
