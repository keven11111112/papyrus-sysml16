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
import org.eclipse.papyrus.sysml16.blocks.ConnectorProperty;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * 8.3.2.6 ConnectorProperty [5] A property stereotyped by ConnectorProperty
 * must have the same name and type as the connector referred to by the
 * connector attribute.
 * 
 */
public class ConnectorPropertySameNameModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		ConnectorProperty connectorProperty = (ConnectorProperty) context.getTarget();
		Property property = connectorProperty.getBase_Property();
		if (property != null) {
			Connector connector = connectorProperty.getConnector();
			if (connector != null) {
				String name = connector.getName();
				if (name != null && !name.equals(property.getName())) {
					return context.createFailureStatus(context.getTarget());
				}
				Type type = connector.getType();
				if (type != null && !type.equals(property.getType())) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
