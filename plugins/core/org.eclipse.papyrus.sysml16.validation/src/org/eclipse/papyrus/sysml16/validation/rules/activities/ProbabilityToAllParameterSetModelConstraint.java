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
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 11.3.2.7 Probability [3] When the «probability» stereotype is applied to an
 * output parameter set, it must also be applied to all the parameter sets of
 * the behavior or operation owning the original parameter set.
 */
public class ProbabilityToAllParameterSetModelConstraint extends AbstractModelConstraint {

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
		if (parameterSet != null) {
			Element owner = parameterSet.getOwner();

			// FIXME what is the link (constraint) to behavior or operation?
			if (owner instanceof Behavior) {
				Behavior behavior = (Behavior) owner;
				EList<ParameterSet> ownedParameterSets = behavior.getOwnedParameterSets();
				for (ParameterSet ownedParameterSet : ownedParameterSets) {
					if (UMLUtil.getStereotypeApplication(ownedParameterSet, Probability.class) != null) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}
			if (owner instanceof Operation) {
				Operation operation = (Operation) owner;
				EList<ParameterSet> ownedParameterSets = operation.getOwnedParameterSets();
				for (ParameterSet ownedParameterSet : ownedParameterSets) {
					if (UMLUtil.getStereotypeApplication(ownedParameterSet, Probability.class) != null) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
