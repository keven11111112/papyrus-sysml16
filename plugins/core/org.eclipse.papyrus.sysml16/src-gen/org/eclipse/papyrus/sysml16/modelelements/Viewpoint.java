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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Viewpoint is a specification of the conventions and rules for constructing and using a view for the purpose of addressing a set of stakeholder concerns. The languages and methods for specifying a view may reference languages and methods in another viewpoint. They specify the elements expected to be represented in the view, and may be formally or informally defined. For example, the security viewpoint may require the security requirements, security functional and physical architecture, and security test cases.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getConcernList <em>Concern List</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getStakeholder <em>Stakeholder</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint()
 * @model
 * @generated
 */
public interface Viewpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Concern</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' attribute list.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint_Concern()
	 * @model dataType="org.eclipse.uml2.types.String" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<String> getConcern();

	/**
	 * Returns the value of the '<em><b>Concern List</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interest of the stakeholders.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concern List</em>' reference list.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint_ConcernList()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Comment> getConcernList();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The languages used to construct the viewpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint_Language()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The methods used to construct the views for this viewpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint_Method()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Behavior> getMethod();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMethod()
	 * @generated
	 */
	Behavior getMethod(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMethod()
	 * @generated
	 */
	Behavior getMethod(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute list.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint_Presentation()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getPresentation();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose addresses the stakeholder concerns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.modelelements.Viewpoint#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Stakeholder</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.sysml16.modelelements.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of stakeholders.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stakeholder</em>' reference list.
	 * @see org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage#getViewpoint_Stakeholder()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Stakeholder> getStakeholder();

} // Viewpoint
