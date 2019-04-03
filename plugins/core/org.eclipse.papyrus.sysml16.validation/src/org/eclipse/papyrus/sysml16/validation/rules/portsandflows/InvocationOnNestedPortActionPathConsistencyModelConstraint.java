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
 *   Pauline DEVILLE (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml16.validation.rules.portsandflows;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.portsandflows.InvocationOnNestedPortAction;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * 9.3.2.11 InvocationOnNestedPortAction [3] The port at each successive position of the onNestedPort attribute,
 * following the first position, shall be owned by the Block that types the port at the immediately preceding
 * position, or a generalization of that Block.
 */
public class InvocationOnNestedPortActionPathConsistencyModelConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		InvocationOnNestedPortAction invocationOnNestedPortAction = (InvocationOnNestedPortAction) context.getTarget();
		List<Port> onNestedPort = invocationOnNestedPortAction.getOnNestedPort();
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
