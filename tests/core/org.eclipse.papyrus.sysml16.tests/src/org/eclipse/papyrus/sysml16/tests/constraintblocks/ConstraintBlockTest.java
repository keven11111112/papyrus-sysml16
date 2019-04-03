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

package org.eclipse.papyrus.sysml16.tests.constraintblocks;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlock;
import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlocksPackage;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
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
 * <li>{@link org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlock#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 */
public class ConstraintBlockTest {

	private ConstraintBlock constraintBlock = null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() {
		// Prepare Model test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);

		/*
		 * Constraint blocks support a special form of compartment, with the label “parameters,” which may contain declarations for
		 * some or all of its constraint parameters. Properties of a constraint block should be shown either in the constraints
		 * compartment, for org eclipse uml2 create nested constraint properties, or within the parameters compartment.
		 */

		Class ownedBlockClass3 = model.createOwnedClass("Block3", false); //$NON-NLS-1$
		stereotypeApplicationHelper.applyStereotype(ownedBlockClass3, BlocksPackage.eINSTANCE.getBlock(), null);

		// The root constraintBlock
		Class constraintBlockClass = model.createOwnedClass("ConstraintBlock", false); //$NON-NLS-1$
		constraintBlock = (ConstraintBlock) stereotypeApplicationHelper.applyStereotype(constraintBlockClass, ConstraintBlocksPackage.eINSTANCE.getConstraintBlock(), null);

		Class ownedBlockClass2 = model.createOwnedClass("Block2", false); //$NON-NLS-1$
		stereotypeApplicationHelper.applyStereotype(ownedBlockClass2, BlocksPackage.eINSTANCE.getBlock(), null);

		// create a owned property type by a ConstraintBlock
		constraintBlockClass.createOwnedAttribute("cbProperty", constraintBlockClass); //$NON-NLS-1$
		// create a owned property type by a Block
		constraintBlockClass.createOwnedAttribute("uncbProperty", ownedBlockClass2); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlock#getParameters()
	 * <em>FlowProperty</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlock#getParameters
	 */
	@Test
	public void testGetParameters() {
		Assert.assertNotNull("Parameters should not be null", constraintBlock.getParameters()); //$NON-NLS-1$
		Assert.assertEquals("Parameters size should be 1", 1, constraintBlock.getParameters().size()); //$NON-NLS-1$
	}

}
