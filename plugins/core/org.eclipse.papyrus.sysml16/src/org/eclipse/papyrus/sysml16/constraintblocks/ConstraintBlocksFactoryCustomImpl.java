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

package org.eclipse.papyrus.sysml16.constraintblocks;
import org.eclipse.papyrus.sysml16.constraintblocks.internal.impl.ConstraintBlocksFactoryImpl;


/**
 * 
 *
 */
public class ConstraintBlocksFactoryCustomImpl extends ConstraintBlocksFactoryImpl implements ConstraintBlocksFactory{
	
	/**
	 * @see org.eclipse.papyrus.sysml16.constraintblocks.internal.impl.ConstraintblocksFactoryImpl#createConstraintBlock()
	 *
	 * @return the BoundReference
	 */
	@Override
	public ConstraintBlock createConstraintBlock() {
		return new ConstraintBlockCustomImpl();
	}
	
}
