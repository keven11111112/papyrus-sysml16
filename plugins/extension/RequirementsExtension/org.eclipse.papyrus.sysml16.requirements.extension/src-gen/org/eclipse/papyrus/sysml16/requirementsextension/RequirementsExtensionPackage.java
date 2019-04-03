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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This non-normative extension includes stereotypes for a simplified requirements taxonomy that is intended to be further adapted as required to support the particular needs of the application or organization. The requirements categories in this example include functional, interface, performance, physical requirements, and design constraints
 * 
 * Some general guidance for applying a requirements profile is as follows:
 * - The categories should be adapted for the specific application or organization and reflected in the table. This includes agreement on the categories and their associated descriptions, stereotype properties, and constraints. Additional categories can be added by further subclassing the categories in the table below, or adding additional categories at the pier level of these categories.
 * - The default requirement category should be the generic «requirement».
 * - Apply the more specialized requirement stereotype (functional, interface, performance, physical, design constraint) as applicable and ensure consistency with the description, stereotype properties, and constraints.
 * - A specific text requirement can include the application of more than one requirement category, in which case, each stereotype should be shown in guillemets.
 * <!-- end-model-doc -->
 * @see org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RequirementsExtension'"
 * @generated
 */
public interface RequirementsExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirementsextension"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/SysML/1.6/RequirementsExtension"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RequirementsExtension"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsExtensionPackage eINSTANCE = org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.ExtendedRequirementImpl <em>Extended Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.ExtendedRequirementImpl
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getExtendedRequirement()
	 * @generated
	 */
	int EXTENDED_REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__BASE_NAMED_ELEMENT = RequirementsPackage.REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__DERIVED = RequirementsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__DERIVED_FROM = RequirementsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__ID = RequirementsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__MASTER = RequirementsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__REFINED_BY = RequirementsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__SATISFIED_BY = RequirementsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__TEXT = RequirementsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__TRACED_TO = RequirementsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__VERIFIED_BY = RequirementsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__BASE_CLASS = RequirementsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__SOURCE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__RISK = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT__VERIFY_METHOD = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extended Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT_FEATURE_COUNT = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT___GET_SATISFIED_BY = RequirementsPackage.REQUIREMENT___GET_SATISFIED_BY;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT___GET_VERIFIED_BY = RequirementsPackage.REQUIREMENT___GET_VERIFIED_BY;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT___GET_TRACED_TO = RequirementsPackage.REQUIREMENT___GET_TRACED_TO;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT___GET_DERIVED = RequirementsPackage.REQUIREMENT___GET_DERIVED;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT___GET_DERIVED_FROM = RequirementsPackage.REQUIREMENT___GET_DERIVED_FROM;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT___GET_REFINED_BY = RequirementsPackage.REQUIREMENT___GET_REFINED_BY;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT___GET_MASTER = RequirementsPackage.REQUIREMENT___GET_MASTER;

	/**
	 * The number of operations of the '<em>Extended Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REQUIREMENT_OPERATION_COUNT = RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.FunctionalRequirementImpl
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__BASE_NAMED_ELEMENT = EXTENDED_REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DERIVED = EXTENDED_REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DERIVED_FROM = EXTENDED_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ID = EXTENDED_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__MASTER = EXTENDED_REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__REFINED_BY = EXTENDED_REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SATISFIED_BY = EXTENDED_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__TEXT = EXTENDED_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__TRACED_TO = EXTENDED_REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__VERIFIED_BY = EXTENDED_REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__BASE_CLASS = EXTENDED_REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SOURCE = EXTENDED_REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__RISK = EXTENDED_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__VERIFY_METHOD = EXTENDED_REQUIREMENT__VERIFY_METHOD;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = EXTENDED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT___GET_SATISFIED_BY = EXTENDED_REQUIREMENT___GET_SATISFIED_BY;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT___GET_VERIFIED_BY = EXTENDED_REQUIREMENT___GET_VERIFIED_BY;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT___GET_TRACED_TO = EXTENDED_REQUIREMENT___GET_TRACED_TO;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT___GET_DERIVED = EXTENDED_REQUIREMENT___GET_DERIVED;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT___GET_DERIVED_FROM = EXTENDED_REQUIREMENT___GET_DERIVED_FROM;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT___GET_REFINED_BY = EXTENDED_REQUIREMENT___GET_REFINED_BY;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT___GET_MASTER = EXTENDED_REQUIREMENT___GET_MASTER;

	/**
	 * The number of operations of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_OPERATION_COUNT = EXTENDED_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.InterfaceRequirementImpl <em>Interface Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.InterfaceRequirementImpl
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getInterfaceRequirement()
	 * @generated
	 */
	int INTERFACE_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__BASE_NAMED_ELEMENT = EXTENDED_REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__DERIVED = EXTENDED_REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__DERIVED_FROM = EXTENDED_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__ID = EXTENDED_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__MASTER = EXTENDED_REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__REFINED_BY = EXTENDED_REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__SATISFIED_BY = EXTENDED_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__TEXT = EXTENDED_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__TRACED_TO = EXTENDED_REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__VERIFIED_BY = EXTENDED_REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__BASE_CLASS = EXTENDED_REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__SOURCE = EXTENDED_REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__RISK = EXTENDED_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT__VERIFY_METHOD = EXTENDED_REQUIREMENT__VERIFY_METHOD;

	/**
	 * The number of structural features of the '<em>Interface Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT_FEATURE_COUNT = EXTENDED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT___GET_SATISFIED_BY = EXTENDED_REQUIREMENT___GET_SATISFIED_BY;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT___GET_VERIFIED_BY = EXTENDED_REQUIREMENT___GET_VERIFIED_BY;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT___GET_TRACED_TO = EXTENDED_REQUIREMENT___GET_TRACED_TO;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT___GET_DERIVED = EXTENDED_REQUIREMENT___GET_DERIVED;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT___GET_DERIVED_FROM = EXTENDED_REQUIREMENT___GET_DERIVED_FROM;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT___GET_REFINED_BY = EXTENDED_REQUIREMENT___GET_REFINED_BY;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT___GET_MASTER = EXTENDED_REQUIREMENT___GET_MASTER;

	/**
	 * The number of operations of the '<em>Interface Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIREMENT_OPERATION_COUNT = EXTENDED_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.PerformanceRequirementImpl <em>Performance Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.PerformanceRequirementImpl
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getPerformanceRequirement()
	 * @generated
	 */
	int PERFORMANCE_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__BASE_NAMED_ELEMENT = EXTENDED_REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__DERIVED = EXTENDED_REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__DERIVED_FROM = EXTENDED_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__ID = EXTENDED_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__MASTER = EXTENDED_REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__REFINED_BY = EXTENDED_REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__SATISFIED_BY = EXTENDED_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__TEXT = EXTENDED_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__TRACED_TO = EXTENDED_REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__VERIFIED_BY = EXTENDED_REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__BASE_CLASS = EXTENDED_REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__SOURCE = EXTENDED_REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__RISK = EXTENDED_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__VERIFY_METHOD = EXTENDED_REQUIREMENT__VERIFY_METHOD;

	/**
	 * The number of structural features of the '<em>Performance Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT_FEATURE_COUNT = EXTENDED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT___GET_SATISFIED_BY = EXTENDED_REQUIREMENT___GET_SATISFIED_BY;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT___GET_VERIFIED_BY = EXTENDED_REQUIREMENT___GET_VERIFIED_BY;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT___GET_TRACED_TO = EXTENDED_REQUIREMENT___GET_TRACED_TO;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT___GET_DERIVED = EXTENDED_REQUIREMENT___GET_DERIVED;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT___GET_DERIVED_FROM = EXTENDED_REQUIREMENT___GET_DERIVED_FROM;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT___GET_REFINED_BY = EXTENDED_REQUIREMENT___GET_REFINED_BY;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT___GET_MASTER = EXTENDED_REQUIREMENT___GET_MASTER;

	/**
	 * The number of operations of the '<em>Performance Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT_OPERATION_COUNT = EXTENDED_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.PhysicalRequirementImpl <em>Physical Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.PhysicalRequirementImpl
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getPhysicalRequirement()
	 * @generated
	 */
	int PHYSICAL_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__BASE_NAMED_ELEMENT = EXTENDED_REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__DERIVED = EXTENDED_REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__DERIVED_FROM = EXTENDED_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__ID = EXTENDED_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__MASTER = EXTENDED_REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__REFINED_BY = EXTENDED_REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__SATISFIED_BY = EXTENDED_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__TEXT = EXTENDED_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__TRACED_TO = EXTENDED_REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__VERIFIED_BY = EXTENDED_REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__BASE_CLASS = EXTENDED_REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__SOURCE = EXTENDED_REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__RISK = EXTENDED_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT__VERIFY_METHOD = EXTENDED_REQUIREMENT__VERIFY_METHOD;

	/**
	 * The number of structural features of the '<em>Physical Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT_FEATURE_COUNT = EXTENDED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT___GET_SATISFIED_BY = EXTENDED_REQUIREMENT___GET_SATISFIED_BY;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT___GET_VERIFIED_BY = EXTENDED_REQUIREMENT___GET_VERIFIED_BY;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT___GET_TRACED_TO = EXTENDED_REQUIREMENT___GET_TRACED_TO;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT___GET_DERIVED = EXTENDED_REQUIREMENT___GET_DERIVED;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT___GET_DERIVED_FROM = EXTENDED_REQUIREMENT___GET_DERIVED_FROM;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT___GET_REFINED_BY = EXTENDED_REQUIREMENT___GET_REFINED_BY;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT___GET_MASTER = EXTENDED_REQUIREMENT___GET_MASTER;

	/**
	 * The number of operations of the '<em>Physical Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_REQUIREMENT_OPERATION_COUNT = EXTENDED_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.DesignConstraintImpl <em>Design Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.DesignConstraintImpl
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getDesignConstraint()
	 * @generated
	 */
	int DESIGN_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__BASE_NAMED_ELEMENT = EXTENDED_REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__DERIVED = EXTENDED_REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__DERIVED_FROM = EXTENDED_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ID = EXTENDED_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__MASTER = EXTENDED_REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__REFINED_BY = EXTENDED_REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__SATISFIED_BY = EXTENDED_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__TEXT = EXTENDED_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__TRACED_TO = EXTENDED_REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__VERIFIED_BY = EXTENDED_REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__BASE_CLASS = EXTENDED_REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__SOURCE = EXTENDED_REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__RISK = EXTENDED_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__VERIFY_METHOD = EXTENDED_REQUIREMENT__VERIFY_METHOD;

	/**
	 * The number of structural features of the '<em>Design Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT_FEATURE_COUNT = EXTENDED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT___GET_SATISFIED_BY = EXTENDED_REQUIREMENT___GET_SATISFIED_BY;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT___GET_VERIFIED_BY = EXTENDED_REQUIREMENT___GET_VERIFIED_BY;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT___GET_TRACED_TO = EXTENDED_REQUIREMENT___GET_TRACED_TO;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT___GET_DERIVED = EXTENDED_REQUIREMENT___GET_DERIVED;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT___GET_DERIVED_FROM = EXTENDED_REQUIREMENT___GET_DERIVED_FROM;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT___GET_REFINED_BY = EXTENDED_REQUIREMENT___GET_REFINED_BY;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT___GET_MASTER = EXTENDED_REQUIREMENT___GET_MASTER;

	/**
	 * The number of operations of the '<em>Design Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT_OPERATION_COUNT = EXTENDED_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.RiskKind <em>Risk Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.RiskKind
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getRiskKind()
	 * @generated
	 */
	int RISK_KIND = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind <em>Verification Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getVerificationMethodKind()
	 * @generated
	 */
	int VERIFICATION_METHOD_KIND = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement <em>Extended Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Requirement</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement
	 * @generated
	 */
	EClass getExtendedRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getSource()
	 * @see #getExtendedRequirement()
	 * @generated
	 */
	EAttribute getExtendedRequirement_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getRisk()
	 * @see #getExtendedRequirement()
	 * @generated
	 */
	EAttribute getExtendedRequirement_Risk();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getVerifyMethod <em>Verify Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Method</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement#getVerifyMethod()
	 * @see #getExtendedRequirement()
	 * @generated
	 */
	EAttribute getExtendedRequirement_VerifyMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirementsextension.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirementsextension.InterfaceRequirement <em>Interface Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Requirement</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.InterfaceRequirement
	 * @generated
	 */
	EClass getInterfaceRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirementsextension.PerformanceRequirement <em>Performance Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Requirement</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.PerformanceRequirement
	 * @generated
	 */
	EClass getPerformanceRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirementsextension.PhysicalRequirement <em>Physical Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Requirement</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.PhysicalRequirement
	 * @generated
	 */
	EClass getPhysicalRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirementsextension.DesignConstraint <em>Design Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Constraint</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.DesignConstraint
	 * @generated
	 */
	EClass getDesignConstraint();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.sysml16.requirementsextension.RiskKind <em>Risk Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Kind</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.RiskKind
	 * @generated
	 */
	EEnum getRiskKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind <em>Verification Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verification Method Kind</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind
	 * @generated
	 */
	EEnum getVerificationMethodKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsExtensionFactory getRequirementsExtensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.ExtendedRequirementImpl <em>Extended Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.ExtendedRequirementImpl
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getExtendedRequirement()
		 * @generated
		 */
		EClass EXTENDED_REQUIREMENT = eINSTANCE.getExtendedRequirement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_REQUIREMENT__SOURCE = eINSTANCE.getExtendedRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_REQUIREMENT__RISK = eINSTANCE.getExtendedRequirement_Risk();

		/**
		 * The meta object literal for the '<em><b>Verify Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_REQUIREMENT__VERIFY_METHOD = eINSTANCE.getExtendedRequirement_VerifyMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.FunctionalRequirementImpl
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.InterfaceRequirementImpl <em>Interface Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.InterfaceRequirementImpl
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getInterfaceRequirement()
		 * @generated
		 */
		EClass INTERFACE_REQUIREMENT = eINSTANCE.getInterfaceRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.PerformanceRequirementImpl <em>Performance Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.PerformanceRequirementImpl
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getPerformanceRequirement()
		 * @generated
		 */
		EClass PERFORMANCE_REQUIREMENT = eINSTANCE.getPerformanceRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.PhysicalRequirementImpl <em>Physical Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.PhysicalRequirementImpl
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getPhysicalRequirement()
		 * @generated
		 */
		EClass PHYSICAL_REQUIREMENT = eINSTANCE.getPhysicalRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.DesignConstraintImpl <em>Design Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.DesignConstraintImpl
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getDesignConstraint()
		 * @generated
		 */
		EClass DESIGN_CONSTRAINT = eINSTANCE.getDesignConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.RiskKind <em>Risk Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.RiskKind
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getRiskKind()
		 * @generated
		 */
		EEnum RISK_KIND = eINSTANCE.getRiskKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind <em>Verification Method Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind
		 * @see org.eclipse.papyrus.sysml16.requirementsextension.internal.impl.RequirementsExtensionPackageImpl#getVerificationMethodKind()
		 * @generated
		 */
		EEnum VERIFICATION_METHOD_KIND = eINSTANCE.getVerificationMethodKind();

	}

} //RequirementsExtensionPackage
