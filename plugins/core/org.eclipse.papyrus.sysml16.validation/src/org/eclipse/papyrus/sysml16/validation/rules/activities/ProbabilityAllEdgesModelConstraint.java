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
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 11.3.2.7 Probability [2] When the «probability» stereotype is applied to an
 * activity edge, then it must be applied to all edges coming out of the same
 * source.
 */
public class ProbabilityAllEdgesModelConstraint extends AbstractModelConstraint {

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
			if (source != null) {
				EList<ActivityEdge> outgoings = source.getOutgoings();
				for (ActivityEdge outActivityEdge : outgoings) {
					if (UMLUtil.getStereotypeApplication(outActivityEdge, Probability.class) != null) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}
			if (!(source instanceof DecisionNode) && !(source instanceof ObjectNode)) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}

}
