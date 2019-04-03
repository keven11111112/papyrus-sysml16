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

import org.eclipse.papyrus.sysml16.requirements.Requirement;
import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * AxisManager for SysML Requirements.
 */
public class RequirementAxisManager extends AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager<Requirement> {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canCreateAxisElement(java.lang.String)
	 */
	@Override
	public boolean canCreateAxisElement(String elementId) {
		return SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_REQUIREMENT.equals(elementId);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeApplication(org.eclipse.uml2.uml.Element)
	 */
	@Override
	protected Requirement getStereotypeApplication(Element el) {
		return UMLUtil.getStereotypeApplication(el, Requirement.class);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#isInstanceOfRequiredStereotypeApplication(java.lang.Object)
	 */
	@Override
	protected boolean isInstanceOfRequiredStereotypeApplication(final Object object) {
		return object instanceof Requirement;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeBaseElement(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected Element getStereotypeBaseElement(final Requirement stereotypeApplication) {
		return stereotypeApplication.getBase_Class();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#isAllowedAsBaseElement(org.eclipse.uml2.uml.Element)
	 */
	@Override
	protected boolean isAllowedAsBaseElement(final Element element) {
		return element instanceof Class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeApplicationBasePropertyName()
	 */
	@Override
	protected String getStereotypeApplicationBasePropertyName() {
		return RequirementsPackage.eINSTANCE.getRequirement_Base_Class().getName();
	}

}
