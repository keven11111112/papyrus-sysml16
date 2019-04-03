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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.sysml16.modelelements.Conform;
import org.eclipse.papyrus.sysml16.modelelements.View;
import org.eclipse.papyrus.sysml16.modelelements.Viewpoint;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 7.3.2.1 Conform
 * the service edit must implement the following constraints
 * [1] The general classifier must be an element stereotyped by Viewpoint.
 * [2] The specific classifier must be an element that is stereotyped by View.
 *
 *7.3.2.7 View
 *[1] A view must only conform to a single viewpoint.
 *
 */
public class ConformCreationEditHelperAdvice extends AbstractEditHelperAdvice {
	
	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#approveRequest(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		//only CreateRelationshipRequest are interested for conform
		if(request instanceof CreateRelationshipRequest){
			CreateRelationshipRequest createRelationshipRequest=(CreateRelationshipRequest)request;
			//only elementType conform are interested for conform
			IElementType elementType=createRelationshipRequest.getElementType();
			if (elementType instanceof ISpecializationType){
				List<IElementType> elementTypesHierarchy= new ArrayList<>();
				elementTypesHierarchy.add(elementType);
				ISpecializationType iSpecializationType=(ISpecializationType)elementType;
				elementTypesHierarchy.addAll(Arrays.asList(iSpecializationType.getAllSuperTypes()));
				if(elementTypesHierarchy.contains(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONFORM))){
					return approveCreateRelationshipRequest(createRelationshipRequest);
				} 
			}
		}
		return super.approveRequest(request);	
	}

	/**
	 * is the createRelationshipRequest on Conform (or one sub specialization is approved)
	 * @param createRelationshipRequest
	 * @return
	 */
	private boolean approveCreateRelationshipRequest(CreateRelationshipRequest createRelationshipRequest) {
		//test source
		EObject source = createRelationshipRequest.getSource();
		if (!(source instanceof Classifier)){			
			return false;
		}
		else{
			// this is a view, but has it a conform link?
			Conform conformLink=null;
			Classifier viewBaseClass= (Classifier)source;
			// Find Conform link
			EList<Generalization> generalizations = viewBaseClass.getGeneralizations();
			if (generalizations != null) {
				Iterator<Generalization> itGen = generalizations.iterator();
				while (itGen.hasNext() && (conformLink == null)) {
					conformLink = UMLUtil.getStereotypeApplication(itGen.next(), Conform.class);
				}
			}
			//Test to verify if the view has already a conform link.
			if(conformLink!=null){
				return false;
			}
		}
		//the source is ok
		if( UMLUtil.getStereotypeApplication((Classifier)source, View.class)==null){
			return false;
		}

		//test target
		EObject target = createRelationshipRequest.getTarget();
		if(target==null){
			return true;
		}
		if (!(target instanceof Classifier)){
			return false;
		}
		return UMLUtil.getStereotypeApplication((Classifier)target, Viewpoint.class)!=null;
	}

}
