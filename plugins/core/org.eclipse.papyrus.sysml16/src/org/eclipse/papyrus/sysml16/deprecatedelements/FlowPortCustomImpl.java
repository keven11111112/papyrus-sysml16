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

package org.eclipse.papyrus.sysml16.deprecatedelements;

import java.util.Map;

import org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowPortImpl;
import org.eclipse.papyrus.sysml16.internal.util.IconUtil;
import org.eclipse.papyrus.sysml16.portsandflows.FlowDirectionKind;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "FlowPort" stereotype see Requirement DerivedProperties Req0010
 *
 */
public class FlowPortCustomImpl extends FlowPortImpl implements FlowPort {

	/**
	 * Icons for displaying port orientation,
	 */
	private static Map<String, Image> icons;

	/**
	 * @return the icons for port orientation
	 */
	public static Map<String, Image> getIcons(FlowPort flowPort) {
		if (icons == null) {// for PERFORMANCE we call UMLUtil.getStereotype only once
			Stereotype stereotype = UMLUtil.getStereotype(flowPort);
			icons = IconUtil.getImages(stereotype);
		}
		return icons;
	}


	/**
	 * C.3.2.2 FlowPort : /isAtomic : Boolean (derived) This is a derived attribute (derived from the flow port’s type).
	 * For a flow port typed by a flow specification the value of this attribute is False, otherwise the value is True.
	 * 
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowPortImpl#isAtomic()
	 *
	 * @return true if atomic
	 */
	@Override
	public boolean isAtomic() {
		// The FlowPort is Atomic if it is not typed by a FlowSpecification
		boolean isAtomic = true;
		if (getBase_Port() != null) {
			// Find FlowPort type
			Type type = getBase_Port().getType();
			if ((type != null) && (type instanceof Interface)) {
				FlowSpecification flowSpec = UMLUtil.getStereotypeApplication(type, FlowSpecification.class);
				if (flowSpec != null) {
					isAtomic = false;
				}
			}
		}
		return isAtomic;
	}


	/**
	 * Images registered in Profile are :
	 * 0 - FlowPort IN
	 * 1 - FlowPort OUT
	 * 2 - FlowPort INOUT
	 * 3 - FlowPort NA (Non Atomic)
	 * 4 (Other) - FlowPort (default, similar to INOUT)
	 * 
	 * @see org.eclipse.papyrus.sysml16.deprecatedelements.internal.impl.FlowPortImpl#getIcon()
	 *
	 * @return the icon depending on the orientation of the FlowPort
	 */
	@Override
	public Image getIcon() {
		Image image = null;
		if (getBase_Port() != null) {
			Map<String, Image> iconList = getIcons(this);
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
		return FlowPort.class.getSimpleName() + "_" + flowDirection.getName().toUpperCase();//$NON-NLS-1$
	}

}
