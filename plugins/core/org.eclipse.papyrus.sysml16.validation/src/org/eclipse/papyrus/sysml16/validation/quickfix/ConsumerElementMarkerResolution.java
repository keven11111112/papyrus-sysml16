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

package org.eclipse.papyrus.sysml16.validation.quickfix;

import java.util.function.Consumer;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.ui.util.ServiceUtilsForHandlers;
import org.eclipse.papyrus.sysml16.validation.Activator;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.uml2.uml.Element;

/**
 * A generic class to solve a problem with an UML element consumer very handy for simple use case.
 */
public class ConsumerElementMarkerResolution<T extends Element> implements IMarkerResolution {

	private String label;
	private Consumer<T> consumer;

	public ConsumerElementMarkerResolution(String label, Consumer<T> consumer) {
		this.label = label;
		this.consumer = consumer;
	}

	public String getLabel() {
		return label;
	}

	public void run(IMarker marker) {
		try {
			Object uri = marker.getAttribute("uri");
			if (uri instanceof String) {
				ModelSet currentModelSet = ServiceUtilsForHandlers.getInstance().getModelSet(null);
				EObject eObject = currentModelSet.getEObject(URI.createURI((String) uri), true);
				if (eObject instanceof Element) {
					Element element = (Element) eObject;
					InternalTransactionalEditingDomain transactionalEditingDomain = (InternalTransactionalEditingDomain) ServiceUtilsForEObject
							.getInstance().getTransactionalEditingDomain(element);
					RecordingCommand unapplyStereotypeCommand = new RecordingCommand(transactionalEditingDomain,
							label) {

						@SuppressWarnings("unchecked")
						@Override
						protected void doExecute() {
							try {
								consumer.accept((T) element);
							} catch (ClassCastException e) {
								Activator.log(e); // When using generic ensure that the referenced element can be cast
							}

						}
					};
					transactionalEditingDomain.getCommandStack().execute(unapplyStereotypeCommand);
					marker.delete();
				}
			}
		} catch (ServiceException | CoreException e) {
			Activator.log(e);
		}
	}
}