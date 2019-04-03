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

package org.eclipse.papyrus.sysml16.diagram.common.figure;

import org.eclipse.swt.graphics.Image;

/**
 * This figure is a specialization of a connector in order to overload the display of the BindingConnector display.
 */
public class SysMLConnectorFigure extends org.eclipse.papyrus.uml.diagram.composite.custom.figures.ConnectorFigure {

	/**
	 * The String that must display a bindingConnector
	 */
	protected static final String STEREOTYPE_LABEL_BINDINGCONNECTOR = "equal"; //$NON-NLS-1$
	/**
	 * String that replace the name of the stereotype BindingConnector
	 */
	protected static final String BINDING_CONNECTOR = "BindingConnector";

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.common.figure.edge.UMLEdgeFigure#setStereotypeDisplay(java.lang.String, org.eclipse.swt.graphics.Image)
	 */
	@Override
	public void setStereotypeDisplay(String stereotypes, Image image) {
		String newStereotypeString = stereotypes.replaceAll(BINDING_CONNECTOR, STEREOTYPE_LABEL_BINDINGCONNECTOR);
		super.setStereotypeDisplay(newStereotypeString, image);
	}

}
