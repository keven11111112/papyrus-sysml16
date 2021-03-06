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
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.ValueType;
import org.eclipse.papyrus.sysml16.portsandflows.ItemFlow;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 9.3.2.11 ItemFlow [2] An ItemFlow itemProperty is typed by a ValueType,
 * Block, or Signal.
 */
public class ItemFlowSamePropertyTypedByModelConstraint extends AbstractModelConstraint {

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
			Type type = itemProperty.getType();
			if (type != null) {
				if (UMLUtil.getStereotypeApplication(type, ValueType.class) == null
						&& UMLUtil.getStereotypeApplication(type, Block.class) == null
						&& !(type instanceof Signal)) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
