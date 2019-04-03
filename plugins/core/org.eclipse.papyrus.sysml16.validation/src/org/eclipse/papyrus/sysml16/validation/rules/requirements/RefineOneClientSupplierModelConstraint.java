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
import org.eclipse.papyrus.sysml16.requirements.Refine;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.NamedElement;

/**
 * 16.3.2.4 Refine [2] Abstractions with a Refine stereotype or one of its specializations applied shall have exactly one client
 * and one supplier.
 */
public class RefineOneClientSupplierModelConstraint extends AbstractModelConstraint {


	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Refine refine = (Refine) context.getTarget();
		Abstraction abstraction = refine.getBase_Abstraction();
		if (abstraction == null) {
			return context.createFailureStatus(context.getTarget());
		}
		EList<NamedElement> clients = abstraction.getClients();
		EList<NamedElement> suppliers = abstraction.getSuppliers();
		if (clients == null || clients.size() != 1 || suppliers == null || suppliers.size() != 1) {
			return context.createFailureStatus(context.getTarget());
		}
		return context.createSuccessStatus();
	}

}
