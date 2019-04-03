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
package org.eclipse.papyrus.sysml16.requirements.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.sysml16.requirements.AbstractRequirement;
import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getDerived <em>Derived</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getTracedTo <em>Traced To</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getVerifiedBy <em>Verified By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRequirementImpl extends MinimalEObjectImpl.Container implements AbstractRequirement {
	/**
	 * The cached value of the '{@link #getBase_NamedElement() <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement base_NamedElement;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.ABSTRACT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getBase_NamedElement() {
		if (base_NamedElement != null && base_NamedElement.eIsProxy()) {
			InternalEObject oldBase_NamedElement = (InternalEObject)base_NamedElement;
			base_NamedElement = (NamedElement)eResolveProxy(oldBase_NamedElement);
			if (base_NamedElement != oldBase_NamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
			}
		}
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetBase_NamedElement() {
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_NamedElement(NamedElement newBase_NamedElement) {
		NamedElement oldBase_NamedElement = base_NamedElement;
		base_NamedElement = newBase_NamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractRequirement> getDerived() {
		// TODO: implement this method to return the 'Derived' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractRequirement> getDerivedFrom() {
		// TODO: implement this method to return the 'Derived From' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ABSTRACT_REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractRequirement> getMaster() {
		// TODO: implement this method to return the 'Master' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getRefinedBy() {
		// TODO: implement this method to return the 'Refined By' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getRefinedBy(String name) {
		return getRefinedBy(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getRefinedBy(String name, boolean ignoreCase, EClass eClass) {
		refinedByLoop: for (NamedElement refinedBy : getRefinedBy()) {
			if (eClass != null && !eClass.isInstance(refinedBy))
				continue refinedByLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(refinedBy.getName()) : name.equals(refinedBy.getName())))
				continue refinedByLoop;
			return refinedBy;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getSatisfiedBy() {
		// TODO: implement this method to return the 'Satisfied By' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSatisfiedBy(String name) {
		return getSatisfiedBy(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSatisfiedBy(String name, boolean ignoreCase, EClass eClass) {
		satisfiedByLoop: for (NamedElement satisfiedBy : getSatisfiedBy()) {
			if (eClass != null && !eClass.isInstance(satisfiedBy))
				continue satisfiedByLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(satisfiedBy.getName()) : name.equals(satisfiedBy.getName())))
				continue satisfiedByLoop;
			return satisfiedBy;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ABSTRACT_REQUIREMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getTracedTo() {
		// TODO: implement this method to return the 'Traced To' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getTracedTo(String name) {
		return getTracedTo(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getTracedTo(String name, boolean ignoreCase, EClass eClass) {
		tracedToLoop: for (NamedElement tracedTo : getTracedTo()) {
			if (eClass != null && !eClass.isInstance(tracedTo))
				continue tracedToLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(tracedTo.getName()) : name.equals(tracedTo.getName())))
				continue tracedToLoop;
			return tracedTo;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getVerifiedBy() {
		// TODO: implement this method to return the 'Verified By' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getVerifiedBy(String name) {
		return getVerifiedBy(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getVerifiedBy(String name, boolean ignoreCase, EClass eClass) {
		verifiedByLoop: for (NamedElement verifiedBy : getVerifiedBy()) {
			if (eClass != null && !eClass.isInstance(verifiedBy))
				continue verifiedByLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(verifiedBy.getName()) : name.equals(verifiedBy.getName())))
				continue verifiedByLoop;
			return verifiedBy;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__DERIVED:
				return getDerived();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__DERIVED_FROM:
				return getDerivedFrom();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__ID:
				return getId();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__MASTER:
				return getMaster();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__REFINED_BY:
				return getRefinedBy();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY:
				return getSatisfiedBy();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__TEXT:
				return getText();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__TRACED_TO:
				return getTracedTo();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__VERIFIED_BY:
				return getVerifiedBy();
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
			case RequirementsPackage.ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case RequirementsPackage.ABSTRACT_REQUIREMENT__ID:
				setId((String)newValue);
				return;
			case RequirementsPackage.ABSTRACT_REQUIREMENT__TEXT:
				setText((String)newValue);
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
			case RequirementsPackage.ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case RequirementsPackage.ABSTRACT_REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case RequirementsPackage.ABSTRACT_REQUIREMENT__TEXT:
				setText(TEXT_EDEFAULT);
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
			case RequirementsPackage.ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case RequirementsPackage.ABSTRACT_REQUIREMENT__DERIVED:
				return !getDerived().isEmpty();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__DERIVED_FROM:
				return !getDerivedFrom().isEmpty();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RequirementsPackage.ABSTRACT_REQUIREMENT__MASTER:
				return !getMaster().isEmpty();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__REFINED_BY:
				return !getRefinedBy().isEmpty();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__SATISFIED_BY:
				return !getSatisfiedBy().isEmpty();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case RequirementsPackage.ABSTRACT_REQUIREMENT__TRACED_TO:
				return !getTracedTo().isEmpty();
			case RequirementsPackage.ABSTRACT_REQUIREMENT__VERIFIED_BY:
				return !getVerifiedBy().isEmpty();
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", text: "); //$NON-NLS-1$
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //AbstractRequirementImpl
