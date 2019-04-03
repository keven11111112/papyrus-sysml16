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

package org.eclipse.papyrus.sysml16.edit.tests.requirements.provider;

import org.eclipse.papyrus.sysml16.requirements.provider.RequirementItemProvider;
import org.eclipse.papyrus.sysml16.requirements.provider.RequirementsItemProviderAdapterFactory;
import org.eclipse.papyrus.sysml16.requirements.RequirementCustomImpl;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Basic test RequirementItemProvider.
 */
public class RequirementItemProviderTest {

	/**
	 * Check that a Requirement has an image to avoid regression when regeneration
	 */
	@Ignore
	@Test
	public void testProfilRegistration() {
		RequirementsItemProviderAdapterFactory requirementsItemProviderAdapterFactory = new RequirementsItemProviderAdapterFactory();
		RequirementItemProvider createRequirementAdapter = (RequirementItemProvider) requirementsItemProviderAdapterFactory.createRequirementAdapter();
		Assert.assertNotNull("Requirement should have an image", createRequirementAdapter.getImage(new RequirementCustomImpl())); //$NON-NLS-1$
	}

}
