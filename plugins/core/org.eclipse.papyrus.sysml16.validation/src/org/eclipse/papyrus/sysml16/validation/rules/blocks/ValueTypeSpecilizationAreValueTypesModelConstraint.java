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
 *   Pauline DEVILLE (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml16.validation.rules.blocks;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.ValueType;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.15 ValueType [1] Any classifier that specializes a ValueType shall also have the ValueType stereotype applied.
 */
public class ValueTypeSpecilizationAreValueTypesModelConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof Classifier) {
			for (Classifier generalClassifer : ((Classifier) target).parents()) {
				ValueType generalValueType = UMLUtil.getStereotypeApplication(generalClassifer, ValueType.class);
				if (generalValueType != null) {
					ValueType classifierValueType = UMLUtil.getStereotypeApplication((Classifier) target, ValueType.class);
					if (classifierValueType == null) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

}
