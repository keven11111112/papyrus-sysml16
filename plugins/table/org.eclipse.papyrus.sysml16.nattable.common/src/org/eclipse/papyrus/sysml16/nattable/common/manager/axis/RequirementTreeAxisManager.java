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

package org.eclipse.papyrus.sysml16.nattable.common.manager.axis;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.sysml16.requirements.Requirement;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.nattable.manager.axis.UMLElementTreeAxisManagerForEventList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * AxisManager for SysML Requirements tree is Manager.
 */
public class RequirementTreeAxisManager extends UMLElementTreeAxisManagerForEventList {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.UMLElementTreeAxisManagerForEventList#canCreateAxisElement(java.lang.String)
	 */
	@Override
	public boolean canCreateAxisElement(String elementId) {
		return SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_REQUIREMENT.equals(elementId);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.UMLElementTreeAxisManagerForEventList#isAllowedContents(java.lang.Object, java.lang.Object, org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration, int)
	 */
	@Override
	public boolean isAllowedContents(Object objectToTest, Object semanticParent, TreeFillingConfiguration conf, int depth) {
		if (objectToTest  instanceof Element){
			Element element = (Element) objectToTest;
			if (UMLUtil.getStereotypeApplication(element, Requirement.class)!= null){
				return super.isAllowedContents(objectToTest, semanticParent, conf, depth);
			}
		}
		return false;
	}

}
