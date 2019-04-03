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

package org.eclipse.papyrus.sysml16.blocks;
import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlocksFactoryImpl;


/**
 * 
 *
 */
public class BlocksFactoryCustomImpl extends BlocksFactoryImpl implements BlocksFactory{

	/**
	 * @see org.eclipse.papyrus.sysml16.blocks.internal.impl.BlocksFactoryImpl#createBoundReference()
	 *
	 * @return the BoundReference
	 */
	@Override
	public BoundReference createBoundReference() {
		return new BoundReferenceCustomImpl();
	}
	
	/**
	 * @see org.eclipse.papyrus.sysml16.blocks.internal.impl.BlocksFactoryImpl#createBlock()
	 *
	 * @return the Block
	 */
	@Override
	public Block createBlock() {
		return new BlockCustomImpl();
	}
	
}
