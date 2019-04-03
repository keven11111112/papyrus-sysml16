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

package org.eclipse.papyrus.sysml16.architecture.tests.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureContext;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDomain;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureViewpoint;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.sysml16.architecture.util.SysML16chitectureUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SysML16ArchitectureUtilTest {

	public static final String ARCHITECTURE_PATH = "org.eclipse.papyrus.sysml16.architecture/resources/sysml16.architecture"; //$NON-NLS-1$

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ SysML16chitectureUtil.DIAGRAM_ACTIVITY_ID },
				{ SysML16chitectureUtil.DIAGRAM_BLOCK_DEFINITION_ID },
				{ SysML16chitectureUtil.DIAGRAM_SEQUENCE_ID },
				{ SysML16chitectureUtil.DIAGRAM_INTERNAL_BLOCK_ID },
				{ SysML16chitectureUtil.DIAGRAM_PACKAGE_ID },
				{ SysML16chitectureUtil.DIAGRAM_PARAMETRIC_ID },
				{ SysML16chitectureUtil.DIAGRAM_REQUIREMENT_ID },
				{ SysML16chitectureUtil.DIAGRAM_STATE_MACHINE_ID },
				{ SysML16chitectureUtil.DIAGRAM_USE_CASE_ID },
				{ SysML16chitectureUtil.TABLE_REQUIREMENT_ID },
				{ SysML16chitectureUtil.TABLE_REQUIREMENT_TREE_ID },
				{ SysML16chitectureUtil.TABLE_ALLOCATION_ID },
		});
	}

	private String representationId;

	public SysML16ArchitectureUtilTest(String representationId) {
		this.representationId = representationId;
	}

	/**
	 * Check that constant are referring to an existing element
	 */
	@Test
	public void checkRepresentationIds() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(ARCHITECTURE_PATH, true);
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		Resource resource = resourceSetImpl.getResource(createPlatformPluginURI, true);
		Assert.assertFalse("SysML 1.6 architecture should not be empty", resource.getContents().isEmpty()); //$NON-NLS-1$
		EObject firstEObject = resource.getContents().get(0);
		Assert.assertTrue("First element of architecture should be an ArchitectureDomain", firstEObject instanceof ArchitectureDomain); //$NON-NLS-1$
		ArchitectureDomain architectureDomain = (ArchitectureDomain) firstEObject;
		Assert.assertNotNull("Unknow representation id " + representationId, getRepresentationKindById(architectureDomain, representationId)); //$NON-NLS-1$
	}


	///////////////////////////////////////////////////////////////////////////////
	// FIXME: should be in Papyrus core API
	protected RepresentationKind getRepresentationKindById(ArchitectureDomain architectureDomain, String id) {
		Map<String, RepresentationKind> allRepresentationKind = new HashMap<>();
		EList<ArchitectureContext> contexts = architectureDomain.getContexts();
		for (ArchitectureContext architectureContext : contexts) {
			EList<ArchitectureViewpoint> viewpoints = architectureContext.getViewpoints();
			for (ArchitectureViewpoint architectureViewpoint : viewpoints) {
				for (RepresentationKind representationKind : architectureViewpoint.getRepresentationKinds()) {
					allRepresentationKind.put(representationKind.getId(), representationKind);
				}
			}
		}
		return allRepresentationKind.get(id);
	}
	////////////////////////////////////////////////////////////////////////////////
}
