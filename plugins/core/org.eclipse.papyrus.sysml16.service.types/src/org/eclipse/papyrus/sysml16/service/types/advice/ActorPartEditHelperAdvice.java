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

package org.eclipse.papyrus.sysml16.service.types.advice;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

/**
 * The creation of element can imply launch of popup.
 * 
 * It must be possible to let the possibility to add a popup to create actor Part.
 */
public class ActorPartEditHelperAdvice extends AbstractEditHelperAdvice {


	/**
	 * Parameter id used to pass the command for setting the type of the property
	 */
	public static final String SET_ACTOR_ICOMMAND = "SET_ACTOR_ICOMMAND"; //$NON-NLS-1$


	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		Object parameter = request.getParameter(SET_ACTOR_ICOMMAND);

		if (parameter instanceof ICommand) {
			return (ICommand) parameter;
		}
		return super.getAfterConfigureCommand(request);
	}
}
