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

package org.eclipse.papyrus.sysml16.validation.rules.blocks;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.ParticipantProperty;
import org.eclipse.uml2.uml.Property;

/**
 * 8.3.2.12 ParticipantProperty [6] The property referred to by end must have a
 * multiplicity of 1.
 *
 */
public class ParticipantPropertyEndMultiplicityModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		ParticipantProperty participantProperty = (ParticipantProperty) context.getTarget();
		Property property = participantProperty.getBase_Property();
		if (property != null && (property.upperBound() != 1 || property.lowerBound() != 1)) {
			return context.createFailureStatus(context.getTarget());
		}
		return context.createSuccessStatus();
	}

}
