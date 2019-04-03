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
package org.eclipse.papyrus.sysml16.sysml.internal.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
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

import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;

import org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementsPackageImpl;

import org.eclipse.papyrus.sysml16.sysml.Dummy;
import org.eclipse.papyrus.sysml16.sysml.SysMLFactory;
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
public class SysMLPackageImpl extends EPackageImpl implements SysMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dummyEEnum = null;

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
	 * @see org.eclipse.papyrus.sysml16.sysml.SysMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SysMLPackageImpl() {
		super(eNS_URI, SysMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SysMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SysMLPackage init() {
		if (isInited) return (SysMLPackage)EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSysMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SysMLPackageImpl theSysMLPackage = registeredSysMLPackage instanceof SysMLPackageImpl ? (SysMLPackageImpl)registeredSysMLPackage : new SysMLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(registeredPackage instanceof RequirementsPackageImpl ? registeredPackage : RequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		theSysMLPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theBlocksPackage.createPackageContents();
		theConstraintBlocksPackage.createPackageContents();
		theDeprecatedElementsPackage.createPackageContents();
		thePortsAndFlowsPackage.createPackageContents();
		theModelElementsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theSysMLPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theBlocksPackage.initializePackageContents();
		theConstraintBlocksPackage.initializePackageContents();
		theDeprecatedElementsPackage.initializePackageContents();
		thePortsAndFlowsPackage.initializePackageContents();
		theModelElementsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSysMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, theSysMLPackage);
		return theSysMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDummy() {
		return dummyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SysMLFactory getSysMLFactory() {
		return (SysMLFactory)getEFactoryInstance();
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

		// Create enums
		dummyEEnum = createEEnum(DUMMY);
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
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		AllocationsPackage theAllocationsPackage = (AllocationsPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		ConstraintBlocksPackage theConstraintBlocksPackage = (ConstraintBlocksPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintBlocksPackage.eNS_URI);
		DeprecatedElementsPackage theDeprecatedElementsPackage = (DeprecatedElementsPackage)EPackage.Registry.INSTANCE.getEPackage(DeprecatedElementsPackage.eNS_URI);
		PortsAndFlowsPackage thePortsAndFlowsPackage = (PortsAndFlowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsAndFlowsPackage.eNS_URI);
		ModelElementsPackage theModelElementsPackage = (ModelElementsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelElementsPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitiesPackage);
		getESubpackages().add(theAllocationsPackage);
		getESubpackages().add(theBlocksPackage);
		getESubpackages().add(theConstraintBlocksPackage);
		getESubpackages().add(theDeprecatedElementsPackage);
		getESubpackages().add(thePortsAndFlowsPackage);
		getESubpackages().add(theModelElementsPackage);
		getESubpackages().add(theRequirementsPackage);

		// Initialize enums and add enum literals
		initEEnum(dummyEEnum, Dummy.class, "Dummy"); //$NON-NLS-1$

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
			   "originalName", "SysML" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //SysMLPackageImpl
