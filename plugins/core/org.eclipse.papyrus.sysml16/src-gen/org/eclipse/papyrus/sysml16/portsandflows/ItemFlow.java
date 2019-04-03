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

import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ItemFlow describes the flow of items across a connector or an association. It may constrain the item exchange between blocks, block usages, or flow ports as specified by their flow properties. For example, a pump connected to a tank: the pump has an “out” flow property of type Liquid and the tank has an “in” FlowProperty of type Liquid. To signify that only water flows between the pump and the tank, we can specify an ItemFlow of type Water on the connector.
 *           
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.ItemFlow#getBase_InformationFlow <em>Base Information Flow</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.ItemFlow#getItemProperty <em>Item Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getItemFlow()
 * @model
 * @generated
 */
public interface ItemFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Information Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Information Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Information Flow</em>' reference.
	 * @see #setBase_InformationFlow(InformationFlow)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getItemFlow_Base_InformationFlow()
	 * @model ordered="false"
	 * @generated
	 */
	InformationFlow getBase_InformationFlow();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.ItemFlow#getBase_InformationFlow <em>Base Information Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Information Flow</em>' reference.
	 * @see #getBase_InformationFlow()
	 * @generated
	 */
	void setBase_InformationFlow(InformationFlow value);

	/**
	 * Returns the value of the '<em><b>Item Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional property that relates the flowing item to the instances of the connector’s enclosing block. This property is applicable only for item flows assigned to connectors. The multiplicity is zero if the item flow is assigned to an Association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Property</em>' reference.
	 * @see #setItemProperty(Property)
	 * @see org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage#getItemFlow_ItemProperty()
	 * @model ordered="false"
	 * @generated
	 */
	Property getItemProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.portsandflows.ItemFlow#getItemProperty <em>Item Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Property</em>' reference.
	 * @see #getItemProperty()
	 * @generated
	 */
	void setItemProperty(Property value);

} // ItemFlow
