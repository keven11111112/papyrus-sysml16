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

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.diagram.common.figure.SysMLConnectorFigure;

/**
 * This editpart has been specialized in order to replace default figure by a custom figure to change display of stereotype application.
 */
public class SysMLConnectorEditPart extends org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConnectorEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public SysMLConnectorEditPart(View view) {
		super(view);
	}

	@Override
	protected Connection createConnectionFigure() {
		return new SysMLConnectorFigure();
	}

}
