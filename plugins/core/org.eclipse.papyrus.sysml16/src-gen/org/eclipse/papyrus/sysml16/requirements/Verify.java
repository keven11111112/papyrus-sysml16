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
package org.eclipse.papyrus.sysml16.requirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Verify relationship is a dependency between a requirement and a test case or other model element that can determine whether a system fulfills the requirement. As with other dependencies, the arrow direction points from the (client) element to the (supplier) requirement.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.sysml16.requirements.RequirementsPackage#getVerify()
 * @model
 * @generated
 */
public interface Verify extends Trace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model refRequired="true" refOrdered="false" resultMany="true" resultOrdered="false"
	 * @generated
	 */
	void getVerifies(NamedElement ref, EList<Requirement> result);

} // Verify
