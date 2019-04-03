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

package org.eclipse.papyrus.sysml16.diagram.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This editPart is a specialization of a connectorEeditpart that overload the setText about the label of AppliedStereotype.
 */
public class SysMLConnectorAppliedStereotypeEditPart extends org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorAppliedStereotypeEditPart {

	/**
	 * The String that must display a bindingConnector
	 */
	protected static final String STEREOTYPE_LABEL_BINDINGCONNECTOR = "equal";
	/**
	 * String that replace the name of the stereotype BindingConnector
	 */
	protected static final String BINDING_CONNECTOR = "BindingConnector";

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public SysMLConnectorAppliedStereotypeEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorAppliedStereotypeEditPart#setLabelTextHelper(org.eclipse.draw2d.IFigure, java.lang.String)
	 *
	 * @param figure
	 * @param text
	 */
	@Override
	protected void setLabelTextHelper(IFigure figure, String text) {
		String newtext = text.replaceAll(BINDING_CONNECTOR, STEREOTYPE_LABEL_BINDINGCONNECTOR);
		super.setLabelTextHelper(figure, newtext);
	}
}
