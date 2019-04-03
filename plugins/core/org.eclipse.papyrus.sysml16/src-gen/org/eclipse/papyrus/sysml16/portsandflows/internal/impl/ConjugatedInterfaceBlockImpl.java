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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml16.portsandflows.ConjugatedInterfaceBlock;
import org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature;
import org.eclipse.papyrus.sysml16.portsandflows.FlowProperty;
import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;
import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugated Interface Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml16.portsandflows.internal.impl.ConjugatedInterfaceBlockImpl#getOriginal <em>Original</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjugatedInterfaceBlockImpl extends InterfaceBlockImpl implements ConjugatedInterfaceBlock {
	/**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
	protected InterfaceBlock original;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugatedInterfaceBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortsAndFlowsPackage.Literals.CONJUGATED_INTERFACE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceBlock getOriginal() {
		if (original != null && original.eIsProxy()) {
			InternalEObject oldOriginal = (InternalEObject)original;
			original = (InterfaceBlock)eResolveProxy(oldOriginal);
			if (original != oldOriginal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK__ORIGINAL, oldOriginal, original));
			}
		}
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceBlock basicGetOriginal() {
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginal(InterfaceBlock newOriginal) {
		InterfaceBlock oldOriginal = original;
		original = newOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK__ORIGINAL, oldOriginal, original));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areConjugated(DirectedFeature df1, DirectedFeature df2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areConjugated(FlowProperty fp1, FlowProperty fp2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areConjugated(Reception r1, Reception r2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areConjugated(Operation o1, Operation o2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areConjugated(Property p1, Property p2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areSameConstraintSets(Constraint cs1, Constraint cs2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areSameParameterSets(ParameterSet ps1, ParameterSet ps2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean haveSameSignatures(BehavioralFeature bf1, BehavioralFeature bf2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK__ORIGINAL:
				if (resolve) return getOriginal();
				return basicGetOriginal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK__ORIGINAL:
				setOriginal((InterfaceBlock)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK__ORIGINAL:
				setOriginal((InterfaceBlock)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK__ORIGINAL:
				return original != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__DIRECTEDFEATURE_DIRECTEDFEATURE:
				return areConjugated((DirectedFeature)arguments.get(0), (DirectedFeature)arguments.get(1));
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__FLOWPROPERTY_FLOWPROPERTY:
				return areConjugated((FlowProperty)arguments.get(0), (FlowProperty)arguments.get(1));
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__RECEPTION_RECEPTION:
				return areConjugated((Reception)arguments.get(0), (Reception)arguments.get(1));
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__OPERATION_OPERATION:
				return areConjugated((Operation)arguments.get(0), (Operation)arguments.get(1));
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK___ARE_CONJUGATED__PROPERTY_PROPERTY:
				return areConjugated((Property)arguments.get(0), (Property)arguments.get(1));
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK___ARE_SAME_CONSTRAINT_SETS__CONSTRAINT_CONSTRAINT:
				return areSameConstraintSets((Constraint)arguments.get(0), (Constraint)arguments.get(1));
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK___ARE_SAME_PARAMETER_SETS__PARAMETERSET_PARAMETERSET:
				return areSameParameterSets((ParameterSet)arguments.get(0), (ParameterSet)arguments.get(1));
			case PortsAndFlowsPackage.CONJUGATED_INTERFACE_BLOCK___HAVE_SAME_SIGNATURES__BEHAVIORALFEATURE_BEHAVIORALFEATURE:
				return haveSameSignatures((BehavioralFeature)arguments.get(0), (BehavioralFeature)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConjugatedInterfaceBlockImpl
