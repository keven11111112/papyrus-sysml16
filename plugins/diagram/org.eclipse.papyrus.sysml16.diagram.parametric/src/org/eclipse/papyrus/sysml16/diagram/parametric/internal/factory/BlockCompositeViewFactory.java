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
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.sysml16.diagram.common.internal.factory.AbstractBasicViewFactory;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeFloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeNameEditPart;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry;

/**
 * extraction from Composite UML view Provider.
 */
public class BlockCompositeViewFactory extends AbstractBasicViewFactory {

	/**
	 * Base element of Block
	 */
	private static final String CLASS = "Class";//$NON-NLS-1$

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
		node.setType(UMLVisualIDRegistry.getType(ClassCompositeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, CLASS);
		createLabel(node, UMLVisualIDRegistry.getType(ClassCompositeNameEditPart.VISUAL_ID));
		Node floatinglLabel = createLabel(node, UMLVisualIDRegistry.getType(ClassCompositeFloatingLabelEditPart.VISUAL_ID));
		floatinglLabel.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6089 = (Location) floatinglLabel.getLayoutConstraint();
		location6089.setX(0);
		location6089.setY(5);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, CLASS);
		return node;
	}

}
