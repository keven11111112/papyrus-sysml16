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

package org.eclipse.papyrus.sysml16.diagram.common.tests.util;

import java.util.Map;

import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.diagram.common.util.GraphicalSysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Check constant of GraphicalSysMLServiceTypeUtil.
 */
public class GraphicalSysMLServiceTypeUtilTest {

	@BeforeClass
	public static void loadSysMLDefinition() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		ElementTypeSetConfiguration elementTypeSetConfiguration = map.get("org.eclipse.papyrus.sysml16di.elementTypes"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML element type set definition is missing", elementTypeSetConfiguration); //$NON-NLS-1$
	}


	@Test
	public void checkConstraintLabelElementTypeId() {
		Assert.assertTrue("ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINT_LABEL should have a valid element id : ", SysMLServiceTypeUtil.isKnown(GraphicalSysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINT_LABEL)); //$NON-NLS-1$
	}

	@Test
	public void checkParameterBorderItemLabelElementTypeId() {
		Assert.assertTrue("ORG_ECLIPSE_PAPYRUS_SYSML16_PARAMETER_BORDER_ITEM should have a valid element id : ", SysMLServiceTypeUtil.isKnown(GraphicalSysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PARAMETER_BORDER_ITEM)); //$NON-NLS-1$
	}

}
