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

package org.eclipse.papyrus.sysml16.ui.constraints;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.infra.constraints.constraints.Constraint;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.papyrus.uml.properties.constraints.HasStereotypeConstraint;
import org.eclipse.papyrus.uml.tools.utils.UMLUtil;
import org.eclipse.uml2.uml.Profile;

/**
 * A constraint to test if the given object is a UML Element and has the given Stereotype and Sysml1.6 profile applied.
 */
public class HasStereotypeSysml16Constraint extends HasStereotypeConstraint implements Constraint {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.constraints.constraints.AbstractConstraint#match(java.lang.Object)
	 *      Check if the containing package has profilUri applied.
	 */
	@Override
	public boolean match(Object selection) {
		if (super.match(selection)) {
			EList<Profile> allAppliedProfiles = UMLUtil.resolveUMLElement(selection).getNearestPackage().getAllAppliedProfiles();
			for (Profile profile : allAppliedProfiles) {
				String uri = profile.getURI();
				if (SysMLResource.PROFILE_URI.equals(uri)) {
					return true;
				}
			}
		}
		return false; // always called even when not defined
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("HasStereotypeSysml16 %s (%s)", stereotypeName, getDisplayUnit().getElementMultiplicity() == 1 ? "Single" : "Multiple"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.constraints.constraints.AbstractConstraint#equivalent(org.eclipse.papyrus.infra.constraints.constraints.Constraint)
	 */
	@Override
	protected boolean equivalent(Constraint constraint) {
		return super.equivalent(constraint) && constraint instanceof HasStereotypeSysml16Constraint;
	}
}
