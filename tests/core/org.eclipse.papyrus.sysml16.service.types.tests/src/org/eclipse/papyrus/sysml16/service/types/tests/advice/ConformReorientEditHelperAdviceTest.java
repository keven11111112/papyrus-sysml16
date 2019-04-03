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

package org.eclipse.papyrus.sysml16.service.types.tests.advice;

import java.util.Map;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRequest;
import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;
import org.eclipse.papyrus.sysml16.service.types.advice.ConformReorientEditHelperAdvice;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test class for conform creation.
 */
public class ConformReorientEditHelperAdviceTest {

	@BeforeClass
	public static void loadSysml16Definition() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		ElementTypeSetConfiguration elementTypeSetConfiguration = map.get("org.eclipse.papyrus.sysml16.service.types.elementTypeSet"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML 1.6 element type set definition is missing", elementTypeSetConfiguration); //$NON-NLS-1$

	}

	/**
	 * A Class with the stereotype Viewpoint
	 */
	private org.eclipse.uml2.uml.Class classStereotypeViewpoint;

	/**
	 * A Class with the stereotype View
	 */
	private org.eclipse.uml2.uml.Class classStereotypeView;

	/**
	 * a class without stereotype
	 */
	private org.eclipse.uml2.uml.Class notStereotypeClass;

	/**
	 * the link conform
	 */
	private Abstraction conformLink;

	/**
	 * A Class with the stereotype Viewpoint to test re-orient
	 */
	private Class classStereotypeView2;

	/**
	 * A Class with the stereotype View to test re-orient
	 */
	private Class classStereotypeViewpoint2;

	@Before
	public void setUp() {
		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$
		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);
		classStereotypeViewpoint = model.createOwnedClass("classStereotypeViewpoint", false);
		stereotypeApplicationHelper.applyStereotype(classStereotypeViewpoint, ModelElementsPackage.eINSTANCE.getViewpoint(), null);
		classStereotypeView = model.createOwnedClass("classStereotypeView", false);
		stereotypeApplicationHelper.applyStereotype(classStereotypeView, ModelElementsPackage.eINSTANCE.getView(), null);

		// class not stereotyped
		notStereotypeClass = model.createOwnedClass("notStereotypeClass", false);

		// creation of the conform link
		conformLink = UMLFactory.eINSTANCE.createAbstraction();
		model.getPackagedElements().add(conformLink);
		conformLink.getClients().add(classStereotypeView);
		conformLink.getSuppliers().add(classStereotypeViewpoint);
		stereotypeApplicationHelper.applyStereotype(conformLink, ModelElementsPackage.eINSTANCE.getConform(), null);


		classStereotypeView2 = model.createOwnedClass("classStereotypeView2", false);
		stereotypeApplicationHelper.applyStereotype(classStereotypeView2, ModelElementsPackage.eINSTANCE.getView(), null);


		classStereotypeViewpoint2 = model.createOwnedClass("classStereotypeViewpoint2", false);
		stereotypeApplicationHelper.applyStereotype(classStereotypeViewpoint2, ModelElementsPackage.eINSTANCE.getViewpoint(), null);
	}


	/**
	 * Test if the creation of conform following SysML requirements
	 */
	@Test
	public void testApproveRequest() {
		ConformReorientEditHelperAdvice conformReorientEditHelperAdvice = new ConformReorientEditHelperAdvice();

		IEditCommandRequest invalidRequest = new ReorientRelationshipRequest(conformLink, notStereotypeClass, classStereotypeViewpoint, ReorientRequest.REORIENT_TARGET);
		Assert.assertFalse("Target reorient should forbiden for a conform not linked to any elements", conformReorientEditHelperAdvice.approveRequest(invalidRequest)); //$NON-NLS-1$

		IEditCommandRequest validRequest = new ReorientRelationshipRequest(conformLink, classStereotypeViewpoint2, classStereotypeViewpoint, ReorientRequest.REORIENT_TARGET);
		Assert.assertTrue("Target reorient should allow on view point", conformReorientEditHelperAdvice.approveRequest(validRequest)); //$NON-NLS-1$

		IEditCommandRequest invalidRequest2 = new ReorientRelationshipRequest(conformLink, notStereotypeClass, classStereotypeView, ReorientRequest.REORIENT_SOURCE);
		Assert.assertFalse("Source reotient should forbiden for a conform not linked to any elements", conformReorientEditHelperAdvice.approveRequest(invalidRequest2)); //$NON-NLS-1$

		IEditCommandRequest validRequest2 = new ReorientRelationshipRequest(conformLink, classStereotypeView2, classStereotypeView, ReorientRequest.REORIENT_SOURCE);
		Assert.assertTrue("Source reorient should should allow on view ", conformReorientEditHelperAdvice.approveRequest(validRequest2)); //$NON-NLS-1$


	}

}
