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
package org.eclipse.papyrus.sysml16.modelelements;

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
 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ModelElements'"
 * @generated
 */
public interface ModelElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelelements"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/sysml/1.6/SysML/ModelElements"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModelElements"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelElementsPackage eINSTANCE = org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ConformImpl <em>Conform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ConformImpl
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getConform()
	 * @generated
	 */
	int CONFORM = 0;

	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM__BASE_GENERALIZATION = 0;

	/**
	 * The number of structural features of the '<em>Conform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl <em>Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getElementGroup()
	 * @generated
	 */
	int ELEMENT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__BASE_COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__CRITERION = 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__NAME = 3;

	/**
	 * The feature id for the '<em><b>Ordered Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__ORDERED_MEMBER = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__SIZE = 5;

	/**
	 * The number of structural features of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>All Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP___ALL_GROUPS__ELEMENT_ELIST = 0;

	/**
	 * The operation id for the '<em>Criterion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP___CRITERION__STRING = 1;

	/**
	 * The operation id for the '<em>Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP___MEMBER__ELIST = 2;

	/**
	 * The operation id for the '<em>Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP___SIZE__INT = 3;

	/**
	 * The number of operations of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ExposeImpl <em>Expose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ExposeImpl
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getExpose()
	 * @generated
	 */
	int EXPOSE = 2;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Expose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ProblemImpl
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 3;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.RationaleImpl
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 4;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.StakeholderImpl
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 5;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__BASE_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Concern List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CONCERN_LIST = 1;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CONCERN = 2;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewImpl
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Stakeholder</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__STAKEHOLDER = 1;

	/**
	 * The feature id for the '<em><b>View Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_POINT = 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getViewpoint()
	 * @generated
	 */
	int VIEWPOINT = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CONCERN = 1;

	/**
	 * The feature id for the '<em><b>Concern List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CONCERN_LIST = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__METHOD = 4;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__PRESENTATION = 5;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__PURPOSE = 6;

	/**
	 * The feature id for the '<em><b>Stakeholder</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__STAKEHOLDER = 7;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.modelelements.Conform <em>Conform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Conform
	 * @generated
	 */
	EClass getConform();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.Conform#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Conform#getBase_Generalization()
	 * @see #getConform()
	 * @generated
	 */
	EReference getConform_Base_Generalization();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Group</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup
	 * @generated
	 */
	EClass getElementGroup();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getBase_Comment()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_Base_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criterion</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getCriterion()
	 * @see #getElementGroup()
	 * @generated
	 */
	EAttribute getElementGroup_Criterion();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getMember()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_Member();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getName()
	 * @see #getElementGroup()
	 * @generated
	 */
	EAttribute getElementGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getOrderedMember <em>Ordered Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ordered Member</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getOrderedMember()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_OrderedMember();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#getSize()
	 * @see #getElementGroup()
	 * @generated
	 */
	EAttribute getElementGroup_Size();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#allGroups(org.eclipse.uml2.uml.Element, org.eclipse.emf.common.util.EList) <em>All Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Groups</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#allGroups(org.eclipse.uml2.uml.Element, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getElementGroup__AllGroups__Element_EList();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#criterion(java.lang.String) <em>Criterion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Criterion</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#criterion(java.lang.String)
	 * @generated
	 */
	EOperation getElementGroup__Criterion__String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#member(org.eclipse.emf.common.util.EList) <em>Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Member</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#member(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getElementGroup__Member__EList();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml16.modelelements.ElementGroup#size(int) <em>Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size</em>' operation.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ElementGroup#size(int)
	 * @generated
	 */
	EOperation getElementGroup__Size__int();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.modelelements.Expose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expose</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Expose
	 * @generated
	 */
	EClass getExpose();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.Expose#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Expose#getBase_Dependency()
	 * @see #getExpose()
	 * @generated
	 */
	EReference getExpose_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.modelelements.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.Problem#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Problem#getBase_Comment()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.modelelements.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.Rationale#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Rationale#getBase_Comment()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.modelelements.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.Stakeholder#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Stakeholder#getBase_Classifier()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_Base_Classifier();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.modelelements.Stakeholder#getConcernList <em>Concern List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concern List</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Stakeholder#getConcernList()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_ConcernList();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.sysml16.modelelements.Stakeholder#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Concern</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Stakeholder#getConcern()
	 * @see #getStakeholder()
	 * @generated
	 */
	EAttribute getStakeholder_Concern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.modelelements.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.View#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.View#getBase_Class()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.modelelements.View#getStakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholder</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.View#getStakeholder()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Stakeholder();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.View#getViewPoint <em>View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View Point</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.View#getViewPoint()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewPoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint
	 * @generated
	 */
	EClass getViewpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getBase_Class()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Base_Class();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Concern</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getConcern()
	 * @see #getViewpoint()
	 * @generated
	 */
	EAttribute getViewpoint_Concern();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getConcernList <em>Concern List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concern List</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getConcernList()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_ConcernList();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getLanguage()
	 * @see #getViewpoint()
	 * @generated
	 */
	EAttribute getViewpoint_Language();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getMethod()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Method();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Presentation</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getPresentation()
	 * @see #getViewpoint()
	 * @generated
	 */
	EAttribute getViewpoint_Presentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getPurpose()
	 * @see #getViewpoint()
	 * @generated
	 */
	EAttribute getViewpoint_Purpose();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getStakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholder</em>'.
	 * @see org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getStakeholder()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Stakeholder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelElementsFactory getModelElementsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ConformImpl <em>Conform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ConformImpl
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getConform()
		 * @generated
		 */
		EClass CONFORM = eINSTANCE.getConform();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM__BASE_GENERALIZATION = eINSTANCE.getConform_Base_Generalization();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl <em>Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getElementGroup()
		 * @generated
		 */
		EClass ELEMENT_GROUP = eINSTANCE.getElementGroup();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__BASE_COMMENT = eINSTANCE.getElementGroup_Base_Comment();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_GROUP__CRITERION = eINSTANCE.getElementGroup_Criterion();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__MEMBER = eINSTANCE.getElementGroup_Member();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_GROUP__NAME = eINSTANCE.getElementGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Ordered Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__ORDERED_MEMBER = eINSTANCE.getElementGroup_OrderedMember();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_GROUP__SIZE = eINSTANCE.getElementGroup_Size();

		/**
		 * The meta object literal for the '<em><b>All Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_GROUP___ALL_GROUPS__ELEMENT_ELIST = eINSTANCE.getElementGroup__AllGroups__Element_EList();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_GROUP___CRITERION__STRING = eINSTANCE.getElementGroup__Criterion__String();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_GROUP___MEMBER__ELIST = eINSTANCE.getElementGroup__Member__EList();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_GROUP___SIZE__INT = eINSTANCE.getElementGroup__Size__int();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ExposeImpl <em>Expose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ExposeImpl
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getExpose()
		 * @generated
		 */
		EClass EXPOSE = eINSTANCE.getExpose();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSE__BASE_DEPENDENCY = eINSTANCE.getExpose_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ProblemImpl
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__BASE_COMMENT = eINSTANCE.getProblem_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.RationaleImpl
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIONALE__BASE_COMMENT = eINSTANCE.getRationale_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.StakeholderImpl
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__BASE_CLASSIFIER = eINSTANCE.getStakeholder_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Concern List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__CONCERN_LIST = eINSTANCE.getStakeholder_ConcernList();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAKEHOLDER__CONCERN = eINSTANCE.getStakeholder_Concern();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewImpl
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__BASE_CLASS = eINSTANCE.getView_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Stakeholder</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__STAKEHOLDER = eINSTANCE.getView_Stakeholder();

		/**
		 * The meta object literal for the '<em><b>View Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_POINT = eINSTANCE.getView_ViewPoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl
		 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ModelElementsPackageImpl#getViewpoint()
		 * @generated
		 */
		EClass VIEWPOINT = eINSTANCE.getViewpoint();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__BASE_CLASS = eINSTANCE.getViewpoint_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT__CONCERN = eINSTANCE.getViewpoint_Concern();

		/**
		 * The meta object literal for the '<em><b>Concern List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__CONCERN_LIST = eINSTANCE.getViewpoint_ConcernList();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT__LANGUAGE = eINSTANCE.getViewpoint_Language();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__METHOD = eINSTANCE.getViewpoint_Method();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT__PRESENTATION = eINSTANCE.getViewpoint_Presentation();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT__PURPOSE = eINSTANCE.getViewpoint_Purpose();

		/**
		 * The meta object literal for the '<em><b>Stakeholder</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__STAKEHOLDER = eINSTANCE.getViewpoint_Stakeholder();

	}

} //ModelElementsPackage
