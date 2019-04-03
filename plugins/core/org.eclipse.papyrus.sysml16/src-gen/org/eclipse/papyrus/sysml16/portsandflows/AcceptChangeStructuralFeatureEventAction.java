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

import org.eclipse.uml2.uml.AcceptEventAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Change Structural Feature Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.AcceptChangeStructuralFeatureEventAction#getBase_AcceptEventAction <em>Base Accept Event Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getAcceptChangeStructuralFeatureEventAction()
 * @model
 * @generated
 */
public interface AcceptChangeStructuralFeatureEventAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Accept Event Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #setBase_AcceptEventAction(AcceptEventAction)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction()
	 * @model ordered="false"
	 * @generated
	 */
	AcceptEventAction getBase_AcceptEventAction();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.AcceptChangeStructuralFeatureEventAction#getBase_AcceptEventAction <em>Base Accept Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #getBase_AcceptEventAction()
	 * @generated
	 */
	void setBase_AcceptEventAction(AcceptEventAction value);

} // AcceptChangeStructuralFeatureEventAction
