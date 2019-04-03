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

package org.eclipse.papyrus.sysml16.diagram.common.internal.dialog;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.uml.diagram.common.dialogs.CreateOrSelectTypeDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * This class is used to keep the typed new name even after the widget is disposed
 * It's internal since the capability should be moved to papyrus core in CreateOrSelectTypeDialog
 */
// TODO :Bug 497304 move all the code/feature/open api in CreateOrSelectTypeDialog
public class CreateOrSelectTypeWithNameDialog extends CreateOrSelectTypeDialog {

	private String savedNewTypeNameText;

	/**
	 * Constructor.
	 *
	 * @param shell
	 * @param defaultContainer
	 * @param elementType
	 * @param editedFeature
	 * @param elementEClass
	 * @param containerType
	 * @param containerFeature
	 * @param containerEClass
	 */
	public CreateOrSelectTypeWithNameDialog(Shell shell, EObject defaultContainer, IElementType elementType, EStructuralFeature editedFeature, EClass elementEClass, IElementType containerType, EStructuralFeature containerFeature, EClass containerEClass) {
		super(shell, defaultContainer, elementType, editedFeature, elementEClass, containerType, containerFeature, containerEClass);
	}

	/**
	 * Constructor.
	 *
	 * @param shell
	 * @param defaultContainer
	 * @param elementType
	 * @param editedFeature
	 * @param elementEClass
	 * @param containerType
	 * @param containerFeature
	 * @param containerEClass
	 * @param notWantedMetaclasses
	 */
	public CreateOrSelectTypeWithNameDialog(Shell shell, EObject defaultContainer, IElementType elementType, EStructuralFeature editedFeature, EClass elementEClass, IElementType containerType, EStructuralFeature containerFeature, EClass containerEClass,
			List<?> notWantedMetaclasses) {
		super(shell, defaultContainer, elementType, editedFeature, elementEClass, containerType, containerFeature, containerEClass, notWantedMetaclasses);
	}

	/**
	 * @return the savedNewTypeNameText
	 */
	public String getSavedNewTypeNameText() {
		return savedNewTypeNameText;
	}

	/**
	 * @param savedNewTypeNameText
	 *            the savedNewTypeNameText to set
	 */
	public void setSavedNewTypeNameText(String savedNewTypeNameText) {
		this.savedNewTypeNameText = savedNewTypeNameText;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.dialogs.CreateOrSelectTypeDialog#buildNewTypeCreateCommand()
	 *
	 */
	@Override
	protected void buildNewTypeCreateCommand() {
		super.buildNewTypeCreateCommand();
		savedNewTypeNameText = newTypeNameText.getText();
	}

	/**
	 * @return
	 * @deprecated use getSavedNewTypeNameText
	 */
	@Deprecated() // use getSavedNewTypeNameText()
	public String getSavedNewTypeName() {
		return savedNewTypeNameText;
	}

}
