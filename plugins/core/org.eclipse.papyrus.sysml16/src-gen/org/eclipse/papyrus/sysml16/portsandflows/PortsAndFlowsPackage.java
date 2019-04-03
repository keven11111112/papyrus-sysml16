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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PortsAndFlows'"
 * @generated
 */
public interface PortsAndFlowsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "portsandflows"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/sysml/1.6/SysML/PortsAndFlows"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PortsAndFlows"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortsAndFlowsPackage eINSTANCE = org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl <em>Accept Change Structural Feature Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getAcceptChangeStructuralFeatureEventAction()
	 * @generated
	 */
	int ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Accept Change Structural Feature Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accept Change Structural Feature Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ChangeStructuralFeatureEventImpl <em>Change Structural Feature Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ChangeStructuralFeatureEventImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getChangeStructuralFeatureEvent()
	 * @generated
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Change Structural Feature Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Change Structural Feature Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.DirectedFeatureImpl <em>Directed Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.DirectedFeatureImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getDirectedFeature()
	 * @generated
	 */
	int DIRECTED_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Base Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__BASE_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Feature Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__FEATURE_DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Directed Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Directed Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FlowPropertyImpl <em>Flow Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FlowPropertyImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getFlowProperty()
	 * @generated
	 */
	int FLOW_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Flow Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Icon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY___GET_ICON = 0;

	/**
	 * The number of operations of the '<em>Flow Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FullPortImpl <em>Full Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FullPortImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getFullPort()
	 * @generated
	 */
	int FULL_PORT = 4;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PORT__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Full Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Full Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InterfaceBlockImpl <em>Interface Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InterfaceBlockImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getInterfaceBlock()
	 * @generated
	 */
	int INTERFACE_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Interface Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK___GET_CONJUGATED = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InvocationOnNestedPortActionImpl <em>Invocation On Nested Port Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InvocationOnNestedPortActionImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getInvocationOnNestedPortAction()
	 * @generated
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION__BASE_ELEMENT = BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION__PROPERTY_PATH = BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Invocation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Nested Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invocation On Nested Port Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION_FEATURE_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Invocation On Nested Port Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION_OPERATION_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ItemFlowImpl <em>Item Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ItemFlowImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getItemFlow()
	 * @generated
	 */
	int ITEM_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Base Information Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__BASE_INFORMATION_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Item Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ITEM_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Item Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ProxyPortImpl <em>Proxy Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ProxyPortImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getProxyPort()
	 * @generated
	 */
	int PROXY_PORT = 8;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_PORT__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Proxy Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Proxy Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.TriggerOnNestedPortImpl <em>Trigger On Nested Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.TriggerOnNestedPortImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getTriggerOnNestedPort()
	 * @generated
	 */
	int TRIGGER_ON_NESTED_PORT = 9;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT__BASE_ELEMENT = BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT__PROPERTY_PATH = BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT__BASE_TRIGGER = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Nested Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger On Nested Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT_FEATURE_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trigger On Nested Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT_OPERATION_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ConjugatedInterfaceBlockImpl <em>Conjugated Interface Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ConjugatedInterfaceBlockImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getConjugatedInterfaceBlock()
	 * @generated
	 */
	int CONJUGATED_INTERFACE_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK__BASE_CLASS = INTERFACE_BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK__IS_ENCAPSULATED = INTERFACE_BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK__ORIGINAL = INTERFACE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conjugated Interface Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK_FEATURE_COUNT = INTERFACE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___GET_REFERENCES = INTERFACE_BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___GET_PARTS = INTERFACE_BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___GET_FLOW_PROPERTIES = INTERFACE_BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___GET_CONJUGATED = INTERFACE_BLOCK___GET_CONJUGATED;

	/**
	 * The operation id for the '<em>Are Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__DIRECTEDFEATURE_DIRECTEDFEATURE = INTERFACE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Are Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__FLOWPROPERTY_FLOWPROPERTY = INTERFACE_BLOCK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Are Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__RECEPTION_RECEPTION = INTERFACE_BLOCK_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Are Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__OPERATION_OPERATION = INTERFACE_BLOCK_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Are Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__PROPERTY_PROPERTY = INTERFACE_BLOCK_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Are Same Constraint Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___ARE_SAME_CONSTRAINT_SETS__CONSTRAINT_CONSTRAINT = INTERFACE_BLOCK_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Are Same Parameter Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___ARE_SAME_PARAMETER_SETS__PARAMETERSET_PARAMETERSET = INTERFACE_BLOCK_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Have Same Signatures</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK___HAVE_SAME_SIGNATURES__BEHAVIORALFEATURE_BEHAVIORALFEATURE = INTERFACE_BLOCK_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Conjugated Interface Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUGATED_INTERFACE_BLOCK_OPERATION_COUNT = INTERFACE_BLOCK_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AddFlowPropertyValueOnNestedPortActionImpl <em>Add Flow Property Value On Nested Port Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AddFlowPropertyValueOnNestedPortActionImpl
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getAddFlowPropertyValueOnNestedPortAction()
	 * @generated
	 */
	int ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ELEMENT = BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__PROPERTY_PATH = BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>On Nested Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__ON_NESTED_PORT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Add Structural Feature Value Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Flow Property Value On Nested Port Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION_FEATURE_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Flow Property Value On Nested Port Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION_OPERATION_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind <em>Feature Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getFeatureDirectionKind()
	 * @generated
	 */
	int FEATURE_DIRECTION_KIND = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind <em>Flow Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getFlowDirectionKind()
	 * @generated
	 */
	int FLOW_DIRECTION_KIND = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.AcceptChangeStructuralFeatureEventAction <em>Accept Change Structural Feature Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Change Structural Feature Event Action</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.AcceptChangeStructuralFeatureEventAction
	 * @generated
	 */
	EClass getAcceptChangeStructuralFeatureEventAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.AcceptChangeStructuralFeatureEventAction#getBase_AcceptEventAction <em>Base Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Accept Event Action</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.AcceptChangeStructuralFeatureEventAction#getBase_AcceptEventAction()
	 * @see #getAcceptChangeStructuralFeatureEventAction()
	 * @generated
	 */
	EReference getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent <em>Change Structural Feature Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Structural Feature Event</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent
	 * @generated
	 */
	EClass getChangeStructuralFeatureEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent#getBase_ChangeEvent <em>Base Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Change Event</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent#getBase_ChangeEvent()
	 * @see #getChangeStructuralFeatureEvent()
	 * @generated
	 */
	EReference getChangeStructuralFeatureEvent_Base_ChangeEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent#getStructuralFeature()
	 * @see #getChangeStructuralFeatureEvent()
	 * @generated
	 */
	EReference getChangeStructuralFeatureEvent_StructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature <em>Directed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Feature</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature
	 * @generated
	 */
	EClass getDirectedFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature#getBase_Feature <em>Base Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Feature</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature#getBase_Feature()
	 * @see #getDirectedFeature()
	 * @generated
	 */
	EReference getDirectedFeature_Base_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature#getFeatureDirection <em>Feature Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Direction</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature#getFeatureDirection()
	 * @see #getDirectedFeature()
	 * @generated
	 */
	EAttribute getDirectedFeature_FeatureDirection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.FlowProperty <em>Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Property</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowProperty
	 * @generated
	 */
	EClass getFlowProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.FlowProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowProperty#getBase_Property()
	 * @see #getFlowProperty()
	 * @generated
	 */
	EReference getFlowProperty_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.portsandflows.FlowProperty#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowProperty#getDirection()
	 * @see #getFlowProperty()
	 * @generated
	 */
	EAttribute getFlowProperty_Direction();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.FlowProperty#getIcon() <em>Get Icon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Icon</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowProperty#getIcon()
	 * @generated
	 */
	EOperation getFlowProperty__GetIcon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.FullPort <em>Full Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FullPort
	 * @generated
	 */
	EClass getFullPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.FullPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FullPort#getBase_Port()
	 * @see #getFullPort()
	 * @generated
	 */
	EReference getFullPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock <em>Interface Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Block</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock
	 * @generated
	 */
	EClass getInterfaceBlock();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock#getConjugated() <em>Get Conjugated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Conjugated</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock#getConjugated()
	 * @generated
	 */
	EOperation getInterfaceBlock__GetConjugated();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction <em>Invocation On Nested Port Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation On Nested Port Action</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction
	 * @generated
	 */
	EClass getInvocationOnNestedPortAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction#getBase_InvocationAction <em>Base Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Invocation Action</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction#getBase_InvocationAction()
	 * @see #getInvocationOnNestedPortAction()
	 * @generated
	 */
	EReference getInvocationOnNestedPortAction_Base_InvocationAction();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction#getOnNestedPort <em>On Nested Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Nested Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction#getOnNestedPort()
	 * @see #getInvocationOnNestedPortAction()
	 * @generated
	 */
	EReference getInvocationOnNestedPortAction_OnNestedPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.ItemFlow <em>Item Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Flow</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ItemFlow
	 * @generated
	 */
	EClass getItemFlow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.ItemFlow#getBase_InformationFlow <em>Base Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Information Flow</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ItemFlow#getBase_InformationFlow()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_Base_InformationFlow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.ItemFlow#getItemProperty <em>Item Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Property</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ItemFlow#getItemProperty()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_ItemProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.ProxyPort <em>Proxy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ProxyPort
	 * @generated
	 */
	EClass getProxyPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.ProxyPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ProxyPort#getBase_Port()
	 * @see #getProxyPort()
	 * @generated
	 */
	EReference getProxyPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.TriggerOnNestedPort <em>Trigger On Nested Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger On Nested Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.TriggerOnNestedPort
	 * @generated
	 */
	EClass getTriggerOnNestedPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.TriggerOnNestedPort#getBase_Trigger <em>Base Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Trigger</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.TriggerOnNestedPort#getBase_Trigger()
	 * @see #getTriggerOnNestedPort()
	 * @generated
	 */
	EReference getTriggerOnNestedPort_Base_Trigger();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.portsandflows.TriggerOnNestedPort#getOnNestedPort <em>On Nested Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Nested Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.TriggerOnNestedPort#getOnNestedPort()
	 * @see #getTriggerOnNestedPort()
	 * @generated
	 */
	EReference getTriggerOnNestedPort_OnNestedPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock <em>Conjugated Interface Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjugated Interface Block</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock
	 * @generated
	 */
	EClass getConjugatedInterfaceBlock();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#getOriginal()
	 * @see #getConjugatedInterfaceBlock()
	 * @generated
	 */
	EReference getConjugatedInterfaceBlock_Original();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature, org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature) <em>Are Conjugated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Conjugated</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature, org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature)
	 * @generated
	 */
	EOperation getConjugatedInterfaceBlock__AreConjugated__DirectedFeature_DirectedFeature();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.papyrus.sysml16.portsandflows.FlowProperty, org.eclipse.papyrus.sysml16.portsandflows.FlowProperty) <em>Are Conjugated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Conjugated</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.papyrus.sysml16.portsandflows.FlowProperty, org.eclipse.papyrus.sysml16.portsandflows.FlowProperty)
	 * @generated
	 */
	EOperation getConjugatedInterfaceBlock__AreConjugated__FlowProperty_FlowProperty();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.uml2.uml.Reception, org.eclipse.uml2.uml.Reception) <em>Are Conjugated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Conjugated</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.uml2.uml.Reception, org.eclipse.uml2.uml.Reception)
	 * @generated
	 */
	EOperation getConjugatedInterfaceBlock__AreConjugated__Reception_Reception();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.uml2.uml.Operation, org.eclipse.uml2.uml.Operation) <em>Are Conjugated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Conjugated</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.uml2.uml.Operation, org.eclipse.uml2.uml.Operation)
	 * @generated
	 */
	EOperation getConjugatedInterfaceBlock__AreConjugated__Operation_Operation();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.uml2.uml.Property, org.eclipse.uml2.uml.Property) <em>Are Conjugated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Conjugated</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areConjugated(org.eclipse.uml2.uml.Property, org.eclipse.uml2.uml.Property)
	 * @generated
	 */
	EOperation getConjugatedInterfaceBlock__AreConjugated__Property_Property();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areSameConstraintSets(org.eclipse.uml2.uml.Constraint, org.eclipse.uml2.uml.Constraint) <em>Are Same Constraint Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Same Constraint Sets</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areSameConstraintSets(org.eclipse.uml2.uml.Constraint, org.eclipse.uml2.uml.Constraint)
	 * @generated
	 */
	EOperation getConjugatedInterfaceBlock__AreSameConstraintSets__Constraint_Constraint();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areSameParameterSets(org.eclipse.uml2.uml.ParameterSet, org.eclipse.uml2.uml.ParameterSet) <em>Are Same Parameter Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Same Parameter Sets</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#areSameParameterSets(org.eclipse.uml2.uml.ParameterSet, org.eclipse.uml2.uml.ParameterSet)
	 * @generated
	 */
	EOperation getConjugatedInterfaceBlock__AreSameParameterSets__ParameterSet_ParameterSet();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#haveSameSignatures(org.eclipse.uml2.uml.BehavioralFeature, org.eclipse.uml2.uml.BehavioralFeature) <em>Have Same Signatures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Have Same Signatures</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#haveSameSignatures(org.eclipse.uml2.uml.BehavioralFeature, org.eclipse.uml2.uml.BehavioralFeature)
	 * @generated
	 */
	EOperation getConjugatedInterfaceBlock__HaveSameSignatures__BehavioralFeature_BehavioralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction <em>Add Flow Property Value On Nested Port Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Flow Property Value On Nested Port Action</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction
	 * @generated
	 */
	EClass getAddFlowPropertyValueOnNestedPortAction();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction#getOnNestedPort <em>On Nested Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Nested Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction#getOnNestedPort()
	 * @see #getAddFlowPropertyValueOnNestedPortAction()
	 * @generated
	 */
	EReference getAddFlowPropertyValueOnNestedPortAction_OnNestedPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction#getBase_AddStructuralFeatureValueAction <em>Base Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Add Structural Feature Value Action</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction#getBase_AddStructuralFeatureValueAction()
	 * @see #getAddFlowPropertyValueOnNestedPortAction()
	 * @generated
	 */
	EReference getAddFlowPropertyValueOnNestedPortAction_Base_AddStructuralFeatureValueAction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind <em>Feature Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Direction Kind</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind
	 * @generated
	 */
	EEnum getFeatureDirectionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind <em>Flow Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Direction Kind</em>'.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind
	 * @generated
	 */
	EEnum getFlowDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PortsAndFlowsFactory getPortsAndFlowsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl <em>Accept Change Structural Feature Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getAcceptChangeStructuralFeatureEventAction()
		 * @generated
		 */
		EClass ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION = eINSTANCE.getAcceptChangeStructuralFeatureEventAction();

		/**
		 * The meta object literal for the '<em><b>Base Accept Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION = eINSTANCE.getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ChangeStructuralFeatureEventImpl <em>Change Structural Feature Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ChangeStructuralFeatureEventImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getChangeStructuralFeatureEvent()
		 * @generated
		 */
		EClass CHANGE_STRUCTURAL_FEATURE_EVENT = eINSTANCE.getChangeStructuralFeatureEvent();

		/**
		 * The meta object literal for the '<em><b>Base Change Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT = eINSTANCE.getChangeStructuralFeatureEvent_Base_ChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE = eINSTANCE.getChangeStructuralFeatureEvent_StructuralFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.DirectedFeatureImpl <em>Directed Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.DirectedFeatureImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getDirectedFeature()
		 * @generated
		 */
		EClass DIRECTED_FEATURE = eINSTANCE.getDirectedFeature();

		/**
		 * The meta object literal for the '<em><b>Base Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_FEATURE__BASE_FEATURE = eINSTANCE.getDirectedFeature_Base_Feature();

		/**
		 * The meta object literal for the '<em><b>Feature Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_FEATURE__FEATURE_DIRECTION = eINSTANCE.getDirectedFeature_FeatureDirection();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FlowPropertyImpl <em>Flow Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FlowPropertyImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getFlowProperty()
		 * @generated
		 */
		EClass FLOW_PROPERTY = eINSTANCE.getFlowProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_PROPERTY__BASE_PROPERTY = eINSTANCE.getFlowProperty_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PROPERTY__DIRECTION = eINSTANCE.getFlowProperty_Direction();

		/**
		 * The meta object literal for the '<em><b>Get Icon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOW_PROPERTY___GET_ICON = eINSTANCE.getFlowProperty__GetIcon();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FullPortImpl <em>Full Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FullPortImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getFullPort()
		 * @generated
		 */
		EClass FULL_PORT = eINSTANCE.getFullPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULL_PORT__BASE_PORT = eINSTANCE.getFullPort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InterfaceBlockImpl <em>Interface Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InterfaceBlockImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getInterfaceBlock()
		 * @generated
		 */
		EClass INTERFACE_BLOCK = eINSTANCE.getInterfaceBlock();

		/**
		 * The meta object literal for the '<em><b>Get Conjugated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERFACE_BLOCK___GET_CONJUGATED = eINSTANCE.getInterfaceBlock__GetConjugated();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InvocationOnNestedPortActionImpl <em>Invocation On Nested Port Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InvocationOnNestedPortActionImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getInvocationOnNestedPortAction()
		 * @generated
		 */
		EClass INVOCATION_ON_NESTED_PORT_ACTION = eINSTANCE.getInvocationOnNestedPortAction();

		/**
		 * The meta object literal for the '<em><b>Base Invocation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION = eINSTANCE.getInvocationOnNestedPortAction_Base_InvocationAction();

		/**
		 * The meta object literal for the '<em><b>On Nested Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT = eINSTANCE.getInvocationOnNestedPortAction_OnNestedPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ItemFlowImpl <em>Item Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ItemFlowImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getItemFlow()
		 * @generated
		 */
		EClass ITEM_FLOW = eINSTANCE.getItemFlow();

		/**
		 * The meta object literal for the '<em><b>Base Information Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_FLOW__BASE_INFORMATION_FLOW = eINSTANCE.getItemFlow_Base_InformationFlow();

		/**
		 * The meta object literal for the '<em><b>Item Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_FLOW__ITEM_PROPERTY = eINSTANCE.getItemFlow_ItemProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ProxyPortImpl <em>Proxy Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ProxyPortImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getProxyPort()
		 * @generated
		 */
		EClass PROXY_PORT = eINSTANCE.getProxyPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_PORT__BASE_PORT = eINSTANCE.getProxyPort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.TriggerOnNestedPortImpl <em>Trigger On Nested Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.TriggerOnNestedPortImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getTriggerOnNestedPort()
		 * @generated
		 */
		EClass TRIGGER_ON_NESTED_PORT = eINSTANCE.getTriggerOnNestedPort();

		/**
		 * The meta object literal for the '<em><b>Base Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_ON_NESTED_PORT__BASE_TRIGGER = eINSTANCE.getTriggerOnNestedPort_Base_Trigger();

		/**
		 * The meta object literal for the '<em><b>On Nested Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT = eINSTANCE.getTriggerOnNestedPort_OnNestedPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ConjugatedInterfaceBlockImpl <em>Conjugated Interface Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ConjugatedInterfaceBlockImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getConjugatedInterfaceBlock()
		 * @generated
		 */
		EClass CONJUGATED_INTERFACE_BLOCK = eINSTANCE.getConjugatedInterfaceBlock();

		/**
		 * The meta object literal for the '<em><b>Original</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUGATED_INTERFACE_BLOCK__ORIGINAL = eINSTANCE.getConjugatedInterfaceBlock_Original();

		/**
		 * The meta object literal for the '<em><b>Are Conjugated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__DIRECTEDFEATURE_DIRECTEDFEATURE = eINSTANCE.getConjugatedInterfaceBlock__AreConjugated__DirectedFeature_DirectedFeature();

		/**
		 * The meta object literal for the '<em><b>Are Conjugated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__FLOWPROPERTY_FLOWPROPERTY = eINSTANCE.getConjugatedInterfaceBlock__AreConjugated__FlowProperty_FlowProperty();

		/**
		 * The meta object literal for the '<em><b>Are Conjugated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__RECEPTION_RECEPTION = eINSTANCE.getConjugatedInterfaceBlock__AreConjugated__Reception_Reception();

		/**
		 * The meta object literal for the '<em><b>Are Conjugated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__OPERATION_OPERATION = eINSTANCE.getConjugatedInterfaceBlock__AreConjugated__Operation_Operation();

		/**
		 * The meta object literal for the '<em><b>Are Conjugated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__PROPERTY_PROPERTY = eINSTANCE.getConjugatedInterfaceBlock__AreConjugated__Property_Property();

		/**
		 * The meta object literal for the '<em><b>Are Same Constraint Sets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONJUGATED_INTERFACE_BLOCK___ARE_SAME_CONSTRAINT_SETS__CONSTRAINT_CONSTRAINT = eINSTANCE.getConjugatedInterfaceBlock__AreSameConstraintSets__Constraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Are Same Parameter Sets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONJUGATED_INTERFACE_BLOCK___ARE_SAME_PARAMETER_SETS__PARAMETERSET_PARAMETERSET = eINSTANCE.getConjugatedInterfaceBlock__AreSameParameterSets__ParameterSet_ParameterSet();

		/**
		 * The meta object literal for the '<em><b>Have Same Signatures</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONJUGATED_INTERFACE_BLOCK___HAVE_SAME_SIGNATURES__BEHAVIORALFEATURE_BEHAVIORALFEATURE = eINSTANCE.getConjugatedInterfaceBlock__HaveSameSignatures__BehavioralFeature_BehavioralFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AddFlowPropertyValueOnNestedPortActionImpl <em>Add Flow Property Value On Nested Port Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AddFlowPropertyValueOnNestedPortActionImpl
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getAddFlowPropertyValueOnNestedPortAction()
		 * @generated
		 */
		EClass ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION = eINSTANCE.getAddFlowPropertyValueOnNestedPortAction();

		/**
		 * The meta object literal for the '<em><b>On Nested Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__ON_NESTED_PORT = eINSTANCE.getAddFlowPropertyValueOnNestedPortAction_OnNestedPort();

		/**
		 * The meta object literal for the '<em><b>Base Add Structural Feature Value Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION = eINSTANCE.getAddFlowPropertyValueOnNestedPortAction_Base_AddStructuralFeatureValueAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind <em>Feature Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getFeatureDirectionKind()
		 * @generated
		 */
		EEnum FEATURE_DIRECTION_KIND = eINSTANCE.getFeatureDirectionKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind <em>Flow Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind
		 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl#getFlowDirectionKind()
		 * @generated
		 */
		EEnum FLOW_DIRECTION_KIND = eINSTANCE.getFlowDirectionKind();

	}

} //PortsAndFlowsPackage
