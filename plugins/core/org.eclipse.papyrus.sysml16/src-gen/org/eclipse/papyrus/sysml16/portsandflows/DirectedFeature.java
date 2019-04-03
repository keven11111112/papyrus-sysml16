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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature#getBase_Feature <em>Base Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature#getFeatureDirection <em>Feature Direction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getDirectedFeature()
 * @model
 * @generated
 */
public interface DirectedFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Feature</em>' reference.
	 * @see #setBase_Feature(Feature)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getDirectedFeature_Base_Feature()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getBase_Feature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature#getBase_Feature <em>Base Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Feature</em>' reference.
	 * @see #getBase_Feature()
	 * @generated
	 */
	void setBase_Feature(Feature value);

	/**
	 * Returns the value of the '<em><b>Feature Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind
	 * @see #setFeatureDirection(FeatureDirectionKind)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getDirectedFeature_FeatureDirection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeatureDirectionKind getFeatureDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature#getFeatureDirection <em>Feature Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FeatureDirectionKind
	 * @see #getFeatureDirection()
	 * @generated
	 */
	void setFeatureDirection(FeatureDirectionKind value);

} // DirectedFeature
