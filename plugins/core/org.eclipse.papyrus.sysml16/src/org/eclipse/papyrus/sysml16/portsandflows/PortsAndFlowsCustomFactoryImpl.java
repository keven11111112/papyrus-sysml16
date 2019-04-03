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

package org.eclipse.papyrus.sysml16.portsandflows;

import org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsFactoryImpl;

/**
 *
 *
 */
public class PortsAndFlowsCustomFactoryImpl extends PortsAndFlowsFactoryImpl {


	/**
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsandflowsFactoryImpl#createFlowProperty()
	 *
	 * @return
	 */
	@Override
	public FlowProperty createFlowProperty() {
		return new FlowPropertyCustomImpl();
	}

	/**
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsFactoryImpl#createInterfaceBlock()
	 *
	 * @return
	 */
	@Override
	public InterfaceBlock createInterfaceBlock() {
		return new InterfaceBlockCustomImpl();
	}
}
