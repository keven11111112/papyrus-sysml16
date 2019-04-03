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
package org.eclipse.papyrus.sysml16.requirementsextension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml16.requirements.AbstractRequirement;
import org.eclipse.papyrus.sysml16.requirements.Requirement;

import org.eclipse.papyrus.sysml16.requirementsextension.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage
 * @generated
 */
public class RequirementsExtensionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementsExtensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsExtensionSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementsExtensionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT: {
				ExtendedRequirement extendedRequirement = (ExtendedRequirement)theEObject;
				T result = caseExtendedRequirement(extendedRequirement);
				if (result == null) result = caseRequirement(extendedRequirement);
				if (result == null) result = caseAbstractRequirement(extendedRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsExtensionPackage.FUNCTIONAL_REQUIREMENT: {
				FunctionalRequirement functionalRequirement = (FunctionalRequirement)theEObject;
				T result = caseFunctionalRequirement(functionalRequirement);
				if (result == null) result = caseExtendedRequirement(functionalRequirement);
				if (result == null) result = caseRequirement(functionalRequirement);
				if (result == null) result = caseAbstractRequirement(functionalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsExtensionPackage.INTERFACE_REQUIREMENT: {
				InterfaceRequirement interfaceRequirement = (InterfaceRequirement)theEObject;
				T result = caseInterfaceRequirement(interfaceRequirement);
				if (result == null) result = caseExtendedRequirement(interfaceRequirement);
				if (result == null) result = caseRequirement(interfaceRequirement);
				if (result == null) result = caseAbstractRequirement(interfaceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsExtensionPackage.PERFORMANCE_REQUIREMENT: {
				PerformanceRequirement performanceRequirement = (PerformanceRequirement)theEObject;
				T result = casePerformanceRequirement(performanceRequirement);
				if (result == null) result = caseExtendedRequirement(performanceRequirement);
				if (result == null) result = caseRequirement(performanceRequirement);
				if (result == null) result = caseAbstractRequirement(performanceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsExtensionPackage.PHYSICAL_REQUIREMENT: {
				PhysicalRequirement physicalRequirement = (PhysicalRequirement)theEObject;
				T result = casePhysicalRequirement(physicalRequirement);
				if (result == null) result = caseExtendedRequirement(physicalRequirement);
				if (result == null) result = caseRequirement(physicalRequirement);
				if (result == null) result = caseAbstractRequirement(physicalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsExtensionPackage.DESIGN_CONSTRAINT: {
				DesignConstraint designConstraint = (DesignConstraint)theEObject;
				T result = caseDesignConstraint(designConstraint);
				if (result == null) result = caseExtendedRequirement(designConstraint);
				if (result == null) result = caseRequirement(designConstraint);
				if (result == null) result = caseAbstractRequirement(designConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedRequirement(ExtendedRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalRequirement(FunctionalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRequirement(InterfaceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceRequirement(PerformanceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalRequirement(PhysicalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignConstraint(DesignConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRequirement(AbstractRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RequirementsExtensionSwitch
