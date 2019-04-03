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
package org.eclipse.papyrus.sysml16.service.types.matcher;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

/**
 * Test if current {@link Property} is a {@link Actor} Part
 */
public class ActorPartPropertyMatcher implements IElementMatcher {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean matches(EObject eObject) {
		boolean isMatch = false;
		if ((eObject instanceof Property) && !(eObject instanceof Port)) {
			Property element = (Property) eObject;
			// The property is necessary a composition and has a type
			if ((element.getType() != null) && (element.getAggregation() == AggregationKind.COMPOSITE_LITERAL)) {
				// Moreover its type has to be a Actor
				isMatch = element.getType() instanceof Actor;
			}
		}
		return isMatch;
	}
}
