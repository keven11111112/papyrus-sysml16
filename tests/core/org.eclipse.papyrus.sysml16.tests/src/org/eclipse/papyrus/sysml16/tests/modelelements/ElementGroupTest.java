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
import org.eclipse.papyrus.sysml16.modelelements.ElementGroup;
import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>ElementGroupTest</b></em>'.
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getCriterion <em>Criterion</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getSize <em>Size</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 */
public class ElementGroupTest {

	private static final String CRITERION = "Authored by Patrick"; //$NON-NLS-1$

	private ElementGroup defaultElementgroup=null;

	private Class class1=null;

	private Class class2=null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp()  {

		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());

		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		// Create comments & class
		Comment defaultComment= model.createOwnedComment();
		defaultElementgroup = (ElementGroup)StereotypeApplicationHelper.getInstance(null).applyStereotype(defaultComment, ModelElementsPackage.eINSTANCE.getElementGroup(),null);
		defaultComment.setBody(CRITERION);
		class1 = model.createOwnedClass("Class1", false); //$NON-NLS-1$
		class2 = model.createOwnedClass("Class2", false); //$NON-NLS-1$
		defaultComment.getAnnotatedElements().add(class1);
		defaultComment.getAnnotatedElements().add(class2);
		

	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getCriterion()
	 * <em>criterion</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getCriterion()
	 */
	@Test
	public void testGetCriterion() {
		Assert.assertEquals("The criterion of Elementgroup is badly computed, it must be equals to the body of the comment",CRITERION, defaultElementgroup.getCriterion()); //$NON-NLS-1$
	}
	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getSize()
	 * <em>Size</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getSize()
	 */
	@Test
	public void testGetSize() {
		Assert.assertEquals("Size of ElementGroup is badly computed. It must contain two elements",2,defaultElementgroup.getSize()); //$NON-NLS-1$
	}
	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getMember()
	 * <em>Member</em>}' feature getter. 
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getMember()
	 */
	@Test
	public void testGetMember() {
		Assert.assertEquals("Member of elementGroup is badly computed, the content of the list member is not correct",class1,defaultElementgroup.getMember().get(0)); //$NON-NLS-1$
		Assert.assertEquals("Member of elementGroup is badly computed, the content of the list member is not correct",class2,defaultElementgroup.getMember().get(1)); //$NON-NLS-1$
	}
}
