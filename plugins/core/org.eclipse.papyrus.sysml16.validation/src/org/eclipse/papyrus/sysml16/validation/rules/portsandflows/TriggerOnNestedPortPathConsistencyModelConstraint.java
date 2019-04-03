/**
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Pauline DEVILLE (CEA LIST) - Initial API and implementation
 */
package org.eclipse.papyrus.sysml16.validation.rules.portsandflows;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.portsandflows.TriggerOnNestedPort;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

public class TriggerOnNestedPortPathConsistencyModelConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		TriggerOnNestedPort addFlowPropertyValueOnNestedPortAction = (TriggerOnNestedPort) context.getTarget();
		List<Port> onNestedPort = addFlowPropertyValueOnNestedPortAction.getOnNestedPort();
		Classifier classifier = null;
		for (Port port : onNestedPort) {
			if (classifier != null && !classifier.getAllAttributes().contains(port)) {
				return context.createFailureStatus(context.getTarget());
			}
			Type type = port.getType();
			if (type instanceof Classifier) {
				// FIXME: this constraint seems to assume that the
				// type is a classifier
				classifier = (Classifier) type;
			} else {
				classifier = null;
			}
		}
		return context.createSuccessStatus();
	}

}
