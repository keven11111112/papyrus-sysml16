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
import org.eclipse.papyrus.sysml16.modelelements.Viewpoint;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>ViewPoint</b></em>'.
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getConcern <em>Concern</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 */
@SuppressWarnings("nls")
public class ViewPointTest {

	private static final String THIS_IS_THE_BODY_OF_COMMENT2 = "this is the body of comment2"; //$NON-NLS-1$

	private static final String THIS_IS_THE_BODY_OF_COMMENT1 = "this is the body of comment1"; //$NON-NLS-1$

	private Viewpoint defaultViewpoint = null;

	private Behavior ownedBehavior = null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() {

		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());

		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		// Create classes & interface
		Class defaultClass = model.createOwnedClass("defaultClass", false); //$NON-NLS-1$

		// Add viewPoint stereotypes
		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);
		defaultViewpoint = (Viewpoint) stereotypeApplicationHelper.applyStereotype(defaultClass, ModelElementsPackage.eINSTANCE.getViewpoint(), null);
		Comment comment1 = UMLFactory.eINSTANCE.createComment();
		comment1.setBody(THIS_IS_THE_BODY_OF_COMMENT1);
		model.getOwnedComments().add(comment1);
		Comment comment2 = UMLFactory.eINSTANCE.createComment();
		comment2.setBody(THIS_IS_THE_BODY_OF_COMMENT2);
		model.getOwnedComments().add(comment2);
		defaultViewpoint.getConcernList().add(comment1);
		defaultViewpoint.getConcernList().add(comment2);
		Operation createOperation = UMLFactory.eINSTANCE.createOperation();
		createOperation.setName("View"); //$NON-NLS-1$
		defaultClass.getOwnedOperations().add(createOperation);
		ownedBehavior = defaultClass.createOwnedBehavior("aBehavior", UMLPackage.eINSTANCE.getActivity()); //$NON-NLS-1$
		createOperation.getMethods().add(ownedBehavior);
		stereotypeApplicationHelper.applyStereotype(createOperation, StandardPackage.eINSTANCE.getCreate(), null);
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.modelelements.viewpoint#getConcern()
	 * <em>concern</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.modelelements.viewpoint#getConcern()
	 */
	@Test
	public void testGetConcern() {
		Assert.assertEquals("The derived property concern is badly calculated.The size of the list must 2.", 2, defaultViewpoint.getConcern().size()); //$NON-NLS-1$
		Assert.assertEquals("The derived property concern is badly calculated. Concern must contain at the first place the body of the first comment", THIS_IS_THE_BODY_OF_COMMENT1, defaultViewpoint.getConcern().get(0)); //$NON-NLS-1$
		Assert.assertEquals("The derived property concern is badly calculated. Concern must contain at the second place the body of the second comment", THIS_IS_THE_BODY_OF_COMMENT2, defaultViewpoint.getConcern().get(1)); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.modelelements.viewpoint#getBehavior()
	 * <em>behavior</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.modelelements.viewpoint#getBehavior()
	 */
	@Test
	public void testGetMethod() {
		Assert.assertEquals("The derived property method is badly calculated. The size of the list must 1", 1, defaultViewpoint.getMethod().size()); //$NON-NLS-1$
		Assert.assertEquals("The derived property method is badly calculated. The view point must contained in the list", ownedBehavior, defaultViewpoint.getMethod().get(0)); //$NON-NLS-1$
	}
}
