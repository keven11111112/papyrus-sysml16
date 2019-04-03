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

package org.eclipse.papyrus.sysml16.tests.modelelements;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;
import org.eclipse.papyrus.sysml16.modelelements.Stakeholder;
import org.eclipse.papyrus.sysml16.modelelements.View;
import org.eclipse.papyrus.sysml16.modelelements.Viewpoint;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>View</b></em>'.
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.modelelements.View#getViewPoint() <em>View Point</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.modelelements.View#getStakeholder() <em>Stakeholder</em>}</li>
 * </ul>
 * </p>
 */
public class ViewTest {

	private Viewpoint viewpoint = null;

	private View defaultView = null;

	private Stakeholder stakeholder;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp()  {

		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());

		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		// Create class
		Class defaultClass = model.createOwnedClass("View1", false); //$NON-NLS-1$

		Class class1 = model.createOwnedClass("Viewpoint1", false); //$NON-NLS-1$
		Class class2= model.createOwnedClass("stakeholder", false); //$NON-NLS-1$

		// Add View stereotype

		defaultView = (View)StereotypeApplicationHelper.getInstance(null).applyStereotype(defaultClass, ModelElementsPackage.eINSTANCE.getView(),null);

		// Add ViewPoint stereotype
		viewpoint = (Viewpoint)StereotypeApplicationHelper.getInstance(null).applyStereotype(class1, ModelElementsPackage.eINSTANCE.getViewpoint(),null);
		stakeholder = (Stakeholder)StereotypeApplicationHelper.getInstance(null).applyStereotype(class2, ModelElementsPackage.eINSTANCE.getStakeholder(),null);


		// create conform link based on Generalization
		Generalization generalization=defaultClass.createGeneralization(class1);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(generalization, ModelElementsPackage.eINSTANCE.getConform(),null);
		
		//add stakeholder to the viewpoint
		viewpoint.getStakeholder().add(stakeholder);

	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.modelelements.View#getViewPoint()
	 * <em>View Point</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.modelelements.View#getViewPoint()
	 */
	@Test
	public void testGetViewPoint() {
		Assert.assertNotNull("The derived property viewpoint is baldy computed for View, it must not be null", defaultView.getViewPoint()); //$NON-NLS-1$
		Assert.assertEquals("The derived property viewpoint is baldy computed for View, it must not be equal to view point",viewpoint, defaultView.getViewPoint()); //$NON-NLS-1$
	}
	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.modelelements.View#getStakeholder()
	 * <em>Stakeholder</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.modelelements.View#getStakeholder()
	 */
	@Test
	public void testGetStakeholder() {
		Assert.assertEquals("The derived property Stakeholder is baldy computed for View, it must not be equal to 1",1, defaultView.getStakeholder().size()); //$NON-NLS-1$
		Assert.assertTrue("The derived property Stakeholder is baldy computed for View, it must not be equal to the stakeholder",defaultView.getStakeholder().contains(stakeholder)); //$NON-NLS-1$
	}

}
