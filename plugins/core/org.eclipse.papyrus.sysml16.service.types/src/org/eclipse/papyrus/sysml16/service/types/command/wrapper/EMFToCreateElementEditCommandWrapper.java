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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * This class is a specialization to wrap creation command of editCommand (element or relationship).
 */
public class EMFToCreateElementEditCommandWrapper extends EMFToIEditCommandWrapper {

	/**
	 * Constructor.
	 *
	 * @param label
	 * @param elementToEdit
	 *            the element to edit maybe different to the created element! it could be the container ...
	 * @param request
	 *            the {@link org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest}
	 * @param emfCommand
	 *            the EMF command that is wrapped see {@link IEMFElementToEditCommand}
	 */
	public EMFToCreateElementEditCommandWrapper(EObject elementToEdit, CreateElementRequest request, IEMFElementToEditCommand emfCommand) {
		super(elementToEdit, request, emfCommand);
	}

	/**
	 * @see org.eclipse.papyrus.sysml16.service.types.command.wrapper.EMFToIEditCommandWrapper#getEMFElementToEdit()
	 *
	 * @return
	 */
	@Override
	protected EObject getEMFElementToEdit() {
		return ((CreateElementRequest) getRequest()).getNewElement();

	}

}
