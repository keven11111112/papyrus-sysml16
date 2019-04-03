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
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml16.blocks.internal.impl.BoundReferenceImpl;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;



/**
 *
 */
public class BoundReferenceCustomImpl extends BoundReferenceImpl {

	/**
	 * 8.3.2.4 Bound Reference : /bindingPath : Property [1..*] {ordered, nonunique} Gives the propertyPath of the 
	 * NestedConnectorEnd applied, if any, to the boundEnd, appended to the role of the boundEnd.
	 * The binding path includes the property at the bound end, and before that, the property
	 * path of the bound end, if it is a nested connector end.
	 * 
	 * @see org.eclipse.papyrus.sysml16.blocks.internal.impl.BoundReferenceImpl#getBindingPath()
	 *
	 * @return the list of Property linked
	 */
	@Override
	public EList<Property> getBindingPath() { 
		BasicEList<Property> propertyEList = new BasicEList<>();
		ConnectorEnd connectorEnd = getBoundEnd();
		if (connectorEnd != null){
			NestedConnectorEnd nestedConnectorEnd = UMLUtil.getStereotypeApplication(connectorEnd, NestedConnectorEnd.class);
			if (nestedConnectorEnd != null) {
				EList<Property> propertyPath = nestedConnectorEnd.getPropertyPath();
				propertyEList.addAll(propertyPath);				
			}
			
			ConnectableElement role = connectorEnd.getRole();
			if (role instanceof Property) { // should always be true to conform the 1 requirement
				propertyEList.add((Property) role);
			}
		}
		return new UnmodifiableEList<>(this, BlocksPackage.eINSTANCE.getBoundReference_BindingPath(), propertyEList.size(), propertyEList.toArray());
	}
	
}
