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

import java.util.Arrays;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This advice is used to redirect creation of constraint inside a property to the type of the property
 */
public class ConstraintCreationEditHelperAdvice extends AbstractEditHelperAdvice {
	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#configureRequest(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
	 *
	 * @param request
	 */
	@Override
	public void configureRequest(IEditCommandRequest request) {
		if (request instanceof CreateElementRequest) {
			// check the element to create is a sub kind of UML Constraint
			CreateElementRequest createElementRequest = (CreateElementRequest) request;
			if (Arrays.asList(createElementRequest.getElementType().getAllSuperTypes()).contains(UMLElementTypes.CONSTRAINT)) {
				// check the container as Constraint Block property
				if (((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTPROPERTY)).getMatcher().matches(createElementRequest.getContainer())) {
					if (createElementRequest.getContainer() instanceof Property) {
						// this line is very important
						// change the context ok, but the feature must be change in order to create a port inside the class
						createElementRequest.setContainmentFeature(UMLPackage.eINSTANCE.getNamespace_OwnedRule());
						Property p = (Property) createElementRequest.getContainer();
						if (p.getType() != null) {
							createElementRequest.setContainer(p.getType());
						}

					}
				}
			}
		}

		super.configureRequest(request);
	}

}
