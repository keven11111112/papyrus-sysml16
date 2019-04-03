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

package org.eclipse.papyrus.sysml16.diagram.parametric.dnd;

/**
 * This interface is used to capitalize constant about Drop strategy of the parametric diagram.
 */
public interface IParametricDropStrategy {

	String PARAMETRIC_DROP_CATEGORY_ID = "org.eclipse.papyrus.sysml16.diagram.parametric"; //$NON-NLS-1$
	
	String PARAMETRIC_DROP_CATEGORY_LABEL = "Parameter drag and drop"; //$NON-NLS-1$
}
