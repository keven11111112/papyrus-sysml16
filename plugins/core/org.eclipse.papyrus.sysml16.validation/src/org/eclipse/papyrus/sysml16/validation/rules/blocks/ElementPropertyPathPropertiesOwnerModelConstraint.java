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
import org.eclipse.papyrus.sysml16.blocks.ElementPropertyPath;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * 8.3.2.9 ElementPropertyPath [1] The property at each successive position of
 * the propertyPath attribute, following the first position, must be owned by
 * the Block or ValueType that types the property at the immediately preceding
 * position, or a generalization of the Block or ValueType.
 */
public class ElementPropertyPathPropertiesOwnerModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		ElementPropertyPath elementPropertyPath = (ElementPropertyPath) context.getTarget();
		EList<Property> propertyPath = elementPropertyPath.getPropertyPath();
		Classifier classifier = null;
		for (Property property : propertyPath) {
			if (classifier != null && !classifier.getAllAttributes().contains(property)) {
				return context.createFailureStatus(context.getTarget());
			}
			Type type = property.getType();
			if (type instanceof Classifier) {
				// FIXME: this constraint seems to assume that the
				// type is a classifier
				classifier = (Classifier) type;
			} else {
				classifier = null;
			}
		}
		return context.createSuccessStatus();
	}

}
