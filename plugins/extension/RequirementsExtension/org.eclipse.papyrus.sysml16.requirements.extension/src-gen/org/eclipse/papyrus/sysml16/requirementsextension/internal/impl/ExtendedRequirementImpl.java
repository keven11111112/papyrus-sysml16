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
package org.eclipse.papyrus.sysml16.requirementsextension.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementImpl;

import org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement;
import org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage;
import org.eclipse.papyrus.sysml16.requirementsextension.RiskKind;
import org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.ExtendedRequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.ExtendedRequirementImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.ExtendedRequirementImpl#getVerifyMethod <em>Verify Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExtendedRequirementImpl extends RequirementImpl implements ExtendedRequirement {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected static final RiskKind RISK_EDEFAULT = RiskKind.HIGH;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected RiskKind risk = RISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifyMethod() <em>Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyMethod()
	 * @generated
	 * @ordered
	 */
	protected static final VerificationMethodKind VERIFY_METHOD_EDEFAULT = VerificationMethodKind.ANALYSIS;

	/**
	 * The cached value of the '{@link #getVerifyMethod() <em>Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyMethod()
	 * @generated
	 * @ordered
	 */
	protected VerificationMethodKind verifyMethod = VERIFY_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsExtensionPackage.Literals.EXTENDED_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsExtensionPackage.EXTENDED_REQUIREMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskKind getRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRisk(RiskKind newRisk) {
		RiskKind oldRisk = risk;
		risk = newRisk == null ? RISK_EDEFAULT : newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsExtensionPackage.EXTENDED_REQUIREMENT__RISK, oldRisk, risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationMethodKind getVerifyMethod() {
		return verifyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyMethod(VerificationMethodKind newVerifyMethod) {
		VerificationMethodKind oldVerifyMethod = verifyMethod;
		verifyMethod = newVerifyMethod == null ? VERIFY_METHOD_EDEFAULT : newVerifyMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsExtensionPackage.EXTENDED_REQUIREMENT__VERIFY_METHOD, oldVerifyMethod, verifyMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__SOURCE:
				return getSource();
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__RISK:
				return getRisk();
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__VERIFY_METHOD:
				return getVerifyMethod();
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
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__SOURCE:
				setSource((String)newValue);
				return;
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__RISK:
				setRisk((RiskKind)newValue);
				return;
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__VERIFY_METHOD:
				setVerifyMethod((VerificationMethodKind)newValue);
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
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__RISK:
				setRisk(RISK_EDEFAULT);
				return;
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__VERIFY_METHOD:
				setVerifyMethod(VERIFY_METHOD_EDEFAULT);
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
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__RISK:
				return risk != RISK_EDEFAULT;
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__VERIFY_METHOD:
				return verifyMethod != VERIFY_METHOD_EDEFAULT;
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
		result.append(" (source: "); //$NON-NLS-1$
		result.append(source);
		result.append(", risk: "); //$NON-NLS-1$
		result.append(risk);
		result.append(", verifyMethod: "); //$NON-NLS-1$
		result.append(verifyMethod);
		result.append(')');
		return result.toString();
	}

} //ExtendedRequirementImpl
