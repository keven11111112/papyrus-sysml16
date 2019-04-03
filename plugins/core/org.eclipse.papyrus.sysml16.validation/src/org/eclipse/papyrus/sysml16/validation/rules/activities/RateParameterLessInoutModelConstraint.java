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
import org.eclipse.papyrus.sysml16.activities.Rate;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 11.3.2.8 Rate [2] The rate of a parameter shall be less than or equal to rates
 * on edges that come into or go out from pins and parameters nodes
 * corresponding to the parameter.
 */
public class RateParameterLessInoutModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Rate rate = (Rate) context.getTarget();
		Parameter parameter = rate.getBase_Parameter();
		if (parameter != null) {
			Element owner = parameter.getOwner();
			if (owner instanceof ActivityNode) {
				ActivityNode activityNode = (ActivityNode) owner;
				EList<ActivityEdge> incomings = activityNode.getIncomings();
				int sumRateValue = 0;
				for (ActivityEdge activityEdge : incomings) {
					Rate edgeRate = UMLUtil.getStereotypeApplication(activityEdge, Rate.class);
					if (edgeRate != null) {
						sumRateValue += getRateValue(edgeRate);
					}
				}
				if (sumRateValue > getRateValue(rate)) {
					return context.createFailureStatus(context.getTarget());
				}
			}

		}
		return context.createSuccessStatus();
	}

	// FIXME : add the method in rate
	private int getRateValue(Rate rate) {
		return 0;
	}

}
