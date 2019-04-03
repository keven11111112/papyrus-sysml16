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
package org.eclipse.papyrus.sysml16.blocks.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.blocks.BoundReference;

import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.blocks.internal.impl.BoundReferenceImpl#getBindingPath <em>Binding Path</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.blocks.internal.impl.BoundReferenceImpl#getBoundEnd <em>Bound End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundReferenceImpl extends EndPathMultiplicityImpl implements BoundReference {
	/**
	 * The cached value of the '{@link #getBoundEnd() <em>Bound End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundEnd()
	 * @generated
	 * @ordered
	 */
	protected ConnectorEnd boundEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlocksPackage.Literals.BOUND_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getBindingPath() {
		// TODO: implement this method to return the 'Binding Path' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBindingPath(String name, Type type) {
		return getBindingPath(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBindingPath(String name, Type type, boolean ignoreCase, EClass eClass) {
		bindingPathLoop: for (Property bindingPath : getBindingPath()) {
			if (eClass != null && !eClass.isInstance(bindingPath))
				continue bindingPathLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(bindingPath.getName()) : name.equals(bindingPath.getName())))
				continue bindingPathLoop;
			if (type != null && !type.equals(bindingPath.getType()))
				continue bindingPathLoop;
			return bindingPath;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorEnd getBoundEnd() {
		if (boundEnd != null && boundEnd.eIsProxy()) {
			InternalEObject oldBoundEnd = (InternalEObject)boundEnd;
			boundEnd = (ConnectorEnd)eResolveProxy(oldBoundEnd);
			if (boundEnd != oldBoundEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlocksPackage.BOUND_REFERENCE__BOUND_END, oldBoundEnd, boundEnd));
			}
		}
		return boundEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd basicGetBoundEnd() {
		return boundEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundEnd(ConnectorEnd newBoundEnd) {
		ConnectorEnd oldBoundEnd = boundEnd;
		boundEnd = newBoundEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocksPackage.BOUND_REFERENCE__BOUND_END, oldBoundEnd, boundEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlocksPackage.BOUND_REFERENCE__BINDING_PATH:
				return getBindingPath();
			case BlocksPackage.BOUND_REFERENCE__BOUND_END:
				if (resolve) return getBoundEnd();
				return basicGetBoundEnd();
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
			case BlocksPackage.BOUND_REFERENCE__BOUND_END:
				setBoundEnd((ConnectorEnd)newValue);
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
			case BlocksPackage.BOUND_REFERENCE__BOUND_END:
				setBoundEnd((ConnectorEnd)null);
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
			case BlocksPackage.BOUND_REFERENCE__BINDING_PATH:
				return !getBindingPath().isEmpty();
			case BlocksPackage.BOUND_REFERENCE__BOUND_END:
				return boundEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //BoundReferenceImpl
