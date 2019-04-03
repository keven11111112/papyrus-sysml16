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

package org.eclipse.papyrus.sysml16.service.types.tests.util;

import java.lang.reflect.Field;
import java.util.Map;

import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class should test that all constant in SysMLServiceTypeUtil should be referring
 * to an existing element type
 */
public class SysMLServiceTypeUtilTest {

	/**
	 * Check that the required element type set are correctly loaded
	 */
	@BeforeClass
	public static void loadSysml16Defintion() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		ElementTypeSetConfiguration elementTypeSetConfiguration = map.get("org.eclipse.papyrus.sysml16.service.types.elementTypeSet"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML 1.6 element type set definition is missing", elementTypeSetConfiguration); //$NON-NLS-1$
		ElementTypeSetConfiguration elementTypeSetConfigurationExtension = map.get("org.eclipse.papyrus.sysml16.service.types.elementTypeSet.extension"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML 1.6 element type set extension definition is missing", elementTypeSetConfigurationExtension); //$NON-NLS-1$

	}


	/**
	 * Check that each field is referencing an existing element type
	 * 
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws ServiceException
	 */
	@Test
	public void testElementTypeIdsDefinedAsConstant() throws IllegalArgumentException, IllegalAccessException, ServiceException {
		Field[] declaredFields = SysMLServiceTypeUtil.class.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) {
			Field field = declaredFields[i];
			if (field.isAccessible()) {
				String name = field.getName();
				Object value = field.get(SysMLServiceTypeUtil.class);
				Assert.assertTrue(name + " value should define as a String", value instanceof String); //$NON-NLS-1$
				boolean knownElementType = SysMLServiceTypeUtil.isKnown((String) value);
				Assert.assertTrue(name + " value should define an existing elementtype id", knownElementType); //$NON-NLS-1$
			}
		}
	}
}
