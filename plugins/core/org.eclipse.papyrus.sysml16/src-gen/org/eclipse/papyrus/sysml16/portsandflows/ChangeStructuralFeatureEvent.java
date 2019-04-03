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
package org.eclipse.papyrus.sysml16.portsandflows;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Structural Feature Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent#getBase_ChangeEvent <em>Base Change Event</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent#getStructuralFeature <em>Structural Feature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getChangeStructuralFeatureEvent()
 * @model
 * @generated
 */
public interface ChangeStructuralFeatureEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Change Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Change Event</em>' reference.
	 * @see #setBase_ChangeEvent(ChangeEvent)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getChangeStructuralFeatureEvent_Base_ChangeEvent()
	 * @model ordered="false"
	 * @generated
	 */
	ChangeEvent getBase_ChangeEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent#getBase_ChangeEvent <em>Base Change Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Change Event</em>' reference.
	 * @see #getBase_ChangeEvent()
	 * @generated
	 */
	void setBase_ChangeEvent(ChangeEvent value);

	/**
	 * Returns the value of the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Feature</em>' reference.
	 * @see #setStructuralFeature(StructuralFeature)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getChangeStructuralFeatureEvent_StructuralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getStructuralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent#getStructuralFeature <em>Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Feature</em>' reference.
	 * @see #getStructuralFeature()
	 * @generated
	 */
	void setStructuralFeature(StructuralFeature value);

} // ChangeStructuralFeatureEvent
