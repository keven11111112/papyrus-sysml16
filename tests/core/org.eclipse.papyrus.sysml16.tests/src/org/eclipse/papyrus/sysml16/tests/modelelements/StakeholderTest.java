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
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Stakeholder</b></em>'.
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.modelelements.StakeholderTest#testGetConcern <em>Concern</em>}</li>
 * </ul>
 * </p>
 */
public class StakeholderTest {

	private static final String THIS_IS_THE_BODY_OF_COMMENT2 = "this is the body of comment2"; //$NON-NLS-1$

	private static final String THIS_IS_THE_BODY_OF_COMMENT1 = "this is the body of comment1"; //$NON-NLS-1$

	private Stakeholder defaultStakeholder= null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp()  {
		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());
		
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		// Create classes & interface
		Class defaultClass = model.createOwnedClass("defaultClass", false); //$NON-NLS-1$

		// Add stakeholder stereotypes
		defaultStakeholder = (Stakeholder)StereotypeApplicationHelper.getInstance(null).applyStereotype(defaultClass, ModelElementsPackage.eINSTANCE.getStakeholder(),null);
		Comment comment1=UMLFactory.eINSTANCE.createComment();
		comment1.setBody(THIS_IS_THE_BODY_OF_COMMENT1);
		model.getOwnedComments().add(comment1);
		Comment comment2=UMLFactory.eINSTANCE.createComment();
		comment2.setBody(THIS_IS_THE_BODY_OF_COMMENT2);
		model.getOwnedComments().add(comment2);
		defaultStakeholder.getConcernList().add(comment1);
		defaultStakeholder.getConcernList().add(comment2);
	}


	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.modelelements.Stakeholder#getConcern()
	 * <em>concern</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.modelelements.Stakeholder#getConcern()
	 */
	@Test
	public void testGetConcern() {
		Assert.assertEquals("The derived property concern is badly calculated, the size of the list must be 2.", 2, defaultStakeholder.getConcern().size()); //$NON-NLS-1$
		Assert.assertEquals("The derived property concern is badly calculated, the body of the first comment is not at the first place",THIS_IS_THE_BODY_OF_COMMENT1,defaultStakeholder.getConcern().get(0)); //$NON-NLS-1$
		Assert.assertEquals("The derived property concern is badly calculated, the body of the second comment is not à the second place",THIS_IS_THE_BODY_OF_COMMENT2,defaultStakeholder.getConcern().get(1)); //$NON-NLS-1$
	}

}
