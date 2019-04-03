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

package org.eclipse.papyrus.sysml16.ui.tests.images;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.papyrus.uml.tools.utils.UMLUtil;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPlugin;
import org.junit.Assert;
import org.junit.Test;

/**
 * Basic test for SysML 1.6 images.
 */
public class SysmlProfileImageTest {

	/**
	 * Check that images for Stereotypes defined in the profile are all present in the
	 * 
	 * @throws IOException
	 */
	@Test
	public void testImageLocation() throws IOException {
		URI uri = UMLPlugin.getEPackageNsURIToProfileLocationMap().get(SysMLResource.PROFILE_URI);
		Resource resource = new ResourceSetImpl().getResource(uri, true);
		Set<Stereotype> allStereotypes = UMLUtil.getAllStereotypes((Package) resource.getAllContents().next());
		for (Stereotype stereotype : allStereotypes) {
			EList<Image> icons = stereotype.getIcons();
			for (Image image : icons) {
				String location = image.getLocation();
				try {
					URL url = new URL(location);
					Assert.assertNotNull("The icon location :" + location + " can't be found", FileLocator.find(url)); //$NON-NLS-1$ //$NON-NLS-2$
				} catch (MalformedURLException e) {
					Assert.fail("The icon for " + stereotype.getName() + " is refering to a bad location : " + location); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
		}
	}

}
