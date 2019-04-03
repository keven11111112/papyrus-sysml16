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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * 8.3.2.7 DirectedRelationshipPropertyPath [6] The type of the property at the
 * last position of the sourcePropertyPath list must own or inherit the source
 * of the stereotyped directed relationship.
 */
public class DirectedRelationshipPropertyPathSourceLastModelConstraint extends AbstractModelConstraint {

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
		EList<Property> sourcePropertyPath = directedRelationshipPropertyPath.getSourcePropertyPath();
		if (sourcePropertyPath != null && !sourcePropertyPath.isEmpty()) {
			Property property = sourcePropertyPath.get(sourcePropertyPath.size() - 1);
			Type type = property.getType();
			if (type != null) {
				DirectedRelationship directedRelationship = directedRelationshipPropertyPath
						.getBase_DirectedRelationship();
				if (directedRelationship != null) {
					EList<Element> sources = directedRelationship.getSources();
					if (sources != null && !sources.isEmpty() && !type.getOwnedElements().contains(sources.get(0))) {
						if (type instanceof Classifier) {
							Classifier classifier = (Classifier) type;
							if (!classifier.getInheritedMembers().contains(sources.get(0))) {
								return context.createFailureStatus(context.getTarget());
							}
						} else {
							return context.createFailureStatus(context.getTarget());
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}
}
