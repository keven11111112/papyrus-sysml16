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

package org.eclipse.papyrus.sysml16.modelelements;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "View" stereotype see Requirement DerivedProperties Req0010 
 *
 */
public class ViewCustomImpl extends ViewImpl implements View {


	/**
	 * 7.3.2.7 View : /viewpoint: Viewpoint The viewpoint for this View is derived from the conform relationship.
	 * 
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewImpl#basicGetViewPoint()
	 * @return
	 */
	@Override
	public Viewpoint basicGetViewPoint() {
		// ViewPoint is related to View via a Conform dependency
		Viewpoint viewPoint = null;
		Conform conform = null;

		Class viewBaseClass = getBase_Class();
		if (viewBaseClass != null) {
			// Find Conform link
			EList<Generalization> generalizations = viewBaseClass.getGeneralizations();
			if (generalizations != null) {
				Iterator<Generalization> itGen = generalizations.iterator();
				while (itGen.hasNext() && (conform == null)) {
					conform = UMLUtil.getStereotypeApplication(itGen.next(), Conform.class);
				}
			}
			// Find ViewPoint
			if (conform != null) {
				Generalization baseGeneralization = conform.getBase_Generalization();
				if (baseGeneralization != null){
					EList<Element> targets = baseGeneralization.getTargets();
					if (targets != null) {
						Iterator<Element> itElt = targets.iterator();
						while (itElt.hasNext()) {
							viewPoint = UMLUtil.getStereotypeApplication(itElt.next(), Viewpoint.class);
						}						
					}
				}
			}
		}
		return viewPoint;
	}

	/**
	 * 
	 * 7.3.2.7 View : /stakeholder: Stakeholder [*] The list of stakeholders is derived from the viewpoint the view conforms to.
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewImpl#getStakeholder()
	 *
	 * @return
	 */
	@Override
	public EList<Stakeholder> getStakeholder() {
		EList<Stakeholder> stakeholderEList = new BasicEList<>();
		Viewpoint viewPoint = getViewPoint();
		if (viewPoint != null){
			stakeholderEList.addAll(viewPoint.getStakeholder());
		}
		return new UnmodifiableEList<>(this, ModelElementsPackage.eINSTANCE.getViewpoint_Stakeholder(), stakeholderEList.size(), stakeholderEList.toArray());
	}
	
	
	
} 
