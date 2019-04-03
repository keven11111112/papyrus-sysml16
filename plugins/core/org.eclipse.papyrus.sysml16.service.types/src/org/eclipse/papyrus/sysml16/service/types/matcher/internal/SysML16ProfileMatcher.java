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

package org.eclipse.papyrus.sysml16.service.types.matcher.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

/**
 * org.eclipse.papyrus.sysml16.service.types.matcher.internal.SysML16ProfileMatcher
 */
public class SysML16ProfileMatcher implements IElementMatcher {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean matches(EObject eObject) {
		if (!(eObject instanceof Element)) {
			return false;
		}
		Element element = (Element) eObject;
		Model model = element.getModel();
		if (model == null) {
			return false;
		}
		
		EList<Profile> allAppliedProfiles = model.getAllAppliedProfiles();
		if (allAppliedProfiles!=null){
			List<String> appliedProfileByUri = new ArrayList<>();
			for (Profile appliedProfile : allAppliedProfiles) {
				appliedProfileByUri.add(appliedProfile.getURI());
			}

			if (!appliedProfileByUri.contains(SysMLResource.PROFILE_URI)) {
				return false;
			}			
		}
		return true;
	}
}
