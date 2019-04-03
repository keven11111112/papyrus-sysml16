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
 *   Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml16.modelexplorer;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * Provide subpart inside that comes from types
 *
 */
public class GetSubParts implements IJavaQuery2<NamedElement, Collection<EObject>> {
	@Override
	public Collection<EObject> evaluate(final NamedElement context,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
			throws DerivedTypedElementException {


		ArrayList<EObject> result = new ArrayList<>();
		if (context instanceof Property) {
			Property property = (Property) context;
			if (property.getType() == null) {
				return result;
			}
			if (property.getType() instanceof org.eclipse.uml2.uml.Class) {
				result.addAll(((org.eclipse.uml2.uml.Class) property.getType()).getAllAttributes());
			}
		}
		return result;

	}


}
