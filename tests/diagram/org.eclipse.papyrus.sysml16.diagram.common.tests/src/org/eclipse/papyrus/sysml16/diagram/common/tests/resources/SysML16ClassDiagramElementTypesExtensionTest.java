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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.papyrus.infra.types.AbstractMatcherConfiguration;
import org.eclipse.papyrus.infra.types.ElementTypeConfiguration;
import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.infra.types.SpecializationTypeConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */
public class SysML16ClassDiagramElementTypesExtensionTest {

	public static final String CLASS_DIAGRAM_EXTENSION_ELEMENT_TYPE_PATH = "org.eclipse.papyrus.sysml16.diagram.common/resources/SysML16Di-extension.elementtypesconfigurations"; //$NON-NLS-1$

	@BeforeClass
	public static void loadSysMLDefinition() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		ElementTypeSetConfiguration elementTypeSetConfiguration = map.get("org.eclipse.papyrus.sysml16di.elementTypeSet.extension"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML element type set definition is missing", elementTypeSetConfiguration); //$NON-NLS-1$
	}

	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void validateSysML16ClassDiagramElementTypesExtensionModel() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(CLASS_DIAGRAM_EXTENSION_ELEMENT_TYPE_PATH, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The element type model is not valid ", Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$
	}

	/**
	 * Check that all SpecializationTypeConfiguration have a matcher
	 * (This is no more required for avoiding to broke UML Diagrams since contextid but still a good idea)
	 */
	@Test
	public void checkElementTypeMatcher() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(CLASS_DIAGRAM_EXTENSION_ELEMENT_TYPE_PATH, true);
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		Resource resource = resourceSetImpl.getResource(createPlatformPluginURI, true);
		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = (EObject) allContents.next();
			if (eObject instanceof ElementTypeSetConfiguration) {
				ElementTypeSetConfiguration elementTypeSetConfiguration = (ElementTypeSetConfiguration) eObject;
				EList<ElementTypeConfiguration> elementTypeConfigurations = elementTypeSetConfiguration.getElementTypeConfigurations();
				for (ElementTypeConfiguration elementTypeConfiguration : elementTypeConfigurations) {
					if (elementTypeConfiguration instanceof SpecializationTypeConfiguration) {
						SpecializationTypeConfiguration specializationTypeConfiguration = (SpecializationTypeConfiguration) elementTypeConfiguration;
						AbstractMatcherConfiguration matcherConfiguration = specializationTypeConfiguration.getMatcherConfiguration();
						Assert.assertNotNull(specializationTypeConfiguration.getName()
								+ "is missing its matcher. All SysML 1.6 SpecializationTypeConfiguration must have a matcher. By default, use org.eclipse.papyrus.sysml16.service.types.matcher.internal.SysML16ProfileMatcher)", matcherConfiguration); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			}
		}
	}

}
