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

package org.eclipse.papyrus.sysml16.portsandflows;


import java.util.Map;

import org.eclipse.papyrus.sysml16.internal.util.IconUtil;
import org.eclipse.papyrus.sysml16.portsandflows.internal.impl.FlowPropertyImpl;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 
 *
 */
public class FlowPropertyCustomImpl extends FlowPropertyImpl implements FlowProperty{

	/**
	 * Icons for displaying flow property orientation
	 */
	private static Map<String,Image> icons;


	/**
	 * @return the icons for flow property orientation
	 */
	public static Map<String,Image> getIcons(FlowProperty flowProperty) {
		if (icons == null){// for PERFORMANCE we call UMLUtil.getStereotype only once
			 Stereotype stereotype = UMLUtil.getStereotype(flowProperty);
			 icons = IconUtil.getImages(stereotype);
		}
		return icons;
	}
	
	/**
	 * Images registered in Profile are :
	 * 0 - FlowPort IN
	 * 1 - FlowPort OUT
	 * 2 - FlowPort INOUT
	 * 3 (other) - FlowPort (default, similar to INOUT)
	 */
	@Override
	public Image getIcon() {
		Image image = null;
		if (getBase_Property() != null) {
			Map<String,Image> iconList = getIcons(this);
			switch (getDirection()) {
			case IN:
				image = iconList.get(getImageKey(FlowDirectionKind.IN));
				break;
			case OUT:
				image = iconList.get(getImageKey(FlowDirectionKind.OUT));
				break;
			case INOUT:
				image = iconList.get(getImageKey(FlowDirectionKind.INOUT));
				break;
			default:
				image = iconList.get(getImageKey(FlowDirectionKind.INOUT));
				break;
			}
		}
		return image;
	}
	
	private String getImageKey(FlowDirectionKind flowDirection) {
		return FlowProperty.class.getSimpleName()+"_"+flowDirection.getName().toUpperCase();//$NON-NLS-1$
	}
	
}
