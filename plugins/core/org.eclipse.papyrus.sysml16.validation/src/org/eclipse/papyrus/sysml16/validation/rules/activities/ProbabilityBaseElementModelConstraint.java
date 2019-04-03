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
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterSet;

/**
 * 11.3.2.7 Probability [1] The <<probability>> stereotype can only be applied to
 * activity edges that have decision nodes or object nodes as sources, or to
 * output parameter sets.
 */
public class ProbabilityBaseElementModelConstraint extends AbstractModelConstraint {

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
		ActivityEdge activityEdge = probability.getBase_ActivityEdge();
		if (activityEdge != null) {
			ActivityNode source = activityEdge.getSource();
			if (!(source instanceof DecisionNode) && !(source instanceof ObjectNode)) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		ParameterSet parameterSet = probability.getBase_ParameterSet();
		// What is an output parameter set? (I chose all parameters are OUT)
		if (parameterSet != null) {
			EList<Parameter> parameters = parameterSet.getParameters();
			for (Parameter parameter : parameters) {
				if (!ParameterDirectionKind.OUT_LITERAL.equals(parameter.getDirection())) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}

		return context.createSuccessStatus();
	}

}
