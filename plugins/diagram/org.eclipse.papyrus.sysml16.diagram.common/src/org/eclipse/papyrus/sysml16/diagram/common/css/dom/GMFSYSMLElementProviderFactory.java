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

import org.eclipse.papyrus.infra.gmfdiag.css.engine.ICSSElementProviderFactory;
import org.eclipse.papyrus.infra.gmfdiag.css.notation.CSSDiagram;
import org.eclipse.papyrus.infra.gmfdiag.css.provider.IPapyrusElementProvider;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Element;


/**
 * IElementProvider Factory for Diagrams related to SysML Elements.
 */
public class GMFSYSMLElementProviderFactory implements ICSSElementProviderFactory {

	@Override
	public boolean isProviderFor(CSSDiagram diagram) {
		if (diagram.getElement() instanceof Element) {
			// Retrieve the UML2 element
			Element element = (Element) diagram.getElement();

			// Introspect its packages to check if SysML profile is applied
			return SysMLResource.isSysMLProfileApplied(element);
		}
		return false;
	}

	@Override
	public IPapyrusElementProvider createProvider(CSSDiagram diagram) {
		return new GMFSYSMLElementProvider();
	}



}
