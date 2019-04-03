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

package org.eclipse.papyrus.sysml16.tests.deprecatedelements;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.sysml16.deprecatedelements.DeprecatedElementsPackage;
import org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>FlowSpecification</b></em>'.
 * 
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification#getFlowProperties <em>FlowProperties</em>}</li>
 * </ul>
 * </p>
 */
public class FlowSpecificationTest {

	private FlowSpecification flowSpecification=null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp()  {
		// Prepare Model test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);
		/*
		 * create a FlowSpecification
		 */
		Interface flowSpecificationInterface=model.createOwnedInterface("FlowSpecification1"); //$NON-NLS-1$
		flowSpecification = (FlowSpecification) stereotypeApplicationHelper.applyStereotype(flowSpecificationInterface, DeprecatedElementsPackage.eINSTANCE.getFlowSpecification(),null);

		/*
		 * create a flow property and add it to the FlowSpecification
		 */
		Property property1 = flowSpecificationInterface.createOwnedAttribute("property1", null); //$NON-NLS-1$
		StereotypeApplicationHelper.getInstance(null).applyStereotype(property1, PortsAndFlowsPackage.eINSTANCE.getFlowProperty(),null);
		
	}
	
	/**
	 * @pap.req Flow specifications cannot own operations or receptions (they can only own FlowProperties)
	 */
	@Test
	public void testGetOperations() { 
		Assert.assertEquals("Operations size should be 0", 0, flowSpecification.getBase_Interface().getAllOperations().size()); //$NON-NLS-1$
	}
	
	/**
	 * @pap.req Flow specifications cannot own operations or receptions (they can only own FlowProperties)
	 */
	@Test
	public void testGetReceptions() { 
		Assert.assertEquals("Receptions size should be 0", 0, flowSpecification.getBase_Interface().getOwnedReceptions().size()); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification#getFlowProperties()
	 * <em>FlowProperty</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification#getFlowProperties()
	 */
	@Test
	public void testGetFlowProperties() {  
		Assert.assertNotNull("FlowProperties should not be null", flowSpecification.getFlowProperties()); //$NON-NLS-1$
		Assert.assertEquals("FlowProperties size should be 1", 1, flowSpecification.getFlowProperties().size()); //$NON-NLS-1$
	}
	


} 
