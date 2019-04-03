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

package org.eclipse.papyrus.sysml16.service.types.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Utility class for Connector
 */
public class ConnectorUtil {

	public static final UMLConnectorUtils umlUtility = new UMLConnectorUtils(); // TODO all methods should be static in an utility class

	/**
	 * the key used to store the nested path as parameter of the request. The value will be a List of {@link Property}
	 */
	public static final String NESTED_CONNECTOR_END_PATH = "connectorEndPath"; //$NON-NLS-1$

	/** the separator used in the role path to distinguish the part. */
	public static final String PART_SEPARATOR = "."; //$NON-NLS-1$

	/** allow to know if a string contains others characters than a-z A-Z 0-9 and _. */
	public static final String HAS_NO_WORD_CHAR_REGEX = "\\W+"; //$NON-NLS-1$

	/** String used to delimit a name with contains special chars. */
	public static final String STRING_DELIMITER = "\'"; //$NON-NLS-1$

	/**
	 * Utility class avoid instantiation.
	 *
	 */
	private ConnectorUtil() {
	}

	/**
	 * Gets the encapsulated container.
	 *
	 * @param view
	 *            the view
	 * @return the nearest encapsulated structure container or null
	 */
	public static View getEncapsulatedContainer(View view) {
		View encapsulatedContainer = null;

		for (View containerView : umlUtility.getStructureContainers(view)) {

			if (view == containerView) {
				continue;
			}

			if ((view.getElement() instanceof Port) && (containerView.getChildren().contains(view))) {
				continue;
			}

			StructuredClassifier structuredClassifier = umlUtility.getStructuredClassifier(containerView);
			Block block = UMLUtil.getStereotypeApplication(structuredClassifier, Block.class);
			if (block != null && block.isEncapsulated()) {
				encapsulatedContainer = containerView;
				break;
			}
		}

		return encapsulatedContainer;
	}

	/**
	 * Test if an encapsulation crossing is required to connect the checked end to the opposite end.
	 *
	 * @param checkedEnd
	 *            the checked end view.
	 * @param oppositeEnd
	 *            the opposite end view.
	 * @return true if the gesture break encapsulation rule.
	 */
	public static boolean isCrossingEncapsulation(View checkedEnd, View oppositeEnd) {
		boolean isCrossingEncapsulation = false;

		View encapsulatedContainer = getEncapsulatedContainer(checkedEnd);
		if (encapsulatedContainer != null) {
			View containerView = umlUtility.deduceViewContainer(checkedEnd, oppositeEnd);
			List<View> containers = umlUtility.getStructureContainers(checkedEnd);

			if (containers.indexOf(encapsulatedContainer) < containers.indexOf(containerView)) {
				isCrossingEncapsulation = true;
			}
		}

		return isCrossingEncapsulation;
	}


	/**
	 * Gets the role path.
	 *
	 * @param end
	 *            the connector end
	 * @return the role path
	 *         the path for the role of the connector end (without using label provider)
	 */
	public static final String getRolePath(final ConnectorEnd end) {
		final NestedConnectorEnd nestedConnectorEnd = UMLUtil.getStereotypeApplication(end, NestedConnectorEnd.class);
		final ConnectableElement role = end.getRole();
		final StringBuilder rolePath = new StringBuilder();
		if (role != null) {
			if (nestedConnectorEnd != null) {
				final List<Property> properties = nestedConnectorEnd.getPropertyPath();
				for (final Property current : properties) {
					rolePath.append(UMLConnectorUtils.getNameWithQuotes(current));
					rolePath.append(UMLConnectorUtils.PART_SEPARATOR);
				}
			} else {
				// when the stereotype is applied, the Property for partWithPort is included in the stereotype#path
				final Property partWithPort = end.getPartWithPort();
				if (partWithPort != null) {
					rolePath.append(UMLConnectorUtils.getNameWithQuotes(partWithPort));
					rolePath.append(UMLConnectorUtils.PART_SEPARATOR);
				}
			}
			rolePath.append(UMLConnectorUtils.getNameWithQuotes(role));
		}

		return rolePath.toString();
	}



