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

package org.eclipse.papyrus.sysml16.internal.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 *
 */
// See org.eclipse.papyrus.uml.tools.utils.ImageUtil
// FIXME: copy/paste field since we do not want to introduce a Papyrus dependency in the profile
public class IconUtil {

	/**
	 * Constructor.
	 *
	 */
	private IconUtil() {
		// avoid instantiation in utility class
	}

	public static final String IMAGE_PAPYRUS_EA = "image_papyrus"; //$NON-NLS-1$

	/**
	 * KEY of the EAnnotation where the image's name is stored
	 *
	 * @see {@link #getName(Image)}
	 * @see {@link #setName(Image, String)}
	 */
	public static final String IMAGE_NAME_KEY = "image_name_key"; //$NON-NLS-1$

	public static Map<String, Image> getImages(Stereotype stereotype) {
		Map<String, Image> icons = new HashMap<>();
		for (Image image : stereotype.getIcons()) {
			EAnnotation eAnnotation = UMLUtil.getEAnnotation(image, IMAGE_PAPYRUS_EA, false);
			String string = eAnnotation.getDetails().get(IMAGE_NAME_KEY);
			icons.put(string, image);
		}
		return icons;
	}

}
