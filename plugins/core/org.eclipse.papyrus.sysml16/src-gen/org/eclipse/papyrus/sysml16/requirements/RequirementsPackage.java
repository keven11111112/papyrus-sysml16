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
package org.eclipse.papyrus.sysml16.requirements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

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
 * @see org.eclipse.papyrus.sysml16.requirements.RequirementsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Requirements'"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/sysml/1.6/SysML/Requirements"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Requirements"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.TraceImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 1;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__BASE_DIRECTED_RELATIONSHIP = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__BASE_ABSTRACTION = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE___GET_TRACED_FROM__NAMEDELEMENT_ELIST = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.CopyImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 0;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__BASE_DIRECTED_RELATIONSHIP = TRACE__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SOURCE_CONTEXT = TRACE__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SOURCE_PROPERTY_PATH = TRACE__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TARGET_CONTEXT = TRACE__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TARGET_PROPERTY_PATH = TRACE__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__BASE_ABSTRACTION = TRACE__BASE_ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY___GET_TRACED_FROM__NAMEDELEMENT_ELIST = TRACE___GET_TRACED_FROM__NAMEDELEMENT_ELIST;

	/**
	 * The number of operations of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getAbstractRequirement()
	 * @generated
	 */
	int ABSTRACT_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DERIVED = 1;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DERIVED_FROM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__MASTER = 4;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__REFINED_BY = 5;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SATISFIED_BY = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__TEXT = 7;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__TRACED_TO = 8;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__VERIFIED_BY = 9;

	/**
	 * The number of structural features of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___GET_SATISFIED_BY = 0;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___GET_VERIFIED_BY = 1;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___GET_TRACED_TO = 2;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___GET_DERIVED = 3;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___GET_DERIVED_FROM = 4;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___GET_REFINED_BY = 5;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT___GET_MASTER = 6;

	/**
	 * The number of operations of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_NAMED_ELEMENT = ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED = ABSTRACT_REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = ABSTRACT_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = ABSTRACT_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MASTER = ABSTRACT_REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_BY = ABSTRACT_REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = ABSTRACT_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = ABSTRACT_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TRACED_TO = ABSTRACT_REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED_BY = ABSTRACT_REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_CLASS = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_SATISFIED_BY = ABSTRACT_REQUIREMENT___GET_SATISFIED_BY;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_VERIFIED_BY = ABSTRACT_REQUIREMENT___GET_VERIFIED_BY;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_TRACED_TO = ABSTRACT_REQUIREMENT___GET_TRACED_TO;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_DERIVED = ABSTRACT_REQUIREMENT___GET_DERIVED;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_DERIVED_FROM = ABSTRACT_REQUIREMENT___GET_DERIVED_FROM;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_REFINED_BY = ABSTRACT_REQUIREMENT___GET_REFINED_BY;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_MASTER = ABSTRACT_REQUIREMENT___GET_MASTER;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = ABSTRACT_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.DeriveReqtImpl <em>Derive Reqt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.DeriveReqtImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getDeriveReqt()
	 * @generated
	 */
	int DERIVE_REQT = 4;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__BASE_DIRECTED_RELATIONSHIP = TRACE__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__SOURCE_CONTEXT = TRACE__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__SOURCE_PROPERTY_PATH = TRACE__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__TARGET_CONTEXT = TRACE__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__TARGET_PROPERTY_PATH = TRACE__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__BASE_ABSTRACTION = TRACE__BASE_ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Derive Reqt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT___GET_TRACED_FROM__NAMEDELEMENT_ELIST = TRACE___GET_TRACED_FROM__NAMEDELEMENT_ELIST;

	/**
	 * The number of operations of the '<em>Derive Reqt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.RefineImpl <em>Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RefineImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getRefine()
	 * @generated
	 */
	int REFINE = 5;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_DIRECTED_RELATIONSHIP = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__SOURCE_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__SOURCE_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__TARGET_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__TARGET_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_ABSTRACTION = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_FEATURE_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Refines</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE___GET_REFINES__NAMEDELEMENT_ELIST = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_OPERATION_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.SatisfyImpl <em>Satisfy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.SatisfyImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getSatisfy()
	 * @generated
	 */
	int SATISFY = 6;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_DIRECTED_RELATIONSHIP = TRACE__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SOURCE_CONTEXT = TRACE__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SOURCE_PROPERTY_PATH = TRACE__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__TARGET_CONTEXT = TRACE__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__TARGET_PROPERTY_PATH = TRACE__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_ABSTRACTION = TRACE__BASE_ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY___GET_TRACED_FROM__NAMEDELEMENT_ELIST = TRACE___GET_TRACED_FROM__NAMEDELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Get Satisfies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY___GET_SATISFIES__NAMEDELEMENT_ELIST = TRACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_OPERATION_COUNT = TRACE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.TestCaseImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 7;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__BASE_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__BASE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.VerifyImpl <em>Verify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.VerifyImpl
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getVerify()
	 * @generated
	 */
	int VERIFY = 8;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__BASE_DIRECTED_RELATIONSHIP = TRACE__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SOURCE_CONTEXT = TRACE__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SOURCE_PROPERTY_PATH = TRACE__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TARGET_CONTEXT = TRACE__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TARGET_PROPERTY_PATH = TRACE__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__BASE_ABSTRACTION = TRACE__BASE_ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY___GET_TRACED_FROM__NAMEDELEMENT_ELIST = TRACE___GET_TRACED_FROM__NAMEDELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Get Verifies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY___GET_VERIFIES__NAMEDELEMENT_ELIST = TRACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_OPERATION_COUNT = TRACE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.Trace#getTracedFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.emf.common.util.EList) <em>Get Traced From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Traced From</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.Trace#getTracedFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTrace__GetTracedFrom__NamedElement_EList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement#getBase_Class()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement <em>Abstract Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Requirement</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement
	 * @generated
	 */
	EClass getAbstractRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getBase_NamedElement()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_Base_NamedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getDerived()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_Derived();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getDerivedFrom()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getId()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getMaster()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_Master();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined By</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getRefinedBy()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_RefinedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfied By</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getSatisfiedBy()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_SatisfiedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getText()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getTracedTo <em>Traced To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traced To</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getTracedTo()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_TracedTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getVerifiedBy <em>Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified By</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getVerifiedBy()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_VerifiedBy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getSatisfiedBy() <em>Get Satisfied By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Satisfied By</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getSatisfiedBy()
	 * @generated
	 */
	EOperation getAbstractRequirement__GetSatisfiedBy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getVerifiedBy() <em>Get Verified By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Verified By</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getVerifiedBy()
	 * @generated
	 */
	EOperation getAbstractRequirement__GetVerifiedBy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getTracedTo() <em>Get Traced To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Traced To</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getTracedTo()
	 * @generated
	 */
	EOperation getAbstractRequirement__GetTracedTo();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getDerived() <em>Get Derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Derived</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getDerived()
	 * @generated
	 */
	EOperation getAbstractRequirement__GetDerived();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getDerivedFrom() <em>Get Derived From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Derived From</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getDerivedFrom()
	 * @generated
	 */
	EOperation getAbstractRequirement__GetDerivedFrom();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getRefinedBy() <em>Get Refined By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Refined By</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getRefinedBy()
	 * @generated
	 */
	EOperation getAbstractRequirement__GetRefinedBy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getMaster() <em>Get Master</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Master</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.AbstractRequirement#getMaster()
	 * @generated
	 */
	EOperation getAbstractRequirement__GetMaster();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.DeriveReqt <em>Derive Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derive Reqt</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.DeriveReqt
	 * @generated
	 */
	EClass getDeriveReqt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refine</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.Refine
	 * @generated
	 */
	EClass getRefine();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.Refine#getRefines(org.eclipse.uml2.uml.NamedElement, org.eclipse.emf.common.util.EList) <em>Get Refines</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Refines</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.Refine#getRefines(org.eclipse.uml2.uml.NamedElement, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRefine__GetRefines__NamedElement_EList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfy</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.Satisfy
	 * @generated
	 */
	EClass getSatisfy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.Satisfy#getSatisfies(org.eclipse.uml2.uml.NamedElement, org.eclipse.emf.common.util.EList) <em>Get Satisfies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Satisfies</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.Satisfy#getSatisfies(org.eclipse.uml2.uml.NamedElement, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSatisfy__GetSatisfies__NamedElement_EList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.requirements.TestCase#getBase_Behavior <em>Base Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavior</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.TestCase#getBase_Behavior()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Base_Behavior();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.requirements.TestCase#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.TestCase#getBase_Operation()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Base_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.requirements.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verify</em>'.
	 * @see org.eclipse.papyrus.sysml16.requirements.Verify
	 * @generated
	 */
	EClass getVerify();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.requirements.Verify#getVerifies(org.eclipse.uml2.uml.NamedElement, org.eclipse.emf.common.util.EList) <em>Get Verifies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Verifies</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.requirements.Verify#getVerifies(org.eclipse.uml2.uml.NamedElement, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getVerify__GetVerifies__NamedElement_EList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.CopyImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.TraceImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Get Traced From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE___GET_TRACED_FROM__NAMEDELEMENT_ELIST = eINSTANCE.getTrace__GetTracedFrom__NamedElement_EList();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__BASE_CLASS = eINSTANCE.getRequirement_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getAbstractRequirement()
		 * @generated
		 */
		EClass ABSTRACT_REQUIREMENT = eINSTANCE.getAbstractRequirement();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT = eINSTANCE.getAbstractRequirement_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__DERIVED = eINSTANCE.getAbstractRequirement_Derived();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__DERIVED_FROM = eINSTANCE.getAbstractRequirement_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__ID = eINSTANCE.getAbstractRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__MASTER = eINSTANCE.getAbstractRequirement_Master();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__REFINED_BY = eINSTANCE.getAbstractRequirement_RefinedBy();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__SATISFIED_BY = eINSTANCE.getAbstractRequirement_SatisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__TEXT = eINSTANCE.getAbstractRequirement_Text();

		/**
		 * The meta object literal for the '<em><b>Traced To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__TRACED_TO = eINSTANCE.getAbstractRequirement_TracedTo();

		/**
		 * The meta object literal for the '<em><b>Verified By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__VERIFIED_BY = eINSTANCE.getAbstractRequirement_VerifiedBy();

		/**
		 * The meta object literal for the '<em><b>Get Satisfied By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_REQUIREMENT___GET_SATISFIED_BY = eINSTANCE.getAbstractRequirement__GetSatisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Get Verified By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_REQUIREMENT___GET_VERIFIED_BY = eINSTANCE.getAbstractRequirement__GetVerifiedBy();

		/**
		 * The meta object literal for the '<em><b>Get Traced To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_REQUIREMENT___GET_TRACED_TO = eINSTANCE.getAbstractRequirement__GetTracedTo();

		/**
		 * The meta object literal for the '<em><b>Get Derived</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_REQUIREMENT___GET_DERIVED = eINSTANCE.getAbstractRequirement__GetDerived();

		/**
		 * The meta object literal for the '<em><b>Get Derived From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_REQUIREMENT___GET_DERIVED_FROM = eINSTANCE.getAbstractRequirement__GetDerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Get Refined By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_REQUIREMENT___GET_REFINED_BY = eINSTANCE.getAbstractRequirement__GetRefinedBy();

		/**
		 * The meta object literal for the '<em><b>Get Master</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_REQUIREMENT___GET_MASTER = eINSTANCE.getAbstractRequirement__GetMaster();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.DeriveReqtImpl <em>Derive Reqt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.DeriveReqtImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getDeriveReqt()
		 * @generated
		 */
		EClass DERIVE_REQT = eINSTANCE.getDeriveReqt();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.RefineImpl <em>Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RefineImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getRefine()
		 * @generated
		 */
		EClass REFINE = eINSTANCE.getRefine();

		/**
		 * The meta object literal for the '<em><b>Get Refines</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFINE___GET_REFINES__NAMEDELEMENT_ELIST = eINSTANCE.getRefine__GetRefines__NamedElement_EList();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.SatisfyImpl <em>Satisfy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.SatisfyImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getSatisfy()
		 * @generated
		 */
		EClass SATISFY = eINSTANCE.getSatisfy();

		/**
		 * The meta object literal for the '<em><b>Get Satisfies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATISFY___GET_SATISFIES__NAMEDELEMENT_ELIST = eINSTANCE.getSatisfy__GetSatisfies__NamedElement_EList();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.TestCaseImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Base Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__BASE_BEHAVIOR = eINSTANCE.getTestCase_Base_Behavior();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__BASE_OPERATION = eINSTANCE.getTestCase_Base_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.requirements.internal.impl.VerifyImpl <em>Verify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.VerifyImpl
		 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl#getVerify()
		 * @generated
		 */
		EClass VERIFY = eINSTANCE.getVerify();

		/**
		 * The meta object literal for the '<em><b>Get Verifies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERIFY___GET_VERIFIES__NAMEDELEMENT_ELIST = eINSTANCE.getVerify__GetVerifies__NamedElement_EList();

	}

} //RequirementsPackage