	/**
	 * Checks if is crossing encapsulation.
	 *
	 * @param nestedPath
	 *            the nested path
	 * @return true, if is crossing encapsulation <code>true</code> if we are breaking encapsulation (see SysML rules in SysML Standard 1.2, p.44):
	 *         isEncapsulated: Boolean [0..1] If true, then the block is treated as a black box; a part typed by this black box can only be connected
	 *         via its ports or directly to its outer boundary. If false, or if a value is not present, then connections can be established to
	 *         elements of its internal structure via deep-nested connector ends.
	 */
	public static final boolean isCrossingEncapuslation(final List<Property> nestedPath) {
		for (final ConnectableElement current : nestedPath) {
			final Type type = current.getType();
			if (type != null) {
				final Block block = UMLUtil.getStereotypeApplication(type, Block.class);
				if (block != null && block.isEncapsulated()) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Can display existing connector between views according to nested paths.
	 *
	 * @param connector
	 *            a connector existing in the model
	 * @param sourceView
	 *            a potential source for this connector
	 * @param targetView
	 *            a potential target for this connector
	 * @return true, if successful <code>true</code> if displaying the existing connector between this source and this target view is correct
	 */
	public static boolean canDisplayExistingConnectorBetweenViewsAccordingToNestedPaths(final Connector connector, final View sourceView, final View targetView) {
		final List<Property> sourcePath = umlUtility.getNestedPropertyPath(sourceView, targetView);
		final List<Property> targetPath = umlUtility.getNestedPropertyPath(targetView, sourceView);
		boolean hasWantedPath = true;
		for (final ConnectorEnd end : connector.getEnds()) {
			if (sourceView != null && end.getRole() == sourceView.getElement()) {
				hasWantedPath = hasWantedPath && haveSamePath(sourcePath, end);
			} else if (targetView != null && end.getRole() == targetView.getElement()) {
				hasWantedPath = hasWantedPath && haveSamePath(targetPath, end);
			}
		}
		return hasWantedPath;
	}



	/**
	 * Have same path.
	 *
	 * @param wantedPath
	 *            the wanted nested path for the end
	 * @param end
	 *            an end
	 * @return true, if successful
	 *         true if the end has as nested path THE wanted path
	 */
	protected static boolean haveSamePath(final List<Property> wantedPath, final ConnectorEnd end) {
		NestedConnectorEnd nestedConnectorEnd = UMLUtil.getStereotypeApplication(end, NestedConnectorEnd.class);
		if (nestedConnectorEnd != null) {
			return nestedConnectorEnd.getPropertyPath().equals(wantedPath);
		} else {
			return wantedPath.isEmpty();
		}
	}




	/**
	 * Filter connectors that have this property in their <NestedConnectorEnd> property path.
	 *
	 * @param connectors
	 * @param part
	 * @return connectors that have this property in their <NestedConnectorEnd> property path.
	 */
	public static List<Connector> filterConnectorByPropertyInNestedConnectorEnd(List<Connector> connectors, Property part) {
		List<Connector> res = new ArrayList<>();
		for (Connector connector : connectors) {
			EList<ConnectorEnd> ends = connector.getEnds();
			for (ConnectorEnd connectorEnd : ends) {
				NestedConnectorEnd stereotypeApplication = UMLUtil.getStereotypeApplication(connectorEnd, NestedConnectorEnd.class);
				if (stereotypeApplication != null) {
					EList<Property> propertyPath = stereotypeApplication.getPropertyPath();
					for (Property property : propertyPath) {
						if (property.equals(part)) {
							res.add(connector);
						}
					}
				}
			}
		}
		return res;
	}

	/**
	 * Inverse of property path from the view to the class
	 * 
	 * [SysML 1.6 - 8.3.2.9]: "The ordering of properties is from a property of the context block, through a
	 * property of each intermediate block that types the preceding property, ending in a property with a type
	 * that owns or inherits the fully nested property."
	 * 
	 * @param clazz
	 * @param view
	 * @return
	 */
	public static List<Property> getNestedPath(org.eclipse.uml2.uml.Class clazz, View view) {
		List<Property> propertyPath = new ArrayList<>();
		View currentView = ViewUtil.getContainerView(view);
		// get the path from view to clazz
		boolean stop = false;
		while (!stop && currentView != null) {
			EObject property = currentView.getElement();
			if (property instanceof Property) {
				if (((Property) property).getType() == clazz) {
					stop = true;
				} else {
					propertyPath.add((Property) property);
				}
			} else {
				if (clazz.equals(currentView.getElement())) {
					stop = true;
				}
			}
			currentView = ViewUtil.getContainerView(currentView);
		}
		Collections.reverse(propertyPath);
		return propertyPath;
	}


}
