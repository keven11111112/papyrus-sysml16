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

import org.eclipse.gmf.runtime.diagram.ui.internal.commands.ElementTypeLabelProvider;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.services.edit.commands.ConfigureFeatureCommandFactory;
import org.eclipse.papyrus.infra.services.edit.commands.IConfigureCommandFactory;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.diagram.common.internal.dialog.CreateOrSelectTypeWithNameDialog;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Dialog for initialization of Value (Property) type (the type is either selected or created).
 */
public class CreateOrSelectValuePropertyTypeDialog extends CreateOrSelectTypeWithNameDialog {

	protected ComboViewer newTypeKindComboViewer = null;

	protected Combo newTypeKindCombo = null;

	protected IElementType[] valueTypeKind = { UMLElementTypes.DATA_TYPE,
			ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_VALUETYPE),
			UMLElementTypes.PRIMITIVE_TYPE, UMLElementTypes.ENUMERATION };

	protected IElementType newTypeKind = UMLElementTypes.DATA_TYPE;

	/** Constructor */
	public CreateOrSelectValuePropertyTypeDialog(Shell shell, NamedElement owner) {
		super(shell, owner, UMLElementTypes.DATA_TYPE, UMLPackage.eINSTANCE.getTypedElement_Type(), null, UMLElementTypes.PACKAGE, UMLPackage.eINSTANCE.getPackage_PackagedElement(), null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createFormCreationSection(Composite pParent, FormToolkit pToolkit) {
		// create the section
		String lSectionTitle = getCreationSectionTitle();
		Section lSection = pToolkit.createSection(pParent, ExpandableComposite.EXPANDED | ExpandableComposite.TITLE_BAR);
		lSection.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		if (lSectionTitle != null) {
			lSection.setText(lSectionTitle);
		}

		ScrolledForm lInsideScrolledForm = pToolkit.createScrolledForm(lSection);
		lInsideScrolledForm.setExpandHorizontal(true);
		lInsideScrolledForm.setExpandVertical(true);
		Composite lBody = lInsideScrolledForm.getBody();

		GridLayout lLayout = new GridLayout(3, false);
		lBody.setLayout(lLayout);

		// content of the section
		creationRadio = pToolkit.createButton(lBody, getCreationSectionRadioLabel(), SWT.RADIO);
		creationRadio.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

		pToolkit.createLabel(lBody, getNewTypeNameLabel(), SWT.NONE);
		newTypeNameText = pToolkit.createText(lBody, "", SWT.BORDER);//$NON-NLS-1$
		newTypeNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		newTypeNameText.setFocus();

		// manage type selection
		pToolkit.createLabel(lBody, getNewTypeContainerNameLabel(), SWT.NONE);
		newTypeContainerNameText = pToolkit.createText(lBody, labelProvider.getText(newTypeContainer), SWT.BORDER | SWT.READ_ONLY);
		newTypeContainerNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		newTypeContainerButton = pToolkit.createButton(lBody, "...", SWT.FLAT);//$NON-NLS-1$
		newTypeContainerButton.setLayoutData(new GridData(SWT.NONE));

		pToolkit.createLabel(lBody, "New Label", SWT.NONE);
		newTypeKindCombo = new Combo(lBody, SWT.DROP_DOWN | SWT.READ_ONLY);
		newTypeKindComboViewer = new ComboViewer(newTypeKindCombo);
		pToolkit.adapt(newTypeKindCombo);
		newTypeKindCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		newTypeKindComboViewer.setLabelProvider(new ElementTypeLabelProvider());
		newTypeKindComboViewer.add(valueTypeKind);
		newTypeKindComboViewer.setSelection(new StructuredSelection(valueTypeKind[0]));

		lInsideScrolledForm.reflow(true);
		lSection.setClient(lInsideScrolledForm);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildNewTypeCreateCommand() {
		// The new element is expected to be a NamedElement.
		IElementEditService commandService = ElementEditServiceUtils.getCommandProvider(newTypeContainer);
		if (commandService != null) {
			CreateElementRequest createTypeRequest = new CreateElementRequest(newTypeContainer, newTypeKind);
			createTypeRequest.setParameter(IConfigureCommandFactory.CONFIGURE_COMMAND_FACTORY_ID, new ConfigureFeatureCommandFactory(UMLPackage.eINSTANCE.getNamedElement_Name(), newTypeNameText.getText()));
			newTypeCreateCommand = commandService.getEditCommand(createTypeRequest);
		}
		setSavedNewTypeNameText(newTypeNameText.getText());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void hookListeners() {
		super.hookListeners();

		// listener to select invocation type
		ModifyListener newTypeKindListener = new ModifyListener() {

			/**
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			@Override
			public void modifyText(ModifyEvent e) {
				ISelection sel = newTypeKindComboViewer.getSelection();
				if (sel instanceof StructuredSelection) {
					Object type = ((StructuredSelection) sel).getFirstElement();
					if (type instanceof IElementType) {
						newTypeKind = (IElementType) type;
					} else {
						newTypeKind = null;
					}

					// reset name
					setNewTypeName(null);
				}
			}
		};
		newTypeKindCombo.addModifyListener(newTypeKindListener);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void setNewTypeName(String text) {
		String name = text;
		if (text == null) {
			name = NamedElementUtil.getDefaultNameWithIncrementFromBase(newTypeKind.getEClass().getName(), newTypeContainer.eContents());
			if (newTypeKind == ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_VALUETYPE)) {
				name = NamedElementUtil.getDefaultNameWithIncrementFromBase(BlocksPackage.eINSTANCE.getValueType().getName(), newTypeContainer.eContents());
			}
			newTypeNameText.setText(name);

		} else {
			newTypeNameText.setText(name);
			newTypeName = name;
		}

		validateNewTypeName();
		refreshOkButton();
	}
}
