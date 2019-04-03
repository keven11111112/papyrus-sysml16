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

import org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature;
import org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.DirectedFeatureImpl#getBase_Feature <em>Base Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.DirectedFeatureImpl#getFeatureDirection <em>Feature Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectedFeatureImpl extends MinimalEObjectImpl.Container implements DirectedFeature {
	/**
	 * The cached value of the '{@link #getBase_Feature() <em>Base Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Feature()
	 * @generated
	 * @ordered
	 */
	protected Feature base_Feature;

	/**
	 * The default value of the '{@link #getFeatureDirection() <em>Feature Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureDirectionKind FEATURE_DIRECTION_EDEFAULT = FeatureDirectionKind.PROVIDED;

	/**
	 * The cached value of the '{@link #getFeatureDirection() <em>Feature Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDirection()
	 * @generated
	 * @ordered
	 */
	protected FeatureDirectionKind featureDirection = FEATURE_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortsAndFlowsPackage.Literals.DIRECTED_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getBase_Feature() {
		if (base_Feature != null && base_Feature.eIsProxy()) {
			InternalEObject oldBase_Feature = (InternalEObject)base_Feature;
			base_Feature = (Feature)eResolveProxy(oldBase_Feature);
			if (base_Feature != oldBase_Feature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortsAndFlowsPackage.DIRECTED_FEATURE__BASE_FEATURE, oldBase_Feature, base_Feature));
			}
		}
		return base_Feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetBase_Feature() {
		return base_Feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Feature(Feature newBase_Feature) {
		Feature oldBase_Feature = base_Feature;
		base_Feature = newBase_Feature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortsAndFlowsPackage.DIRECTED_FEATURE__BASE_FEATURE, oldBase_Feature, base_Feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureDirectionKind getFeatureDirection() {
		return featureDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureDirection(FeatureDirectionKind newFeatureDirection) {
		FeatureDirectionKind oldFeatureDirection = featureDirection;
		featureDirection = newFeatureDirection == null ? FEATURE_DIRECTION_EDEFAULT : newFeatureDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortsAndFlowsPackage.DIRECTED_FEATURE__FEATURE_DIRECTION, oldFeatureDirection, featureDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortsAndFlowsPackage.DIRECTED_FEATURE__BASE_FEATURE:
				if (resolve) return getBase_Feature();
				return basicGetBase_Feature();
			case PortsAndFlowsPackage.DIRECTED_FEATURE__FEATURE_DIRECTION:
				return getFeatureDirection();
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
			case PortsAndFlowsPackage.DIRECTED_FEATURE__BASE_FEATURE:
				setBase_Feature((Feature)newValue);
				return;
			case PortsAndFlowsPackage.DIRECTED_FEATURE__FEATURE_DIRECTION:
				setFeatureDirection((FeatureDirectionKind)newValue);
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
			case PortsAndFlowsPackage.DIRECTED_FEATURE__BASE_FEATURE:
				setBase_Feature((Feature)null);
				return;
			case PortsAndFlowsPackage.DIRECTED_FEATURE__FEATURE_DIRECTION:
				setFeatureDirection(FEATURE_DIRECTION_EDEFAULT);
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
			case PortsAndFlowsPackage.DIRECTED_FEATURE__BASE_FEATURE:
				return base_Feature != null;
			case PortsAndFlowsPackage.DIRECTED_FEATURE__FEATURE_DIRECTION:
				return featureDirection != FEATURE_DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (featureDirection: "); //$NON-NLS-1$
		result.append(featureDirection);
		result.append(')');
		return result.toString();
	}

} //DirectedFeatureImpl
