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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

/**
 * Utility class for Connector edit helpers.
 */
// TODO : this class should be move to uml core
public class UMLConnectorUtils extends org.eclipse.papyrus.uml.service.types.utils.ConnectorUtils {

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
	 * Get the path of structure views crossed by the checked end.
	 *
	 * @param checkedEnd
	 *            the checked end view.
	 * @param oppositeEnd
	 *            the opposite end view.
	 * @return the list of crossed structure views.
	 */
	public List<View> getNestedPath(View checkedEnd, View oppositeEnd) {
		List<View> isNestedConnectableElement = new ArrayList<>();

		View nearestContainer = new UMLConnectorUtils().getNearestStructureContainer(checkedEnd);
		if (nearestContainer != null) {
			View containerView = new UMLConnectorUtils().deduceViewContainer(checkedEnd, oppositeEnd);
			List<View> containers = new UMLConnectorUtils().getStructureContainers(checkedEnd);

			if (containers.indexOf(nearestContainer) < containers.indexOf(containerView)) {
				isNestedConnectableElement = containers.subList(containers.indexOf(nearestContainer), containers.indexOf(containerView));
			}
		}

		// nested path is taken from the top block to the deepest property ==> collection must be reverted
		Collections.reverse(isNestedConnectableElement);

		return isNestedConnectableElement;
	}

	/**
	 * Get the path of structure views crossed by the checked end.
	 *
	 * @param checkedEnd
	 *            the checked end view.
	 * @param oppositeEnd
	 *            the opposite end view.
	 * @return the list of crossed structure views.
	 */
	public List<Property> getNestedPropertyPath(View checkedEnd, View oppositeEnd) {
		List<Property> nestedPropertyPath = new ArrayList<>();
		List<View> nestedPath = getNestedPath(checkedEnd, oppositeEnd);

		for (View view : nestedPath) {
			if ((view.getElement() != null) && (view.getElement() instanceof Property)) {
				nestedPropertyPath.add((Property) view.getElement());
			}
		}

		// if end is a port, and the list is not empty, add the property from the check view in the list
		if (!nestedPropertyPath.isEmpty() && checkedEnd.getElement() instanceof Port) {
			Property partWithPort = getPartWithPort(checkedEnd, oppositeEnd);
			if (partWithPort != null) {
				nestedPropertyPath.add(partWithPort);
			}
		}

		return nestedPropertyPath;
	}

	/**
	 * Test if the checked end is nested (means it cross StructuredClassifier borders).
	 *
	 * @param checkedEnd
	 *            the checked end view.
	 * @param oppositeEnd
	 *            the opposite end view.
	 * @return true if the checked end is nested.
	 */
	public boolean isNestedConnectableElement(View checkedEnd, View oppositeEnd) {
		return !(getNestedPath(checkedEnd, oppositeEnd).isEmpty());
	}

	/**
	 * Gets the nearest structure container.
	 *
	 * @param view
	 *            the view
	 * @return the nearest structure container or null
	 */
	public View getNearestStructureContainer(View view) {
		View nearestStructureContainer = null;
		for (View containerView : getStructureContainers(view)) {
			if (view == containerView) {
				continue;
			}
			nearestStructureContainer = containerView;
			break;
		}
		return nearestStructureContainer;
	}

	/**
	 * Gets the name with quotes.
	 *
	 * @param property
	 *            a property
	 * @return the name with quotes
	 *         the property name with name delimiter if it is required
	 */
	public static final String getNameWithQuotes(final NamedElement property) {
		final String partName = property.getName();
		final StringBuilder partNameBuffer = new StringBuilder();
		final Pattern pattern = Pattern.compile(UMLConnectorUtils.HAS_NO_WORD_CHAR_REGEX);
		final Matcher matcher = pattern.matcher(partName);
		boolean mustHaveQuote = false;
		while (matcher.find() && !mustHaveQuote) {
			mustHaveQuote = true;
		}
		if (mustHaveQuote) {
			partNameBuffer.append(UMLConnectorUtils.STRING_DELIMITER);
			partNameBuffer.append(partName);
			partNameBuffer.append(UMLConnectorUtils.STRING_DELIMITER);
		} else {
			partNameBuffer.append(partName);
		}

		return partNameBuffer.toString();
	}

	/**
	 * Can display existing connector between views according to partWithPort.
	 *
	 * @param connector
	 *            the connector
	 * @param sourceView
	 *            the source view
	 * @param targetView
	 *            the target view
	 * @return true, if successful
	 */
	public boolean canDisplayExistingConnectorBetweenViewsAccordingToPartWithPort(final Connector connector, final View sourceView, final View targetView) {
		Property partWithPort = getPartWithPortFromConnector(connector);
		if (partWithPort != null) {
			String partWithPortName = partWithPort.getName();
			Type partWithPortType = partWithPort.getType();
			EObject sourceContainer = ((View) sourceView.eContainer()).getElement();
			EObject targetContainer = ((View) targetView.eContainer()).getElement();

			boolean sameSourceType = false;
			if (sourceContainer instanceof TypedElement) {
				sameSourceType = partWithPortType.conformsTo(((TypedElement) sourceContainer).getType());
			}
			boolean sameSourceName = partWithPortName.equals(((NamedElement) sourceContainer).getName());

			boolean sameTargetType = false;
			if (targetContainer instanceof TypedElement) {
				sameTargetType = partWithPortType.conformsTo(((TypedElement) targetContainer).getType());
			}
			boolean sametargetName = partWithPortName.equals(((NamedElement) targetContainer).getName());

			return (sameSourceType && sameSourceName) || (sameTargetType && sametargetName);
		}
		return true;
	}

	/**
	 * Gets the partWithPort from the connector.
	 *
	 * @param connector
	 *            the connector
	 * @return the part with port from connector
	 */
	public Property getPartWithPortFromConnector(final Connector connector) {
		if (connector != null && connector.getEnds() != null) {
			for (final ConnectorEnd end : connector.getEnds()) {
				Property partWithPort = end.getPartWithPort();
				if (partWithPort != null) {
					return partWithPort;
				}
			}
		}
		return null;
	}

	/**
	 * Test if the relationship creation is allowed.
	 *
	 * @deprecated in 0.10.1 (will be removed in 0.11.0)
	 * 
	 * @param source
	 *            the relationship source can be null
	 * @param target
	 *            the relationship target can be null
	 * @param sourceView
	 *            the relationship graphical source can be null
	 * @param targetView
	 *            the relationship graphical target can be null
	 * @return true if the creation is allowed
	 */
	@Deprecated // test creation should be done in approve request
	public static boolean canCreate(EObject source, EObject target, View sourceView, View targetView) {

		if ((source != null) && !(source instanceof ConnectableElement)) {
			return false;
		}

		if ((target != null) && !(target instanceof ConnectableElement)) {
			return false;
		}

		if ((sourceView != null) && (targetView != null)) {
			// Cannot create a connector from a view representing a Part to its own Port (or the opposite)
			if ((sourceView.getChildren().contains(targetView)) || (targetView.getChildren().contains(sourceView))) {
				return false;
			}

			// Cannot connect a Part to one of its (possibly indirect) containment, must connect to one of its Port.
			if (new UMLConnectorUtils().getStructureContainers(sourceView).contains(targetView) || new UMLConnectorUtils().getStructureContainers(targetView).contains(sourceView)) {
				return false;
			}
		}
		return true;
	}

}
