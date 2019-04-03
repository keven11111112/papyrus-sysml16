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
import org.eclipse.papyrus.sysml16.blocks.BoundReference;
import org.eclipse.papyrus.sysml16.blocks.EndPathMultiplicity;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.10 EndPathMultiplicity [1] Properties to which EndPathMultiplicity is
 * applied must be related by redefinition to a property to which BoundReference
 * is applied.
 */
public class EndPathMultiplicityBoundReferencePropertyModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		EndPathMultiplicity endPathMultiplicity = (EndPathMultiplicity) context.getTarget();
		Property property = endPathMultiplicity.getBase_Property();
		if (property != null) {
			EList<Property> redefinedProperties = property.getRedefinedProperties();
			for (Property redefinedProperty : redefinedProperties) {
				if (UMLUtil.getStereotypeApplication(redefinedProperty, BoundReference.class) == null) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
