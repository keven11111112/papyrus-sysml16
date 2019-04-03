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

import org.eclipse.papyrus.sysml16.nattable.ui.filter.SysmlCommandFilter;
import org.eclipse.papyrus.uml.service.types.filter.ICommandFilter;
import org.eclipse.papyrus.uml.service.types.ui.handlers.AbstractCreateElementCommandHandler;

/**
 * Abstract handler for every creation command for Sysml elements
 * used in the ModelExplorer contextual ("Create new child") menu
 */
public abstract class AbstractSysmlCreateElementCommandHandler extends AbstractCreateElementCommandHandler {

	private static final ICommandFilter filter = SysmlCommandFilter.INSTANCE;

	@Override
	public ICommandFilter getCommandFilter() {
		return filter;
	}

}
