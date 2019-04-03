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

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.papyrus.sysml16.modelelements.Conform;
import org.eclipse.papyrus.sysml16.modelelements.View;
import org.eclipse.papyrus.sysml16.modelelements.Viewpoint;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 7.3.2.1 Conform
 * the service edit must implement the following constraints
 * [1] The general classifier must be an element stereotyped by Viewpoint.
 * [2] The specific classifier must be an element that is stereotyped by View.
 *
 * 7.3.2.7 View
 *A view must only conform to a single viewpoint.
 *
 */
public class ConformReorientEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#approveRequest(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		if(!(request instanceof ReorientRelationshipRequest)){
			return super.approveRequest(request);
		}
		ReorientRelationshipRequest reorientRelationshipRequest= (ReorientRelationshipRequest) request;
		EObject newRelationshipEnd = reorientRelationshipRequest.getNewRelationshipEnd();
		if (!(newRelationshipEnd instanceof Classifier)){
			return false;
		}
		
		Classifier newRelationshipEndClassifier = (Classifier) newRelationshipEnd ;
		//SOURCE
		if(ReorientRelationshipRequest.REORIENT_SOURCE==reorientRelationshipRequest.getDirection()){
			if( UMLUtil.getStereotypeApplication(newRelationshipEndClassifier, View.class)!=null){
				// this is a view, but has it a conform link?
				Conform conformLink=null;
				// Find Conform link
				EList<Generalization> generalizations = newRelationshipEndClassifier.getGeneralizations();
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
				return true;
			}
		}else{//TARGET
			if( UMLUtil.getStereotypeApplication(newRelationshipEndClassifier, Viewpoint.class)!=null){
				return true;
			}
		}
		return false;
	}
}
