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
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * 8.3.2.3 Block
 * the service edit must implement the following constraints
 * isEncapsulated: Boolean [0..1]
 * If true, then the block is treated as a black box; a part typed by this black box can only be connected via its ports or
 * directly to its outer boundary. If false, or if a value is not present, then connections can be established to elements of
 * its internal structure via deep-nested connector ends.
 * 
 * <pre>
 * This advice is used to remove inconsistent {@link Connector} when a related {@link Block}
 * is set as encapsulated ({@link Block#isEncapsulated()} property).
 * </pre>
 */
public class SetEncapsulatedEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * <pre>
	 * {@inheritDoc}
	 * 
	 * Returns the command to destroy any {@link Connector} breaking encapsulation rules.
	 * </pre>
	 *
	 * @param request
	 *            the request to modify the model
	 * @return
	 * 		the command to destroy the views of the parts which are not owned by the new type
	 *
	 */
	@Override
	protected ICommand getBeforeSetCommand(SetRequest request) {
		ICommand setCommand = super.getBeforeSetCommand(request);
		Set<Connector> connectorToDelete = new HashSet<>();

		EObject elementToEdit = request.getElementToEdit();
		if ((elementToEdit instanceof Block) && (request.getFeature() == BlocksPackage.eINSTANCE.getBlock_IsEncapsulated())) {

			Block blockApp = (Block) elementToEdit;
			Boolean setAsEncapsulated = (request.getValue() instanceof Boolean) ? (Boolean) request.getValue() : false;
			if (!blockApp.isEncapsulated() && setAsEncapsulated) {

				for (Property property : getPropertyTypedByBlock(blockApp)) {
					for (NestedConnectorEnd nestedEnd : getRelatedNestedConnectorEnd(property)) {
						ConnectorEnd end = nestedEnd.getBase_ConnectorEnd();
						Connector connector = (end != null) ? (Connector) end.eContainer() : null;
						if (connector != null) {
							connectorToDelete.add(connector);
						}
					}
				}
			}
		}

		// Add connector destroy command if needed
		if (!(connectorToDelete.isEmpty())) {
			DestroyDependentsRequest req = new DestroyDependentsRequest(request.getEditingDomain(), elementToEdit, false);
			req.setClientContext(request.getClientContext());
			req.addParameters(request.getParameters());
			ICommand connectorDestroyCommand = req.getDestroyDependentsCommand(connectorToDelete);
			if (connectorDestroyCommand != null) {
				setCommand = CompositeCommand.compose(connectorDestroyCommand, setCommand);
			}
		}

		return setCommand;
	}

	/**
	 * Get any {@link Property} typed by the given {@link Block} (its base class).
	 *
	 * @param block
	 *            the block.
	 * @return a collection of {@link Property}
	 */
	private Collection<Property> getPropertyTypedByBlock(Block block) {
		EReference[] eRefs = new EReference[] { UMLPackage.eINSTANCE.getTypedElement_Type() };

		Collection<?> references = EMFCoreUtil.getReferencers(block.getBase_Class(), eRefs);
		List<Property> propertyReferences = new LinkedList<>();
		for (Object reference : references) {
			if (reference instanceof Property) {
				propertyReferences.add((Property) reference);
			}
		}

		return propertyReferences;
	}

	/**
	 * Get any {@link NestedConnectorEnd} stereotype application that holds the property in its path.
	 *
	 * @param property
	 *            the property that should be in the path.
	 * @return a collection of {@link NestedConnectorEnd}
	 */
	@SuppressWarnings("unchecked")
	private Collection<NestedConnectorEnd> getRelatedNestedConnectorEnd(Property property) {
		EReference[] eRefs = new EReference[] { BlocksPackage.eINSTANCE.getElementPropertyPath_PropertyPath() };

		Collection<NestedConnectorEnd> references = EMFCoreUtil.getReferencers(property, eRefs);
		return (references != null) ? references : Collections.unmodifiableList(new ArrayList<NestedConnectorEnd>());
	}
}
