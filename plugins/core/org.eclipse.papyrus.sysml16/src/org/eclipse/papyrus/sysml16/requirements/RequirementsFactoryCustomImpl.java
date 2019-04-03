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

package org.eclipse.papyrus.sysml16.requirements;

import org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsFactoryImpl;

/**
 * this class has been added in order to integrated specific implementation of Stereotypes: Requirement.
 * Specific code has been added to calculate derived properties see Requirement Req0010 DerivedProperties
 * 
 *
 */
public class RequirementsFactoryCustomImpl extends RequirementsFactoryImpl implements RequirementsFactory {

	/**
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsFactoryImpl#createRequirement()
	 *
	 * @return a new requirement
	 */
	@Override
	public Requirement createRequirement() {
		return new RequirementCustomImpl();
	}

}
