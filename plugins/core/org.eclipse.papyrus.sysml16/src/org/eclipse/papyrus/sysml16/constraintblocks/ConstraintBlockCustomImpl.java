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

package org.eclipse.papyrus.sysml16.constraintblocks;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.sysml16.constraintblocks.internal.impl.ConstraintBlockImpl;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;



/**
 * 
 */
public class ConstraintBlockCustomImpl extends ConstraintBlockImpl {
	
	/**
	 * 
	 * @see org.eclipse.papyrus.sysml16.constraintblocks.internal.impl.ConstraintBlockImpl#getParameters()
	 *
	 * @return the list of Properties
	 */
	@Override
	public EList<Property> getParameters() { 
		BasicEList<Property> propertyEList = new BasicEList<>();
	
		if (getBase_Class() != null) {
			EList<Property> ownedAttributes = getBase_Class().getOwnedAttributes(); 
			for (Property property : ownedAttributes) {
				Type type = property.getType();
				ConstraintBlock stereotypeApplication = UMLUtil.getStereotypeApplication(type, ConstraintBlock.class);
				if (stereotypeApplication == null){
					propertyEList.add(property);
				}
			}
		}

		return new BasicEList.UnmodifiableEList<>(propertyEList.size(), propertyEList.toArray());
	}
	
}
