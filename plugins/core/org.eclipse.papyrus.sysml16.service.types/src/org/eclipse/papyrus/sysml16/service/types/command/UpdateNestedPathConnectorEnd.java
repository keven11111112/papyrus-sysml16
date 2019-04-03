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

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd;
import org.eclipse.papyrus.sysml16.service.types.util.ConnectorUtil;
import org.eclipse.papyrus.uml.service.types.utils.ConnectorUtils;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;

/**
 * NestedConnectorEnd
 * 
 * The NestedConnectorEnd stereotype of UML ConnectorEnd extends a UML ConnectorEnd so that the connected property
 * may be identified by a multi-level path of accessible properties from the block that owns the connector. The propertyPath
 * inherited from ElementPropertyPath gives a series of properties that identifies the connected property in the context of the
 * block that owns the connector.
 * 
 * The ordering of properties is from a property of the block that owns the connector, through
 * a property of each intermediate block that types the preceding property, ending in a property with a type that owns or
 * inherits the property that is the role of the connector end (the property that the connector graphically attaches to at that
 * end). The property that is the role of the connector end is not included in the propertyPath list.
 */
public class UpdateNestedPathConnectorEnd extends EditElementCommand {

	/**
	 * The current ConnectorEnd is the source of the Connector
	 */
	private Boolean isSource;

	@Deprecated // deprecated in 1.1.0
	public UpdateNestedPathConnectorEnd(String label, EObject elementToEdit, IEditCommandRequest request) {
		super(label, elementToEdit, request);
	}

	public UpdateNestedPathConnectorEnd(String label, EObject elementToEdit, IEditCommandRequest request, boolean isSource) {
		super(label, elementToEdit, request);
		this.isSource = isSource;
	}

	/**
	 * Check that the command access the connector and that the we have a view for NestedConnectorEnd target.
	 */
	@Override
	public boolean canExecute() {
		return getElementToEdit() instanceof View && super.canExecute();
	}

	/**
	 * Get the class owning the connector that owns the connector end
	 * 
	 * @param connectorEnd
	 * @return
	 */
	private org.eclipse.uml2.uml.Class getConnectorClass(ConnectorEnd connectorEnd) {
		Element connectorEndOwner = connectorEnd.getOwner();
		if (connectorEndOwner instanceof Connector) {
			Connector connector = (Connector) connectorEndOwner;
			Element connectorOwner = connector.getOwner();
			if (connectorOwner instanceof org.eclipse.uml2.uml.Class) {
				return (org.eclipse.uml2.uml.Class) connectorOwner;
			}
		}
		return null;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!(canExecute() && getConnector() != null)) {
			throw new ExecutionException("Can't update NesteConnectorEnd, missing View or connector."); //$NON-NLS-1$
		}
		EList<ConnectorEnd> ends = getConnector().getEnds();
		if (ends != null && ends.size() > 1) {
			ConnectorEnd connectorEnd = null;
			View elementToEdit = (View) getElementToEdit();
			connectorEnd = getCalculatedConnectorEnd();
			if (connectorEnd != null) {
				List<Property> nestedPath = ConnectorUtil.getNestedPath(getConnectorClass(connectorEnd), elementToEdit);
				NestedConnectorEnd nestedConnectorEnd = UMLUtil.getStereotypeApplication(connectorEnd, NestedConnectorEnd.class);

				if (nestedPath.isEmpty()) {
					if (nestedConnectorEnd != null) {
						EcoreUtil.delete(nestedConnectorEnd, true);// Remove stereotype if applied
					}
				} else {
					if (nestedConnectorEnd == null) {
						nestedConnectorEnd = (NestedConnectorEnd) StereotypeApplicationHelper.getInstance(null).applyStereotype(connectorEnd, BlocksPackage.eINSTANCE.getNestedConnectorEnd(),null);
					}
					// set new path if different from existing
					if (!nestedConnectorEnd.getPropertyPath().equals(nestedPath)) {
						nestedConnectorEnd.getPropertyPath().clear();
						nestedConnectorEnd.getPropertyPath().addAll(nestedPath);
					}
				}
			}
		}
		return CommandResult.newOKCommandResult(getElementToEdit());
	}


	private Connector getConnector() {
		if (getRequest() instanceof CreateRelationshipRequest) {
			return (Connector) ((CreateRelationshipRequest) getRequest()).getNewElement();
		} else if (getRequest() instanceof ReorientRelationshipRequest) {
			return (Connector) ((ReorientRelationshipRequest) getRequest()).getRelationship();
		} else if (getRequest() instanceof ConfigureRequest) {
			return (Connector) ((ConfigureRequest) getRequest()).getElementToConfigure();
		}
		return null;
	}

	/**
	 * Get the calculated connector end
	 * 
	 * @return the calculated connector end or null is isSource is null
	 */
	private ConnectorEnd getCalculatedConnectorEnd() {
		Connector connector = getConnector();
		EList<ConnectorEnd> ends = getConnector().getEnds();
		if (ends != null && ends.size() > 1) {
			if (isSource != null) {
				if (isSource) {
					return new ConnectorUtils().getSourceConnectorEnd(connector);
				} else {
					return new ConnectorUtils().getTargetConnectorEnd(connector);
				}
			} else {
				View elementToEdit = (View) getElementToEdit();
				ConnectorEnd connectorEndSource = ends.get(0);
				if (elementToEdit.getElement().equals(connectorEndSource.getRole())) {
					return connectorEndSource;
				} else {
					return ends.get(1);
				}
			}
		}
		return null;
	}

}
