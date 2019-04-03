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
package org.eclipse.papyrus.sysml16.portsandflows;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjugated Interface Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#getOriginal <em>Original</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getConjugatedInterfaceBlock()
 * @model
 * @generated
 */
public interface ConjugatedInterfaceBlock extends InterfaceBlock {
	/**
	 * Returns the value of the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' reference.
	 * @see #setOriginal(InterfaceBlock)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getConjugatedInterfaceBlock_Original()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InterfaceBlock getOriginal();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock#getOriginal <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original</em>' reference.
	 * @see #getOriginal()
	 * @generated
	 */
	void setOriginal(InterfaceBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" df1Required="true" df1Ordered="false" df2Required="true" df2Ordered="false"
	 * @generated
	 */
	boolean areConjugated(DirectedFeature df1, DirectedFeature df2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" fp1Required="true" fp1Ordered="false" fp2Required="true" fp2Ordered="false"
	 * @generated
	 */
	boolean areConjugated(FlowProperty fp1, FlowProperty fp2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" r1Required="true" r1Ordered="false" r2Required="true" r2Ordered="false"
	 * @generated
	 */
	boolean areConjugated(Reception r1, Reception r2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" o1Required="true" o1Ordered="false" o2Required="true" o2Ordered="false"
	 * @generated
	 */
	boolean areConjugated(Operation o1, Operation o2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" p1Required="true" p1Ordered="false" p2Required="true" p2Ordered="false"
	 * @generated
	 */
	boolean areConjugated(Property p1, Property p2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" cs1Required="true" cs1Ordered="false" cs2Required="true" cs2Ordered="false"
	 * @generated
	 */
	boolean areSameConstraintSets(Constraint cs1, Constraint cs2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" ps1Required="true" ps1Ordered="false" ps2Required="true" ps2Ordered="false"
	 * @generated
	 */
	boolean areSameParameterSets(ParameterSet ps1, ParameterSet ps2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bf1Required="true" bf1Ordered="false" bf2Required="true" bf2Ordered="false"
	 * @generated
	 */
	boolean haveSameSignatures(BehavioralFeature bf1, BehavioralFeature bf2);

} // ConjugatedInterfaceBlock
