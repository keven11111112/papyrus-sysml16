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
import org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * 8.3.2.11 NestedConnectorEnd [2] The type of the property at the last position
 * of the propertyPath list must own or inherit the role property of the
 * stereotyped connector end.
 * 
 */
public class NestedConnectorEndLastPropertyModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		NestedConnectorEnd nestedConnectorEnd = (NestedConnectorEnd) context.getTarget();
		ConnectorEnd connectorEnd = nestedConnectorEnd.getBase_ConnectorEnd();
		if (connectorEnd != null) {
			// FIXME: this constraint seems to assume that the connectable
			// element is a property
			ConnectableElement role = connectorEnd.getRole();
			if (role instanceof Property) {
				Property property = (Property) role;
				EList<Property> propertyPath = nestedConnectorEnd.getPropertyPath();
				if (propertyPath != null && !propertyPath.isEmpty()) {
					Property lastProperty = propertyPath.get(propertyPath.size() - 1);
					if (lastProperty != null) {
						Type type = lastProperty.getType();
						if (type instanceof Classifier) {
							// FIXME: this constraint seems to assume that the
							// type is a classifier
							Classifier classifier = (Classifier) type;
							if (!classifier.getAllAttributes().contains(property)) {
								return context.createFailureStatus(context.getTarget());
							}
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
