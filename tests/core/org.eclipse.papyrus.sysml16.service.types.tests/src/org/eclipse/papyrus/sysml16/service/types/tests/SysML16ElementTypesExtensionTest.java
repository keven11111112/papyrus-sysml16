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

package org.eclipse.papyrus.sysml16.service.types.tests;

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
import org.junit.Ignore;
import org.junit.Test;

/**
 * This class is to check any change in the SysML 1.6 element type id
 * (since the ids can be used a specialization they are part of public API)
 *
 */
public class SysML16ElementTypesExtensionTest {

	public static final String ELEMENTTYPE_EXTENSION_MENU_PATH = "org.eclipse.papyrus.sysml16.service.types/model/SysML16-extension.elementtypesconfigurations"; //$NON-NLS-1$
	
	@BeforeClass
	public static void loadSysMLDefinition() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		ElementTypeSetConfiguration elementTypeSetConfiguration = map.get("org.eclipse.papyrus.sysml16.service.types.elementTypeSet.extension"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML element type set definition is missing", elementTypeSetConfiguration); //$NON-NLS-1$
	}
	
	@Test
	@Ignore //FIXME Setting a field by model create a working bu invalide model
	public void validateSysML16ElementTypesExtensionModel() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(ELEMENTTYPE_EXTENSION_MENU_PATH, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The SysML16ElementTypesExtension model is not valid ", Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$
	}
	
	/**
	 * Check that all SpecializationTypeConfiguration have a matcher 
	 * (This is no more required for avoiding to broke UML Diagrams since contextid but still a good idea)
	 */
	@Test
	public void checkElementTypeMatcher() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(ELEMENTTYPE_EXTENSION_MENU_PATH, true);
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
						Assert.assertNotNull(specializationTypeConfiguration.getName()+"is missing its matcher. All SysML 1.6 SpecializationTypeConfiguration must have a matcher. By default, use org.eclipse.papyrus.sysml16.service.types.matcher.internal.SysML16ProfileMatcher)", matcherConfiguration); //$NON-NLS-1$
					}
				}
			}
		}
	}	
	
    @Test
	public void testRegistryContentForUnit() {
		Assert.assertTrue("Unit element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Unit")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForQuantityKind() {
		Assert.assertTrue("QuantityKind element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.QuantityKind")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForConstraintProperty() {
		Assert.assertTrue("ConstraintProperty element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ConstraintProperty")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForActorPart() {
		Assert.assertTrue("ActorPart element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ActorPart")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForValue() {
		Assert.assertTrue("Value element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Value")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForReference() {
		Assert.assertTrue("Reference element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Reference")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForPart() {
		Assert.assertTrue("Part element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Part")); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
