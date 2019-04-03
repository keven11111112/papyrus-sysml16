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

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.papyrus.sysml16.constraintblocks.ConstraintBlocksPackage;
import org.eclipse.papyrus.sysml16.diagram.common.internal.dialog.CreateOrSelectTypeWithNameDialog;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Dialog for initialization of Part (Property) type (the type is either selected or created).
 */
public class CreateOrSelectConstraintPropertyTypeDialog extends CreateOrSelectTypeWithNameDialog {

	/** Constructor */
	public CreateOrSelectConstraintPropertyTypeDialog(Shell shell, NamedElement owner) {
		super(shell, owner, ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK),
				UMLPackage.eINSTANCE.getTypedElement_Type(),
				ConstraintBlocksPackage.eINSTANCE.getConstraintBlock(),
				UMLElementTypes.PACKAGE,
				UMLPackage.eINSTANCE.getPackage_PackagedElement(), null);
	}

}
