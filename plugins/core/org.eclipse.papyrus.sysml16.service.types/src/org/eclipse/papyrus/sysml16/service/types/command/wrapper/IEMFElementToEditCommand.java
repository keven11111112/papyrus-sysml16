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

package org.eclipse.papyrus.sysml16.service.types.command.wrapper;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is used in the context of @see {@link IEMFElementToEditCommand}
 * This command will modified an element that must be given in parameter of the operation <B>setElementToEdit</B>
 */
public interface IEMFElementToEditCommand extends Command {

	/**
	 * set the element that will be modified in this EMF command, typically request.getNewElement() from {@link org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest}
	 * 
	 * @param eObject
	 *            EOject that will be modified in this EMF command.
	 */
	void setElementToEdit(EObject eObject);

}
