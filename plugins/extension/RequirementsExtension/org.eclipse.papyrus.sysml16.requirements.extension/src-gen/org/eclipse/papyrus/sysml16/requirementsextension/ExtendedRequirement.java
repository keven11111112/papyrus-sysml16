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
package org.eclipse.papyrus.sysml16.requirementsextension;

import org.eclipse.papyrus.sysml16.requirements.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A mix-in stereotype that contains generally useful attributes for requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getRisk <em>Risk</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getVerifyMethod <em>Verify Method</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage#getExtendedRequirement()
 * @model abstract="true"
 * @generated
 */
public interface ExtendedRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage#getExtendedRequirement_Source()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.sysml16.requirementsextension.RiskKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.RiskKind
	 * @see #setRisk(RiskKind)
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage#getExtendedRequirement_Risk()
	 * @model ordered="false"
	 * @generated
	 */
	RiskKind getRisk();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getRisk <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.RiskKind
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(RiskKind value);

	/**
	 * Returns the value of the '<em><b>Verify Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Method</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind
	 * @see #setVerifyMethod(VerificationMethodKind)
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage#getExtendedRequirement_VerifyMethod()
	 * @model ordered="false"
	 * @generated
	 */
	VerificationMethodKind getVerifyMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getVerifyMethod <em>Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Method</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind
	 * @see #getVerifyMethod()
	 * @generated
	 */
	void setVerifyMethod(VerificationMethodKind value);

} // ExtendedRequirement
