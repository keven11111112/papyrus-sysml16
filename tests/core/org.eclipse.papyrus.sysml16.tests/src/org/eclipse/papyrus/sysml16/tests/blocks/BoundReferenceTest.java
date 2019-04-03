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
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.blocks.BoundReference;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>BoundReference</b></em>'.
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.blocks.BoundReferenceTest#testGetBindingPath <em>BindingPath</em>}</li>
 * </ul>
 * </p>
 */
public class BoundReferenceTest {

	private BoundReference defaultBoundReference = null;

	private Property p1 = null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() {
		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);


		Class composite = model.createOwnedClass("mainComposite", false); //$NON-NLS-1$
		stereotypeApplicationHelper.applyStereotype(composite, BlocksPackage.eINSTANCE.getBlock(), null);
		Class block1 = model.createOwnedClass("Block1", false); //$NON-NLS-1$
		stereotypeApplicationHelper.applyStereotype(block1, BlocksPackage.eINSTANCE.getBlock(), null);

		Class block2 = model.createOwnedClass("Block2", false); //$NON-NLS-1$
		stereotypeApplicationHelper.applyStereotype(block2, BlocksPackage.eINSTANCE.getBlock(), null);
		p1 = composite.createOwnedAttribute("P1", block1); //$NON-NLS-1$

		Property p2 = composite.createOwnedAttribute("P2", block2); //$NON-NLS-1$
		defaultBoundReference = (BoundReference) stereotypeApplicationHelper.applyStereotype(p2, BlocksPackage.eINSTANCE.getBoundReference(), null);

		Connector connector = composite.createOwnedConnector("connector"); //$NON-NLS-1$
		stereotypeApplicationHelper.applyStereotype(connector, BlocksPackage.eINSTANCE.getBindingConnector(), null);

		ConnectorEnd connectorEnd1 = connector.createEnd();
		connectorEnd1.setRole(p1);
		stereotypeApplicationHelper.applyStereotype(connector, BlocksPackage.eINSTANCE.getNestedConnectorEnd(), null);

		ConnectorEnd connectorEnd2 = connector.createEnd();
		connectorEnd2.setRole(p2);
		defaultBoundReference.setBoundEnd(connectorEnd1);
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.blocks.BoundReference#testGetBindingPath()
	 * <em>BindingPath</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.blocks.BoundReference#getBindingPath()
	 */
	@Test
	public void testGetBindingPath() {
		Assert.assertNotNull("bindingpath of bound reference can never be null", defaultBoundReference.getBindingPath()); //$NON-NLS-1$
		Assert.assertEquals("In this context the binding paht must be equals to 1", 1, defaultBoundReference.getBindingPath().size()); //$NON-NLS-1$
		Assert.assertTrue("The boundEnd is not contained in the BindingPath", defaultBoundReference.getBindingPath().contains(p1)); //$NON-NLS-1$
	}

}
