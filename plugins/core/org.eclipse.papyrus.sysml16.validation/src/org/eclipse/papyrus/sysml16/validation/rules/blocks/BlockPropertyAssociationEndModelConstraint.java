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
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.3 Block [4] In the UML metamodel on which SysML is built,
 * a Property that is typed by a block must be defined as an end of an association.
 * (An inverse end of this association, whether owned by
 * another block or the association itself, must always be present so there
 * is always a metamodel element to record the inverse multiplicity of the reference.)
 */
public class BlockPropertyAssociationEndModelConstraint extends AbstractModelConstraint {

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
		// FIXME: Literally the norm state the constraints for all properties
		// but common sense would recommend to skip the constraint on certain Port
		// SO: the question should be raised in SysML Forums... (More information: Bug 487500)
		if (target instanceof Property && !(target instanceof Port)) {
			Property property = (Property) target;
			Type type = property.getType();
			if (type != null && property.getAssociation() == null) {
				if (UMLUtil.getStereotypeApplication(type, Block.class) != null) {
					return context.createFailureStatus(target);
				}
			}
		}
		return context.createSuccessStatus();
	}

}
