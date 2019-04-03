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
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.blocks.ValueType;
import org.eclipse.papyrus.sysml16.util.QUDVUtil;
import org.eclipse.uml2.uml.Classifier;

/**
 * 8.3.2.15 ValueType [2] The unit of a ValueType, if any, shall be an InstanceSpecification classified by SysML's Unit block in
 * the UnitAndQuantityKind model library or a specialization of it.
 */
public class ValueTypeUnitModelConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		ValueType valueType = (ValueType) context.getTarget();
		Classifier unitClassifier = QUDVUtil.getClassifierByNameSpaceFromQUDV(QUDVUtil.UNIT_AND_QUANTITY_KIND, QUDVUtil.UNIT);
		if (valueType.getUnit() != null && !valueType.getUnit().getClassifiers().isEmpty()) {
			for (Classifier classifier : valueType.getUnit().getClassifiers()) {
				if (!classifier.allParents().stream().anyMatch(c -> c.getQualifiedName().equals(unitClassifier.getQualifiedName())) // check if there is at least on element of the list whose the qualifideName match the unitClassifier qualifideName
						&& !classifier.getQualifiedName().equals(unitClassifier.getQualifiedName())) {
					return context.createFailureStatus(context.getTarget());
				}
			}
		}
		return context.createSuccessStatus();
	}

}
