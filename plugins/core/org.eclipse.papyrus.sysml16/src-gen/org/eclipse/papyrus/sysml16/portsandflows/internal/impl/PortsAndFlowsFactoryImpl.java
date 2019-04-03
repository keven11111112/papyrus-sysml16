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
package org.eclipse.papyrus.sysml16.portsandflows.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.sysml16.portsandflows.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortsAndFlowsFactoryImpl extends EFactoryImpl implements PortsAndFlowsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortsAndFlowsFactory init() {
		try {
			PortsAndFlowsFactory thePortsAndFlowsFactory = (PortsAndFlowsFactory)EPackage.Registry.INSTANCE.getEFactory(PortsAndFlowsPackage.eNS_URI);
			if (thePortsAndFlowsFactory != null) {
				return thePortsAndFlowsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PortsAndFlowsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsAndFlowsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PortsAndFlowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION: return createAcceptChangeStructuralFeatureEventAction();
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT: return createChangeStructuralFeatureEvent();
			case PortsAndFlowsPackage.DIRECTED_FEATURE: return createDirectedFeature();
			case PortsAndFlowsPackage.FLOW_PROPERTY: return createFlowProperty();
			case PortsAndFlowsPackage.FULL_PORT: return createFullPort();
			case PortsAndFlowsPackage.INTERFACE_BLOCK: return createInterfaceBlock();
			case PortsAndFlowsPackage.INVOCATION_ON_NESTED_PORT_ACTION: return createInvocationOnNestedPortAction();
			case PortsAndFlowsPackage.ITEM_FLOW: return createItemFlow();
			case PortsAndFlowsPackage.PROXY_PORT: return createProxyPort();
			case PortsAndFlowsPackage.TRIGGER_ON_NESTED_PORT: return createTriggerOnNestedPort();
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK: return createConjugatedInterfaceBlock();
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION: return createAddFlowPropertyValueOnNestedPortAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PortsAndFlowsPackage.FEATURE_DIRECTION_KIND:
				return createFeatureDirectionKindFromString(eDataType, initialValue);
			case PortsAndFlowsPackage.FLOW_DIRECTION_KIND:
				return createFlowDirectionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PortsAndFlowsPackage.FEATURE_DIRECTION_KIND:
				return convertFeatureDirectionKindToString(eDataType, instanceValue);
			case PortsAndFlowsPackage.FLOW_DIRECTION_KIND:
				return convertFlowDirectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptChangeStructuralFeatureEventAction createAcceptChangeStructuralFeatureEventAction() {
		AcceptChangeStructuralFeatureEventActionImpl acceptChangeStructuralFeatureEventAction = new AcceptChangeStructuralFeatureEventActionImpl();
		return acceptChangeStructuralFeatureEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeStructuralFeatureEvent createChangeStructuralFeatureEvent() {
		ChangeStructuralFeatureEventImpl changeStructuralFeatureEvent = new ChangeStructuralFeatureEventImpl();
		return changeStructuralFeatureEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedFeature createDirectedFeature() {
		DirectedFeatureImpl directedFeature = new DirectedFeatureImpl();
		return directedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowProperty createFlowProperty() {
		FlowPropertyImpl flowProperty = new FlowPropertyImpl();
		return flowProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FullPort createFullPort() {
		FullPortImpl fullPort = new FullPortImpl();
		return fullPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceBlock createInterfaceBlock() {
		InterfaceBlockImpl interfaceBlock = new InterfaceBlockImpl();
		return interfaceBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvocationOnNestedPortAction createInvocationOnNestedPortAction() {
		InvocationOnNestedPortActionImpl invocationOnNestedPortAction = new InvocationOnNestedPortActionImpl();
		return invocationOnNestedPortAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemFlow createItemFlow() {
		ItemFlowImpl itemFlow = new ItemFlowImpl();
		return itemFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProxyPort createProxyPort() {
		ProxyPortImpl proxyPort = new ProxyPortImpl();
		return proxyPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerOnNestedPort createTriggerOnNestedPort() {
		TriggerOnNestedPortImpl triggerOnNestedPort = new TriggerOnNestedPortImpl();
		return triggerOnNestedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugatedInterfaceBlock createConjugatedInterfaceBlock() {
		ConjugatedInterfaceBlockImpl conjugatedInterfaceBlock = new ConjugatedInterfaceBlockImpl();
		return conjugatedInterfaceBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddFlowPropertyValueOnNestedPortAction createAddFlowPropertyValueOnNestedPortAction() {
		AddFlowPropertyValueOnNestedPortActionImpl addFlowPropertyValueOnNestedPortAction = new AddFlowPropertyValueOnNestedPortActionImpl();
		return addFlowPropertyValueOnNestedPortAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDirectionKind createFeatureDirectionKindFromString(EDataType eDataType, String initialValue) {
		FeatureDirectionKind result = FeatureDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowDirectionKind createFlowDirectionKindFromString(EDataType eDataType, String initialValue) {
		FlowDirectionKind result = FlowDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortsAndFlowsPackage getPortsAndFlowsPackage() {
		return (PortsAndFlowsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PortsAndFlowsPackage getPackage() {
		return PortsAndFlowsPackage.eINSTANCE;
	}

} //PortsAndFlowsFactoryImpl
