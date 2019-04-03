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

package org.eclipse.papyrus.sysml16.validation.rules.portsandflows;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction;
import org.eclipse.uml2.uml.InvocationAction;

/**
 * 9.3.2.10 InvocationOnNestedPortAction [1] The onPort property of an
 * invocation action must have a value when this stereotype is applied.
 */
public class InvocationOnNestedPortActionRequiredOnPortModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		InvocationOnNestedPortAction invocationOnNestedPortAction = (InvocationOnNestedPortAction) context.getTarget();
		InvocationAction invocationAction = invocationOnNestedPortAction.getBase_InvocationAction();
		if (invocationAction != null) {
			if (invocationAction.getOnPort() == null) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}

}
