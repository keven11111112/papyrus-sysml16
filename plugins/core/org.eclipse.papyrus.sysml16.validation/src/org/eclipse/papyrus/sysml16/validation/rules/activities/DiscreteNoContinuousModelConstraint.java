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
import org.eclipse.papyrus.sysml16.activities.Continuous;
import org.eclipse.papyrus.sysml16.activities.Discrete;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 11.3.2.3 Discrete [1] The «discrete» and «continuous» stereotypes cannot be
 * applied to the same element at the same time.
 */
public class DiscreteNoContinuousModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Discrete discrete = (Discrete) context.getTarget();

		Parameter parameter = discrete.getBase_Parameter();
		if (parameter != null && UMLUtil.getStereotypeApplication(parameter, Continuous.class) != null) {
			return context.createFailureStatus(context.getTarget());
		}

		ObjectNode objectNode = discrete.getBase_ObjectNode();
		if (objectNode != null && UMLUtil.getStereotypeApplication(objectNode, Continuous.class) != null) {
			return context.createFailureStatus(context.getTarget());
		}

		ActivityEdge activityEdge = discrete.getBase_ActivityEdge();
		if (activityEdge != null && UMLUtil.getStereotypeApplication(activityEdge, Continuous.class) != null) {
			return context.createFailureStatus(context.getTarget());
		}

		return context.createSuccessStatus();
	}

}
