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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.sysml16.requirements.Requirement;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 16.3.2.2 DeriveReqt (SysML 1.6)
 * Constraints
 * [1] The supplier must be an element stereotyped by «requirement» or one of «requirement» subtypes.
 */
public class DeriveReqtSupplierEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#approveRequest(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		// only CreateRelationshipRequest are interested for conform
		if (request instanceof CreateRelationshipRequest) {
			CreateRelationshipRequest createRelationshipRequest = (CreateRelationshipRequest) request;
			// only elementType conform are interested for conform
			IElementType elementType = createRelationshipRequest.getElementType();
			if (elementType instanceof ISpecializationType) {
				if (isSpecializationof((ISpecializationType) elementType, SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_DERIVEREQT_ABSTRACTION) ||
						isSpecializationof((ISpecializationType) elementType, SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_DERIVEREQT_DIRECTEDRELATIONSHIP)) {
					return approveCreateRelationshipRequest(createRelationshipRequest);
				}
			}
		}
		return super.approveRequest(request);
	}

	/**
	 * supplier (target) of the createRelationshipRequest should be a requirement
	 * 
	 * @param createRelationshipRequest
	 * @return
	 */
	private boolean approveCreateRelationshipRequest(CreateRelationshipRequest createRelationshipRequest) {
		EObject target = createRelationshipRequest.getTarget();
		return (target instanceof Classifier) && UMLUtil.getStereotypeApplication((Classifier) target, Requirement.class) != null;
	}

	/**
	 * Check if iSpecializationType is a specialization of elementTypeId
	 * 
	 * @param iSpecializationType
	 * @param elementTypeId
	 * @return
	 */
	// FIXME : this utility should be provided by the elementType API
	private boolean isSpecializationof(ISpecializationType iSpecializationType, String elementTypeId) {
		List<IElementType> elementTypesHierarchy = new ArrayList<>();
		elementTypesHierarchy.add(iSpecializationType);
		elementTypesHierarchy.addAll(Arrays.asList(iSpecializationType.getAllSuperTypes()));
		return elementTypesHierarchy.contains(ElementTypeRegistry.getInstance().getType(elementTypeId));
	}

}
