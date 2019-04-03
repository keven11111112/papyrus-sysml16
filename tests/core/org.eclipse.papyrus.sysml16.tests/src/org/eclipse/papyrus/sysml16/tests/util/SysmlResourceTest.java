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

package org.eclipse.papyrus.sysml16.tests.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Basic test for Sysml 1.6 profile.
 */
public class SysmlResourceTest {

	/**
	 * Check that profile application lookup is well implemented
	 */
	@Test
	public void testGetFirstSysMLMatchingContainerProfiledBySysMLProfile4UMLModel() {
		// Model tree is umlModel>nestedPackage,rootPackage>secondPackage
		Package rootPackage, secondPackage, nestedPackage;
		Package resultPackage, pakage;

		Model umlModel = UMLFactory.eINSTANCE.createModel();
		pakage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(umlModel);
		Assert.assertNull("Initial model should not match any SysML profile", pakage); //$NON-NLS-1$

		nestedPackage = umlModel.createNestedPackage("myNestedPackage"); //$NON-NLS-1$
		pakage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(nestedPackage);
		Assert.assertNull("Nested package should not match any SysML profile", pakage); //$NON-NLS-1$

		rootPackage = (Package) umlModel.createPackagedElement("myRootPackage", UMLPackage.eINSTANCE.getPackage()); //$NON-NLS-1$
		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(rootPackage);
		Assert.assertNull("Root package should not match any SysML profil", resultPackage); //$NON-NLS-1$

		secondPackage = (Package) rootPackage.createPackagedElement("myPackage2", UMLPackage.eINSTANCE.getPackage()); //$NON-NLS-1$
		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(pakage);
		Assert.assertNull("Secund level package should not match any SysML profile", resultPackage); //$NON-NLS-1$

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource sysmlProfileResource = resourceSet.getResource(URI.createURI(SysMLResource.PROFILE_PATH), true);
		Profile sysmlProfile = (Profile) EcoreUtil.getObjectByType(sysmlProfileResource.getContents(), UMLPackage.Literals.PACKAGE);
		rootPackage.applyProfile(sysmlProfile);
		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(rootPackage);
		Assert.assertNotNull("Should retrieve a root package with SysML applied profile", resultPackage); //$NON-NLS-1$
		Assert.assertEquals("Should retrieve the root package with SysML applied profile", rootPackage, resultPackage); //$NON-NLS-1$

		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(secondPackage);
		Assert.assertNotNull("Should retrieve a root package from the level2 package with SysML applied profile", resultPackage); //$NON-NLS-1$
		Assert.assertEquals("Should retrieve the root package from the level2 package with SysML applied profile", rootPackage, resultPackage); //$NON-NLS-1$
	}

	/**
	 * Check that profile application lookup is well implemented
	 */
	@Test
	public void testGetFirstSysMLMatchingContainerProfiledBySysMLProfile4SysMLModel() {
		// Model tree is model>rootPackage>secondPackage
		Package rootPackage, secondPackage;
		Package resultPackage;

		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(model);
		Assert.assertNotNull("Model is the first lvel with SysML applied profil", resultPackage); //$NON-NLS-1$
		Assert.assertEquals(model, resultPackage);

		rootPackage = (Package) model.createPackagedElement("rootPackage", UMLPackage.eINSTANCE.getPackage()); //$NON-NLS-1$
		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(rootPackage);
		Assert.assertNotNull("Should retrieve a package", resultPackage); //$NON-NLS-1$
		Assert.assertEquals("Should retrieve the root model", model, resultPackage); //$NON-NLS-1$

		secondPackage = (Package) rootPackage.createPackagedElement("myPackage2", UMLPackage.eINSTANCE.getPackage()); //$NON-NLS-1$
		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(secondPackage);
		Assert.assertNotNull("Should retrieve a result from the level2 package", resultPackage); //$NON-NLS-1$
		Assert.assertEquals("Should retrieve the root model", model, resultPackage); //$NON-NLS-1$

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource sysmlProfileResource = resourceSet.getResource(URI.createURI(SysMLResource.PROFILE_PATH), true);
		Profile sysmlProfile = (Profile) EcoreUtil.getObjectByType(sysmlProfileResource.getContents(), UMLPackage.Literals.PACKAGE);
		rootPackage.applyProfile(sysmlProfile);
		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(rootPackage);
		Assert.assertNotNull("Should retrieve a package with applied sysml profil", resultPackage); //$NON-NLS-1$
		Assert.assertEquals("Should retrieve the root package with applied sysml profil", rootPackage, resultPackage); //$NON-NLS-1$

		resultPackage = SysMLResource.getFirstSysMLMatchingContainerProfiledBySysMLProfile(secondPackage);
		Assert.assertNotNull("Should retrieve a package from the level2 package with applied sysml profil ", resultPackage); //$NON-NLS-1$
		Assert.assertEquals("Should retrieve the root package from the level2 package with applied sysml profil", rootPackage, resultPackage); //$NON-NLS-1$

	}

}
