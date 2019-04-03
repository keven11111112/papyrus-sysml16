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

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransaction;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Class to test SharedAssociation
 */
public class SharedAssociationTest {
	
	private static final String ELEMENT_TYPE_ID = "org.eclipse.papyrus.uml.AssociationShared"; //$NON-NLS-1$
 
	@BeforeClass
	public static void loadSysMLDefinition() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		ElementTypeSetConfiguration elementTypeSetConfiguration = map.get("org.eclipse.papyrus.sysml16.service.types.elementTypeSet.extension"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML element type set definition is missing", elementTypeSetConfiguration); //$NON-NLS-1$
	}	
	
	@Ignore // FIXME : fail with NPE to be checked after full switch to independent contextid
    @Test
	public void testCreation() throws InterruptedException, RollbackException {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Model model = SysMLResource.createSysMLModel(resourceSet);
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$
		Class clazz = model.createOwnedClass("Class", false);
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		InternalTransactionalEditingDomain editingDomain = (InternalTransactionalEditingDomain) TransactionUtil.getEditingDomain(model);
		
		IElementType elementType = ElementTypeRegistry.getInstance().getType(ELEMENT_TYPE_ID);
		CreateRelationshipRequest validRequest = new CreateRelationshipRequest(clazz, clazz, elementType);
		IElementEditService commandService = ElementEditServiceUtils.getCommandProvider(model);
		ICommand editCommand = commandService.getEditCommand(validRequest);
		 
		Assert.assertTrue("The command for creating a provate package import should be executable", editCommand.canExecute()); //$NON-NLS-1$

		InternalTransaction startTransaction = editingDomain.startTransaction(false, null);
		editingDomain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(editCommand));
		startTransaction.commit();
		Object result = editCommand.getCommandResult().getReturnValue();
		Assert.assertTrue("The result should be a Association", result instanceof Association); //$NON-NLS-1$
		Assert.assertEquals("The Association is expected a shared aggregation in the first member end",AggregationKind.SHARED_LITERAL, ((Association) result).getMemberEnds().get(0).getAggregation()); //$NON-NLS-1$
	}

}
