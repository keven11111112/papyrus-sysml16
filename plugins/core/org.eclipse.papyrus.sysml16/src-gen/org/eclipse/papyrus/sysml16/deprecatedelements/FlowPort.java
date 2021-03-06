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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind;

import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             A FlowPort is an interaction point through which input and/or output of items such as data, material, or energy may flow. This enables the owning block to declare which items it may exchange with its environment and the interaction points through which the exchange is made. We distinguish between atomic flow port and a nonatomic flow port. Atomic flow ports relay items that are classified by a single Block, ValueType, DataType, or Signal classifier. A nonatomic flow port relays items of several types as specified by a FlowSpecification. Flow ports and associated flow specifications define “what can flow” between the block and its environment, whereas item flows specify “what does flow” in a specific usage context. Flow ports relay items to their owning block or to a connector that connects them with their owner’s internal parts (internal connector).
 *           
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#isAtomic <em>Is Atomic</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.deprecatedelements.DeprecatedElementsPackage#getFlowPort()
 * @model
 * @generated
 */
public interface FlowPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.DeprecatedElementsPackage#getFlowPort_Base_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"inout"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates the direction in which an atomic flow port relays its items. If the direction is set to “in,” then the items are relayed from an external connector via the flow port into the flow port’s owner (or one of its parts). If the direction is set to “out,” then the items are relayed from the flow port’s owner, via the flow port, through an external connector attached to the flow port. If the direction is set to “inout,” then items can flow both ways. By default, the value is inout.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind
	 * @see #setDirection(FlowDirectionKind)
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.DeprecatedElementsPackage#getFlowPort_Direction()
	 * @model default="inout" required="true" ordered="false"
	 * @generated
	 */
	FlowDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FlowDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived attribute (derived from the flow port’s type). For a flow port typed by a flow specification the value of this attribute is False, otherwise the value is True.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Atomic</em>' attribute.
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.DeprecatedElementsPackage#getFlowPort_IsAtomic()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isAtomic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Image getIcon();

} // FlowPort
