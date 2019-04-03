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

import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IControlParserForDirectEdit;
import org.eclipse.papyrus.uml.diagram.common.editparts.EditableLabelForNodeEditPart;

/**
 * to be given into papyrus.
 * This is a generic editpart that can be used to represent a element that is displayed in a list.
 * This editpart allow selection and the edition by an xtext technology.
 * 
 * @deprecated
 */
@Deprecated
public class LabelInListEditpart extends EditableLabelForNodeEditPart implements ITextAwareEditPart, IPrimaryEditPart, IControlParserForDirectEdit {

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public LabelInListEditpart(View view) {
		super(view);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.EditableLabelForNodeEditPart#isSelectable()
	 */
	@Override
	public boolean isSelectable() {
		return getFigure().isShowing();
	}
}
