/**
 * Copyright (c) 2019 CEA LIST.
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
 */
package org.eclipse.papyrus.sysml16.modelelements;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             A Rationale documents the justification for decisions and the requirements, design, and other decisions. A Rationale can be attached to any model element including relationships. It allows the user, for example, to specify a rationale that may reference more detailed documentation such as a trade study or analysis report. Rationale is a stereotype of comment and may be attached to any other model element in the same manner as a comment.
 *           
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Rationale#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getRationale()
 * @model
 * @generated
 */
public interface Rationale extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Comment</em>' reference.
	 * @see #setBase_Comment(Comment)
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getRationale_Base_Comment()
	 * @model ordered="false"
	 * @generated
	 */
	Comment getBase_Comment();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.modelelements.Rationale#getBase_Comment <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Comment</em>' reference.
	 * @see #getBase_Comment()
	 * @generated
	 */
	void setBase_Comment(Comment value);

} // Rationale
