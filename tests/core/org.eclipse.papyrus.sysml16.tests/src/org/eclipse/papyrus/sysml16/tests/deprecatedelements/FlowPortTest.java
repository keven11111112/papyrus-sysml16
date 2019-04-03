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
import org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort;
import org.eclipse.papyrus.sysml16.deprecatedelements.FlowPortCustomImpl;
import org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind;
import org.eclipse.papyrus.sysml16.util.DeprecatedElementUtil;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '
 * <em><b>Flow Port</b></em>'.
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#isAtomic()
 * <em>Is Atomic</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getIcon()
 * <em>Get Icon</em>}</li>
 * </ul>
 * </p>
 *
 */
public class FlowPortTest {

	private Port p0 = null;

	private FlowPort fpDefault = null;

	private FlowPort fpOut = null;

	private FlowPort fpIn = null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() {
		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		// Create classes & interface
		Class c0 = model.createOwnedClass("c0", false); //$NON-NLS-1$
		Interface i2 = model.createOwnedInterface("i2"); //$NON-NLS-1$

		// Create type
		PrimitiveType ptype = model.createOwnedPrimitiveType("type"); //$NON-NLS-1$

		// Create ports
		p0 = c0.createOwnedPort("p0", null); //$NON-NLS-1$
		Port p1 = c0.createOwnedPort("p1", ptype); //$NON-NLS-1$
		Port p2 = c0.createOwnedPort("p2", i2); //$NON-NLS-1$

		// Add FlowPort stereotypes
		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);
		fpDefault = (FlowPort) stereotypeApplicationHelper.applyStereotype(p0, DeprecatedElementsPackage.eINSTANCE.getFlowPort(), null);

		fpOut = (FlowPort) stereotypeApplicationHelper.applyStereotype(p1, DeprecatedElementsPackage.eINSTANCE.getFlowPort(), null);
		fpOut.setDirection(FlowDirectionKind.OUT);
		fpIn = (FlowPort) stereotypeApplicationHelper.applyStereotype(p2, DeprecatedElementsPackage.eINSTANCE.getFlowPort(), null);
		fpIn.setDirection(FlowDirectionKind.IN);

		p2.setIsConjugated(true);

		// Add FlowSpecification
		stereotypeApplicationHelper.applyStereotype(i2, DeprecatedElementsPackage.eINSTANCE.getFlowSpecification(), null);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#isAtomic()
	 * <em>Is Atomic</em>}' feature getter.
	 *
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#isAtomic()
	 */
	@Test
	public void testIsAtomic() {
		Assert.assertTrue("FlowPort without type is Atomic", fpDefault.isAtomic()); //$NON-NLS-1$
		Assert.assertTrue("FlowPort type is not a FlowSpecification", fpOut.isAtomic()); //$NON-NLS-1$
		Assert.assertFalse("FlowPort type is a FlowSpecification", fpIn.isAtomic()); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getIcon() <em>Get Icon</em>}' operation.
	 *
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getIcon()
	 * 
	 */
	@Test
	public void testGetIcon() {
		Image imageIn = FlowPortCustomImpl.getIcons(fpIn).get("FlowPort_IN"); //$NON-NLS-1$
		Image imageOut = FlowPortCustomImpl.getIcons(fpOut).get("FlowPort_OUT"); //$NON-NLS-1$
		Image imageInOut = FlowPortCustomImpl.getIcons(fpDefault).get("FlowPort_INOUT"); //$NON-NLS-1$

		Assert.assertEquals("A Flow property with an INOUT direction must have the INOUT image", imageInOut, fpDefault.getIcon()); //$NON-NLS-1$
		Assert.assertEquals("A Flow property with an OUT direction must have the OUT image", imageOut, fpOut.getIcon()); //$NON-NLS-1$
		Assert.assertEquals("A Flow property with an IN direction must have the IN image", imageIn, fpIn.getIcon()); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.papyrus.sysml16.util.DeprecatedElementUtil#isDeprecatedElement()
	 * <em>Is Deprecated</em>}' feature getter.
	 *
	 * @see org.eclipse.papyrus.sysml16.util.DeprecatedElementUtil#isDeprecatedElement()
	 */
	@Test
	public void testIsDeprecated() {
		Assert.assertTrue("FlowPort is deprecated", DeprecatedElementUtil.isDeprecatedElement(p0)); //$NON-NLS-1$
		Assert.assertTrue("FlowPort is deprecated", DeprecatedElementUtil.isDeprecatedElement(fpOut)); //$NON-NLS-1$
	}
}
