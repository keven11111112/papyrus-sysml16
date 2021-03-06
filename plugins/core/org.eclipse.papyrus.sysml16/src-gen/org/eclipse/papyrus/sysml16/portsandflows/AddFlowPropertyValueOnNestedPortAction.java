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

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.ElementPropertyPath;

import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Flow Property Value On Nested Port Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction#getOnNestedPort <em>On Nested Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction#getBase_AddStructuralFeatureValueAction <em>Base Add Structural Feature Value Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getAddFlowPropertyValueOnNestedPortAction()
 * @model
 * @generated
 */
public interface AddFlowPropertyValueOnNestedPortAction extends ElementPropertyPath {
	/**
	 * Returns the value of the '<em><b>On Nested Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Nested Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Nested Port</em>' reference list.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getAddFlowPropertyValueOnNestedPortAction_OnNestedPort()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getOnNestedPort();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>On Nested Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOnNestedPort()
	 * @generated
	 */
	Port getOnNestedPort(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>On Nested Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOnNestedPort()
	 * @generated
	 */
	Port getOnNestedPort(String name, Type type, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Base Add Structural Feature Value Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Add Structural Feature Value Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Add Structural Feature Value Action</em>' reference.
	 * @see #setBase_AddStructuralFeatureValueAction(AddStructuralFeatureValueAction)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getAddFlowPropertyValueOnNestedPortAction_Base_AddStructuralFeatureValueAction()
	 * @model ordered="false"
	 * @generated
	 */
	AddStructuralFeatureValueAction getBase_AddStructuralFeatureValueAction();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction#getBase_AddStructuralFeatureValueAction <em>Base Add Structural Feature Value Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Add Structural Feature Value Action</em>' reference.
	 * @see #getBase_AddStructuralFeatureValueAction()
	 * @generated
	 */
	void setBase_AddStructuralFeatureValueAction(AddStructuralFeatureValueAction value);

} // AddFlowPropertyValueOnNestedPortAction
