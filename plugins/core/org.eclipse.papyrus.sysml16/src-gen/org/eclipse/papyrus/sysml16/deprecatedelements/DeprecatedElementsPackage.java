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
package org.eclipse.papyrus.sysml16.deprecatedelements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.sysml16.deprecatedelements.DeprecatedElementsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeprecatedElements'"
 * @generated
 */
public interface DeprecatedElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deprecatedelements"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/sysml/1.6/SysML/DeprecatedElements"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DeprecatedElements"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeprecatedElementsPackage eINSTANCE = org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowPortImpl <em>Flow Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowPortImpl
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedElementsPackageImpl#getFlowPort()
	 * @generated
	 */
	int FLOW_PORT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__IS_ATOMIC = 2;

	/**
	 * The number of structural features of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Icon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT___GET_ICON = 0;

	/**
	 * The number of operations of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowSpecificationImpl
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedElementsPackageImpl#getFlowSpecification()
	 * @generated
	 */
	int FLOW_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION__BASE_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION___GET_FLOW_PROPERTIES = 0;

	/**
	 * The number of operations of the '<em>Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort <em>Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort
	 * @generated
	 */
	EClass getFlowPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getBase_Port()
	 * @see #getFlowPort()
	 * @generated
	 */
	EReference getFlowPort_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getDirection()
	 * @see #getFlowPort()
	 * @generated
	 */
	EAttribute getFlowPort_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#isAtomic <em>Is Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Atomic</em>'.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#isAtomic()
	 * @see #getFlowPort()
	 * @generated
	 */
	EAttribute getFlowPort_IsAtomic();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getIcon() <em>Get Icon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Icon</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getIcon()
	 * @generated
	 */
	EOperation getFlowPort__GetIcon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification <em>Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Specification</em>'.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification
	 * @generated
	 */
	EClass getFlowSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification#getBase_Interface()
	 * @see #getFlowSpecification()
	 * @generated
	 */
	EReference getFlowSpecification_Base_Interface();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification#getFlowProperties() <em>Get Flow Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Flow Properties</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification#getFlowProperties()
	 * @generated
	 */
	EOperation getFlowSpecification__GetFlowProperties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeprecatedElementsFactory getDeprecatedElementsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowPortImpl <em>Flow Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowPortImpl
		 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedElementsPackageImpl#getFlowPort()
		 * @generated
		 */
		EClass FLOW_PORT = eINSTANCE.getFlowPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_PORT__BASE_PORT = eINSTANCE.getFlowPort_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PORT__DIRECTION = eINSTANCE.getFlowPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Is Atomic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PORT__IS_ATOMIC = eINSTANCE.getFlowPort_IsAtomic();

		/**
		 * The meta object literal for the '<em><b>Get Icon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOW_PORT___GET_ICON = eINSTANCE.getFlowPort__GetIcon();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowSpecificationImpl
		 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.DeprecatedElementsPackageImpl#getFlowSpecification()
		 * @generated
		 */
		EClass FLOW_SPECIFICATION = eINSTANCE.getFlowSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION__BASE_INTERFACE = eINSTANCE.getFlowSpecification_Base_Interface();

		/**
		 * The meta object literal for the '<em><b>Get Flow Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOW_SPECIFICATION___GET_FLOW_PROPERTIES = eINSTANCE.getFlowSpecification__GetFlowProperties();

	}

} //DeprecatedElementsPackage
