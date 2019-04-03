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
import org.eclipse.papyrus.sysml16.blocks.DirectedRelationshipPropertyPath;
import org.eclipse.uml2.uml.Property;

/**
 * 8.3.2.7 DirectedRelationshipPropertyPath [1] target#context must have a value
 * when targetPropertyPath has a value.
 */
public class DirectedRelationshipPropertyPathRequireTargetContextModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		DirectedRelationshipPropertyPath directedRelationshipPropertyPath = (DirectedRelationshipPropertyPath) context
				.getTarget();
		EList<Property> targetPropertyPath = directedRelationshipPropertyPath.getTargetPropertyPath();
		if (targetPropertyPath != null && !targetPropertyPath.isEmpty()) {
			if (directedRelationshipPropertyPath.getTargetContext() == null) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}

}
