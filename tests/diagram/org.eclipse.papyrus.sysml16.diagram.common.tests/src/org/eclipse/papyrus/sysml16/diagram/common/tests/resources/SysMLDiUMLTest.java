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

package org.eclipse.papyrus.sysml16.diagram.common.tests.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.papyrus.infra.types.ElementTypeConfiguration;
import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This class is to test the validity of sysmldi element types.
 */
public class SysMLDiUMLTest {

	public static final String SYSMLDI_ELEMENT_TYPE_PATH = "org.eclipse.papyrus.sysml16.diagram.common/resources/SysML16DiUML.elementtypesconfigurations"; //$NON-NLS-1$

	@BeforeClass
	public static void loadSysMLDefinition() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		ElementTypeSetConfiguration elementTypeSetConfiguration = map.get("org.eclipse.papyrus.sysml16di.elementTypes"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML element type set definition is missing", elementTypeSetConfiguration); //$NON-NLS-1$
	}

	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */

	@Test
	public void validateSysML16ElementTypesModel() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(SYSMLDI_ELEMENT_TYPE_PATH, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The element type model is not valid ", Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$
	}

	/**
	 * Check if there is a duplicated identifier in all loaded element types
	 */
	@Test
	public void checkAlreadyExistingId() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		List<String> alreadyCheckedIds = new ArrayList<>();
		for (ElementTypeSetConfiguration elementTypeSetConfiguration : map.values()) {
			EList<ElementTypeConfiguration> elementTypeConfigurations = elementTypeSetConfiguration.getElementTypeConfigurations();
			for (ElementTypeConfiguration elementTypeConfiguration : elementTypeConfigurations) {
				String identifier = elementTypeConfiguration.getIdentifier();
				Assert.assertFalse("Duplicated elementtype identifer " + identifier, alreadyCheckedIds.contains(identifier)); //$NON-NLS-1$
				alreadyCheckedIds.add(identifier);
			}
		}
	}

}
