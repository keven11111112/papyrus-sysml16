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
import org.eclipse.papyrus.sysml16.requirements.AbstractRequirement;
import org.eclipse.papyrus.sysml16.requirements.Satisfy;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 16.3.2.7 Satisfy [1] The supplier shall be an element stereotyped by any subtype of <<AbstractRequirement>>.
 */
public class SatisfySupplierModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Satisfy satisfy = (Satisfy) context.getTarget();
		Abstraction abstraction = satisfy.getBase_Abstraction();
		if (abstraction != null) {
			EList<NamedElement> suppliers = abstraction.getSuppliers();
			if (suppliers != null && !suppliers.isEmpty()) {
				if (UMLUtil.getStereotypeApplication(suppliers.get(0), AbstractRequirement.class) == null) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
