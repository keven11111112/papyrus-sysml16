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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.3 Block [1] For an association in which both ends are typed by blocks,
 * the number of ends must be exactly two.
 */
public class AssociationBlockModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof Association) {
			Association association = (Association) target;
			EList<Property> memberEnds = association.getMemberEnds();
			if (memberEnds != null && memberEnds.size() >= 2) {
				Property firstProperty = memberEnds.get(0);
				Property secondProperty = memberEnds.get(1);
				if (firstProperty != null && secondProperty != null) {
					Type firstType = firstProperty.getType();
					Type secondType = secondProperty.getType();
					if (firstType != null && secondType != null) {
						if (memberEnds.size() != 2) {
							if (UMLUtil.getStereotypeApplication(firstType, Block.class) != null
									&& UMLUtil.getStereotypeApplication(secondType, Block.class) != null) {
								return context.createFailureStatus(target);
							}
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
