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
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.portsandflows.FullPort;
import org.eclipse.papyrus.sysml16.portsandflows.ProxyPort;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 
 * 9.3.2.8 FullPort (SysML 1.6) Constraints [1] Full ports cannot also be proxy
 * ports. This applies even if some of the stereotypes are on subsetted or
 * redefined ports.
 *
 */
public class FullPortNotProxyPortModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		FullPort fullPort = (FullPort) context.getTarget();
		Port port = fullPort.getBase_Port();
		if (port != null) {
			if (UMLUtil.getStereotypeApplication(port, ProxyPort.class) != null) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}

}
