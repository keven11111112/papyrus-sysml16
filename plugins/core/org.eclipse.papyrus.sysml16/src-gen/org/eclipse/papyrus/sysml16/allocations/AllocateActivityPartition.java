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
package org.eclipse.papyrus.sysml16.allocations;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ActivityPartition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocate Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AllocateActivityPartition is used to depict an «allocate» relationship on an Activity diagram. The AllocateActivityPartition is a standard UML2::ActivityPartition, with modified constraints as stated in the paragraph below.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.allocations.AllocateActivityPartition#getBase_ActivityPartition <em>Base Activity Partition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.allocations.AllocationsPackage#getAllocateActivityPartition()
 * @model
 * @generated
 */
public interface AllocateActivityPartition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity Partition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity Partition</em>' reference.
	 * @see #setBase_ActivityPartition(ActivityPartition)
	 * @see org.eclipse.papyrus.sysml16.allocations.AllocationsPackage#getAllocateActivityPartition_Base_ActivityPartition()
	 * @model ordered="false"
	 * @generated
	 */
	ActivityPartition getBase_ActivityPartition();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.allocations.AllocateActivityPartition#getBase_ActivityPartition <em>Base Activity Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity Partition</em>' reference.
	 * @see #getBase_ActivityPartition()
	 * @generated
	 */
	void setBase_ActivityPartition(ActivityPartition value);

} // AllocateActivityPartition
