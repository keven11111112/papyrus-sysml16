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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.sysml16.portsandflows.ItemFlow;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ItemFlowImpl#getBase_InformationFlow <em>Base Information Flow</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ItemFlowImpl#getItemProperty <em>Item Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemFlowImpl extends MinimalEObjectImpl.Container implements ItemFlow {
	/**
	 * The cached value of the '{@link #getBase_InformationFlow() <em>Base Information Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InformationFlow()
	 * @generated
	 * @ordered
	 */
	protected InformationFlow base_InformationFlow;

	/**
	 * The cached value of the '{@link #getItemProperty() <em>Item Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemProperty()
	 * @generated
	 * @ordered
	 */
	protected Property itemProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortsAndFlowsPackage.Literals.ITEM_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformationFlow getBase_InformationFlow() {
		if (base_InformationFlow != null && base_InformationFlow.eIsProxy()) {
			InternalEObject oldBase_InformationFlow = (InternalEObject)base_InformationFlow;
			base_InformationFlow = (InformationFlow)eResolveProxy(oldBase_InformationFlow);
			if (base_InformationFlow != oldBase_InformationFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortsAndFlowsPackage.ITEM_FLOW__BASE_INFORMATION_FLOW, oldBase_InformationFlow, base_InformationFlow));
			}
		}
		return base_InformationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlow basicGetBase_InformationFlow() {
		return base_InformationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_InformationFlow(InformationFlow newBase_InformationFlow) {
		InformationFlow oldBase_InformationFlow = base_InformationFlow;
		base_InformationFlow = newBase_InformationFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortsAndFlowsPackage.ITEM_FLOW__BASE_INFORMATION_FLOW, oldBase_InformationFlow, base_InformationFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getItemProperty() {
		if (itemProperty != null && itemProperty.eIsProxy()) {
			InternalEObject oldItemProperty = (InternalEObject)itemProperty;
			itemProperty = (Property)eResolveProxy(oldItemProperty);
			if (itemProperty != oldItemProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortsAndFlowsPackage.ITEM_FLOW__ITEM_PROPERTY, oldItemProperty, itemProperty));
			}
		}
		return itemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetItemProperty() {
		return itemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemProperty(Property newItemProperty) {
		Property oldItemProperty = itemProperty;
		itemProperty = newItemProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortsAndFlowsPackage.ITEM_FLOW__ITEM_PROPERTY, oldItemProperty, itemProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortsAndFlowsPackage.ITEM_FLOW__BASE_INFORMATION_FLOW:
				if (resolve) return getBase_InformationFlow();
				return basicGetBase_InformationFlow();
			case PortsAndFlowsPackage.ITEM_FLOW__ITEM_PROPERTY:
				if (resolve) return getItemProperty();
				return basicGetItemProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PortsAndFlowsPackage.ITEM_FLOW__BASE_INFORMATION_FLOW:
				setBase_InformationFlow((InformationFlow)newValue);
				return;
			case PortsAndFlowsPackage.ITEM_FLOW__ITEM_PROPERTY:
				setItemProperty((Property)newValue);
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
			case PortsAndFlowsPackage.ITEM_FLOW__BASE_INFORMATION_FLOW:
				setBase_InformationFlow((InformationFlow)null);
				return;
			case PortsAndFlowsPackage.ITEM_FLOW__ITEM_PROPERTY:
				setItemProperty((Property)null);
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
			case PortsAndFlowsPackage.ITEM_FLOW__BASE_INFORMATION_FLOW:
				return base_InformationFlow != null;
			case PortsAndFlowsPackage.ITEM_FLOW__ITEM_PROPERTY:
				return itemProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemFlowImpl
