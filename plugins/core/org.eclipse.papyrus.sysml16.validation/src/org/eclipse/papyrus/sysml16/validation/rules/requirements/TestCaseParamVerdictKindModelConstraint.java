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

package org.eclipse.papyrus.sysml16.validation.rules.requirements;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.requirements.TestCase;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Type;

/**
 * 16.3.2.6 TestCase [1] The type of return parameter of the stereotyped model element shall be VerdictKind. (note this is
 * consistent with the UML Testing Profile).
 */
public class TestCaseParamVerdictKindModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		TestCase testCase = (TestCase) context.getTarget();
		Operation operation = testCase.getBase_Operation();
		if (operation != null) {
			EList<Parameter> ownedParameters = operation.getOwnedParameters();
			if (ownedParameters != null && !ownedParameters.isEmpty()) {
				for (Parameter parameter : ownedParameters) {
					if (ParameterDirectionKind.RETURN_LITERAL.equals(parameter.getDirection())) {
						Type type = parameter.getType();
						if (type == null || !"VerdictKind".equals(type.getName())) { // FIXME get the value from the correct constant
							return context.createFailureStatus(context.getTarget());
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
