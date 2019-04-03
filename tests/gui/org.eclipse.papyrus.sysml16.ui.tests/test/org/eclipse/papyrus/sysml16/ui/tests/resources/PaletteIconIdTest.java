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
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ChildConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.DrawerConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.IconDescriptor;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.PaletteConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ToolConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Abstract class used to launch tests on a palette model :
 * - check quality id
 * - check existing icon
 */
@RunWith(Parameterized.class)
public class PaletteIconIdTest {

	private String palettePath = ""; //$NON-NLS-1$


	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ "org.eclipse.papyrus.sysml16.diagram.blockdefinition/resources/palette/blockDefinitionDiagram.paletteconfiguration" }, //$NON-NLS-1$
				{ "org.eclipse.papyrus.sysml16.diagram.internalblock/resources/palette/internalBlockDiagram.paletteconfiguration" }, //$NON-NLS-1$
				{ "org.eclipse.papyrus.sysml16.diagram.parametric/resources/palette/parametric.paletteconfiguration" }, //$NON-NLS-1$
				{ "org.eclipse.papyrus.sysml16.diagram.requirement/resources/palette/requirementDiagram.paletteconfiguration" }, //$NON-NLS-1$
		});
	}

	public PaletteIconIdTest(String palettePath) {
		this.palettePath = palettePath;
	}

	@Before
	public void loadElementTypeRegistry() {
		ElementTypeSetConfigurationRegistry.getInstance();
	}

	/**
	 * Check palette ids and element type reference
	 */
	@Test
	public void checkPaletteIds() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(palettePath, true);
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		Resource resource = resourceSetImpl.getResource(createPlatformPluginURI, true);

		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = (EObject) allContents.next();

			if (eObject instanceof PaletteConfiguration) {
				PaletteConfiguration p = (PaletteConfiguration) eObject;
				EList<DrawerConfiguration> drawerConfigurations = p.getDrawerConfigurations();
				for (DrawerConfiguration drawerConfiguration : drawerConfigurations) {
					EList<ChildConfiguration> ownedConfigurations = drawerConfiguration.getOwnedConfigurations();
					for (ChildConfiguration childConfiguration : ownedConfigurations) {

						if (childConfiguration instanceof ToolConfiguration) {
							ToolConfiguration toolConfiguration = (ToolConfiguration) childConfiguration;

							// check icon file
							IconDescriptor icon = toolConfiguration.getIcon();
							String iconPath = "platform:/plugin/" + icon.getPluginID() + "/" + icon.getIconPath(); //$NON-NLS-1$ //$NON-NLS-2$
							if (iconPath != null && !"".equals(iconPath)) {
								try {
									URL url = new URL(iconPath);
									Assert.assertNotNull("The icon " + iconPath + "(for : " + toolConfiguration.getId() + ") can't be found", FileLocator.find(url)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								} catch (MalformedURLException e) {
									Assert.fail("The new child menu is refering to a malformed url " + iconPath); //$NON-NLS-1$
								}
							}
						}
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
		URI createPlatformPluginURI = URI.createPlatformPluginURI(palettePath, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The palette is not valid " + palettePath, Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$
	}

}
