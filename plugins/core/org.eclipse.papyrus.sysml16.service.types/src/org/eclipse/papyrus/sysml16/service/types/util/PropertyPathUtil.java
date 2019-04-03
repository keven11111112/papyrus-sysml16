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

import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * This class is used to calculus property path and block context in the context of SysML
 * To do that the view inside the diagram is needed.
 */
public final class PropertyPathUtil {

	/**
	 * Constructor.
	 *
	 */
	private PropertyPathUtil() {
	}

	/**
	 * 
	 * @param view
	 *            the current view
	 * @return the composite context from a view (it look for the first representation of a classifier)
	 */
	public static Classifier getCompositeContext(View view) {
		View currentView = view;
		while (currentView != null) {
			if (currentView instanceof Shape && currentView.getElement() instanceof Classifier) {
				return (Classifier) currentView.getElement();
			}
			currentView = (View) currentView.eContainer();
		}
		return null;
	}

	/**
	 * 
	 * @param view
	 *            the view that references an element in the diagram
	 * @return a list of properties defined by hierarchy of view, maybe an empty list
	 */
	public static List<Property> getPropertyListFromView(View view) {
		List<Property> propertiesList = new ArrayList<>();
		View currentView = view;
		while (currentView != null) {
			if (currentView instanceof Shape && currentView.getElement() instanceof Property) {
				propertiesList.add((Property) currentView.getElement());
			}
			currentView = (View) currentView.eContainer();
		}
		return propertiesList;
	}

	/**
	 * A series of properties that identifies the source of the directed relationship in the context of the block specified by the
	 * sourceContext property. The ordering of properties is from a property of the sourceContext block, through a property
	 * of each intermediate block that types the preceding property, ending in a property with a type that owns or inherits the
	 * source of the directed relationship. The source is not included in the propertyPath list. The same property might
	 * appear more than once because a block can own a property with the same or specialized block as a type.
	 * 
	 * @param SourceView
	 *            the view that represent the property
	 *
	 * @return the property path as defined in SysML, maybe an emptylist
	 */
	public static List<Property> getPropertyPath(View sourceView) {
		List<Property> propertyList = getPropertyListFromView(sourceView);
		// remove the first property
		if (!propertyList.isEmpty()) {
			propertyList.remove(0);
			Collections.reverse(propertyList);
		}
		return propertyList;
	}

}
