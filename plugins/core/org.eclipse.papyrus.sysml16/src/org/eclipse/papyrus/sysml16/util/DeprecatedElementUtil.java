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

package org.eclipse.papyrus.sysml16.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.sysml16.deprecatedelements.FlowPort;
import org.eclipse.papyrus.sysml16.deprecatedelements.FlowSpecification;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Utility class to get informations on DeprecatedElement resources
 *
 */
public final class DeprecatedElementUtil {
	
	private DeprecatedElementUtil(){
	}

	/**
	 * @param eObject
	 * @return It returns true if the EObject is a deprecated Stereotype or if the Uml element is stereotyped by a deprecated stereotype
	 */
	//Check perf issues before changing this method
	public static boolean isDeprecatedElement(EObject eObject) {
		if(eObject!=null){
			if (eObject.getClass().getName().startsWith("org.eclipse.papyrus.sysml16.deprecatedelements")){//$NON-NLS-1$
				return true;
			}	
			if(eObject instanceof Element){
				Element element = (Element)eObject;
				if (element instanceof Port){
					return UMLUtil.getStereotypeApplication(element, FlowPort.class)!=null;
				}
				if (element instanceof Interface){
					return UMLUtil.getStereotypeApplication(element, FlowSpecification.class)!=null;
				}				
			}
		}
		return false;
	}


}
