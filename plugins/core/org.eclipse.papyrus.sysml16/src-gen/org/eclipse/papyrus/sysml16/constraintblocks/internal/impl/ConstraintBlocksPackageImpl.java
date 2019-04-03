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
package org.eclipse.papyrus.sysml16.constraintblocks.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml16.activities.ActivitiesPackage;

import org.eclipse.papyrus.sysml16.activities.internal.impl.ActivitiesPackageImpl;

import org.eclipse.papyrus.sysml16.allocations.AllocationsPackage;

import org.eclipse.papyrus.sysml16.allocations.internal.impl.AllocationsPackageImpl;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlocksPackageImpl;

import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlock;
import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlocksFactory;
import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlocksPackage;

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
public class ConstraintBlocksPackageImpl extends EPackageImpl implements ConstraintBlocksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintBlockEClass = null;

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
	 * @see org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlocksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintBlocksPackageImpl() {
		super(eNS_URI, ConstraintBlocksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintBlocksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintBlocksPackage init() {
		if (isInited) return (ConstraintBlocksPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintBlocksPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConstraintBlocksPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConstraintBlocksPackageImpl theConstraintBlocksPackage = registeredConstraintBlocksPackage instanceof ConstraintBlocksPackageImpl ? (ConstraintBlocksPackageImpl)registeredConstraintBlocksPackage : new ConstraintBlocksPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeprecatedElementsPackage.eNS_URI);
		DeprecatedElementsPackageImpl theDeprecatedElementsPackage = (DeprecatedElementsPackageImpl)(registeredPackage instanceof DeprecatedElementsPackageImpl ? registeredPackage : DeprecatedElementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PortsAndFlowsPackage.eNS_URI);
		PortsAndFlowsPackageImpl thePortsAndFlowsPackage = (PortsAndFlowsPackageImpl)(registeredPackage instanceof PortsAndFlowsPackageImpl ? registeredPackage : PortsAndFlowsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelElementsPackage.eNS_URI);
		ModelElementsPackageImpl theModelElementsPackage = (ModelElementsPackageImpl)(registeredPackage instanceof ModelElementsPackageImpl ? registeredPackage : ModelElementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(registeredPackage instanceof RequirementsPackageImpl ? registeredPackage : RequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		theConstraintBlocksPackage.createPackageContents();
		theSysMLPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theBlocksPackage.createPackageContents();
		theDeprecatedElementsPackage.createPackageContents();
		thePortsAndFlowsPackage.createPackageContents();
		theModelElementsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintBlocksPackage.initializePackageContents();
		theSysMLPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theBlocksPackage.initializePackageContents();
		theDeprecatedElementsPackage.initializePackageContents();
		thePortsAndFlowsPackage.initializePackageContents();
		theModelElementsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintBlocksPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintBlocksPackage.eNS_URI, theConstraintBlocksPackage);
		return theConstraintBlocksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraintBlock() {
		return constraintBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstraintBlock__GetParameters() {
		return constraintBlockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintBlocksFactory getConstraintBlocksFactory() {
		return (ConstraintBlocksFactory)getEFactoryInstance();
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
		constraintBlockEClass = createEClass(CONSTRAINT_BLOCK);
		createEOperation(constraintBlockEClass, CONSTRAINT_BLOCK___GET_PARAMETERS);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constraintBlockEClass.getESuperTypes().add(theBlocksPackage.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(constraintBlockEClass, ConstraintBlock.class, "ConstraintBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEOperation(getConstraintBlock__GetParameters(), theUMLPackage.getProperty(), "getParameters", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

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
			   "originalName", "ConstraintBlocks" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //ConstraintBlocksPackageImpl
