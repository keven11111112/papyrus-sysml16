/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.sysml16.requirements.extension.validation.rules;

import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.ValueType;
import org.eclipse.papyrus.sysml16.requirements.Requirement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * Constraint for the performance requirements.
 */
public class PerformanceRequirementConstraint extends AbstractModelConstraint {

	/**
	 * This must be satisfied by a value property.
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(final IValidationContext context) {
		final Requirement requirement = (Requirement) context.getTarget();
		final EList<NamedElement> satisfiedByElements = requirement.getSatisfiedBy();

		final Optional<NamedElement> foundCorrectSatisfy = satisfiedByElements.stream().filter(satisfiedBy -> {
			if (satisfiedBy instanceof Property) {
				return ((Property) satisfiedBy).getType() instanceof ValueType;
			}
			return false;
		}).findAny();
		return foundCorrectSatisfy.isPresent() ? context.createSuccessStatus() : context.createFailureStatus(requirement);
	}

}
