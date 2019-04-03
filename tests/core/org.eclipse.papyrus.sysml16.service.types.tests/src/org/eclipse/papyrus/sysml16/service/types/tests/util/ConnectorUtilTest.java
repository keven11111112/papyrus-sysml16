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

package org.eclipse.papyrus.sysml16.service.types.tests.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.papyrus.sysml16.service.types.util.ConnectorUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Test;

public class ConnectorUtilTest {

	/**
	 * Data structure:
	 * | clazzRoot 		|
	 * | P1: clazzType1 |
	 * 
	 * | clazzType1 	| | clazzType2 	   | | clazzType3     |
	 * | P2: clazzType2 | | P3: clazzType3 | | P4: clazzType1 |
	 * 
	 * View structure:
	 * |clazzRootViewNode |
	 * | |p1View  		 ||
	 * | | |p2View 	   	|||
	 * | | | |p3View    |||
	 * | | | | |p4View ||||
	 * 
	 * results:
	 * - nested path for p4View : {P1, P2, P3}
	 * - nested path for p2View : {P1}
	 * 
	 * [SysML 1.6 - 8.3.2.9]: "The ordering of properties is from a property of the context block, through a 
	 * property of each intermediate block that types the preceding property, ending in a property with a type
	 * that owns or inherits the fully nested property."
	 */
	@Test
	public void testGetNestedPath() {
		// Data structure
		Class clazzRoot = UMLFactory.eINSTANCE.createClass();
		Class clazzType1 = UMLFactory.eINSTANCE.createClass();
		Class clazzType2 = UMLFactory.eINSTANCE.createClass();
		Class clazzType3 = UMLFactory.eINSTANCE.createClass();
		Property p1 = clazzRoot.createOwnedAttribute("P1", clazzType1); //$NON-NLS-1$
		Property p2 = clazzType1.createOwnedAttribute("P2", clazzType2); //$NON-NLS-1$
		Property p3 = clazzType2.createOwnedAttribute("P3", clazzType3); //$NON-NLS-1$
		Property p4 = clazzType3.createOwnedAttribute("P4", clazzType1); //$NON-NLS-1$

		// View structure
		Node p4View = NotationFactory.eINSTANCE.createNode();
		p4View.setElement(p4);

		Node p3View = NotationFactory.eINSTANCE.createNode();
		p3View.setElement(p3);
		p3View.insertChild(p4View);

		Node p2View = NotationFactory.eINSTANCE.createNode();
		p2View.setElement(p2);
		p2View.insertChild(p3View);

		Node p1View = NotationFactory.eINSTANCE.createNode();
		p1View.setElement(p1);
		p1View.insertChild(p2View);

		Node clazzRootViewNode = NotationFactory.eINSTANCE.createNode();
		clazzRootViewNode.setElement(clazzRoot);
		clazzRootViewNode.insertChild(p1View);

		List<Property> nestedPath = ConnectorUtil.getNestedPath(clazzRoot, p4View);
		assertEquals("Wrong nested path, expected {P1, P2, P3}", Arrays.asList(p1, p2, p3), nestedPath); //$NON-NLS-1$
		
		nestedPath = ConnectorUtil.getNestedPath(clazzRoot, p2View);
		assertTrue("Wrong nested path, expected {P1}", nestedPath.size() == 1 && nestedPath.get(0) == p1); //$NON-NLS-1$
	}

	/**
	 * Data structure:
	 * | clazzRoot 		|
	 * | P1: clazzType1 |
	 * | P2: clazzType1 |
	 * 
	 * | clazzType	 	|
	 * | P3: clazzType1 |
	 * 
	 * View structure:
	 * +-------------------------+
	 * |      clazzRootView      |
	 * +-------------------------+
	 * |   p1View   |   p2View   |
	 * |+----------+|+----------+|
	 * ||p3ViewInP1|||p3ViewInP2||
	 * |+----------+|+----------+|
	 * +-------------------------+
	 */
	@Test
	public void testGetNestedPath_sameProperty_differentView() {
		Class clazzRoot = UMLFactory.eINSTANCE.createClass();
		Class clazzType = UMLFactory.eINSTANCE.createClass();
		Property p1 = clazzRoot.createOwnedAttribute("P1", clazzType); //$NON-NLS-1$
		Property p2 = clazzRoot.createOwnedAttribute("P2", clazzType); //$NON-NLS-1$
		Property p3 = clazzType.createOwnedAttribute("P3", clazzType); //$NON-NLS-1$
	
		Node p3ViewInpP1 = NotationFactory.eINSTANCE.createNode();
		p3ViewInpP1.setElement(p3);
		
		Node p3ViewInpP2 = NotationFactory.eINSTANCE.createNode();
		p3ViewInpP2.setElement(p3);
		
		Node p2View = NotationFactory.eINSTANCE.createNode();
		p2View.setElement(p2);
		p2View.insertChild(p3ViewInpP2);
		
		Node p1View = NotationFactory.eINSTANCE.createNode();
		p1View.setElement(p1);
		p1View.insertChild(p3ViewInpP1);
		
		Node clazzRootView = NotationFactory.eINSTANCE.createNode();
		clazzRootView.setElement(clazzRoot);
		clazzRootView.insertChild(p1View);
		clazzRootView.insertChild(p2View);
		
		List<Property> nestedPath = ConnectorUtil.getNestedPath(clazzRoot, p3ViewInpP1);
		assertEquals("Wrong nested path, expected {P1}", Arrays.asList(p1), nestedPath); //$NON-NLS-1$
		
		nestedPath = ConnectorUtil.getNestedPath(clazzRoot, p3ViewInpP2);
		assertEquals("Wrong nested path, expected {P2}", Arrays.asList(p2), nestedPath); //$NON-NLS-1$
	
	}
}
