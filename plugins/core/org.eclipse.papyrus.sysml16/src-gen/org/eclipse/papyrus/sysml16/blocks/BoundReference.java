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
package org.eclipse.papyrus.sysml16.blocks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.blocks.BoundReference#getBindingPath <em>Binding Path</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.blocks.BoundReference#getBoundEnd <em>Bound End</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.blocks.BlocksPackage#getBoundReference()
 * @model
 * @generated
 */
public interface BoundReference extends EndPathMultiplicity {
	/**
	 * Returns the value of the '<em><b>Binding Path</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the propertyPath of the NestedConnectorEnd applied, if any, to the boundEnd, appended to the role of the boundEnd. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Path</em>' reference list.
	 * @see org.eclipse.papyrus.sysml16.blocks.BlocksPackage#getBoundReference_BindingPath()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Property> getBindingPath();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Binding Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getBindingPath()
	 * @generated
	 */
	Property getBindingPath(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Binding Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getBindingPath()
	 * @generated
	 */
	Property getBindingPath(String name, Type type, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Bound End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives a connector end of a binding connector opposite to the end linked to the stereotyped property, or linked to a property that generalizes the stereotyped one through redefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound End</em>' reference.
	 * @see #setBoundEnd(ConnectorEnd)
	 * @see org.eclipse.papyrus.sysml16.blocks.BlocksPackage#getBoundReference_BoundEnd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectorEnd getBoundEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.blocks.BoundReference#getBoundEnd <em>Bound End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound End</em>' reference.
	 * @see #getBoundEnd()
	 * @generated
	 */
	void setBoundEnd(ConnectorEnd value);

} // BoundReference
