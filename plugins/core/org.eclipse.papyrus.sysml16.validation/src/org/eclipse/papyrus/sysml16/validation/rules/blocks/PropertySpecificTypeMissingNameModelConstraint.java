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
import org.eclipse.papyrus.sysml16.blocks.PropertySpecificType;
import org.eclipse.uml2.uml.Classifier;

/**
 * 8.3.2.13 PropertySpecificType [2] The name of a classifier to which a
 * PropertySpecificType is applied must be missing. (The «name» attribute of the
 * NamedElement metaclass must be empty.)
 * 
 */
public class PropertySpecificTypeMissingNameModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		PropertySpecificType propertySpecificType = (PropertySpecificType) context.getTarget();
		Classifier classifier = propertySpecificType.getBase_Classifier();
		if (classifier != null) {
			String name = classifier.getName();
			if (name != null && !"".equals(name)) { //$NON-NLS-1$
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}

}
