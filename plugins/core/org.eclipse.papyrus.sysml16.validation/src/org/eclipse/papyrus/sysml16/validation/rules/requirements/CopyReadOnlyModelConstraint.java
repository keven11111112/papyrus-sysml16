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
import org.eclipse.papyrus.sysml16.requirements.Copy;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 16.3.2.2 Copy [2] The text property of the client requirement is constrained to be a read-only copy of the text property of
 * the supplier requirement and this applies recursively to all subrequirements.
 */
public class CopyReadOnlyModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Copy copy = (Copy) context.getTarget();
		Abstraction abstraction = copy.getBase_Abstraction();
		if (abstraction != null) {
			EList<NamedElement> suppliers = abstraction.getSuppliers();
			EList<NamedElement> clients = abstraction.getClients();
			if (suppliers != null && !suppliers.isEmpty() && clients != null && !clients.isEmpty()) {
				AbstractRequirement supplierRequirement = UMLUtil.getStereotypeApplication(suppliers.get(0), AbstractRequirement.class);
				AbstractRequirement clientRequirement = UMLUtil.getStereotypeApplication(clients.get(0), AbstractRequirement.class);
				if (supplierRequirement != null && clientRequirement != null && !supplierRequirement.getText().equals(clientRequirement.getText())) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
