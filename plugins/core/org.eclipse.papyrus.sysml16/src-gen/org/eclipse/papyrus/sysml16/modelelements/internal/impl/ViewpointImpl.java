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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;
import org.eclipse.papyrus.sysml16.modelelements.Stakeholder;
import org.eclipse.papyrus.sysml16.modelelements.Viewpoint;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getConcernList <em>Concern List</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getStakeholder <em>Stakeholder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewpointImpl extends MinimalEObjectImpl.Container implements Viewpoint {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getConcernList() <em>Concern List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernList()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> concernList;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> presentation;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholder()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> stakeholder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelElementsPackage.Literals.VIEWPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelElementsPackage.VIEWPOINT__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelElementsPackage.VIEWPOINT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConcern() {
		// TODO: implement this method to return the 'Concern' attribute list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getConcernList() {
		if (concernList == null) {
			concernList = new EObjectResolvingEList<Comment>(Comment.class, this, ModelElementsPackage.VIEWPOINT__CONCERN_LIST);
		}
		return concernList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, ModelElementsPackage.VIEWPOINT__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getMethod() {
		// TODO: implement this method to return the 'Method' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getMethod(String name) {
		return getMethod(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getMethod(String name, boolean ignoreCase, EClass eClass) {
		methodLoop: for (Behavior method : getMethod()) {
			if (eClass != null && !eClass.isInstance(method))
				continue methodLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(method.getName()) : name.equals(method.getName())))
				continue methodLoop;
			return method;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPresentation() {
		if (presentation == null) {
			presentation = new EDataTypeUniqueEList<String>(String.class, this, ModelElementsPackage.VIEWPOINT__PRESENTATION);
		}
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelElementsPackage.VIEWPOINT__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stakeholder> getStakeholder() {
		if (stakeholder == null) {
			stakeholder = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, ModelElementsPackage.VIEWPOINT__STAKEHOLDER);
		}
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelElementsPackage.VIEWPOINT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ModelElementsPackage.VIEWPOINT__CONCERN:
				return getConcern();
			case ModelElementsPackage.VIEWPOINT__CONCERN_LIST:
				return getConcernList();
			case ModelElementsPackage.VIEWPOINT__LANGUAGE:
				return getLanguage();
			case ModelElementsPackage.VIEWPOINT__METHOD:
				return getMethod();
			case ModelElementsPackage.VIEWPOINT__PRESENTATION:
				return getPresentation();
			case ModelElementsPackage.VIEWPOINT__PURPOSE:
				return getPurpose();
			case ModelElementsPackage.VIEWPOINT__STAKEHOLDER:
				return getStakeholder();
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
			case ModelElementsPackage.VIEWPOINT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ModelElementsPackage.VIEWPOINT__CONCERN_LIST:
				getConcernList().clear();
				getConcernList().addAll((Collection<? extends Comment>)newValue);
				return;
			case ModelElementsPackage.VIEWPOINT__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case ModelElementsPackage.VIEWPOINT__PRESENTATION:
				getPresentation().clear();
				getPresentation().addAll((Collection<? extends String>)newValue);
				return;
			case ModelElementsPackage.VIEWPOINT__PURPOSE:
				setPurpose((String)newValue);
				return;
			case ModelElementsPackage.VIEWPOINT__STAKEHOLDER:
				getStakeholder().clear();
				getStakeholder().addAll((Collection<? extends Stakeholder>)newValue);
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
			case ModelElementsPackage.VIEWPOINT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ModelElementsPackage.VIEWPOINT__CONCERN_LIST:
				getConcernList().clear();
				return;
			case ModelElementsPackage.VIEWPOINT__LANGUAGE:
				getLanguage().clear();
				return;
			case ModelElementsPackage.VIEWPOINT__PRESENTATION:
				getPresentation().clear();
				return;
			case ModelElementsPackage.VIEWPOINT__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case ModelElementsPackage.VIEWPOINT__STAKEHOLDER:
				getStakeholder().clear();
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
			case ModelElementsPackage.VIEWPOINT__BASE_CLASS:
				return base_Class != null;
			case ModelElementsPackage.VIEWPOINT__CONCERN:
				return !getConcern().isEmpty();
			case ModelElementsPackage.VIEWPOINT__CONCERN_LIST:
				return concernList != null && !concernList.isEmpty();
			case ModelElementsPackage.VIEWPOINT__LANGUAGE:
				return language != null && !language.isEmpty();
			case ModelElementsPackage.VIEWPOINT__METHOD:
				return !getMethod().isEmpty();
			case ModelElementsPackage.VIEWPOINT__PRESENTATION:
				return presentation != null && !presentation.isEmpty();
			case ModelElementsPackage.VIEWPOINT__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case ModelElementsPackage.VIEWPOINT__STAKEHOLDER:
				return stakeholder != null && !stakeholder.isEmpty();
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
		result.append(" (language: "); //$NON-NLS-1$
		result.append(language);
		result.append(", presentation: "); //$NON-NLS-1$
		result.append(presentation);
		result.append(", purpose: "); //$NON-NLS-1$
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //ViewpointImpl
