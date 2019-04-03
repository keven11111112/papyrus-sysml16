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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * This class is used to create an association from a property
 */
public class CreateAssociationCommand extends ConfigureElementCommand {
	
	private final AggregationKind aggregationKind;

	/**
	 * Constructor using default Aggregation
	 *
	 * @param request
	 * @param aggregationKind
	 */
	public CreateAssociationCommand(ConfigureRequest request) {
		this(request,AggregationKind.NONE_LITERAL);
	}	
	
	/**
	 * Constructor.
	 *
	 * @param request
	 * @param aggregationKind
	 */
	public CreateAssociationCommand(ConfigureRequest request, AggregationKind aggregationKind) {
		super(request);
		this.aggregationKind = aggregationKind;
	}

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		if (aggregationKind!= null && (getElementToEdit() instanceof Property)) {
			return super.canExecute();
		}
		return false;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		Property sourcePart = (Property) getElementToEdit();
		
		// set the aggregation
		if (sourcePart != null) {
			sourcePart.setAggregation(aggregationKind);

			// construct the Association
			if (sourcePart.getType() != null) {

				// Create association between element owner and element type
				Type sourceType = (Type) sourcePart.getOwner();
				Package associationContainer = sourceType.getNearestPackage();

				// Create targetProperty
				Property targetProperty = UMLFactory.eINSTANCE.createProperty();
				targetProperty.setType(sourceType);

				Association association = UMLFactory.eINSTANCE.createAssociation();
				association.setPackage(associationContainer);
				association.getMemberEnds().add(sourcePart);
				association.getOwnedEnds().add(targetProperty);
				association.getMemberEnds().add(targetProperty);		
			}
		}
		return CommandResult.newOKCommandResult(sourcePart);
	}
}