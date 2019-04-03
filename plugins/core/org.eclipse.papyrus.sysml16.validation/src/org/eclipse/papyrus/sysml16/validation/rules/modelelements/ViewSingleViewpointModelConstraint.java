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

package org.eclipse.papyrus.sysml16.validation.rules.modelelements;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.modelelements.Conform;
import org.eclipse.papyrus.sysml16.modelelements.View;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 7.3.2.7 View [1] A view must only conform to a single viewpoint.
 */
public class ViewSingleViewpointModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		View view = (View) context.getTarget();
		Class clazz = view.getBase_Class();
		if (clazz != null) {
			EList<Generalization> generalizations = clazz.getGeneralizations();
			if (generalizations != null) {
				int countConform = 0;
				for (Generalization generalization : generalizations) {
					if (UMLUtil.getStereotypeApplication(generalization, Conform.class) != null) {
						countConform++;
					}
				}
				if (countConform != 1) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}
}
