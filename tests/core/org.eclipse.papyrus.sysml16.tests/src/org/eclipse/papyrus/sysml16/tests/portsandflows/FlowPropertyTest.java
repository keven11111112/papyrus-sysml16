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

package org.eclipse.papyrus.sysml16.tests.portsandflows;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind;
import org.eclipse.papyrus.sysml16.portsandflows.FlowProperty;
import org.eclipse.papyrus.sysml16.portsandflows.FlowPropertyCustomImpl;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Flow Property</b></em>'.
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.portsandflows.FlowProperty#getIcon() <em>Get Icon</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysm16.portsandflows.FlowProperty#getIcon()
 * <em>Get Icon</em>}</li>
 * </ul>
 * </p>
 */
public class FlowPropertyTest {

	private FlowProperty fpIn = null;

	private FlowProperty fpOut = null;

	private FlowProperty fpInOut = null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() {
		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());

		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		// Create interface
		Interface i = model.createOwnedInterface("i"); //$NON-NLS-1$

		// Create properties
		Property p0 = i.createOwnedAttribute("p0", null); //$NON-NLS-1$
		Property p1 = i.createOwnedAttribute("p1", null); //$NON-NLS-1$
		Property p2 = i.createOwnedAttribute("p2", null); //$NON-NLS-1$

		// Add FlowPort stereotypes
		fpIn = (FlowProperty) StereotypeApplicationHelper.getInstance(null).applyStereotype(p0, PortsAndFlowsPackage.eINSTANCE.getFlowProperty(), null);
		fpIn.setDirection(FlowDirectionKind.IN);

		fpOut = (FlowProperty) StereotypeApplicationHelper.getInstance(null).applyStereotype(p1, PortsAndFlowsPackage.eINSTANCE.getFlowProperty(), null);
		fpOut.setDirection(FlowDirectionKind.OUT);

		fpInOut = (FlowProperty) StereotypeApplicationHelper.getInstance(null).applyStereotype(p2, PortsAndFlowsPackage.eINSTANCE.getFlowProperty(), null);
		fpInOut.setDirection(FlowDirectionKind.INOUT);

	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysm16.portsandflows.FlowProperty#getIcon()
	 * <em>Get Icon</em>}' operation.
	 *
	 * @see org.eclipse.papyrus.sysm16.portsandflows.FlowProperty#getIcon()
	 * 
	 */
	@Test
	public void testGetIcon() {
		Image imageIn = FlowPropertyCustomImpl.getIcons(fpIn).get("FlowProperty_IN"); //$NON-NLS-1$
		Image imageOut = FlowPropertyCustomImpl.getIcons(fpOut).get("FlowProperty_OUT"); //$NON-NLS-1$
		Image imageInOut = FlowPropertyCustomImpl.getIcons(fpInOut).get("FlowProperty_INOUT"); //$NON-NLS-1$

		Assert.assertEquals("A Flow property with an INOUT direction must have the INOUT image", imageInOut, fpInOut.getIcon()); //$NON-NLS-1$
		Assert.assertEquals("A Flow property with an OUT direction must have the OUT image", imageOut, fpOut.getIcon()); //$NON-NLS-1$
		Assert.assertEquals("A Flow property with an IN direction must have the IN image", imageIn, fpIn.getIcon()); //$NON-NLS-1$
	}

}
