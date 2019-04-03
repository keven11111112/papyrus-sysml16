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
package org.eclipse.papyrus.sysml16.portsandflows.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.ElementPropertyPath;

import org.eclipse.papyrus.sysml16.portsandflows.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage
 * @generated
 */
public class PortsAndFlowsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PortsAndFlowsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsAndFlowsSwitch() {
		if (modelPackage == null) {
			modelPackage = PortsAndFlowsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PortsAndFlowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION: {
				AcceptChangeStructuralFeatureEventAction acceptChangeStructuralFeatureEventAction = (AcceptChangeStructuralFeatureEventAction)theEObject;
				T result = caseAcceptChangeStructuralFeatureEventAction(acceptChangeStructuralFeatureEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT: {
				ChangeStructuralFeatureEvent changeStructuralFeatureEvent = (ChangeStructuralFeatureEvent)theEObject;
				T result = caseChangeStructuralFeatureEvent(changeStructuralFeatureEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.DIRECTED_FEATURE: {
				DirectedFeature directedFeature = (DirectedFeature)theEObject;
				T result = caseDirectedFeature(directedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.FLOW_PROPERTY: {
				FlowProperty flowProperty = (FlowProperty)theEObject;
				T result = caseFlowProperty(flowProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.FULL_PORT: {
				FullPort fullPort = (FullPort)theEObject;
				T result = caseFullPort(fullPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.INTERFACE_BLOCK: {
				InterfaceBlock interfaceBlock = (InterfaceBlock)theEObject;
				T result = caseInterfaceBlock(interfaceBlock);
				if (result == null) result = caseBlock(interfaceBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.INVOCATION_ON_NESTED_PORT_ACTION: {
				InvocationOnNestedPortAction invocationOnNestedPortAction = (InvocationOnNestedPortAction)theEObject;
				T result = caseInvocationOnNestedPortAction(invocationOnNestedPortAction);
				if (result == null) result = caseElementPropertyPath(invocationOnNestedPortAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.ITEM_FLOW: {
				ItemFlow itemFlow = (ItemFlow)theEObject;
				T result = caseItemFlow(itemFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.PROXY_PORT: {
				ProxyPort proxyPort = (ProxyPort)theEObject;
				T result = caseProxyPort(proxyPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.TRIGGER_ON_NESTED_PORT: {
				TriggerOnNestedPort triggerOnNestedPort = (TriggerOnNestedPort)theEObject;
				T result = caseTriggerOnNestedPort(triggerOnNestedPort);
				if (result == null) result = caseElementPropertyPath(triggerOnNestedPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK: {
				ConjugatedInterfaceBlock conjugatedInterfaceBlock = (ConjugatedInterfaceBlock)theEObject;
				T result = caseConjugatedInterfaceBlock(conjugatedInterfaceBlock);
				if (result == null) result = caseInterfaceBlock(conjugatedInterfaceBlock);
				if (result == null) result = caseBlock(conjugatedInterfaceBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION: {
				AddFlowPropertyValueOnNestedPortAction addFlowPropertyValueOnNestedPortAction = (AddFlowPropertyValueOnNestedPortAction)theEObject;
				T result = caseAddFlowPropertyValueOnNestedPortAction(addFlowPropertyValueOnNestedPortAction);
				if (result == null) result = caseElementPropertyPath(addFlowPropertyValueOnNestedPortAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Change Structural Feature Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Change Structural Feature Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptChangeStructuralFeatureEventAction(AcceptChangeStructuralFeatureEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Structural Feature Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Structural Feature Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeStructuralFeatureEvent(ChangeStructuralFeatureEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedFeature(DirectedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowProperty(FlowProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullPort(FullPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceBlock(InterfaceBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation On Nested Port Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation On Nested Port Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationOnNestedPortAction(InvocationOnNestedPortAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFlow(ItemFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyPort(ProxyPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger On Nested Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger On Nested Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerOnNestedPort(TriggerOnNestedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjugated Interface Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjugated Interface Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjugatedInterfaceBlock(ConjugatedInterfaceBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Flow Property Value On Nested Port Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Flow Property Value On Nested Port Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddFlowPropertyValueOnNestedPortAction(AddFlowPropertyValueOnNestedPortAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Property Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Property Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementPropertyPath(ElementPropertyPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PortsAndFlowsSwitch
