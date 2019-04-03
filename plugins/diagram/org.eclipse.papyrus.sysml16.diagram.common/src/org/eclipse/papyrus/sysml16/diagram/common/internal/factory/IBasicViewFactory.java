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

package org.eclipse.papyrus.sysml16.diagram.common.internal.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.view.factories.ViewFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * it define the the contract in order to be able to create a serialization of a figure in the diagram
 * it is used to allowing reuse code from GMF generated diagram
 */
public interface IBasicViewFactory extends ViewFactory {

	/**
	 * Create the the view, a element that represents the serialization of a figure inside the GMF framework
	 * 
	 * @param domainElement
	 *            in our case this a SysML element
	 * @param containerView
	 *            the container of the created view
	 * @param semanticHint
	 *            the identifier that will associated to the created view
	 * @param index
	 *            the index where will be created the view ( if you don't know -1)
	 * @param persisted
	 *            true means that the node will be serialized in the file
	 * @param preferencesHint
	 *            a constant that is specific to a diagram
	 * @return the created view
	 */
	View createElementView(EObject domainElement, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint);
}
