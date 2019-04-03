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
import org.eclipse.papyrus.sysml16.portsandflows.ChangeStructuralFeatureEvent;
import org.eclipse.uml2.uml.StructuralFeature;

/**
 * 9.3.2.3 ChangeStructuralFeatureEvent [1] The structural feature must not be
 * static.
 */
public class ChangeStructuralFeatureEventNotStaticModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		ChangeStructuralFeatureEvent changeStructuralFeatureEvent = (ChangeStructuralFeatureEvent) context.getTarget();
		StructuralFeature structuralFeature = changeStructuralFeatureEvent.getStructuralFeature();
		if (structuralFeature != null) {
			if (structuralFeature.isStatic()) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}

}
