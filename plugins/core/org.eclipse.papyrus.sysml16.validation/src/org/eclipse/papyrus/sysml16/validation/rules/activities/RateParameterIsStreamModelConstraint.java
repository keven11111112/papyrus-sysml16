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
import org.eclipse.papyrus.sysml16.activities.Rate;
import org.eclipse.uml2.uml.Parameter;


/**
 * 11.3.2.8 Rate (SysML 1.6)
 * [1] When the «rate» stereotype is applied to a parameter, the parameter must be streaming.
 */
public class RateParameterIsStreamModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Rate rate = (Rate) context.getTarget();
		Parameter parameter = rate.getBase_Parameter();
		if (parameter != null && !parameter.isStream()) {
			return context.createFailureStatus(context.getTarget());
		}
		return context.createSuccessStatus();
	}

}
