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
import org.eclipse.papyrus.sysml16.requirements.Requirement;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 16.3.2.5 Requirement [5] A nested classifier of a class stereotyped by Requirement or one of its specializations shall also be
 * stereotyped by Requirement or one of its specializations.
 */
public class RequirementNestedRequirementModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Requirement requirement = (Requirement) context.getTarget();
		Class clazz = requirement.getBase_Class();
		if (clazz != null) {
			EList<Classifier> nestedClassifiers = clazz.getNestedClassifiers();
			for (Classifier classifier : nestedClassifiers) {
				if (UMLUtil.getStereotypeApplication(classifier, Requirement.class) == null) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
