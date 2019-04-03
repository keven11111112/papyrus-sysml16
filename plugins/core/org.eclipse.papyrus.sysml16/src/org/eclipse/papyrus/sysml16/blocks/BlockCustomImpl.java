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

package org.eclipse.papyrus.sysml16.blocks;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;
import org.eclipse.papyrus.sysml16.portsandflows.FlowProperty;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;



/**
 * 
 */
public class BlockCustomImpl extends BlockImpl {

	/**
	 * 
	 * @see org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl#getReferences()
	 *
	 * @return the list of Property linked
	 */
	@Override
	public EList<Property> getReferences() { 
		BasicEList<Property> propertyEList = new BasicEList<>();
	
		if (getBase_Class() != null) {
			EList<Property> ownedAttributes = getBase_Class().getOwnedAttributes(); 
			for (Property property : ownedAttributes) {
				if (org.eclipse.uml2.uml.AggregationKind.COMPOSITE!=property.getAggregation().getValue()) { 
					Type type = property.getType();
					Block stereotypeApplication = UMLUtil.getStereotypeApplication(type, Block.class);
					if (stereotypeApplication != null){
						propertyEList.add(property);
					}
				}
			}
		}

		return new BasicEList.UnmodifiableEList<>(propertyEList.size(), propertyEList.toArray());
	}
	
	/**
	 * 
	 * @see org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl#getParts()
	 *
	 * @return the list of Property linked
	 */
	@Override
	public EList<Property> getParts() { 
		BasicEList<Property> propertyEList = new BasicEList<>();
	
		if (getBase_Class() != null) {
			EList<Property> ownedAttributes = getBase_Class().getOwnedAttributes(); 
			for (Property property : ownedAttributes) {
				if (org.eclipse.uml2.uml.AggregationKind.COMPOSITE==property.getAggregation().getValue()) { 
					Type type = property.getType();
					Block stereotypeApplication = UMLUtil.getStereotypeApplication(type, Block.class);
					if (stereotypeApplication != null){
						propertyEList.add(property);
					}
				}
			}
		}

		return new BasicEList.UnmodifiableEList<>(propertyEList.size(), propertyEList.toArray());
	}
	
	/**
	 * 
	 * @see org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl#getFlowProperties()
	 *
	 * @return the list of FlowProperties
	 */
	@Override
	public EList<Property> getFlowProperties() { 
		BasicEList<Property> propertyEList = new BasicEList<>();
	
		if (getBase_Class() != null) {
			EList<Property> ownedAttributes = getBase_Class().getOwnedAttributes(); 
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
