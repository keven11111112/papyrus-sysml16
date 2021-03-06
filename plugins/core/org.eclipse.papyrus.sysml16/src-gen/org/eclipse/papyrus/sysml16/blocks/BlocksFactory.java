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
package org.eclipse.papyrus.sysml16.blocks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml16.blocks.BlocksPackage
 * @generated
 */
public interface BlocksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlocksFactory eINSTANCE = org.eclipse.papyrus.sysml16.blocks.internal.impl.BlocksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adjunct Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjunct Property</em>'.
	 * @generated
	 */
	AdjunctProperty createAdjunctProperty();

	/**
	 * Returns a new object of class '<em>Binding Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Connector</em>'.
	 * @generated
	 */
	BindingConnector createBindingConnector();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Bound Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound Reference</em>'.
	 * @generated
	 */
	BoundReference createBoundReference();

	/**
	 * Returns a new object of class '<em>End Path Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Path Multiplicity</em>'.
	 * @generated
	 */
	EndPathMultiplicity createEndPathMultiplicity();

	/**
	 * Returns a new object of class '<em>Classifier Behavior Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Behavior Property</em>'.
	 * @generated
	 */
	ClassifierBehaviorProperty createClassifierBehaviorProperty();

	/**
	 * Returns a new object of class '<em>Connector Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Property</em>'.
	 * @generated
	 */
	ConnectorProperty createConnectorProperty();

	/**
	 * Returns a new object of class '<em>Distributed Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distributed Property</em>'.
	 * @generated
	 */
	DistributedProperty createDistributedProperty();

	/**
	 * Returns a new object of class '<em>Nested Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Connector End</em>'.
	 * @generated
	 */
	NestedConnectorEnd createNestedConnectorEnd();

	/**
	 * Returns a new object of class '<em>Participant Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Property</em>'.
	 * @generated
	 */
	ParticipantProperty createParticipantProperty();

	/**
	 * Returns a new object of class '<em>Property Specific Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Specific Type</em>'.
	 * @generated
	 */
	PropertySpecificType createPropertySpecificType();

	/**
	 * Returns a new object of class '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Type</em>'.
	 * @generated
	 */
	ValueType createValueType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BlocksPackage getBlocksPackage();

} //BlocksFactory
