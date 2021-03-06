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

import org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Structural Feature Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ChangeStructuralFeatureEventImpl#getBase_ChangeEvent <em>Base Change Event</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ChangeStructuralFeatureEventImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeStructuralFeatureEventImpl extends MinimalEObjectImpl.Container implements ChangeStructuralFeatureEvent {
	/**
	 * The cached value of the '{@link #getBase_ChangeEvent() <em>Base Change Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ChangeEvent()
	 * @generated
	 * @ordered
	 */
	protected ChangeEvent base_ChangeEvent;

	/**
	 * The cached value of the '{@link #getStructuralFeature() <em>Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected StructuralFeature structuralFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeStructuralFeatureEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortsAndFlowsPackage.Literals.CHANGE_STRUCTURAL_FEATURE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeEvent getBase_ChangeEvent() {
		if (base_ChangeEvent != null && base_ChangeEvent.eIsProxy()) {
			InternalEObject oldBase_ChangeEvent = (InternalEObject)base_ChangeEvent;
			base_ChangeEvent = (ChangeEvent)eResolveProxy(oldBase_ChangeEvent);
			if (base_ChangeEvent != oldBase_ChangeEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
			}
		}
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent basicGetBase_ChangeEvent() {
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_ChangeEvent(ChangeEvent newBase_ChangeEvent) {
		ChangeEvent oldBase_ChangeEvent = base_ChangeEvent;
		base_ChangeEvent = newBase_ChangeEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralFeature getStructuralFeature() {
		if (structuralFeature != null && structuralFeature.eIsProxy()) {
			InternalEObject oldStructuralFeature = (InternalEObject)structuralFeature;
			structuralFeature = (StructuralFeature)eResolveProxy(oldStructuralFeature);
			if (structuralFeature != oldStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
			}
		}
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature basicGetStructuralFeature() {
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructuralFeature(StructuralFeature newStructuralFeature) {
		StructuralFeature oldStructuralFeature = structuralFeature;
		structuralFeature = newStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT:
				if (resolve) return getBase_ChangeEvent();
				return basicGetBase_ChangeEvent();
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE:
				if (resolve) return getStructuralFeature();
				return basicGetStructuralFeature();
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
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)newValue);
				return;
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)newValue);
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
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)null);
				return;
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)null);
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
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT:
				return base_ChangeEvent != null;
			case PortsAndFlowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE:
				return structuralFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeStructuralFeatureEventImpl
