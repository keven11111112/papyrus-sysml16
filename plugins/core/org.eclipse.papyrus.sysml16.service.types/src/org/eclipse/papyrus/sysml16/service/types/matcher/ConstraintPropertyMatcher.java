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
import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlock;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Test if type {@link Type} is a {@link ConstraintBlock}
 */
public class ConstraintPropertyMatcher implements IElementMatcher {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.IElementMatcher#matches(org.eclipse.emf.ecore.EObject)
	 *
	 * @param eObject
	 * @return
	 */
	@Override
	public boolean matches(EObject eObject) {
		if (eObject instanceof Property) {
			Property property = (Property) eObject;
			Type type= property.getType();
			if(type instanceof Class && UMLUtil.getStereotypeApplication(type, ConstraintBlock.class)!=null){
				return true;
			}
		}

		return false;
	}
}
