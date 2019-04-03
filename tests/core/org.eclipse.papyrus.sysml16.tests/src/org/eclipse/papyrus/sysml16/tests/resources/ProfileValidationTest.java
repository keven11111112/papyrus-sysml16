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

package org.eclipse.papyrus.sysml16.tests.resources;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.papyrus.sysml16.Activator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Specific test checking that profile doesn't have any errors (only warnings...)
 */
public class ProfileValidationTest {

	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void validateModel() {
		String fullPath = Activator.PLUGIN_ID + "/resources/profile/SysML.profile.uml"; //$NON-NLS-1$
		URI modelPlatformURI = URI.createPlatformPluginURI(fullPath, true);
		Resource resource = new ResourceSetImpl().getResource(modelPlatformURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertNotEquals("The /resources/profile/SysML.profile.uml model is invalid " + print(diagnostic), Diagnostic.ERROR, diagnostic.getSeverity()); //$NON-NLS-1$
	}

	// FIXME : Something should exist in API to do that
	private String print(Diagnostic diagnostic) {
		List<Diagnostic> children = diagnostic.getChildren();
		StringBuilder stringBuilder = new StringBuilder(diagnostic.getMessage());
		for (Diagnostic diagnosticChildren : children) {
			stringBuilder.append("\n"); //$NON-NLS-1$
			stringBuilder.append(diagnosticChildren.getMessage());
		}
		return stringBuilder.toString();
	}

}
