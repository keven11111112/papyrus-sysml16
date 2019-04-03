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

package org.eclipse.papyrus.sysml16.deprecatedelements;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowSpecificationImpl;
import org.eclipse.papyrus.sysml16.portsandflows.FlowProperty;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "FlowSpecification" stereotype see Requirement DerivedProperties ReqXXX
 *
 */
public class FlowSpecificationCustomImpl extends FlowSpecificationImpl implements FlowSpecification{

	/**
	 * 
	 * @see org.eclipse.papyrus.sysml16.blocks.internal.impl.FlowSpecificationImpl#getFlowProperties()
	 *
	 * @return the list of FlowProperties
	 */
	@Override
	public EList<Property> getFlowProperties() { 
		BasicEList<Property> propertyEList = new BasicEList<>();
	
		if (getBase_Interface() != null) {
			EList<Property> ownedAttributes = getBase_Interface().getOwnedAttributes(); 
			for (Property property : ownedAttributes) {
				FlowProperty stereotypeApplication = UMLUtil.getStereotypeApplication(property, FlowProperty.class);
				if (stereotypeApplication != null){
					propertyEList.add(property);
				}
			}
		}

		return new BasicEList.UnmodifiableEList<>(propertyEList.size(), propertyEList.toArray());
	}
	
}
