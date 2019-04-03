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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml16.activities.ActivitiesPackage;

import org.eclipse.papyrus.sysml16.activities.internal.impl.ActivitiesPackageImpl;

import org.eclipse.papyrus.sysml16.allocations.AllocationsPackage;

import org.eclipse.papyrus.sysml16.allocations.internal.impl.AllocationsPackageImpl;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlocksPackageImpl;

import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlocksPackage;

import org.eclipse.papyrus.sysml16.constraintblocks.internal.impl.ConstraintBlocksPackageImpl;

import org.eclipse.papyrus.sysml16.deprecatedelements.DeprecatedElementsPackage;

import org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedElementsPackageImpl;

import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;

import org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl;

import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.papyrus.sysml16.portsandflows.internal.impl.PortsAndFlowsPackageImpl;

import org.eclipse.papyrus.sysml16.requirements.AbstractRequirement;
import org.eclipse.papyrus.sysml16.requirements.Copy;
import org.eclipse.papyrus.sysml16.requirements.DeriveReqt;
import org.eclipse.papyrus.sysml16.requirements.Refine;
import org.eclipse.papyrus.sysml16.requirements.Requirement;
import org.eclipse.papyrus.sysml16.requirements.RequirementsFactory;
import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;
import org.eclipse.papyrus.sysml16.requirements.Satisfy;
import org.eclipse.papyrus.sysml16.requirements.TestCase;
import org.eclipse.papyrus.sysml16.requirements.Trace;
import org.eclipse.papyrus.sysml16.requirements.Verify;

import org.eclipse.papyrus.sysml16.sysml.SysMLPackage;

