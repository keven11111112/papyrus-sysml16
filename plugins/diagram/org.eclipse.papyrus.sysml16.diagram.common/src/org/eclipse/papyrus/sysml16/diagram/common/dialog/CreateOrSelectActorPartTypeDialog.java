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

package org.eclipse.papyrus.sysml16.diagram.common.dialog;

import org.eclipse.papyrus.sysml16.diagram.common.internal.dialog.CreateOrSelectTypeWithNameDialog;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Dialog for initialization of Part (Property) type (the type is either selected or created).
 */
public class CreateOrSelectActorPartTypeDialog extends CreateOrSelectTypeWithNameDialog {

	/** Constructor */
	public CreateOrSelectActorPartTypeDialog(Shell shell, NamedElement owner) {
		super(shell, owner, UMLElementTypes.ACTOR,
				UMLPackage.eINSTANCE.getTypedElement_Type(),
				UMLPackage.eINSTANCE.getActor(),
				UMLElementTypes.PACKAGE,
				UMLPackage.eINSTANCE.getPackage_PackagedElement(), null);
	}
}
