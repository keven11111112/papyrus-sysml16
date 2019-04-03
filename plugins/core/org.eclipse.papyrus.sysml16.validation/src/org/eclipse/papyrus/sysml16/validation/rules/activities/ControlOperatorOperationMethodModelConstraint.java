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

package org.eclipse.papyrus.sysml16.validation.rules.activities;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.activities.ControlOperator;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 11.3.2.2 ControlOperator [2] A behavior shall have the <<ControlOperator>> stereotype applied if it is a method of an operation that
 * has the <<ControlOperator>> stereotype applied.
 */
public class ControlOperatorOperationMethodModelConstraint extends AbstractModelConstraint {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(final IValidationContext context) {
		final ControlOperator controlOperator = (ControlOperator) context.getTarget();
		final Operation operation = controlOperator.getBase_Operation();

		if (null != operation) {
			for (final Behavior behavior : operation.getMethods()) {
				if (null == UMLUtil.getStereotypeApplication(behavior, ControlOperator.class)) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}

		return context.createSuccessStatus();
	}

}
