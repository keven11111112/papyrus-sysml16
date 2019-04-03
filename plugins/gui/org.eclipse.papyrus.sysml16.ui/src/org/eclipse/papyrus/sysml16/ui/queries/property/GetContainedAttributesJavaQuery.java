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

package org.eclipse.papyrus.sysml16.ui.queries.property;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.uml2.uml.Property;


/**
 * Build the facet linked to a typed property for Menu Explorer customisation
 * Get the collection of all owned elements of the typed property
 */
public class GetContainedAttributesJavaQuery implements IJavaQuery2<Property, Collection<EObject>> {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2#evaluate(org.eclipse.emf.ecore.EObject, org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2, org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager)
	 */
	@Override
	public Collection<EObject> evaluate(Property property, IParameterValueList2 parameterValues, IFacetManager facetManager) throws DerivedTypedElementException {
		List<EObject> result = new ArrayList<>();
		if(property.getType()!=null){
			result.addAll(property.getType().getOwnedElements());
		}
		return result;
	}
}
