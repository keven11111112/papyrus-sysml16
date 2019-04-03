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
package org.eclipse.papyrus.sysml16.activities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml16.activities.ActivitiesPackage
 * @generated
 */
public interface ActivitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitiesFactory eINSTANCE = org.eclipse.papyrus.sysml16.activities.internal.impl.ActivitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Continuous</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous</em>'.
	 * @generated
	 */
	Continuous createContinuous();

	/**
	 * Returns a new object of class '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rate</em>'.
	 * @generated
	 */
	Rate createRate();

	/**
	 * Returns a new object of class '<em>Control Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Operator</em>'.
	 * @generated
	 */
	ControlOperator createControlOperator();

	/**
	 * Returns a new object of class '<em>Discrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete</em>'.
	 * @generated
	 */
	Discrete createDiscrete();

	/**
	 * Returns a new object of class '<em>No Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Buffer</em>'.
	 * @generated
	 */
	NoBuffer createNoBuffer();

	/**
	 * Returns a new object of class '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional</em>'.
	 * @generated
	 */
	Optional createOptional();

	/**
	 * Returns a new object of class '<em>Overwrite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overwrite</em>'.
	 * @generated
	 */
	Overwrite createOverwrite();

	/**
	 * Returns a new object of class '<em>Probability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probability</em>'.
	 * @generated
	 */
	Probability createProbability();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivitiesPackage getActivitiesPackage();

} //ActivitiesFactory
