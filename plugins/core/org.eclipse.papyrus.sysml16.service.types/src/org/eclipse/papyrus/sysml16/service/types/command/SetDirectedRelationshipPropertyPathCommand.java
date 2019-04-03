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

package org.eclipse.papyrus.sysml16.service.types.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.blocks.DirectedRelationshipPropertyPath;
import org.eclipse.papyrus.sysml16.service.types.command.wrapper.IEMFElementToEditCommand;
import org.eclipse.papyrus.sysml16.service.types.util.PropertyPathUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 8.3.2.7 DirectedRelationshipPropertyPath
 * sourcePropertyPath: Property [0..*] {ordered, nonunique}
 * A series of properties that identifies the source of the directed relationship in the context of the block specified by the
 * sourceContext property. The ordering of properties is from a property of the sourceContext block, through a property
 * of each intermediate block that types the preceding property, ending in a property with a type that owns or inherits the
 * source of the directed relationship. The source is not included in the propertyPath list. The same property might
 * appear more than once because a block can own a property with the same or specialized block as a type.
 * • targetPropertyPath: Property [0..*] {ordered, nonunique}
 * A series of properties that identifies the target of the directed relationship in the context of the block specified by the
 * targetContext property. The ordering of properties is from a property of the targetContext block, through a property of
 * each intermediate block that types the preceding property, ending in a property with a type that owns or inherits the
 * target of the directed relationship. The target is not included in the propertyPath list. The same property might appear
 * more than once because a block can own a property with the same or specialized block as a type.
 * • sourceContext: Classifier [0.1]
 * Gives the context for sourcePropertyPath to begin from.
 * • targetContext: Classifier [0.1]
 * Gives the context for targetPropertyPath to begin from.
 */
public class SetDirectedRelationshipPropertyPathCommand extends RecordingCommand implements IEMFElementToEditCommand {

	protected Element directedRelationShipPropertyPath = null;
	protected View sourceView = null;
	protected boolean isSource;

	/**
	 * Constructor.
	 *
	 * @param domain
	 * @param view
	 *            the view that reference the semantic element, it is need to calculus the context...
	 * @param isSource
	 *            if true fill information about the source, false fill information about the target
	 */
	public SetDirectedRelationshipPropertyPathCommand(TransactionalEditingDomain domain, View view, boolean isSource) {
		super(domain);
		this.sourceView = view;
		this.isSource = isSource;
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		if (directedRelationShipPropertyPath == null || sourceView == null) {
			return false;
		}
		return super.canExecute();
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */
	@Override
	protected void doExecute() {
		if (canExecute()) {
			if (isSource) {
				DirectedRelationshipPropertyPath stereotypeApplication = UMLUtil.getStereotypeApplication(directedRelationShipPropertyPath, DirectedRelationshipPropertyPath.class);
				stereotypeApplication.getSourcePropertyPath().clear();
				stereotypeApplication.getSourcePropertyPath().addAll(PropertyPathUtil.getPropertyPath(sourceView));
				stereotypeApplication.setSourceContext(PropertyPathUtil.getCompositeContext(sourceView));
			} else {
				DirectedRelationshipPropertyPath stereotypeApplication = UMLUtil.getStereotypeApplication(directedRelationShipPropertyPath, DirectedRelationshipPropertyPath.class);
				stereotypeApplication.getTargetPropertyPath().clear();
				stereotypeApplication.getTargetPropertyPath().addAll(PropertyPathUtil.getPropertyPath(sourceView));
				stereotypeApplication.setTargetContext(PropertyPathUtil.getCompositeContext(sourceView));
			}
		}
	}

	/**
	 * @see org.eclipse.papyrus.sysml16.service.types.command.wrapper.IEMFElementToEditCommand#SetElementToEdit(org.eclipse.emf.ecore.EObject)
	 *
	 * @param eObject
	 */
	@Override
	public void setElementToEdit(EObject eObject) {
		if (eObject instanceof Element) {
			directedRelationShipPropertyPath = (Element) eObject;
		}
	}

}
