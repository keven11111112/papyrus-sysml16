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
package org.eclipse.papyrus.sysml16.activities.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml16.activities.ActivitiesFactory;
import org.eclipse.papyrus.sysml16.activities.ActivitiesPackage;
import org.eclipse.papyrus.sysml16.activities.Continuous;
import org.eclipse.papyrus.sysml16.activities.ControlOperator;
import org.eclipse.papyrus.sysml16.activities.Discrete;
import org.eclipse.papyrus.sysml16.activities.NoBuffer;
import org.eclipse.papyrus.sysml16.activities.Optional;
import org.eclipse.papyrus.sysml16.activities.Overwrite;
import org.eclipse.papyrus.sysml16.activities.Probability;
import org.eclipse.papyrus.sysml16.activities.Rate;

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

import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;

import org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl;

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
public class ActivitiesPackageImpl extends EPackageImpl implements ActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overwriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityEClass = null;

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
	 * @see org.eclipse.papyrus.sysml16.activities.ActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitiesPackageImpl() {
		super(eNS_URI, ActivitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitiesPackage init() {
		if (isInited) return (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredActivitiesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ActivitiesPackageImpl theActivitiesPackage = registeredActivitiesPackage instanceof ActivitiesPackageImpl ? (ActivitiesPackageImpl)registeredActivitiesPackage : new ActivitiesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI);
		SysMLPackageImpl theSysMLPackage = (SysMLPackageImpl)(registeredPackage instanceof SysMLPackageImpl ? registeredPackage : SysMLPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(registeredPackage instanceof RequirementsPackageImpl ? registeredPackage : RequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		theActivitiesPackage.createPackageContents();
		theSysMLPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theBlocksPackage.createPackageContents();
		theConstraintBlocksPackage.createPackageContents();
		theDeprecatedElementsPackage.createPackageContents();
		thePortsAndFlowsPackage.createPackageContents();
		theModelElementsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theActivitiesPackage.initializePackageContents();
		theSysMLPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theBlocksPackage.initializePackageContents();
		theConstraintBlocksPackage.initializePackageContents();
		theDeprecatedElementsPackage.initializePackageContents();
		thePortsAndFlowsPackage.initializePackageContents();
		theModelElementsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitiesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitiesPackage.eNS_URI, theActivitiesPackage);
		return theActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuous() {
		return continuousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRate() {
		return rateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRate_Base_ActivityEdge() {
		return (EReference)rateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRate_Base_ObjectNode() {
		return (EReference)rateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRate_Base_Parameter() {
		return (EReference)rateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRate_Rate() {
		return (EReference)rateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlOperator() {
		return controlOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlOperator_Base_Behavior() {
		return (EReference)controlOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlOperator_Base_Operation() {
		return (EReference)controlOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscrete() {
		return discreteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoBuffer() {
		return noBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNoBuffer_Base_ObjectNode() {
		return (EReference)noBufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptional() {
		return optionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptional_Base_Parameter() {
		return (EReference)optionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverwrite() {
		return overwriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOverwrite_Base_ObjectNode() {
		return (EReference)overwriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbability() {
		return probabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProbability_Base_ActivityEdge() {
		return (EReference)probabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProbability_Base_ParameterSet() {
		return (EReference)probabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProbability_Probability() {
		return (EReference)probabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivitiesFactory getActivitiesFactory() {
		return (ActivitiesFactory)getEFactoryInstance();
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
		continuousEClass = createEClass(CONTINUOUS);

		rateEClass = createEClass(RATE);
		createEReference(rateEClass, RATE__BASE_ACTIVITY_EDGE);
		createEReference(rateEClass, RATE__BASE_OBJECT_NODE);
		createEReference(rateEClass, RATE__BASE_PARAMETER);
		createEReference(rateEClass, RATE__RATE);

		controlOperatorEClass = createEClass(CONTROL_OPERATOR);
		createEReference(controlOperatorEClass, CONTROL_OPERATOR__BASE_BEHAVIOR);
		createEReference(controlOperatorEClass, CONTROL_OPERATOR__BASE_OPERATION);

		discreteEClass = createEClass(DISCRETE);

		noBufferEClass = createEClass(NO_BUFFER);
		createEReference(noBufferEClass, NO_BUFFER__BASE_OBJECT_NODE);

		optionalEClass = createEClass(OPTIONAL);
		createEReference(optionalEClass, OPTIONAL__BASE_PARAMETER);

		overwriteEClass = createEClass(OVERWRITE);
		createEReference(overwriteEClass, OVERWRITE__BASE_OBJECT_NODE);

		probabilityEClass = createEClass(PROBABILITY);
		createEReference(probabilityEClass, PROBABILITY__BASE_ACTIVITY_EDGE);
		createEReference(probabilityEClass, PROBABILITY__BASE_PARAMETER_SET);
		createEReference(probabilityEClass, PROBABILITY__PROBABILITY);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		continuousEClass.getESuperTypes().add(this.getRate());
		discreteEClass.getESuperTypes().add(this.getRate());

		// Initialize classes, features, and operations; add parameters
		initEClass(continuousEClass, Continuous.class, "Continuous", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(rateEClass, Rate.class, "Rate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRate_Base_ActivityEdge(), theUMLPackage.getActivityEdge(), null, "base_ActivityEdge", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRate_Base_ObjectNode(), theUMLPackage.getObjectNode(), null, "base_ObjectNode", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRate_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRate_Rate(), theUMLPackage.getInstanceSpecification(), null, "rate", null, 1, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(controlOperatorEClass, ControlOperator.class, "ControlOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getControlOperator_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 0, 1, ControlOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getControlOperator_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, ControlOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(discreteEClass, Discrete.class, "Discrete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(noBufferEClass, NoBuffer.class, "NoBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNoBuffer_Base_ObjectNode(), theUMLPackage.getObjectNode(), null, "base_ObjectNode", null, 0, 1, NoBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(optionalEClass, Optional.class, "Optional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOptional_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 0, 1, Optional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(overwriteEClass, Overwrite.class, "Overwrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOverwrite_Base_ObjectNode(), theUMLPackage.getObjectNode(), null, "base_ObjectNode", null, 0, 1, Overwrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(probabilityEClass, Probability.class, "Probability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProbability_Base_ActivityEdge(), theUMLPackage.getActivityEdge(), null, "base_ActivityEdge", null, 0, 1, Probability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProbability_Base_ParameterSet(), theUMLPackage.getParameterSet(), null, "base_ParameterSet", null, 0, 1, Probability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProbability_Probability(), theUMLPackage.getValueSpecification(), null, "probability", null, 1, 1, Probability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
			   "originalName", "Activities" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //ActivitiesPackageImpl
