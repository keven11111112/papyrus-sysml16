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

package org.eclipse.papyrus.sysml16.diagram.common.css.dom;

import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.ExtendedCSSEngine;
import org.eclipse.papyrus.infra.gmfdiag.css.provider.IPapyrusElementProvider;
import org.eclipse.papyrus.sysml16.diagram.common.css.helper.CSSDOMSYSMLSemanticElementHelper;
import org.w3c.dom.Element;

/**
 * An IElementProvider for SysML-specific CSS concepts
 *
 * Provides a specialization of GMFElementAdapter for SysML Elements
 */
public class GMFSYSMLElementProvider implements IPapyrusElementProvider {

	@Override
	public Element getElement(Object element, CSSEngine engine) {

		if (!(element instanceof View)) {
			throw new IllegalArgumentException("Unknown element : " + element);//$NON-NLS-1$
		}

		if (!(engine instanceof ExtendedCSSEngine)) {
			throw new IllegalArgumentException("Invalid CSS Engine : " + engine);//$NON-NLS-1$
		}

		return new GMFSYSMLElementAdapter((View) element, (ExtendedCSSEngine) engine);
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.css.provider.IPapyrusElementProvider#getPrimaryView(org.eclipse.emf.ecore.EObject)
	 *
	 * @param notationElement
	 * @return
	 */
	@Override
	public View getPrimaryView(EObject notationElement) {
		return CSSDOMSYSMLSemanticElementHelper.getInstance().findPrimaryView(notationElement);
	}

}
