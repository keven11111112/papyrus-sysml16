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
package org.eclipse.papyrus.sysml16.portsandflows.internal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import org.eclipse.papyrus.sysml16.portsandflows.AcceptChangeStructuralFeatureEventAction;
import org.eclipse.papyrus.sysml16.portsandflows.AddFlowPropertyValueOnNestedPortAction;
import org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent;
import org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock;
import org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature;
import org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind;
import org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind;
import org.eclipse.papyrus.sysml16.portsandflows.FlowProperty;
import org.eclipse.papyrus.sysml16.portsandflows.FullPort;
import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;
import org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction;
import org.eclipse.papyrus.sysml16.portsandflows.ItemFlow;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsFactory;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;
import org.eclipse.papyrus.sysml16.portsandflows.ProxyPort;
import org.eclipse.papyrus.sysml16.portsandflows.TriggerOnNestedPort;

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
public class PortsAndFlowsPackageImpl extends EPackageImpl implements PortsAndFlowsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptChangeStructuralFeatureEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeStructuralFeatureEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationOnNestedPortActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerOnNestedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjugatedInterfaceBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addFlowPropertyValueOnNestedPortActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowDirectionKindEEnum = null;

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
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PortsAndFlowsPackageImpl() {
		super(eNS_URI, PortsAndFlowsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PortsAndFlowsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PortsAndFlowsPackage init() {
		if (isInited) return (PortsAndFlowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsAndFlowsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPortsAndFlowsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PortsAndFlowsPackageImpl thePortsAndFlowsPackage = registeredPortsAndFlowsPackage instanceof PortsAndFlowsPackageImpl ? (PortsAndFlowsPackageImpl)registeredPortsAndFlowsPackage : new PortsAndFlowsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelElementsPackage.eNS_URI);
		ModelElementsPackageImpl theModelElementsPackage = (ModelElementsPackageImpl)(registeredPackage instanceof ModelElementsPackageImpl ? registeredPackage : ModelElementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(registeredPackage instanceof RequirementsPackageImpl ? registeredPackage : RequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		thePortsAndFlowsPackage.createPackageContents();
		theSysMLPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theBlocksPackage.createPackageContents();
		theConstraintBlocksPackage.createPackageContents();
		theDeprecatedElementsPackage.createPackageContents();
		theModelElementsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		thePortsAndFlowsPackage.initializePackageContents();
		theSysMLPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theBlocksPackage.initializePackageContents();
		theConstraintBlocksPackage.initializePackageContents();
		theDeprecatedElementsPackage.initializePackageContents();
		theModelElementsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePortsAndFlowsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PortsAndFlowsPackage.eNS_URI, thePortsAndFlowsPackage);
		return thePortsAndFlowsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcceptChangeStructuralFeatureEventAction() {
		return acceptChangeStructuralFeatureEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction() {
		return (EReference)acceptChangeStructuralFeatureEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeStructuralFeatureEvent() {
		return changeStructuralFeatureEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangeStructuralFeatureEvent_Base_ChangeEvent() {
		return (EReference)changeStructuralFeatureEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangeStructuralFeatureEvent_StructuralFeature() {
		return (EReference)changeStructuralFeatureEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectedFeature() {
		return directedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectedFeature_Base_Feature() {
		return (EReference)directedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectedFeature_FeatureDirection() {
		return (EAttribute)directedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowProperty() {
		return flowPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowProperty_Base_Property() {
		return (EReference)flowPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowProperty_Direction() {
		return (EAttribute)flowPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowProperty__GetIcon() {
		return flowPropertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFullPort() {
		return fullPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFullPort_Base_Port() {
		return (EReference)fullPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceBlock() {
		return interfaceBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceBlock__GetConjugated() {
		return interfaceBlockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvocationOnNestedPortAction() {
		return invocationOnNestedPortActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvocationOnNestedPortAction_Base_InvocationAction() {
		return (EReference)invocationOnNestedPortActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvocationOnNestedPortAction_OnNestedPort() {
		return (EReference)invocationOnNestedPortActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemFlow() {
		return itemFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_Base_InformationFlow() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_ItemProperty() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProxyPort() {
		return proxyPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProxyPort_Base_Port() {
		return (EReference)proxyPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerOnNestedPort() {
		return triggerOnNestedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerOnNestedPort_Base_Trigger() {
		return (EReference)triggerOnNestedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerOnNestedPort_OnNestedPort() {
		return (EReference)triggerOnNestedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConjugatedInterfaceBlock() {
		return conjugatedInterfaceBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConjugatedInterfaceBlock_Original() {
		return (EReference)conjugatedInterfaceBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConjugatedInterfaceBlock__AreConjugated__DirectedFeature_DirectedFeature() {
		return conjugatedInterfaceBlockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConjugatedInterfaceBlock__AreConjugated__FlowProperty_FlowProperty() {
		return conjugatedInterfaceBlockEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConjugatedInterfaceBlock__AreConjugated__Reception_Reception() {
		return conjugatedInterfaceBlockEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConjugatedInterfaceBlock__AreConjugated__Operation_Operation() {
		return conjugatedInterfaceBlockEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConjugatedInterfaceBlock__AreConjugated__Property_Property() {
		return conjugatedInterfaceBlockEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConjugatedInterfaceBlock__AreSameConstraintSets__Constraint_Constraint() {
		return conjugatedInterfaceBlockEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConjugatedInterfaceBlock__AreSameParameterSets__ParameterSet_ParameterSet() {
		return conjugatedInterfaceBlockEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConjugatedInterfaceBlock__HaveSameSignatures__BehavioralFeature_BehavioralFeature() {
		return conjugatedInterfaceBlockEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddFlowPropertyValueOnNestedPortAction() {
		return addFlowPropertyValueOnNestedPortActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddFlowPropertyValueOnNestedPortAction_OnNestedPort() {
		return (EReference)addFlowPropertyValueOnNestedPortActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddFlowPropertyValueOnNestedPortAction_Base_AddStructuralFeatureValueAction() {
		return (EReference)addFlowPropertyValueOnNestedPortActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureDirectionKind() {
		return featureDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlowDirectionKind() {
		return flowDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortsAndFlowsFactory getPortsAndFlowsFactory() {
		return (PortsAndFlowsFactory)getEFactoryInstance();
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
		acceptChangeStructuralFeatureEventActionEClass = createEClass(ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION);
		createEReference(acceptChangeStructuralFeatureEventActionEClass, ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION);

		changeStructuralFeatureEventEClass = createEClass(CHANGE_STRUCTURAL_FEATURE_EVENT);
		createEReference(changeStructuralFeatureEventEClass, CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT);
		createEReference(changeStructuralFeatureEventEClass, CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE);

		directedFeatureEClass = createEClass(DIRECTED_FEATURE);
		createEReference(directedFeatureEClass, DIRECTED_FEATURE__BASE_FEATURE);
		createEAttribute(directedFeatureEClass, DIRECTED_FEATURE__FEATURE_DIRECTION);

		flowPropertyEClass = createEClass(FLOW_PROPERTY);
		createEReference(flowPropertyEClass, FLOW_PROPERTY__BASE_PROPERTY);
		createEAttribute(flowPropertyEClass, FLOW_PROPERTY__DIRECTION);
		createEOperation(flowPropertyEClass, FLOW_PROPERTY___GET_ICON);

		fullPortEClass = createEClass(FULL_PORT);
		createEReference(fullPortEClass, FULL_PORT__BASE_PORT);

		interfaceBlockEClass = createEClass(INTERFACE_BLOCK);
		createEOperation(interfaceBlockEClass, INTERFACE_BLOCK___GET_CONJUGATED);

		invocationOnNestedPortActionEClass = createEClass(INVOCATION_ON_NESTED_PORT_ACTION);
		createEReference(invocationOnNestedPortActionEClass, INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION);
		createEReference(invocationOnNestedPortActionEClass, INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT);

		itemFlowEClass = createEClass(ITEM_FLOW);
		createEReference(itemFlowEClass, ITEM_FLOW__BASE_INFORMATION_FLOW);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_PROPERTY);

		proxyPortEClass = createEClass(PROXY_PORT);
		createEReference(proxyPortEClass, PROXY_PORT__BASE_PORT);

		triggerOnNestedPortEClass = createEClass(TRIGGER_ON_NESTED_PORT);
		createEReference(triggerOnNestedPortEClass, TRIGGER_ON_NESTED_PORT__BASE_TRIGGER);
		createEReference(triggerOnNestedPortEClass, TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT);

		conjugatedInterfaceBlockEClass = createEClass(CONJUGATED_INTERFACE_BLOCK);
		createEReference(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK__ORIGINAL);
		createEOperation(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__DIRECTEDFEATURE_DIRECTEDFEATURE);
		createEOperation(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__FLOWPROPERTY_FLOWPROPERTY);
		createEOperation(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__RECEPTION_RECEPTION);
		createEOperation(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__OPERATION_OPERATION);
		createEOperation(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__PROPERTY_PROPERTY);
		createEOperation(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK___ARE_SAME_CONSTRAINT_SETS__CONSTRAINT_CONSTRAINT);
		createEOperation(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK___ARE_SAME_PARAMETER_SETS__PARAMETERSET_PARAMETERSET);
		createEOperation(conjugatedInterfaceBlockEClass, CONJUGATED_INTERFACE_BLOCK___HAVE_SAME_SIGNATURES__BEHAVIORALFEATURE_BEHAVIORALFEATURE);

		addFlowPropertyValueOnNestedPortActionEClass = createEClass(ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION);
		createEReference(addFlowPropertyValueOnNestedPortActionEClass, ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__ON_NESTED_PORT);
		createEReference(addFlowPropertyValueOnNestedPortActionEClass, ADD_FLOW_PROPERTY_VALUE_ON_NESTED_PORT_ACTION__BASE_ADD_STRUCTURAL_FEATURE_VALUE_ACTION);

		// Create enums
		featureDirectionKindEEnum = createEEnum(FEATURE_DIRECTION_KIND);
		flowDirectionKindEEnum = createEEnum(FLOW_DIRECTION_KIND);
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
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceBlockEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		invocationOnNestedPortActionEClass.getESuperTypes().add(theBlocksPackage.getElementPropertyPath());
		triggerOnNestedPortEClass.getESuperTypes().add(theBlocksPackage.getElementPropertyPath());
		conjugatedInterfaceBlockEClass.getESuperTypes().add(this.getInterfaceBlock());
		addFlowPropertyValueOnNestedPortActionEClass.getESuperTypes().add(theBlocksPackage.getElementPropertyPath());

		// Initialize classes, features, and operations; add parameters
		initEClass(acceptChangeStructuralFeatureEventActionEClass, AcceptChangeStructuralFeatureEventAction.class, "AcceptChangeStructuralFeatureEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction(), theUMLPackage.getAcceptEventAction(), null, "base_AcceptEventAction", null, 0, 1, AcceptChangeStructuralFeatureEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(changeStructuralFeatureEventEClass, ChangeStructuralFeatureEvent.class, "ChangeStructuralFeatureEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getChangeStructuralFeatureEvent_Base_ChangeEvent(), theUMLPackage.getChangeEvent(), null, "base_ChangeEvent", null, 0, 1, ChangeStructuralFeatureEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getChangeStructuralFeatureEvent_StructuralFeature(), theUMLPackage.getStructuralFeature(), null, "structuralFeature", null, 1, 1, ChangeStructuralFeatureEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(directedFeatureEClass, DirectedFeature.class, "DirectedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDirectedFeature_Base_Feature(), theUMLPackage.getFeature(), null, "base_Feature", null, 0, 1, DirectedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDirectedFeature_FeatureDirection(), this.getFeatureDirectionKind(), "featureDirection", null, 1, 1, DirectedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(flowPropertyEClass, FlowProperty.class, "FlowProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFlowProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, FlowProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFlowProperty_Direction(), this.getFlowDirectionKind(), "direction", "inout", 1, 1, FlowProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEOperation(getFlowProperty__GetIcon(), theUMLPackage.getImage(), "getIcon", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(fullPortEClass, FullPort.class, "FullPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFullPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, FullPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(interfaceBlockEClass, InterfaceBlock.class, "InterfaceBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEOperation(getInterfaceBlock__GetConjugated(), this.getInterfaceBlock(), "getConjugated", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(invocationOnNestedPortActionEClass, InvocationOnNestedPortAction.class, "InvocationOnNestedPortAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInvocationOnNestedPortAction_Base_InvocationAction(), theUMLPackage.getInvocationAction(), null, "base_InvocationAction", null, 0, 1, InvocationOnNestedPortAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInvocationOnNestedPortAction_OnNestedPort(), theUMLPackage.getPort(), null, "onNestedPort", null, 1, -1, InvocationOnNestedPortAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(itemFlowEClass, ItemFlow.class, "ItemFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getItemFlow_Base_InformationFlow(), theUMLPackage.getInformationFlow(), null, "base_InformationFlow", null, 0, 1, ItemFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getItemFlow_ItemProperty(), theUMLPackage.getProperty(), null, "itemProperty", null, 0, 1, ItemFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(proxyPortEClass, ProxyPort.class, "ProxyPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProxyPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, ProxyPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(triggerOnNestedPortEClass, TriggerOnNestedPort.class, "TriggerOnNestedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTriggerOnNestedPort_Base_Trigger(), theUMLPackage.getTrigger(), null, "base_Trigger", null, 1, 1, TriggerOnNestedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTriggerOnNestedPort_OnNestedPort(), theUMLPackage.getPort(), null, "onNestedPort", null, 1, -1, TriggerOnNestedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(conjugatedInterfaceBlockEClass, ConjugatedInterfaceBlock.class, "ConjugatedInterfaceBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConjugatedInterfaceBlock_Original(), this.getInterfaceBlock(), null, "original", null, 1, 1, ConjugatedInterfaceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getConjugatedInterfaceBlock__AreConjugated__DirectedFeature_DirectedFeature(), theTypesPackage.getBoolean(), "areConjugated", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getDirectedFeature(), "df1", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getDirectedFeature(), "df2", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConjugatedInterfaceBlock__AreConjugated__FlowProperty_FlowProperty(), theTypesPackage.getBoolean(), "areConjugated", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getFlowProperty(), "fp1", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getFlowProperty(), "fp2", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConjugatedInterfaceBlock__AreConjugated__Reception_Reception(), theTypesPackage.getBoolean(), "areConjugated", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getReception(), "r1", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getReception(), "r2", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConjugatedInterfaceBlock__AreConjugated__Operation_Operation(), theTypesPackage.getBoolean(), "areConjugated", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getOperation(), "o1", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getOperation(), "o2", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConjugatedInterfaceBlock__AreConjugated__Property_Property(), theTypesPackage.getBoolean(), "areConjugated", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getProperty(), "p1", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getProperty(), "p2", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConjugatedInterfaceBlock__AreSameConstraintSets__Constraint_Constraint(), theTypesPackage.getBoolean(), "areSameConstraintSets", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getConstraint(), "cs1", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getConstraint(), "cs2", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConjugatedInterfaceBlock__AreSameParameterSets__ParameterSet_ParameterSet(), theTypesPackage.getBoolean(), "areSameParameterSets", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getParameterSet(), "ps1", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getParameterSet(), "ps2", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConjugatedInterfaceBlock__HaveSameSignatures__BehavioralFeature_BehavioralFeature(), theTypesPackage.getBoolean(), "haveSameSignatures", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getBehavioralFeature(), "bf1", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getBehavioralFeature(), "bf2", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(addFlowPropertyValueOnNestedPortActionEClass, AddFlowPropertyValueOnNestedPortAction.class, "AddFlowPropertyValueOnNestedPortAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAddFlowPropertyValueOnNestedPortAction_OnNestedPort(), theUMLPackage.getPort(), null, "onNestedPort", null, 1, -1, AddFlowPropertyValueOnNestedPortAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAddFlowPropertyValueOnNestedPortAction_Base_AddStructuralFeatureValueAction(), theUMLPackage.getAddStructuralFeatureValueAction(), null, "base_AddStructuralFeatureValueAction", null, 0, 1, AddFlowPropertyValueOnNestedPortAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(featureDirectionKindEEnum, FeatureDirectionKind.class, "FeatureDirectionKind"); //$NON-NLS-1$
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.PROVIDED);
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.PROVIDED_REQUIRED);
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.REQUIRED);

		initEEnum(flowDirectionKindEEnum, FlowDirectionKind.class, "FlowDirectionKind"); //$NON-NLS-1$
		addEEnumLiteral(flowDirectionKindEEnum, FlowDirectionKind.IN);
		addEEnumLiteral(flowDirectionKindEEnum, FlowDirectionKind.INOUT);
		addEEnumLiteral(flowDirectionKindEEnum, FlowDirectionKind.OUT);

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
			   "originalName", "PortsAndFlows" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //PortsAndFlowsPackageImpl
