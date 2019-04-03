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
import org.eclipse.papyrus.sysml16.portsandflows.DirectedFeature;
import org.eclipse.papyrus.sysml16.portsandflows.FlowProperty;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 9.3.2.4 DirectedFeature [1] DirectedFeature can only be applied to behavioral
 * features, or to properties that do not have FlowProperty applied, including
 * on subsetted or redefined features.
 */
public class DirectedFeatureOnlyBehavioralModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		DirectedFeature directedFeature = (DirectedFeature) context.getTarget();
		Feature feature = directedFeature.getBase_Feature();
		if (feature != null) {
			if (!(feature instanceof BehavioralFeature || feature instanceof Property)) {
				return context.createFailureStatus(context.getTarget());
			}
			if (feature instanceof Property && UMLUtil.getStereotypeApplication(feature, FlowProperty.class) != null) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}

}
