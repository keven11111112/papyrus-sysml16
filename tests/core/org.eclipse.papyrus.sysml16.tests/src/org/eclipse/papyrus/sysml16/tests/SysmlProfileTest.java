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

package org.eclipse.papyrus.sysml16.tests;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.UMLPlugin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Basic test for SysML 1.6 profile.
 */
@RunWith(Parameterized.class)
public class SysmlProfileTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML" }, //$NON-NLS-1$
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML/Activities" }, //$NON-NLS-1$
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML/Allocations" }, //$NON-NLS-1$
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML/Blocks" }, //$NON-NLS-1$
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML/ConstraintBlocks" }, //$NON-NLS-1$
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML/DeprecatedElements" }, //$NON-NLS-1$
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML/PortsAndFlows" }, //$NON-NLS-1$
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML/ModelElements" }, //$NON-NLS-1$
				{ "http://www.eclipse.org/papyrus/sysml/1.6/SysML/Requirements" } //$NON-NLS-1$
		});
	}

	private String uri;

	public SysmlProfileTest(String uri) {
		this.uri = uri;
	}

	/**
	 * Check that we have a location for the uri
	 * and that the location point to some existing EObject
	 */
	@Test
	public void testProfilRegistration() {
		URI location = UMLPlugin.getEPackageNsURIToProfileLocationMap().get(uri);
		assertNotNull("Location missing for this uri :" + uri, location); //$NON-NLS-1$
		assertNotNull("Location is refering to a non existing EObject :" + location, new ResourceSetImpl().getEObject(location, true)); //$NON-NLS-1$
	}

}
