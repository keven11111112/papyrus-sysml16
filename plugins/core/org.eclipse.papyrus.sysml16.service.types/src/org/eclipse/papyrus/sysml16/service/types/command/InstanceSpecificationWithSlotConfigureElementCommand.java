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
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * A command to configure an instance specification from a classifier
 */
public class InstanceSpecificationWithSlotConfigureElementCommand extends ConfigureElementCommand {

	private Classifier classifier;
	
	/**
	 * Configure the instance specification to use this classifier
	 *
	 * @param request
	 * @param classifier
	 */
	public InstanceSpecificationWithSlotConfigureElementCommand(ConfigureRequest request,Classifier classifier) {
		super(request);
		this.classifier = classifier;
	}	
	
	
	/**
	 * Add the classifier to the instance specification and create slots for each attributes
	 * 
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 *
	 * @param monitor
	 * @param info
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		final InstanceSpecification instanceSpecification = (InstanceSpecification) getElementToEdit();
		if (classifier != null){
			// set instance classifier
			instanceSpecification.getClassifiers().add(classifier);
			EList<Property> attributes = classifier.getAttributes();		
			// create the slots
			for (Property property : attributes) {
				Slot slot = instanceSpecification.createSlot();
				Type type = property.getType();
				if (type!=null){
					ValueSpecification valueSpecification = slot.createValue(property.getName(), type, UMLPackage.eINSTANCE.getInstanceValue());
					valueSpecification.setType(type);
				}else {
					slot.createValue(property.getName(), null, UMLPackage.eINSTANCE.getLiteralString());
				}
				slot.setDefiningFeature(property);
			}						
		}
		return CommandResult.newOKCommandResult(instanceSpecification);
	}

}
