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
package org.eclipse.papyrus.sysml16.validation.rules.modelelements;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.modelelements.Stakeholder;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;

/**
 * Stakeholder [1] A Stakeholder stereotype can only be applied to UML::Actor or UML::Class which are not a
 * UML::Association.
 */
public class StakeholderNotAssociationModelConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Stakeholder stakeholder = (Stakeholder) context.getTarget();
		Classifier base = stakeholder.getBase_Classifier();
		if (base instanceof Actor && !(base instanceof Association)) {
			return context.createSuccessStatus();
		}
		if (base instanceof org.eclipse.uml2.uml.Class && !(base instanceof Association)) {
			return context.createSuccessStatus();
		}

		return context.createFailureStatus(context.getTarget());
	}

}
