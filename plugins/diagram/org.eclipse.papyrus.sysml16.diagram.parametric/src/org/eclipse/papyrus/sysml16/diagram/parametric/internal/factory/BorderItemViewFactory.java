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

package org.eclipse.papyrus.sysml16.diagram.parametric.internal.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.diagram.common.internal.factory.AbstractBasicViewFactory;

/**
 * this specific view factory for parameter element of the constraint block
 *
 */
public class BorderItemViewFactory extends AbstractBasicViewFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.sysml16.diagram.common.internal.factory.IBasicViewFactory#createElementView(org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View, java.lang.String, int, boolean,
	 *      org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint)
	 */
	@Override
	public View createElementView(EObject domainElement, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(semanticHint);
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}
}
