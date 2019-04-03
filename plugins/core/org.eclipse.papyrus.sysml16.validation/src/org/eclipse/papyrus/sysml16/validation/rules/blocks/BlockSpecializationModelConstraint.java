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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.3 Block [8] Any classifier that specializes a Block must also have the
 * Block stereotype or one of its specializations applied.
 */
public class BlockSpecializationModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof Classifier) {
			Classifier classifier = (Classifier) target;
			if (UMLUtil.getStereotypeApplication(classifier, Block.class) == null) {
				EList<Generalization> generalizations = classifier.getGeneralizations();
				for (Generalization generalization : generalizations) {
					Classifier general = generalization.getGeneral();
					if (UMLUtil.getStereotypeApplication(general, Block.class) != null) {
						return context.createFailureStatus(classifier);
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
