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

package org.eclipse.papyrus.sysml16.architecture.tests.resources;

import java.lang.reflect.Method;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test the architecture model : - validate the model.
 */
public class ArchitectureValidationTest {

	public static final String ARCHITECTURE_PATH = "org.eclipse.papyrus.sysml16.architecture/resources/sysml16.architecture"; //$NON-NLS-1$

	@BeforeClass
	public static void loadElementTypeSet() {
		ElementTypeSetConfigurationRegistry.getInstance();
	}

	/**
	 * Check that if an element has a field id then xmi:id should be the same
	 */
	@Test
	public void checkXMIIds() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(ARCHITECTURE_PATH, true);
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		Resource resource = resourceSetImpl.getResource(createPlatformPluginURI, true);

		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = (EObject) allContents.next();

			String id = getId(eObject);
			String xmiId = ((XMIResource) resource).getID(eObject);
			if (id != null) {
				Assert.assertEquals("Xmi id and id field should be the same", id, xmiId); //$NON-NLS-1$
			}
		}
	}

	// SMALL hack to get id if present
	// TODO: Would be nice to have an IIdentifiedElement interface in the MetaModel
	public static String getId(Object obj) {
		try {
			Method method = obj.getClass().getMethod("getId"); //$NON-NLS-1$
			if (method != null) {
				return method.invoke(obj).toString();
			}
		} catch (Exception e) {
			// doesn't matter
		}
		return null;
	}

}
