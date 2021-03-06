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
package org.eclipse.papyrus.sysml16.allocations.internal.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml16.allocations.Allocate;
import org.eclipse.papyrus.sysml16.allocations.AllocationsPackage;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.DirectedRelationshipPropertyPathImpl;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.allocations.internal.impl.AllocateImpl#getBase_Abstraction <em>Base Abstraction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocateImpl extends DirectedRelationshipPropertyPathImpl implements Allocate {
	/**
	 * The cached value of the '{@link #getBase_Abstraction() <em>Base Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Abstraction()
	 * @generated
	 * @ordered
	 */
	protected Abstraction base_Abstraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.ALLOCATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstraction getBase_Abstraction() {
		if (base_Abstraction != null && base_Abstraction.eIsProxy()) {
			InternalEObject oldBase_Abstraction = (InternalEObject)base_Abstraction;
			base_Abstraction = (Abstraction)eResolveProxy(oldBase_Abstraction);
			if (base_Abstraction != oldBase_Abstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.ALLOCATE__BASE_ABSTRACTION, oldBase_Abstraction, base_Abstraction));
			}
		}
		return base_Abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstraction basicGetBase_Abstraction() {
		return base_Abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Abstraction(Abstraction newBase_Abstraction) {
		Abstraction oldBase_Abstraction = base_Abstraction;
		base_Abstraction = newBase_Abstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.ALLOCATE__BASE_ABSTRACTION, oldBase_Abstraction, base_Abstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllocatedFrom(NamedElement ref, EList<NamedElement> result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllocatedTo(NamedElement ref, EList<NamedElement> result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationsPackage.ALLOCATE__BASE_ABSTRACTION:
				if (resolve) return getBase_Abstraction();
				return basicGetBase_Abstraction();
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
			case AllocationsPackage.ALLOCATE__BASE_ABSTRACTION:
				setBase_Abstraction((Abstraction)newValue);
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
			case AllocationsPackage.ALLOCATE__BASE_ABSTRACTION:
				setBase_Abstraction((Abstraction)null);
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
			case AllocationsPackage.ALLOCATE__BASE_ABSTRACTION:
				return base_Abstraction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AllocationsPackage.ALLOCATE___GET_ALLOCATED_FROM__NAMEDELEMENT_ELIST:
				getAllocatedFrom((NamedElement)arguments.get(0), (EList<NamedElement>)arguments.get(1));
				return null;
			case AllocationsPackage.ALLOCATE___GET_ALLOCATED_TO__NAMEDELEMENT_ELIST:
				getAllocatedTo((NamedElement)arguments.get(0), (EList<NamedElement>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AllocateImpl
