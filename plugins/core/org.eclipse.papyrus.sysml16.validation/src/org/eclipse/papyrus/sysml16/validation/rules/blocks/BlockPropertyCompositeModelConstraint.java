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

package org.eclipse.papyrus.sysml16.validation.rules.blocks;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.ValueType;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.3 Block [6] If a property owned by a SysML Block or SysML ValueType is
 * typed by a SysML ValueType, then the aggregation attribute of the property
 * must be «composite.»
 * 
 */
public class BlockPropertyCompositeModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Block block = (Block) context.getTarget();
		Class clazz = block.getBase_Class();
		if (clazz != null) {
			EList<Property> attributes = clazz.getAttributes();
			for (Property property : attributes) {
				Type type = property.getType();
				if (type != null && UMLUtil.getStereotypeApplication(type, ValueType.class) != null) {
					if (!AggregationKind.COMPOSITE_LITERAL.equals(property.getAggregation())) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
