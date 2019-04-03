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

package org.eclipse.papyrus.sysml16.validation.rules.blocks;

import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmf.runtime.emf.core.util.CrossReferenceAdapter;
import org.eclipse.papyrus.sysml16.blocks.PropertySpecificType;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * 8.3.2.13 PropertySpecificType [1] A classifier to which the
 * PropertySpecificType stereotype is applied must be referenced as the type of
 * one and only one property.
 */
public class PropertySpecificTypeUniquePropertyModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		PropertySpecificType propertySpecificType = (PropertySpecificType) context.getTarget();
		Classifier classifier = propertySpecificType.getBase_Classifier();
		if (classifier != null) {
			CrossReferenceAdapter crossReferenceAdapter = CrossReferenceAdapter.getCrossReferenceAdapter(TransactionUtil.getEditingDomain(classifier).getResourceSet());
			Set inverseReferencers = crossReferenceAdapter.getInverseReferencers(classifier, UMLPackage.eINSTANCE.getTypedElement_Type(), null);
			if (inverseReferencers != null && inverseReferencers.size() != 1) {
				return context.createFailureStatus(context.getTarget());
			}
		}
		return context.createSuccessStatus();
	}

}
