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

package org.eclipse.papyrus.sysml16.ui.tests.resources;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.CreationMenu;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.ui.Activator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test the new child model :
 * - checks that all element type are registered
 * - validate the model
 */
public class NewChildMenuTest {

	public static final String NEW_CHILD_MENU_PATH = Activator.PLUGIN_ID + "/resources/SysML16.creationmenumodel"; //$NON-NLS-1$


	@BeforeClass
	public static void loadElementTypeSet() {
		ElementTypeSetConfigurationRegistry.getInstance();
	}

	/**
	 * Check that referenced element type are in the registry
	 */
	@Test
	public void checkMenuNewChildElementTypeIdRefs() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(NEW_CHILD_MENU_PATH, true);
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		Resource resource = resourceSetImpl.getResource(createPlatformPluginURI, true);

		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = (EObject) allContents.next();
			if (eObject instanceof CreationMenu) {
				String iconPath = ((CreationMenu) eObject).getIcon();
				if (iconPath != null && !"".equals(iconPath)) {
					try {
						Assert.assertNotNull("The icon " + iconPath + " can't be found", FileLocator.find(new URL(iconPath))); //$NON-NLS-1$ //$NON-NLS-2$
					} catch (MalformedURLException e) {
						Assert.fail("The new child menu is refering to a malformed url " + iconPath); //$NON-NLS-1$
					}
				}
			}
		}
	}


	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void useValidation() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(NEW_CHILD_MENU_PATH, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The new Child menu is not valid " + NEW_CHILD_MENU_PATH, Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$
	}


}
