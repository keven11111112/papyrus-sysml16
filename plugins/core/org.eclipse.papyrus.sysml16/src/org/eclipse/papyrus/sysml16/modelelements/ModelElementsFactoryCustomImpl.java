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

package org.eclipse.papyrus.sysml16.modelelements;

import org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsFactoryImpl;

/**
 * this class has been added in order to integrated specific implementation of Stereotypes: View.
 * Specific code has been added to calculate derived properties see Requirement Req0010 DerivedProperties
 * 
 *
 */
public class ModelElementsFactoryCustomImpl extends ModelElementsFactoryImpl implements ModelElementsFactory {

	/**
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelelementsFactoryImpl#createView()
	 *
	 * @return the view
	 */
	@Override
	public View createView() {
		return new ViewCustomImpl();
	}
	
	
	/**
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelelementsFactoryImpl#createViewpoint()
	 *
	 * @return the viewpoint
	 */
	@Override
	public Viewpoint createViewpoint() {
		return new ViewpointCustomImpl();
	}
	
	
	/**
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelelementsFactoryImpl#createElementGroup()
	 *
	 * @return the element group
	 */
	@Override
	public ElementGroup createElementGroup() {
		return new ElementGroupCustomImpl();
	}
	
	/**
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelelementsFactoryImpl#createStakeholder()
	 *
	 * @return the stakeholder
	 */
	@Override
	public Stakeholder createStakeholder() {
		return new StakeholderCustomImpl();
	}

}
