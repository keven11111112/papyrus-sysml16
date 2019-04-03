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
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;
import org.eclipse.papyrus.sysml16.service.types.advice.ConformCreationEditHelperAdvice;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test class for conform creation
 */
public class ConformCreationEditHelperAdviceTest {

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

	@Before
	public void setUp() {
		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$
		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);
		classStereotypeViewpoint = model.createOwnedClass("classStereotypeViewpoint", false);
		stereotypeApplicationHelper.applyStereotype(classStereotypeViewpoint, ModelElementsPackage.eINSTANCE.getViewpoint(),null);
		classStereotypeView = model.createOwnedClass("classStereotypeView", false);
		stereotypeApplicationHelper.applyStereotype(classStereotypeView, ModelElementsPackage.eINSTANCE.getView(),null);
	}


	/**
	 * Test if the creation of conform following SysML requirements
	 */
	@Test
	public void testApproveRequest() {
		ConformCreationEditHelperAdvice conformCreationEditHelperAdvice = new ConformCreationEditHelperAdvice();
		IElementType type = ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONFORM);

		IEditCommandRequest invalidRequest = new CreateRelationshipRequest(type);
		Assert.assertFalse("Creation should forbiden for a conform not linked to any elements", conformCreationEditHelperAdvice.approveRequest(invalidRequest));

		IEditCommandRequest validRequest = new CreateRelationshipRequest(classStereotypeView, classStereotypeViewpoint, type);
		Assert.assertTrue("Conform is allow from a View to a Viewpoint", conformCreationEditHelperAdvice.approveRequest(validRequest));

	}

}
