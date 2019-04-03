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

package org.eclipse.papyrus.sysml16.deprecatedelements;

import org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedElementsFactoryImpl;


/**
 * this class has been added in order to integrated specific implementation of Stereotypes: FlowPort.
 * Specific code has been added to calculate derived properties see Requirement Req0010 DerivedProperties
 * 
 * and also FlowSpecification
 */
public class DeprecatEdelementsCustomFactoryImpl extends DeprecatedElementsFactoryImpl implements
		DeprecatedElementsFactory {

	/**
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedelementsFactoryImpl#createFlowPort()
	 *
	 * @return the FlowPort
	 */
	@Override
	public FlowPort createFlowPort() {
		return new FlowPortCustomImpl();
	}
	
	/**
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedelementsFactoryImpl#createFlowSpecification()
	 *
	 * @return the FlowSpecification
	 */
	@Override
	public FlowSpecification createFlowSpecification() {
		return new FlowSpecificationCustomImpl();
	}

}
