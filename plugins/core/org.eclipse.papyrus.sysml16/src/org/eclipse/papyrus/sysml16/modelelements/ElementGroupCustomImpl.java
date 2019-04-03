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

package org.eclipse.papyrus.sysml16.modelelements;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * 
 *
 */
public class ElementGroupCustomImpl extends ElementGroupImpl {

	

	/**
	 * 7.3.2.2 ElementGroup : /criterion[0..1]: String Specifies the rationale for being member of the group. 
	 * Adding an element to the group asserts that the criterion applies to this element.
	 * Derived from Comment::body.
	 * 
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getCriterion()
	 * @return
	 */
	@Override
	public String getCriterion() {
		String criterion = ""; //$NON-NLS-1$
		Comment comment = getBase_Comment();
		if (comment != null){
			criterion = comment.getBody();
		}
		return criterion;
	}


	/**
	 * 7.3.2.2 ElementGroup : /criterion[0..1]: String Specifies the rationale for being member of the group. 
	 * Adding an element to the group asserts that the criterion applies to this element.
	 * Derived from Comment::body.
	 * 
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#setCriterion(java.lang.String)
	 *
	 * @param newCriterion
	 */
	public void setCriterion(String newCriterion) {
		Comment comment = getBase_Comment();
		if (comment != null){
			comment.setBody(newCriterion);
		}
	}

	/**
	 * 
	 * 7.3.2.2 ElementGroup : /member: Element[0..*] Set specifying the members of the group. 
	 * Derived from Comment::annotatedElement.
	 * 
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getMember()
	 *
	 * @return
	 */
	@Override
	public EList<Element> getMember() {
		BasicEList<Element> elementEList = new BasicEList<>();
		Comment comment = getBase_Comment();
		if (comment != null){
			elementEList.addAll( comment.getAnnotatedElements());
		}	
		return new UnmodifiableEList<>(this, ModelElementsPackage.eINSTANCE.getElementGroup_Member(), elementEList.size(), elementEList.toArray());
	}
	
	/**
	 * 7.3.2.2 ElementGroup : /size: Integer Number of members in the group. Derived.
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getSize()
	 *
	 * @return
	 */
	@Override
	public int getSize() {
		return getMember().size();
	}	
}
