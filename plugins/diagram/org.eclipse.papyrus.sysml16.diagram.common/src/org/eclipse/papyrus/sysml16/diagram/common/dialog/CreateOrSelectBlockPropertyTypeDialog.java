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

import java.util.Arrays;
import java.util.List;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.diagram.common.internal.dialog.CreateOrSelectTypeWithNameDialog;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Dialog for initialization of Part (Property) type (the type is either selected or created).
 */
public class CreateOrSelectBlockPropertyTypeDialog extends CreateOrSelectTypeWithNameDialog {

	public CreateOrSelectBlockPropertyTypeDialog(Shell shell, NamedElement owner) {
		super(shell, owner, ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_BLOCK), UMLPackage.eINSTANCE.getTypedElement_Type(), BlocksPackage.eINSTANCE.getBlock(), UMLElementTypes.PACKAGE,
				UMLPackage.eINSTANCE.getPackage_PackagedElement(), null, getConstraintBlockAsStereotype());
	}

	/**
	 * If we create a Part type by a ConstraintBlock, thisPart will become a ConstraintProperty and representation will immediately disappear.
	 * So we filter ConstraintBlock type => Only strict Block are allowed
	 *
	 * @return
	 */
	private static List<?> getConstraintBlockAsStereotype() {
		// We create a mock Stereotype to pass in the good code section of SemanticUMLContentProvider.isCompatibleMetaclass (bad gestion of static stereotypes)
		Stereotype mockStereotype = UMLFactory.eINSTANCE.createStereotype();
		// We use this stereotype with namespace instead of ConstraintsPackage.eINSTANCE.getConstraintBlock()
		mockStereotype.setName("SysML::Constraints::ConstraintBlock");
		return Arrays.asList(mockStereotype);
	}

}
