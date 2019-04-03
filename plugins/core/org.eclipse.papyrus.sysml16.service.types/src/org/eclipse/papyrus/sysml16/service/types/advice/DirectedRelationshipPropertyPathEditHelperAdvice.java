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
package org.eclipse.papyrus.sysml16.service.types.advice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.service.types.command.SetDirectedRelationshipPropertyPathCommand;
import org.eclipse.papyrus.sysml16.service.types.command.wrapper.EMFToCreateElementEditCommandWrapper;
import org.eclipse.papyrus.sysml16.service.types.command.wrapper.EMFToIEditCommandWrapper;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.service.types.utils.RequestParameterUtils;
import org.eclipse.uml2.uml.Property;

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
 *
 */
public class DirectedRelationshipPropertyPathEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterCreateRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getAfterCreateRelationshipCommand(CreateRelationshipRequest request) {

		ICommand defaultCommand = super.getAfterCreateRelationshipCommand(request);
		View sourceView = RequestParameterUtils.getSourceView(request);
		View targetView = RequestParameterUtils.getTargetView(request);
		if (request.getElementType() instanceof ISpecializationType) {
			// get all specializations from elementTypes
			List<IElementType> elementTypesHierarchy = new ArrayList<>();
			elementTypesHierarchy.add(request.getElementType());
			ISpecializationType iSpecializationType = (ISpecializationType) request.getElementType();
			elementTypesHierarchy.addAll(Arrays.asList(iSpecializationType.getAllSuperTypes()));

			if ((elementTypesHierarchy.contains(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_ALLOCATE_ABSTRACTION))) ||
					(elementTypesHierarchy.contains(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_REFINE_ABSTRACTION))) ||
					(elementTypesHierarchy.contains(ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_TRACE_ABSTRACTION)))) {
				
				if (sourceView!=null && sourceView.getElement() instanceof Property) {
					SetDirectedRelationshipPropertyPathCommand setPropertyPathCommand = new SetDirectedRelationshipPropertyPathCommand(request.getEditingDomain(), sourceView, true);
					EMFToIEditCommandWrapper editCommandWrapper = new EMFToCreateElementEditCommandWrapper(request.getContainer(), request, setPropertyPathCommand);
					defaultCommand = CompositeCommand.compose(defaultCommand, editCommandWrapper);
				}

				if (targetView!=null && targetView.getElement() instanceof Property) {
					SetDirectedRelationshipPropertyPathCommand setPropertyPathCommand = new SetDirectedRelationshipPropertyPathCommand(request.getEditingDomain(), targetView, false);
					EMFToIEditCommandWrapper editCommandWrapper = new EMFToCreateElementEditCommandWrapper(request.getContainer(), request, setPropertyPathCommand);
					defaultCommand = CompositeCommand.compose(defaultCommand, editCommandWrapper);
				}
			}
		}
		return defaultCommand;
	}

}
