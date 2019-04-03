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

package org.eclipse.papyrus.sysml16.diagram.parametric.locator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.PortPositionEnum;
import org.eclipse.papyrus.uml.diagram.common.locator.PortPositionLocator;


/**
 * This border locator do not take in account CSS, its always internal.
 * So For this reason SertPortPosition() has been overloaded.
 */
public class ParameterPositionLocator extends PortPositionLocator {


	/**
	 * Constructor.
	 * 
	 * @param parentFigure
	 *            The parent figure.
	 */
	public ParameterPositionLocator(final IFigure parentFigure) {
		super(parentFigure);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.common.locator.PortPositionLocator#setPortPosition(java.lang.String)
	 *
	 * @deprecated (to be removed only when the deprecated parent is removed)
	 */
	@Override
	@Deprecated
	public void setPortPosition(final String position) {
		// Always internal
		super.setPortPosition(PortPositionEnum.INSIDE.toString());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.common.locator.PortPositionLocator#setPosition(org.eclipse.papyrus.infra.gmfdiag.common.utils.PortPositionEnum)
	 */
	@Override
	public void setPosition(final PortPositionEnum position) {
		super.setPosition(PortPositionEnum.INSIDE);
	}

}
