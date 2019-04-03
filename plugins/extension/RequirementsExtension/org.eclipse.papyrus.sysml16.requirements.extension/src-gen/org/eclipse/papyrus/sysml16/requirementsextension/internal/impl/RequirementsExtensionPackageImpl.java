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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;

import org.eclipse.papyrus.sysml16.requirementsextension.DesignConstraint;
import org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement;
import org.eclipse.papyrus.sysml16.requirementsextension.FunctionalRequirement;
import org.eclipse.papyrus.sysml16.requirementsextension.InterfaceRequirement;
import org.eclipse.papyrus.sysml16.requirementsextension.PerformanceRequirement;
import org.eclipse.papyrus.sysml16.requirementsextension.PhysicalRequirement;
import org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionFactory;
import org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage;
import org.eclipse.papyrus.sysml16.requirementsextension.RiskKind;
import org.eclipse.papyrus.sysml16.requirementsextension.VerificationMethodKind;

import org.eclipse.papyrus.sysml16.sysml.SysMLPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsExtensionPackageImpl extends EPackageImpl implements RequirementsExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verificationMethodKindEEnum = null;

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
	 * @see org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsExtensionPackageImpl() {
		super(eNS_URI, RequirementsExtensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementsExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsExtensionPackage init() {
		if (isInited) return (RequirementsExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsExtensionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRequirementsExtensionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RequirementsExtensionPackageImpl theRequirementsExtensionPackage = registeredRequirementsExtensionPackage instanceof RequirementsExtensionPackageImpl ? (RequirementsExtensionPackageImpl)registeredRequirementsExtensionPackage : new RequirementsExtensionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		SysMLPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRequirementsExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsExtensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsExtensionPackage.eNS_URI, theRequirementsExtensionPackage);
		return theRequirementsExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtendedRequirement() {
		return extendedRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedRequirement_Source() {
		return (EAttribute)extendedRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedRequirement_Risk() {
		return (EAttribute)extendedRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedRequirement_VerifyMethod() {
		return (EAttribute)extendedRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalRequirement() {
		return functionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceRequirement() {
		return interfaceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceRequirement() {
		return performanceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalRequirement() {
		return physicalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesignConstraint() {
		return designConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRiskKind() {
		return riskKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerificationMethodKind() {
		return verificationMethodKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsExtensionFactory getRequirementsExtensionFactory() {
		return (RequirementsExtensionFactory)getEFactoryInstance();
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
		extendedRequirementEClass = createEClass(EXTENDED_REQUIREMENT);
		createEAttribute(extendedRequirementEClass, EXTENDED_REQUIREMENT__SOURCE);
		createEAttribute(extendedRequirementEClass, EXTENDED_REQUIREMENT__RISK);
		createEAttribute(extendedRequirementEClass, EXTENDED_REQUIREMENT__VERIFY_METHOD);

		functionalRequirementEClass = createEClass(FUNCTIONAL_REQUIREMENT);

		interfaceRequirementEClass = createEClass(INTERFACE_REQUIREMENT);

		performanceRequirementEClass = createEClass(PERFORMANCE_REQUIREMENT);

		physicalRequirementEClass = createEClass(PHYSICAL_REQUIREMENT);

		designConstraintEClass = createEClass(DESIGN_CONSTRAINT);

		// Create enums
		riskKindEEnum = createEEnum(RISK_KIND);
		verificationMethodKindEEnum = createEEnum(VERIFICATION_METHOD_KIND);
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
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extendedRequirementEClass.getESuperTypes().add(theRequirementsPackage.getRequirement());
		functionalRequirementEClass.getESuperTypes().add(this.getExtendedRequirement());
		interfaceRequirementEClass.getESuperTypes().add(this.getExtendedRequirement());
		performanceRequirementEClass.getESuperTypes().add(this.getExtendedRequirement());
		physicalRequirementEClass.getESuperTypes().add(this.getExtendedRequirement());
		designConstraintEClass.getESuperTypes().add(this.getExtendedRequirement());

		// Initialize classes, features, and operations; add parameters
		initEClass(extendedRequirementEClass, ExtendedRequirement.class, "ExtendedRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExtendedRequirement_Source(), theTypesPackage.getString(), "source", null, 0, 1, ExtendedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExtendedRequirement_Risk(), this.getRiskKind(), "risk", null, 0, 1, ExtendedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExtendedRequirement_VerifyMethod(), this.getVerificationMethodKind(), "verifyMethod", null, 0, 1, ExtendedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(functionalRequirementEClass, FunctionalRequirement.class, "FunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(interfaceRequirementEClass, InterfaceRequirement.class, "InterfaceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(performanceRequirementEClass, PerformanceRequirement.class, "PerformanceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(physicalRequirementEClass, PhysicalRequirement.class, "PhysicalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(designConstraintEClass, DesignConstraint.class, "DesignConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(riskKindEEnum, RiskKind.class, "RiskKind"); //$NON-NLS-1$
		addEEnumLiteral(riskKindEEnum, RiskKind.HIGH);
		addEEnumLiteral(riskKindEEnum, RiskKind.MEDIUM);
		addEEnumLiteral(riskKindEEnum, RiskKind.LOW);

		initEEnum(verificationMethodKindEEnum, VerificationMethodKind.class, "VerificationMethodKind"); //$NON-NLS-1$
		addEEnumLiteral(verificationMethodKindEEnum, VerificationMethodKind.ANALYSIS);
		addEEnumLiteral(verificationMethodKindEEnum, VerificationMethodKind.DEMONSTRATION);
		addEEnumLiteral(verificationMethodKindEEnum, VerificationMethodKind.INSPECTION);
		addEEnumLiteral(verificationMethodKindEEnum, VerificationMethodKind.TEST);

		// Create resource
		createResource(eNS_URI);

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
			   "originalName", "RequirementsExtension" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RequirementsExtensionPackageImpl
