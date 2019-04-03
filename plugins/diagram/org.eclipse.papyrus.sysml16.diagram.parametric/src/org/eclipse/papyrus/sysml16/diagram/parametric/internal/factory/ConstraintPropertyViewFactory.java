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
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PropertyPartCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PropertyPartFloatingLabelEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PropertyPartNameEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry;

/**
 * extraction from Composite View Provider UML view Provider.
 */
public class ConstraintPropertyViewFactory extends AbstractBasicViewFactory {

	/**
	 * Base element of ConstraintProperty.
	 */
	private static final String PROPERTY = "Property";//$NON-NLS-1$

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
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, PROPERTY);
		createLabel(node, UMLVisualIDRegistry.getType(PropertyPartNameEditPartCN.VISUAL_ID));
		Node floatingLabel = createLabel(node, UMLVisualIDRegistry.getType(PropertyPartFloatingLabelEditPartCN.VISUAL_ID));
		floatingLabel.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6054 = (Location) floatingLabel.getLayoutConstraint();
		location6054.setX(0);
		location6054.setY(5);
		createCompartment(node, UMLVisualIDRegistry.getType(PropertyPartCompartmentEditPartCN.VISUAL_ID), true, true, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, PROPERTY);
		return node;
	}

}
