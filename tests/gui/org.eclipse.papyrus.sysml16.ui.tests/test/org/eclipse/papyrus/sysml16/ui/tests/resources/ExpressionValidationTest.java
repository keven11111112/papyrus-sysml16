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

package org.eclipse.papyrus.sysml16.ui.tests.resources;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test the expression model : - validate the model
 */
public class ExpressionValidationTest {

	public static final String EXPRESSIONS_PATH = "org.eclipse.papyrus.sysml16.nattable.common/resources/SysML16.expressions"; //$NON-NLS-1$

	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void useValidation() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(EXPRESSIONS_PATH, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The expression model is not valid " + EXPRESSIONS_PATH, Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$
	}

}
