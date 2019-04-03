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
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.DistributedProperty;
import org.eclipse.papyrus.sysml16.blocks.ValueType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.8 DistributedProperty [1] The DistributedProperty stereotype may be applied only to properties of classifiers stereotyped by Block or ValueType.
 *
 */
public class DistributedPropertyTypedByModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		DistributedProperty distributedProperty = (DistributedProperty) context.getTarget();
		Property property = distributedProperty.getBase_Property();
		if (property != null) {
			Element owner = property.getOwner();
			if (owner != null) {
				if (UMLUtil.getStereotypeApplication(owner, ValueType.class) == null
						&& UMLUtil.getStereotypeApplication(owner, Block.class) == null) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
