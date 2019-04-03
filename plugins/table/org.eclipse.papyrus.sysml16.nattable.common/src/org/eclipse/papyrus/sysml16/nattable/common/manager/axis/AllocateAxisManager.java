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

import org.eclipse.papyrus.sysml16.allocations.Allocate;
import org.eclipse.papyrus.sysml16.allocations.AllocationsPackage;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Axis Manager for Allocate.
 */
public class AllocateAxisManager extends AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager<Allocate> {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canCreateAxisElement(java.lang.String)
	 */
	@Override
	public boolean canCreateAxisElement(final String elementId) {
		return SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_ALLOCATE_ABSTRACTION.equals(elementId);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#isInstanceOfRequiredStereotypeApplication(java.lang.Object)
	 */
	@Override
	protected boolean isInstanceOfRequiredStereotypeApplication(Object object) {
		return object instanceof Allocate;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeApplication(org.eclipse.uml2.uml.Element)
	 */
	@Override
	protected Allocate getStereotypeApplication(final Element el) {
		return UMLUtil.getStereotypeApplication(el, Allocate.class);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeBaseElement(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected Element getStereotypeBaseElement(final Allocate stereotypeApplication) {
		return stereotypeApplication.getBase_Abstraction();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeApplicationBasePropertyName()
	 */
	@Override
	protected String getStereotypeApplicationBasePropertyName() {
		return AllocationsPackage.eINSTANCE.getAllocate_Base_Abstraction().getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#isAllowedAsBaseElement(org.eclipse.uml2.uml.Element)
	 */
	@Override
	protected boolean isAllowedAsBaseElement(Element element) {
		return element instanceof Abstraction;
	}


}
