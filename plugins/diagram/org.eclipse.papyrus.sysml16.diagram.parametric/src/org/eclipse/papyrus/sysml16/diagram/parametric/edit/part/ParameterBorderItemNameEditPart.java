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

package org.eclipse.papyrus.sysml16.diagram.parametric.edit.part;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IControlParserForDirectEdit;
import org.eclipse.papyrus.uml.diagram.common.editparts.BorderItemNameEditPart;

/**
 * This class is fix in order to let the xtext parser to change the parser of the editpart.
 *
 */
public class ParameterBorderItemNameEditPart extends BorderItemNameEditPart implements IControlParserForDirectEdit {

	/**
	 * Constructor.
	 * 
	 * @param view
	 *            The view.
	 */
	public ParameterBorderItemNameEditPart(final View view) {
		super(view);
	}
}
