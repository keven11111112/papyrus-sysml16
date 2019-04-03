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

package org.eclipse.papyrus.sysml16.validation.rules.portsandflows;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 
 * 9.3.2.9 InterfaceBlock [3] Ports owned by interface blocks can only be typed
 * by interface blocks
 *
 */
public class InterfaceBlockPortTypeModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		InterfaceBlock interfaceBlock = (InterfaceBlock) context.getTarget();
		Class clazz = interfaceBlock.getBase_Class();
		if (clazz != null) {
			EList<Property> allAttributes = clazz.getAllAttributes();
			for (Property property : allAttributes) {
				if (property instanceof Port) {
					Port port = (Port) property;
					Type type = port.getType();
					if (type != null && UMLUtil.getStereotypeApplication(type, InterfaceBlock.class) == null) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
