/*****************************************************************************
 * Copyright (c) 2019 CEA LIST, and others.
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
 *
 *****************************************************************************/

package org.eclipse.papyrus.sysml16.validation.rules.modelelements;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.modelelements.Viewpoint;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.profile.standard.Create;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 7.3.2.8 Viewpoint [2] The property ownedOperation must include at least one
 * operation named «View» with the UML Create stereotype applied.
 */
public class ViewpointOwnedViewModelConstraint extends AbstractModelConstraint {

	// expected name of the operation fixed by the norm
	private static final String VIEW = "View"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Viewpoint viewpoint = (Viewpoint) context.getTarget();
		Class clazz = viewpoint.getBase_Class();
		if (clazz != null) {
			EList<Operation> operations = clazz.getOperations();
			boolean found = false;
			for (Operation operation : operations) {
				if (VIEW.equals(operation.getName())
						&& UMLUtil.getStereotypeApplication(operation, Create.class) != null) {
					found = true;
				}
			}
			if (!found) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}
}
