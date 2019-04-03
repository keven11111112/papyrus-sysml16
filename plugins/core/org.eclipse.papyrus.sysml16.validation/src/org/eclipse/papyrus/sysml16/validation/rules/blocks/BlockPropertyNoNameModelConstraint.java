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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.3 Block [3] In the UML metamodel on which SysML is built, any instance
 * of the Property metaclass that is typed by a block (a Class with the «block»
 * stereotype applied) and which is owned by an Association may not have a name
 * and may not be defined as a navigable owned end of the association. (While
 * the Property has a «name» property as defined by its NamedElement
 */
public class BlockPropertyNoNameModelConstraint extends AbstractModelConstraint {

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
		if (target instanceof Property) {
			Property property = (Property) target;
			Element owner = property.getOwner();
			if (owner instanceof Association) {
				Association association = (Association) owner;
				Type type = property.getType();
				if (type != null && UMLUtil.getStereotypeApplication(type, Block.class) != null) {
					String name = property.getName();
					if (name != null && !"".equals(name)) {//$NON-NLS-1$
						return context.createFailureStatus(context.getTarget());
					}

					if (association.getNavigableOwnedEnds().contains(property)) {
						return context.createFailureStatus(context.getTarget());
					}
				}

			}
		}
		return context.createSuccessStatus();
	}

}
