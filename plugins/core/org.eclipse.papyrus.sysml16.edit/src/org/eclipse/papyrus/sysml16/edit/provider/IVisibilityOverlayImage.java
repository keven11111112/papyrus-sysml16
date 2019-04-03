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

package org.eclipse.papyrus.sysml16.edit.provider;

import org.eclipse.emf.edit.provider.ComposedImage;

/**
 * Interface that allow an ItemProvider to compose an overlay that handle
 * visibility logo
 *
 * @author Arthur Daussy <a
 *         href=mailto:arthur.daussy@atos.net>arthur.daussy@atos.net</a>
 *
 */
public interface IVisibilityOverlayImage {

	ComposedImage composeVisibilityImage(Object object, ComposedImage composedImage);
}
