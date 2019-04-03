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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorMultiplicitySourceEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorMultiplicityTargetEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorNameEditPart;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry;

/**
 * This class is an extraction of the generated class to serialize the appearance of a connector in SysML.
 */
public class SysMLConnectorViewFactory extends AbstractBasicViewFactory {


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.sysml16.diagram.common.internal.factory.IBasicViewFactory#createElementView(org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View, java.lang.String, int, boolean,
	 *      org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint)
	 */
	@Override
	public View createElementView(EObject domainElement, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(ConnectorEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "Connector");
		Node label6025 = createLabel(edge, UMLVisualIDRegistry.getType(ConnectorAppliedStereotypeEditPart.VISUAL_ID));
		label6025.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6025 = (Location) label6025.getLayoutConstraint();
		location6025.setX(0);
		location6025.setY(60);
		Node label6050 = createLabel(edge, UMLVisualIDRegistry.getType(ConnectorNameEditPart.VISUAL_ID));
		label6050.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6050 = (Location) label6050.getLayoutConstraint();
		location6050.setX(0);
		location6050.setY(-20);
		Node label6051 = createLabel(edge, UMLVisualIDRegistry.getType(ConnectorMultiplicitySourceEditPart.VISUAL_ID));
		label6051.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6051 = (Location) label6051.getLayoutConstraint();
		location6051.setX(0);
		location6051.setY(20);
		Node label6052 = createLabel(edge, UMLVisualIDRegistry.getType(ConnectorMultiplicityTargetEditPart.VISUAL_ID));
		label6052.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6052 = (Location) label6052.getLayoutConstraint();
		location6052.setX(0);
		location6052.setY(20);
		return edge;
	}

}
