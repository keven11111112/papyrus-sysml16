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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.activities.Probability;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;

/**
 * 11.3.2.7 Probability [4] When the <<probability>> stereotype is applied to an
 * output parameter set, all the output parameters shall be in some parameter
 * set.
 */
public class ProbabilityOutputParametersModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Probability probability = (Probability) context.getTarget();
		ParameterSet parameterSet = probability.getBase_ParameterSet();
		// What is an output parameter set? (I chose all parameters are OUT)
		if (parameterSet != null) {
			EList<Parameter> parameters = parameterSet.getParameters();
			for (Parameter parameter : parameters) {
				EList<ParameterSet> parameterSets = parameter.getParameterSets();
				if (parameterSets == null || parameterSets.isEmpty()) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
