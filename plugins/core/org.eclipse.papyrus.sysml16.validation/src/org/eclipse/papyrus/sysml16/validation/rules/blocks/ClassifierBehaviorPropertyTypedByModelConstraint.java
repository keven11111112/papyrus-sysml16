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
import org.eclipse.papyrus.sysml16.blocks.ClassifierBehaviorProperty;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * 8.3.2.5 ClassifierBehaviorProperty [3] Properties to which
 * ClassifierBehaviorProperty applied must be typed by the classifier behavior
 * of their owning block or a generalization of the classifier behavior.
 * 
 */
public class ClassifierBehaviorPropertyTypedByModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		ClassifierBehaviorProperty classifierBehaviorProperty = (ClassifierBehaviorProperty) context.getTarget();
		Property property = classifierBehaviorProperty.getBase_Property();
		if (property != null) {
			Type type = property.getType();
			if (type != null) {
				Element owner = property.getOwner();
				if (owner instanceof org.eclipse.uml2.uml.Class) {
					// is a block by constraint 8.3.2.5 [1]
					org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) owner;
					if (!type.equals(clazz.getClassifierBehavior())) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}

		}
		return context.createSuccessStatus();
	}

}
