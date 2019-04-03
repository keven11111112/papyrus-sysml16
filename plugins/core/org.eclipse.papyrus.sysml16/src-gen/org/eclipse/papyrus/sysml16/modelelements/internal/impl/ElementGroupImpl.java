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
package org.eclipse.papyrus.sysml16.modelelements.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml16.modelelements.ElementGroup;
import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getBase_Comment <em>Base Comment</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getOrderedMember <em>Ordered Member</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementGroupImpl extends MinimalEObjectImpl.Container implements ElementGroup {
	/**
	 * The cached value of the '{@link #getBase_Comment() <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Comment()
	 * @generated
	 * @ordered
	 */
	protected Comment base_Comment;

	/**
	 * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderedMember() <em>Ordered Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> orderedMember;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelElementsPackage.Literals.ELEMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment getBase_Comment() {
		if (base_Comment != null && base_Comment.eIsProxy()) {
			InternalEObject oldBase_Comment = (InternalEObject)base_Comment;
			base_Comment = (Comment)eResolveProxy(oldBase_Comment);
			if (base_Comment != oldBase_Comment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelElementsPackage.ELEMENT_GROUP__BASE_COMMENT, oldBase_Comment, base_Comment));
			}
		}
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetBase_Comment() {
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Comment(Comment newBase_Comment) {
		Comment oldBase_Comment = base_Comment;
		base_Comment = newBase_Comment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelElementsPackage.ELEMENT_GROUP__BASE_COMMENT, oldBase_Comment, base_Comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCriterion() {
		// TODO: implement this method to return the 'Criterion' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getMember() {
		// TODO: implement this method to return the 'Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelElementsPackage.ELEMENT_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOrderedMember() {
		if (orderedMember == null) {
			orderedMember = new EObjectResolvingEList<Element>(Element.class, this, ModelElementsPackage.ELEMENT_GROUP__ORDERED_MEMBER);
		}
		return orderedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		// TODO: implement this method to return the 'Size' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allGroups(Element e, EList<ElementGroup> result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void criterion(String result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void member(EList<Element> result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void size(int result) {
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
			case ModelElementsPackage.ELEMENT_GROUP__BASE_COMMENT:
				if (resolve) return getBase_Comment();
				return basicGetBase_Comment();
			case ModelElementsPackage.ELEMENT_GROUP__CRITERION:
				return getCriterion();
			case ModelElementsPackage.ELEMENT_GROUP__MEMBER:
				return getMember();
			case ModelElementsPackage.ELEMENT_GROUP__NAME:
				return getName();
			case ModelElementsPackage.ELEMENT_GROUP__ORDERED_MEMBER:
				return getOrderedMember();
			case ModelElementsPackage.ELEMENT_GROUP__SIZE:
				return getSize();
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
			case ModelElementsPackage.ELEMENT_GROUP__BASE_COMMENT:
				setBase_Comment((Comment)newValue);
				return;
			case ModelElementsPackage.ELEMENT_GROUP__NAME:
				setName((String)newValue);
				return;
			case ModelElementsPackage.ELEMENT_GROUP__ORDERED_MEMBER:
				getOrderedMember().clear();
				getOrderedMember().addAll((Collection<? extends Element>)newValue);
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
			case ModelElementsPackage.ELEMENT_GROUP__BASE_COMMENT:
				setBase_Comment((Comment)null);
				return;
			case ModelElementsPackage.ELEMENT_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelElementsPackage.ELEMENT_GROUP__ORDERED_MEMBER:
				getOrderedMember().clear();
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
			case ModelElementsPackage.ELEMENT_GROUP__BASE_COMMENT:
				return base_Comment != null;
			case ModelElementsPackage.ELEMENT_GROUP__CRITERION:
				return CRITERION_EDEFAULT == null ? getCriterion() != null : !CRITERION_EDEFAULT.equals(getCriterion());
			case ModelElementsPackage.ELEMENT_GROUP__MEMBER:
				return !getMember().isEmpty();
			case ModelElementsPackage.ELEMENT_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelElementsPackage.ELEMENT_GROUP__ORDERED_MEMBER:
				return orderedMember != null && !orderedMember.isEmpty();
			case ModelElementsPackage.ELEMENT_GROUP__SIZE:
				return getSize() != SIZE_EDEFAULT;
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
			case ModelElementsPackage.ELEMENT_GROUP___ALL_GROUPS__ELEMENT_ELIST:
				allGroups((Element)arguments.get(0), (EList<ElementGroup>)arguments.get(1));
				return null;
			case ModelElementsPackage.ELEMENT_GROUP___CRITERION__STRING:
				criterion((String)arguments.get(0));
				return null;
			case ModelElementsPackage.ELEMENT_GROUP___MEMBER__ELIST:
				member((EList<Element>)arguments.get(0));
				return null;
			case ModelElementsPackage.ELEMENT_GROUP___SIZE__INT:
				size((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementGroupImpl
