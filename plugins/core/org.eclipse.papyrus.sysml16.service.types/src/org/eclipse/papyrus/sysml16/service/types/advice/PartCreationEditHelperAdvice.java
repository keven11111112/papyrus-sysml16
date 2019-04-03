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

package org.eclipse.papyrus.sysml16.service.types.advice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.papyrus.sysml16.service.types.command.CreateAssociationCommand;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.uml2.uml.AggregationKind;

/**
 *
 *8.3.2.3 Block
 *[1] For an association in which both ends are typed by blocks, the number of ends must be exactly two.
 *
 *[3] In the UML metamodel on which SysML is built, any instance of the Property metaclass that is typed by a block (a Class
 *with the «block» stereotype applied) and which is owned by an Association may not have a name and may not be defined
 *as a navigable owned end of the association. (While the Property has a “name” property as defined by its NamedElement
 *superclass, the value of the “name” property, which is optional, must be missing.)
 *
 *[4] In the UML metamodel on which SysML is built, a Property that is typed by a block must be defined as an end of an association.
 *(An inverse end of this association, whether owned by another block or the association itself, must always be present
 *so there is always a metamodel element to record the inverse multiplicity of the reference.)
 */
public class PartCreationEditHelperAdvice extends AbstractEditHelperAdvice {
	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected org.eclipse.gmf.runtime.common.core.command.ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		IElementType elementType=request.getTypeToConfigure();

		if (elementType instanceof ISpecializationType){
			List<IElementType> elementTypesHierarchy= new ArrayList<>();
			elementTypesHierarchy.add(elementType);
			ISpecializationType iSpecializationType=(ISpecializationType)elementType;
			elementTypesHierarchy.addAll(Arrays.asList(iSpecializationType.getAllSuperTypes()));

			//this is part
			if(elementTypesHierarchy.contains(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PART))){
				return new CreateAssociationCommand( request, AggregationKind.COMPOSITE_LITERAL);
			}
			
		}
		return super.getAfterConfigureCommand(request);
		
	}

	}
