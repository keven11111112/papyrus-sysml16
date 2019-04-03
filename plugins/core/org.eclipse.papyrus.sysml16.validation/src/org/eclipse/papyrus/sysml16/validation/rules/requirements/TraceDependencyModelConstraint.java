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

package org.eclipse.papyrus.sysml16.validation.rules.requirements;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.requirements.Trace;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;

/**
 * 16.3.2.8 Trace [1] Abstractions with a Trace stereotype or one of its specializations applied shall have exactly one client
 * and one supplier.
 */
public class TraceDependencyModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Trace trace = (Trace) context.getTarget();
		Abstraction abstraction = trace.getBase_Abstraction();
		DirectedRelationship directedRelationship = trace.getBase_DirectedRelationship();
		if (!(abstraction instanceof Dependency && directedRelationship instanceof Dependency)) {
			return context.createFailureStatus(context.getTarget());
		}
		return context.createSuccessStatus();
	}
}
