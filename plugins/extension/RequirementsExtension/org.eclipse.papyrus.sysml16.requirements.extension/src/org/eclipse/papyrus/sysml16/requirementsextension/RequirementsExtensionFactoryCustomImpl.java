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

package org.eclipse.papyrus.sysml16.requirementsextension;

import org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionFactoryImpl;

/**
 * this class has been added in order to integrated specific implementation of Stereotypes: Requirement.
 * Specific code has been added to calculate derived properties see Requirement Req0010 DerivedProperties
 *
 *
 */
public class RequirementsExtensionFactoryCustomImpl extends RequirementsExtensionFactoryImpl implements RequirementsExtensionFactory {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionFactoryImpl#createDesignConstraint()
	 */
	@Override
	public DesignConstraint createDesignConstraint() {
		return new DesignConstraintCustomImpl();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionFactoryImpl#createInterfaceRequirement()
	 */
	@Override
	public InterfaceRequirement createInterfaceRequirement() {
		return new InterfaceRequirementCustomImpl();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionFactoryImpl#createPerformanceRequirement()
	 */
	@Override
	public PerformanceRequirement createPerformanceRequirement() {
		return new PerformanceRequirementCustomImpl();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionFactoryImpl#createFunctionalRequirement()
	 */
	@Override
	public FunctionalRequirement createFunctionalRequirement() {
		return new FunctionalRequirementCustomImpl();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionFactoryImpl#createPhysicalRequirement()
	 */
	@Override
	public PhysicalRequirement createPhysicalRequirement() {
		return new PhysicalRequirementCustomImpl();
	}

}
