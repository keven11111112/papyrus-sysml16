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
import org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * 8.3.2.11 NestedConnectorEnd [1] The first property in propertyPath must be
 * owned by the block that owns the connector, or one of the block's
 * generalizations.
 */
public class NestedConnectorEndFirstPropertyModelConstraint extends AbstractModelConstraint {

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
			EObject eContainer = connectorEnd.eContainer();
			if (eContainer instanceof Connector) {
				Element connectorOwner = ((Connector) eContainer).getOwner();
				if (connectorOwner != null) {
					EList<Property> propertyPath = nestedConnectorEnd.getPropertyPath();
					if (propertyPath != null && !propertyPath.isEmpty()) {
						Property firstProperty = propertyPath.get(0);
						if (!connectorOwner.equals(firstProperty.getOwner())) {
							return context.createFailureStatus(context.getTarget());
						}
					}
				}
			}
		}

		return context.createSuccessStatus();
	}

}
