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
import org.eclipse.papyrus.sysml16.blocks.BindingConnector;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Type;

/**
 * 8.3.2.2 Binding Connector [1] The two ends of a binding connector must have
 * either the same type or types that are compatible so that equality of their
 * values can be defined.
 *
 */
public class BindingConnectorSameEndsTypeModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		BindingConnector bindingConnector = (BindingConnector) context.getTarget();
		Connector connector = bindingConnector.getBase_Connector();
		if (connector != null) {
			EList<ConnectorEnd> ends = connector.getEnds();
			Type sharedType = null;
			for (ConnectorEnd connectorEnd : ends) {
				ConnectableElement role = connectorEnd.getRole();
				if (role != null) {
					Type type = role.getType();
					if (sharedType == null) {
						sharedType = type;
					} else if (!sharedType.equals(type)) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
