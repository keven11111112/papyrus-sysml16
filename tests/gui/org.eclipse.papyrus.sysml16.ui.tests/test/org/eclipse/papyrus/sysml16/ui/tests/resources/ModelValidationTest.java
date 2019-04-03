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

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.ui.Activator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * This is a parameterized test to validate all model in the plugin.
 */
@RunWith(Parameterized.class)
public class ModelValidationTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ "/resources/SysML1.6ConstraintEnvironment.xmi" }, //$NON-NLS-1$
				{ "/resources/SysML16.creationmenumodel" }, //$NON-NLS-1$
				{ "/resources/SysML16Edges.creationmenumodel" }, //$NON-NLS-1$
				{ "/resources/UML4SysML16.creationmenumodel" }, //$NON-NLS-1$
				{ "/resources/UML4SysML16Edges.creationmenumodel" }, //$NON-NLS-1$
				// Model seems not to be valid due to the use of two classifier with the same name and a missing proxy to resolve a metamodel.
				// {"/resources/custom/OperationalSysML.custom"}
				// FIXME missing org.eclipse.papyrus.customization.properties.model.xwt;bundle-version="[1.1.0,2.0.0)" dependency in oxygen
				// {"/resources/properties/SysML1.6.ctx"}
		});
	}

	private String modelPath;

	public ModelValidationTest(String modelPath) {
		this.modelPath = modelPath;
	}

	@BeforeClass
	public static void loadElementTypeSet() {
		ElementTypeSetConfigurationRegistry.getInstance();
	}

	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void validateModel() {
		String fullPath = Activator.PLUGIN_ID + this.modelPath;
		URI modelPlatformURI = URI.createPlatformPluginURI(fullPath, true);
		Resource resource = new ResourceSetImpl().getResource(modelPlatformURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The " + modelPath + " model is invalid " + print(diagnostic), Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$ //$NON-NLS-2$
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
