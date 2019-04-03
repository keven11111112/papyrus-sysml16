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

import org.eclipse.emf.ecore.EClass;

/**
 * This class has been implemented in order to depend on Requirement Custom implementation.
 */
public class DesignConstraintCustomImpl extends ExtendedRequirementCustomImpl implements DesignConstraint {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.ExtendedRequirementImpl#eStaticClass()
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsExtensionPackage.Literals.DESIGN_CONSTRAINT;
	}

}