import org.eclipse.papyrus.sysml16.sysml.internal.impl.SysMLPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsPackageImpl extends EPackageImpl implements RequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deriveReqtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.sysml16.requirements.RequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsPackageImpl() {
		super(eNS_URI, RequirementsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsPackage init() {
		if (isInited) return (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRequirementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = registeredRequirementsPackage instanceof RequirementsPackageImpl ? (RequirementsPackageImpl)registeredRequirementsPackage : new RequirementsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI);
		SysMLPackageImpl theSysMLPackage = (SysMLPackageImpl)(registeredPackage instanceof SysMLPackageImpl ? registeredPackage : SysMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(registeredPackage instanceof ActivitiesPackageImpl ? registeredPackage : ActivitiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(registeredPackage instanceof AllocationsPackageImpl ? registeredPackage : AllocationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		BlocksPackageImpl theBlocksPackage = (BlocksPackageImpl)(registeredPackage instanceof BlocksPackageImpl ? registeredPackage : BlocksPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintBlocksPackage.eNS_URI);
		ConstraintBlocksPackageImpl theConstraintBlocksPackage = (ConstraintBlocksPackageImpl)(registeredPackage instanceof ConstraintBlocksPackageImpl ? registeredPackage : ConstraintBlocksPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeprecatedElementsPackage.eNS_URI);
		DeprecatedElementsPackageImpl theDeprecatedElementsPackage = (DeprecatedElementsPackageImpl)(registeredPackage instanceof DeprecatedElementsPackageImpl ? registeredPackage : DeprecatedElementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PortsAndFlowsPackage.eNS_URI);
		PortsAndFlowsPackageImpl thePortsAndFlowsPackage = (PortsAndFlowsPackageImpl)(registeredPackage instanceof PortsAndFlowsPackageImpl ? registeredPackage : PortsAndFlowsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelElementsPackage.eNS_URI);
		ModelElementsPackageImpl theModelElementsPackage = (ModelElementsPackageImpl)(registeredPackage instanceof ModelElementsPackageImpl ? registeredPackage : ModelElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementsPackage.createPackageContents();
		theSysMLPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theBlocksPackage.createPackageContents();
		theConstraintBlocksPackage.createPackageContents();
		theDeprecatedElementsPackage.createPackageContents();
		thePortsAndFlowsPackage.createPackageContents();
		theModelElementsPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsPackage.initializePackageContents();
		theSysMLPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theBlocksPackage.initializePackageContents();
		theConstraintBlocksPackage.initializePackageContents();
		theDeprecatedElementsPackage.initializePackageContents();
		thePortsAndFlowsPackage.initializePackageContents();
		theModelElementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsPackage.eNS_URI, theRequirementsPackage);
		return theRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCopy() {
		return copyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTrace__GetTracedFrom__NamedElement_EList() {
		return traceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Base_Class() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractRequirement() {
		return abstractRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_Base_NamedElement() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_Derived() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_DerivedFrom() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractRequirement_Id() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_Master() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_RefinedBy() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_SatisfiedBy() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractRequirement_Text() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_TracedTo() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirement_VerifiedBy() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractRequirement__GetSatisfiedBy() {
		return abstractRequirementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractRequirement__GetVerifiedBy() {
		return abstractRequirementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractRequirement__GetTracedTo() {
		return abstractRequirementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractRequirement__GetDerived() {
		return abstractRequirementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractRequirement__GetDerivedFrom() {
		return abstractRequirementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractRequirement__GetRefinedBy() {
		return abstractRequirementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractRequirement__GetMaster() {
		return abstractRequirementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeriveReqt() {
		return deriveReqtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefine() {
		return refineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefine__GetRefines__NamedElement_EList() {
		return refineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSatisfy() {
		return satisfyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSatisfy__GetSatisfies__NamedElement_EList() {
		return satisfyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestCase_Base_Behavior() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestCase_Base_Operation() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerify() {
		return verifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVerify__GetVerifies__NamedElement_EList() {
		return verifyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsFactory getRequirementsFactory() {
		return (RequirementsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		copyEClass = createEClass(COPY);

		traceEClass = createEClass(TRACE);
		createEOperation(traceEClass, TRACE___GET_TRACED_FROM__NAMEDELEMENT_ELIST);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__BASE_CLASS);

		abstractRequirementEClass = createEClass(ABSTRACT_REQUIREMENT);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__BASE_NAMED_ELEMENT);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__DERIVED);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__DERIVED_FROM);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__ID);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__MASTER);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__REFINED_BY);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__SATISFIED_BY);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__TEXT);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__TRACED_TO);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__VERIFIED_BY);
		createEOperation(abstractRequirementEClass, ABSTRACT_REQUIREMENT___GET_SATISFIED_BY);
		createEOperation(abstractRequirementEClass, ABSTRACT_REQUIREMENT___GET_VERIFIED_BY);
		createEOperation(abstractRequirementEClass, ABSTRACT_REQUIREMENT___GET_TRACED_TO);
		createEOperation(abstractRequirementEClass, ABSTRACT_REQUIREMENT___GET_DERIVED);
		createEOperation(abstractRequirementEClass, ABSTRACT_REQUIREMENT___GET_DERIVED_FROM);
		createEOperation(abstractRequirementEClass, ABSTRACT_REQUIREMENT___GET_REFINED_BY);
		createEOperation(abstractRequirementEClass, ABSTRACT_REQUIREMENT___GET_MASTER);

		deriveReqtEClass = createEClass(DERIVE_REQT);

		refineEClass = createEClass(REFINE);
		createEOperation(refineEClass, REFINE___GET_REFINES__NAMEDELEMENT_ELIST);

		satisfyEClass = createEClass(SATISFY);
		createEOperation(satisfyEClass, SATISFY___GET_SATISFIES__NAMEDELEMENT_ELIST);

		testCaseEClass = createEClass(TEST_CASE);
		createEReference(testCaseEClass, TEST_CASE__BASE_BEHAVIOR);
		createEReference(testCaseEClass, TEST_CASE__BASE_OPERATION);

		verifyEClass = createEClass(VERIFY);
		createEOperation(verifyEClass, VERIFY___GET_VERIFIES__NAMEDELEMENT_ELIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		copyEClass.getESuperTypes().add(this.getTrace());
		traceEClass.getESuperTypes().add(theBlocksPackage.getDirectedRelationshipPropertyPath());
		traceEClass.getESuperTypes().add(theStandardPackage.getTrace());
		requirementEClass.getESuperTypes().add(this.getAbstractRequirement());
		deriveReqtEClass.getESuperTypes().add(this.getTrace());
		refineEClass.getESuperTypes().add(theBlocksPackage.getDirectedRelationshipPropertyPath());
		refineEClass.getESuperTypes().add(theStandardPackage.getRefine());
		satisfyEClass.getESuperTypes().add(this.getTrace());
		verifyEClass.getESuperTypes().add(this.getTrace());

		// Initialize classes, features, and operations; add parameters
		initEClass(copyEClass, Copy.class, "Copy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		EOperation op = initEOperation(getTrace__GetTracedFrom__NamedElement_EList(), null, "getTracedFrom", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getNamedElement(), "ref", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getRequirement(), "result", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRequirement_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractRequirementEClass, AbstractRequirement.class, "AbstractRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAbstractRequirement_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractRequirement_Derived(), this.getAbstractRequirement(), null, "derived", null, 0, -1, AbstractRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractRequirement_DerivedFrom(), this.getAbstractRequirement(), null, "derivedFrom", null, 0, -1, AbstractRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAbstractRequirement_Id(), theTypesPackage.getString(), "id", "", 1, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAbstractRequirement_Master(), this.getAbstractRequirement(), null, "master", null, 0, -1, AbstractRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractRequirement_RefinedBy(), theUMLPackage.getNamedElement(), null, "refinedBy", null, 0, -1, AbstractRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractRequirement_SatisfiedBy(), theUMLPackage.getNamedElement(), null, "satisfiedBy", null, 0, -1, AbstractRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAbstractRequirement_Text(), theTypesPackage.getString(), "text", "", 1, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAbstractRequirement_TracedTo(), theUMLPackage.getNamedElement(), null, "tracedTo", null, 0, -1, AbstractRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractRequirement_VerifiedBy(), theUMLPackage.getNamedElement(), null, "verifiedBy", null, 0, -1, AbstractRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAbstractRequirement__GetSatisfiedBy(), theUMLPackage.getNamedElement(), "getSatisfiedBy", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAbstractRequirement__GetVerifiedBy(), theUMLPackage.getNamedElement(), "getVerifiedBy", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAbstractRequirement__GetTracedTo(), theUMLPackage.getNamedElement(), "getTracedTo", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAbstractRequirement__GetDerived(), this.getAbstractRequirement(), "getDerived", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAbstractRequirement__GetDerivedFrom(), this.getAbstractRequirement(), "getDerivedFrom", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAbstractRequirement__GetRefinedBy(), theUMLPackage.getNamedElement(), "getRefinedBy", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getAbstractRequirement__GetMaster(), this.getAbstractRequirement(), "getMaster", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(deriveReqtEClass, DeriveReqt.class, "DeriveReqt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(refineEClass, Refine.class, "Refine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = initEOperation(getRefine__GetRefines__NamedElement_EList(), null, "getRefines", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getNamedElement(), "ref", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getRequirement(), "result", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(satisfyEClass, Satisfy.class, "Satisfy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = initEOperation(getSatisfy__GetSatisfies__NamedElement_EList(), null, "getSatisfies", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getNamedElement(), "ref", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getRequirement(), "result", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTestCase_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTestCase_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(verifyEClass, Verify.class, "Verify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = initEOperation(getVerify__GetVerifies__NamedElement_EList(), null, "getVerifies", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getNamedElement(), "ref", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getRequirement(), "result", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "Requirements" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RequirementsPackageImpl
