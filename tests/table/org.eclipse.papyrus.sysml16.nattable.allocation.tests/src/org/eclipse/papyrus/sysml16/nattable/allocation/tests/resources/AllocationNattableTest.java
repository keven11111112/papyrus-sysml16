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

package org.eclipse.papyrus.sysml16.nattable.allocation.tests.resources;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.PasteEObjectConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.nattable.allocation.Activator;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the requirement nattable model :
 * - validate the model
 */
public class AllocationNattableTest {

	public static final String ALLOCATION_NATTABLE_PATH = Activator.PLUGIN_ID + "/resources/allocation.nattableconfiguration"; //$NON-NLS-1$
	
	public static final String ALLOCATION_MATRIX_PATH = Activator.PLUGIN_ID + "/resources/allocationMatrix.nattableconfiguration"; //$NON-NLS-1$

	@Before
	public void loadElementTypeRegistry() {
		ElementTypeSetConfigurationRegistry.getInstance();
	}

	/**
	 * Validate the model with the rules defined in the meta-model tooling.
	 */
	@Test
	public void validateAllocationNattableModel() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(ALLOCATION_NATTABLE_PATH, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The allocation nattable model is not valid ", Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$
	}
	
	/**
	 * Validate the model with the rules defined in the meta-model tooling.
	 */
	@Test
	public void validateAllocationMatrixModel() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(ALLOCATION_MATRIX_PATH, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The allocation matrix model is not valid ", Diagnostic.OK, diagnostic.getSeverity()); //$NON-NLS-1$
	}

	/**
	 * check that the past configuration use a correct element type id
	 */
	@Test
	public void checkPastedElementId() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(ALLOCATION_NATTABLE_PATH, true);
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		Resource resource = resourceSetImpl.getResource(createPlatformPluginURI, true);
		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = (EObject) allContents.next();
			if (eObject instanceof PasteEObjectConfiguration) {
				PasteEObjectConfiguration pasteEObjectConfiguration = (PasteEObjectConfiguration) eObject;
				String elementTypeId = pasteEObjectConfiguration.getPastedElementId();
				Assert.assertTrue("Unregistred element id : " + elementTypeId, SysMLServiceTypeUtil.isKnown(elementTypeId)); //$NON-NLS-1$
			}
		}
	}

}
