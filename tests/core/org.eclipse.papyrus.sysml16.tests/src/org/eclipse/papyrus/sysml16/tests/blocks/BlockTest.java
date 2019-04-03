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

package org.eclipse.papyrus.sysml16.tests.blocks;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Block</b></em>'.
 * 
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.blocks.Block#getReferences <em>References</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.blocks.Block#getParts <em>Parts</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.blocks.Block#getFlowProperties <em>FlowProperties</em>}</li>
 * </ul>
 * </p>
 */
public class BlockTest {

	private Block owningAgregationBlock=null;

	private Block owningCompositionBlock=null;
	
	private Block flowPropertiesBlock=null;

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
		 * create an association
		 */
		Class owningAgregationBlockClass1=model.createOwnedClass("Block1", false); //$NON-NLS-1$
		owningAgregationBlock = (Block) stereotypeApplicationHelper.applyStereotype(owningAgregationBlockClass1, BlocksPackage.eINSTANCE.getBlock(),null);

		Class ownedBlockClass2=model.createOwnedClass("Block2", false); //$NON-NLS-1$
		stereotypeApplicationHelper.applyStereotype(ownedBlockClass2, BlocksPackage.eINSTANCE.getBlock(),null);

		Property p1Inblock1 = owningAgregationBlockClass1.createOwnedAttribute("P1", ownedBlockClass2); //$NON-NLS-1$

		Association associationAgregation = UMLFactory.eINSTANCE.createAssociation();
		Property p1InAsso = associationAgregation.createOwnedEnd("P1", owningAgregationBlockClass1); //$NON-NLS-1$
		associationAgregation.getMemberEnds().add(p1Inblock1);
		associationAgregation.getMemberEnds().add(p1InAsso);

		p1Inblock1.setAggregation(AggregationKind.SHARED_LITERAL);
		p1InAsso.setAggregation(AggregationKind.NONE_LITERAL);

		associationAgregation.setPackage(model);

		/*
		 * create a composition
		 */
		Class owningCompositionBlockClass3 = model.createOwnedClass("Block3", false); //$NON-NLS-1$
		owningCompositionBlock = (Block) stereotypeApplicationHelper.applyStereotype(owningCompositionBlockClass3, BlocksPackage.eINSTANCE.getBlock(),null);

		Property p1Inblock3 = owningCompositionBlockClass3.createOwnedAttribute("P1", ownedBlockClass2); //$NON-NLS-1$

		Association compositionAssociation = UMLFactory.eINSTANCE.createAssociation();
		Property p1InAsso3 = compositionAssociation.createOwnedEnd("P1", owningCompositionBlockClass3); //$NON-NLS-1$
		compositionAssociation.getMemberEnds().add(p1Inblock3);
		compositionAssociation.getMemberEnds().add(p1InAsso3);

		p1Inblock3.setAggregation(AggregationKind.COMPOSITE_LITERAL);
		p1InAsso3.setAggregation(AggregationKind.NONE_LITERAL);

		compositionAssociation.setPackage(model);
		
		/*
		 * create a flow property and add it to the Block
		 */
		Class flowPropertyClass = model.createOwnedClass("FPClass1", false); //$NON-NLS-1$
		flowPropertiesBlock = (Block) stereotypeApplicationHelper.applyStereotype(flowPropertyClass, BlocksPackage.eINSTANCE.getBlock(),null);
		Property p0 = flowPropertyClass.createOwnedAttribute("p0", null); //$NON-NLS-1$
		StereotypeApplicationHelper.getInstance(null).applyStereotype(p0, PortsAndFlowsPackage.eINSTANCE.getFlowProperty(),null);
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.blocks.Block#getReferences()
	 * <em>Reference</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.blocks.Block#getReferences()
	 */
	@Test
	public void testGetReferences() {  
		/*
		 * Test if association Aggregation is operational
		 */
		Assert.assertNotNull("References should not be null", owningAgregationBlock.getReferences()); //$NON-NLS-1$
		Assert.assertEquals("References size should be 1", 1,owningAgregationBlock.getReferences().size()); //$NON-NLS-1$
		/*
		 * Test if association Composition is not interfering
		 */
		Assert.assertNotNull("References should not be null", owningCompositionBlock.getReferences()); //$NON-NLS-1$
		Assert.assertEquals("References size should be 0", 0,owningCompositionBlock.getReferences().size()); //$NON-NLS-1$

	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.blocks.Block#getParts()
	 * <em>Part</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.blocks.Block#getParts()
	 */
	@Test
	public void testGetParts() {  
		/*
		 * Test if association Composition is not interfering
		 */
		Assert.assertNotNull("References should not be null", owningCompositionBlock.getParts()); //$NON-NLS-1$
		Assert.assertEquals("References size should be 1", 1,owningCompositionBlock.getParts().size()); //$NON-NLS-1$

	}


	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.blocks.Block#getFlowProperties()
	 * <em>FlowProperty</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.blocks.Block#getFlowProperties()
	 */
	@Test
	public void testGetFlowProperties() {  
		Assert.assertNotNull("FlowProperties should not be null", flowPropertiesBlock.getFlowProperties()); //$NON-NLS-1$
		Assert.assertEquals("FlowProperties size should be 1", 1, flowPropertiesBlock.getFlowProperties().size()); //$NON-NLS-1$
	}

} 
