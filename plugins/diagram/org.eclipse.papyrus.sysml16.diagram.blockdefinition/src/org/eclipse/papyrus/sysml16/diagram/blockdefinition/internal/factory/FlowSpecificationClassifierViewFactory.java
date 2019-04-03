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

package org.eclipse.papyrus.sysml16.diagram.blockdefinition.internal.factory;

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
import org.eclipse.papyrus.sysml16.diagram.common.internal.factory.util.ClassifierViewFactoryUtil;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;

/**
 * 
 * Extraction from org.eclipse.papyrus/plugins/uml/diagram/org.eclipse.papyrus.uml.diagram.clazz/src/org/eclipse/papyrus/uml/diagram/clazz/providers/UMLViewProvider.java
 *
 */
public class FlowSpecificationClassifierViewFactory extends AbstractBasicViewFactory {

	/**
	 * Base element of FlowSpecification
	 */
	private static final String INTERFACE = "Interface";//$NON-NLS-1$

	@Override
	public Node createElementView(EObject domainElement, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(semanticHint);
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		ClassifierViewFactoryUtil.stampShortcut(containerView, node);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, INTERFACE);
		ClassifierViewFactoryUtil.createLabel(node, UMLVisualIDRegistry.getType(InterfaceNameEditPart.VISUAL_ID));
		Node label8507 = ClassifierViewFactoryUtil.createLabel(node, UMLVisualIDRegistry.getType(InterfaceFloatingNameEditPart.VISUAL_ID));
		label8507.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location8507 = (Location) label8507.getLayoutConstraint();
		location8507.setX(0);
		location8507.setY(5);

		ClassifierViewFactoryUtil.createCompartment(node, UMLVisualIDRegistry.getType(InterfaceAttributeCompartmentEditPart.VISUAL_ID), true, true, true, true);
		ClassifierViewFactoryUtil.createCompartment(node, UMLVisualIDRegistry.getType(InterfaceOperationCompartmentEditPart.VISUAL_ID), true, true, true, true);
		ClassifierViewFactoryUtil.createCompartment(node, UMLVisualIDRegistry.getType(InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID), true, true, true, true);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, INTERFACE);
		return node;
	}
}
