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
package org.eclipse.papyrus.sysml16.activities.internal.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.sysml16.activities.ActivitiesPackage;
import org.eclipse.papyrus.sysml16.activities.Continuous;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContinuousImpl extends RateImpl implements Continuous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.CONTINUOUS;
	}

} //ContinuousImpl
