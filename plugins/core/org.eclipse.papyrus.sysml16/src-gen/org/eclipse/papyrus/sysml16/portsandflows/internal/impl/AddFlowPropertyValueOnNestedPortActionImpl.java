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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.ElementPropertyPathImpl;

import org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Flow Property Value On Nested Port Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AddFlowPropertyValueOnNestedPortActionImpl#getOnNestedPort <em>On Nested Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.AddFlowPropertyValueOnNestedPortActionImpl#getBase_AddStructuralFeatureValueAction <em>Base Add Structural Feature Value Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddFlowPropertyValueOnNestedPortActionImpl extends ElementPropertyPathImpl implements AddFlowPropertyValueOnNestedPortAction {
	/**
	 * The cached value of the '{@link #getOnNestedPort() <em>On Nested Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnNestedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> onNestedPort;

	/**
	 * The cached value of the '{@link #getBase_AddStructuralFeatureValueAction() <em>Base Add Structural Feature Value Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_AddStructuralFeatureValueAction()
	 * @generated
	 * @ordered
	 */
	protected AddStructuralFeatureValueAction base_AddStructuralFeatureValueAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddFlowPropertyValueOnNestedPortActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortsAndFlowsPackage.Literals.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getOnNestedPort() {
		if (onNestedPort == null) {
			onNestedPort = new EObjectResolvingEList<Port>(Port.class, this, PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__ON_NESTED_PORT);
		}
		return onNestedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOnNestedPort(String name, Type type) {
		return getOnNestedPort(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOnNestedPort(String name, Type type, boolean ignoreCase) {
		onNestedPortLoop: for (Port onNestedPort : getOnNestedPort()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(onNestedPort.getName()) : name.equals(onNestedPort.getName())))
				continue onNestedPortLoop;
			if (type != null && !type.equals(onNestedPort.getType()))
				continue onNestedPortLoop;
			return onNestedPort;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddStructuralFeatureValueAction getBase_AddStructuralFeatureValueAction() {
		if (base_AddStructuralFeatureValueAction != null && base_AddStructuralFeatureValueAction.eIsProxy()) {
			InternalEObject oldBase_AddStructuralFeatureValueAction = (InternalEObject)base_AddStructuralFeatureValueAction;
			base_AddStructuralFeatureValueAction = (AddStructuralFeatureValueAction)eResolveProxy(oldBase_AddStructuralFeatureValueAction);
			if (base_AddStructuralFeatureValueAction != oldBase_AddStructuralFeatureValueAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION, oldBase_AddStructuralFeatureValueAction, base_AddStructuralFeatureValueAction));
			}
		}
		return base_AddStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueAction basicGetBase_AddStructuralFeatureValueAction() {
		return base_AddStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_AddStructuralFeatureValueAction(AddStructuralFeatureValueAction newBase_AddStructuralFeatureValueAction) {
		AddStructuralFeatureValueAction oldBase_AddStructuralFeatureValueAction = base_AddStructuralFeatureValueAction;
		base_AddStructuralFeatureValueAction = newBase_AddStructuralFeatureValueAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION, oldBase_AddStructuralFeatureValueAction, base_AddStructuralFeatureValueAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__ON_NESTED_PORT:
				return getOnNestedPort();
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				if (resolve) return getBase_AddStructuralFeatureValueAction();
				return basicGetBase_AddStructuralFeatureValueAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__ON_NESTED_PORT:
				getOnNestedPort().clear();
				getOnNestedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				setBase_AddStructuralFeatureValueAction((AddStructuralFeatureValueAction)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__ON_NESTED_PORT:
				getOnNestedPort().clear();
				return;
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				setBase_AddStructuralFeatureValueAction((AddStructuralFeatureValueAction)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__ON_NESTED_PORT:
				return onNestedPort != null && !onNestedPort.isEmpty();
			case PortsAndFlowsPackage.ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				return base_AddStructuralFeatureValueAction != null;
		}
		return super.eIsSet(featureID);
	}

} //AddFlowPropertyValueOnNestedPortActionImpl
