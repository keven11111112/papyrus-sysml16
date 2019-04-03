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

package org.eclipse.papyrus.sysml16.service.types.matcher;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Test if current {@link Port} is a non atomic {@link FlowPort}.
 */
public class FlowPortNAMatcher implements IElementMatcher {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.IElementMatcher#matches(org.eclipse.emf.ecore.EObject)
	 *
	 * @param eObject
	 * @return
	 */
	@Override
	public boolean matches(EObject eObject) {
		boolean isFlowPortNa = false;
		if (eObject instanceof Port) {
			Port port = (Port) eObject;
			FlowPort flowPort = UMLUtil.getStereotypeApplication(port, FlowPort.class);
			if ((flowPort != null) && (!flowPort.isAtomic())) {
				isFlowPortNa = true;
			}
		}
		return isFlowPortNa;
	}
}
