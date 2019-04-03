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

package org.eclipse.papyrus.sysml16.nattable.ui.handlers;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;

/**
 * <pre>
 * Command handler for ActorPart (Property) creation
 *
 * </pre>
 */
public class ActorPartPropertyHandler extends AbstractSysmlNattableCreateCommandHandler {

	/**
	 * <pre>
	 * @see org.eclipse.papyrus.uml.service.creation.handler.CreateHandler#getElementTypeToCreate()
	 *
	 * @return the IElementType this handler is supposed to create
	 * </pre>
	 */
	@Override
	protected IElementType getElementTypeToCreate() {
		return ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_ACTORPART);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command buildCommand() {

		if (getCommandContext() == null) {
			return UnexecutableCommand.INSTANCE;
		}

		EObject container = getCommandContext().getContainer();
		EReference reference = getCommandContext().getReference();

		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);
		if (provider == null) {
			return UnexecutableCommand.INSTANCE;
		}

		CreateElementRequest createRequest;
		if (reference == null) {
			createRequest = new CreateElementRequest(container, getElementTypeToCreate());
		} else {
			createRequest = new CreateElementRequest(container, getElementTypeToCreate(), reference);
		}
		// Retrieve create command from the Element Edit service
		ICommand createGMFCommand = provider.getEditCommand(createRequest);
		if (createGMFCommand != null) {
			return GMFtoEMFCommandWrapper.wrap(createGMFCommand);
		}
		return UnexecutableCommand.INSTANCE;
	}
}
