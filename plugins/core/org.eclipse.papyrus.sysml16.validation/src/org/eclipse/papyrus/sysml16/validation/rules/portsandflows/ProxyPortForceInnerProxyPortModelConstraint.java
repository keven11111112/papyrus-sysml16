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
import org.eclipse.papyrus.sysml16.portsandflows.ProxyPort;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 
 * 9.3.2.12 ProxyPort
 * [3] Ports owned by the type of a proxy port must be proxy ports
 *
 */
public class ProxyPortForceInnerProxyPortModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		ProxyPort proxyPort = (ProxyPort) context.getTarget();
		Port port = proxyPort.getBase_Port();
		if (port != null) {
			Type type = port.getType();
			if (type instanceof org.eclipse.uml2.uml.Class) { // Class due to constraint 9.3.2.12 ProxyPort [2]
				org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) type;
				EList<Property> ownedAttributes = clazz.getOwnedAttributes();
				for (Property property : ownedAttributes) {
					if (property instanceof Port) {
						Port innerport = (Port) property;
						if (UMLUtil.getStereotypeApplication(innerport, ProxyPort.class) == null) {
							return context.createFailureStatus(context.getTarget());
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
