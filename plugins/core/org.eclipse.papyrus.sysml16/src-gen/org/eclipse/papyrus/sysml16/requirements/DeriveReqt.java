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
package org.eclipse.papyrus.sysml16.requirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derive Reqt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             A DeriveReqt relationship is a dependency between two requirements in which a client requirement can be derived from the supplier requirement. As with other dependencies, the arrow direction points from the derived (client) requirement to the (supplier) requirement from which it is derived.
 *           
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.sysml16.requirements.RequirementsPackage#getDeriveReqt()
 * @model
 * @generated
 */
public interface DeriveReqt extends Trace {
} // DeriveReqt
