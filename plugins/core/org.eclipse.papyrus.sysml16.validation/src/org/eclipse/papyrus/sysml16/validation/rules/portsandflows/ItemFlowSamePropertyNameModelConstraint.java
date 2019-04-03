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
import org.eclipse.papyrus.sysml16.portsandflows.ItemFlow;
import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.Property;

/**
 * 9.3.2.11 ItemFlow [6] If an ItemFlow has an itemProperty, its name should be
 * the same as the name of the item flow.
 */
public class ItemFlowSamePropertyNameModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		ItemFlow itemFlow = (ItemFlow) context.getTarget();
		Property itemProperty = itemFlow.getItemProperty();
		if (itemProperty != null) {
			InformationFlow informationFlow = itemFlow.getBase_InformationFlow();
			if (informationFlow != null) {
				String name = informationFlow.getName();
				if (name != null && !name.equals(itemProperty.getName())) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
