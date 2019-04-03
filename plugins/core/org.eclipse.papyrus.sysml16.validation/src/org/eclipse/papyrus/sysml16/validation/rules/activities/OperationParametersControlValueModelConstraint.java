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

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.activities.ControlOperator;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Type;

/**
 * 11.3.2.2 ControlOperator [1] When the <<ControlOperator>> stereotype is applied, the behavior or operation shall have at least one
 * parameter typed by ControlValue. If the stereotype is not applied, the behavior or operation may not
 * have any parameter typed by ControlValue.
 */
public class OperationParametersControlValueModelConstraint extends AbstractModelConstraint {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(final IValidationContext context) {
		final Operation operation = (Operation) context.getTarget();

		// Check if the ControlOperator stereotype is applied on the operation
		boolean hasControlOperatorStereotype = false;
		final Iterator<EObject> stereotypeApplications = operation.getStereotypeApplications().iterator();
		while (stereotypeApplications.hasNext() && !hasControlOperatorStereotype) {
			hasControlOperatorStereotype = stereotypeApplications.next() instanceof ControlOperator;
		}

		// Check the constraint
		for (final Parameter parameter : operation.getOwnedParameters()) {
			final Type type = parameter.getType();
			if (null != type && type.getQualifiedName().equals("Libraries::ControlValues::ControlValueKind")) { //$NON-NLS-1$
				return hasControlOperatorStereotype ? context.createSuccessStatus() : context.createFailureStatus(context.getTarget());
			}
		}

		return hasControlOperatorStereotype ? context.createFailureStatus(context.getTarget()) : context.createSuccessStatus();
	}

}
