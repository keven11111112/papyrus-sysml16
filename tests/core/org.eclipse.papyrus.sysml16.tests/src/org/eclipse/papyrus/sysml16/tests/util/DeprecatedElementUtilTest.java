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

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.deprecatedelements.DeprecatedElementsPackage;
import org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort;
import org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification;
import org.eclipse.papyrus.sysml16.util.DeprecatedElementUtil;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for deprecated utility class
 * 
 */
public class DeprecatedElementUtilTest {

	/**
	 * Check that FlowPort and FlowSpecification are deprecated
	 */
	@Test
	public void testIsDeprecatedElement()  {
		// Prepare Model test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);
		Class c0 = model.createOwnedClass("class", false); //$NON-NLS-1$

		// Create ports
		Port port = c0.createOwnedPort("port", null); //$NON-NLS-1$

		FlowPort fpDefault = (FlowPort) stereotypeApplicationHelper.applyStereotype(port, DeprecatedElementsPackage.eINSTANCE.getFlowPort(),null);

		Assert.assertTrue("FlowPort should be deprecated", DeprecatedElementUtil.isDeprecatedElement(fpDefault)); //$NON-NLS-1$
		Assert.assertTrue("FlowPort should be deprecated", DeprecatedElementUtil.isDeprecatedElement(port)); //$NON-NLS-1$
		
		Interface flowSpecificationInterface=model.createOwnedInterface("FlowSpecification1"); //$NON-NLS-1$
		FlowSpecification flowSpecification = (FlowSpecification) stereotypeApplicationHelper.applyStereotype(flowSpecificationInterface, DeprecatedElementsPackage.eINSTANCE.getFlowSpecification(),null);
		Assert.assertTrue("FlowSpecification should be deprecated", DeprecatedElementUtil.isDeprecatedElement(flowSpecificationInterface)); //$NON-NLS-1$
		Assert.assertTrue("FlowSpecification should be deprecated", DeprecatedElementUtil.isDeprecatedElement(flowSpecification)); //$NON-NLS-1$
		
		Class blockClass=model.createOwnedClass("Block1", false); //$NON-NLS-1$
		Block block = (Block) stereotypeApplicationHelper.applyStereotype(blockClass, BlocksPackage.eINSTANCE.getBlock(),null);
		Assert.assertFalse("Class should not be deprecated", DeprecatedElementUtil.isDeprecatedElement(blockClass)); //$NON-NLS-1$
		Assert.assertFalse("Block should not be deprecated", DeprecatedElementUtil.isDeprecatedElement(block));	//$NON-NLS-1$
		
	}

}
