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

package org.eclipse.papyrus.sysml16.validation.rules.nonnormative;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd;
import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlock;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 
 */
public class NestedConnectorEndMissingConstraintModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof ConnectorEnd) {
			ConnectorEnd connectorEnd = (ConnectorEnd) target;
			Element owner = connectorEnd.getOwner();
			if (owner instanceof Connector) {
				Connector connector = (Connector) owner;
				ConnectableElement role = connectorEnd.getRole();
				Element connectorOwner = connector.getOwner();
				if (role != null && !role.getOwner().equals(connectorOwner)) {
					if (UMLUtil.getStereotypeApplication(connectorOwner, Block.class) != null || UMLUtil.getStereotypeApplication(connectorOwner, ConstraintBlock.class) != null) {
						if (UMLUtil.getStereotypeApplication(connectorEnd, NestedConnectorEnd.class) == null) {
							return context.createFailureStatus(role.getName());
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
