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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage
 * @generated
 */
public interface PortsAndFlowsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortsAndFlowsFactory eINSTANCE = org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Accept Change Structural Feature Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Change Structural Feature Event Action</em>'.
	 * @generated
	 */
	AcceptChangeStructuralFeatureEventAction createAcceptChangeStructuralFeatureEventAction();

	/**
	 * Returns a new object of class '<em>Change Structural Feature Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Structural Feature Event</em>'.
	 * @generated
	 */
	ChangeStructuralFeatureEvent createChangeStructuralFeatureEvent();

	/**
	 * Returns a new object of class '<em>Directed Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directed Feature</em>'.
	 * @generated
	 */
	DirectedFeature createDirectedFeature();

	/**
	 * Returns a new object of class '<em>Flow Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Property</em>'.
	 * @generated
	 */
	FlowProperty createFlowProperty();

	/**
	 * Returns a new object of class '<em>Full Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Port</em>'.
	 * @generated
	 */
	FullPort createFullPort();

	/**
	 * Returns a new object of class '<em>Interface Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Block</em>'.
	 * @generated
	 */
	InterfaceBlock createInterfaceBlock();

	/**
	 * Returns a new object of class '<em>Invocation On Nested Port Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocation On Nested Port Action</em>'.
	 * @generated
	 */
	InvocationOnNestedPortAction createInvocationOnNestedPortAction();

	/**
	 * Returns a new object of class '<em>Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Flow</em>'.
	 * @generated
	 */
	ItemFlow createItemFlow();

	/**
	 * Returns a new object of class '<em>Proxy Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Port</em>'.
	 * @generated
	 */
	ProxyPort createProxyPort();

	/**
	 * Returns a new object of class '<em>Trigger On Nested Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger On Nested Port</em>'.
	 * @generated
	 */
	TriggerOnNestedPort createTriggerOnNestedPort();

	/**
	 * Returns a new object of class '<em>Conjugated Interface Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjugated Interface Block</em>'.
	 * @generated
	 */
	ConjugatedInterfaceBlock createConjugatedInterfaceBlock();

	/**
	 * Returns a new object of class '<em>Add Flow Property Value On Nested Port Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Flow Property Value On Nested Port Action</em>'.
	 * @generated
	 */
	AddFlowPropertyValueOnNestedPortAction createAddFlowPropertyValueOnNestedPortAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PortsAndFlowsPackage getPortsAndFlowsPackage();

} //PortsAndFlowsFactory
