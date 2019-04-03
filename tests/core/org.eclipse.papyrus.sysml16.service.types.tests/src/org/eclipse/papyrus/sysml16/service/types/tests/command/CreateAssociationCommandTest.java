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

package org.eclipse.papyrus.sysml16.service.types.tests.command;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransaction;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.sysml16.service.types.command.CreateAssociationCommand;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test on CreateAssociationCommand
 *
 */
public class CreateAssociationCommandTest {

	
	/**
	 * Test method for {@link org.eclipse.papyrus.sysml16.service.types.command.CreateAssociationCommand#canExecute()}.
	 */
	@Test
	public void testCanExecute() throws InterruptedException, RollbackException {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Model model = SysMLResource.createSysMLModel(resourceSet);
		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$
		
		Class sourceClass = model.createOwnedClass("C1", false); //$NON-NLS-1$
		Class targetClass = model.createOwnedClass("C2", false); //$NON-NLS-1$
		Property property = sourceClass.createOwnedAttribute("P1", targetClass); //$NON-NLS-1$

		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		InternalTransactionalEditingDomain editingDomain = (InternalTransactionalEditingDomain) TransactionUtil.getEditingDomain(model);
		
		IElementType type = ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PART);
		ConfigureRequest validRequest = new ConfigureRequest(editingDomain, property, type);
		CreateAssociationCommand createAssociationCommand = new CreateAssociationCommand(validRequest, null);
		Assert.assertFalse("The createAssociationCommand should'nt be executable", createAssociationCommand.canExecute()); //$NON-NLS-1$
	}	
	
	/**
	 * Test method for {@link org.eclipse.papyrus.sysml16.service.types.command.CreateAssociationCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)}.
	 * 
	 * @throws InterruptedException
	 * @throws RollbackException
	 */	
	@Test
	public void testExecution() throws InterruptedException, RollbackException {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Model model = SysMLResource.createSysMLModel(resourceSet);
		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$
		
		Class sourceClass = model.createOwnedClass("C1", false); //$NON-NLS-1$
		Class targetClass = model.createOwnedClass("C2", false); //$NON-NLS-1$
		Property property = sourceClass.createOwnedAttribute("P1", targetClass); //$NON-NLS-1$

		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		InternalTransactionalEditingDomain editingDomain = (InternalTransactionalEditingDomain) TransactionUtil.getEditingDomain(model);
		
		IElementType type = ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PART);
		ConfigureRequest validRequest = new ConfigureRequest(editingDomain, property, type);
		CreateAssociationCommand createAssociationCommand = new CreateAssociationCommand(validRequest, AggregationKind.COMPOSITE_LITERAL);
		Assert.assertTrue("The createAssociationCommand should be executable", createAssociationCommand.canExecute()); //$NON-NLS-1$

		InternalTransaction startTransaction = editingDomain.startTransaction(false, null);
		editingDomain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(createAssociationCommand));
		startTransaction.commit();
		Object result = createAssociationCommand.getCommandResult().getReturnValue();
		Assert.assertTrue("The result of a seNestedPathCommand should be a Connector", result instanceof Property); //$NON-NLS-1$
		Assert.assertNotNull("The association wasn't created", ((Property) result).getAssociation()); //$NON-NLS-1$
		Assert.assertEquals("The property has the wrong aggregation",AggregationKind.COMPOSITE_LITERAL, ((Property) result).getAggregation()); //$NON-NLS-1$
	}

	/**
	 * Bug 483564 :Test Undo/Redo that invert association end
	 * @throws InterruptedException
	 * @throws RollbackException
	 */	
	@Test
	public void testExecutionUndoRedo() throws InterruptedException, RollbackException {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Model model = SysMLResource.createSysMLModel(resourceSet);
		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$
		
		Class sourceClass = model.createOwnedClass("C1", false); //$NON-NLS-1$
		Class targetClass = model.createOwnedClass("C2", false); //$NON-NLS-1$
		Property property = sourceClass.createOwnedAttribute("P1", targetClass); //$NON-NLS-1$

		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		InternalTransactionalEditingDomain editingDomain = (InternalTransactionalEditingDomain) TransactionUtil.getEditingDomain(model);
		
		IElementType type = ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PART);
		ConfigureRequest validRequest = new ConfigureRequest(editingDomain, property, type);
		CreateAssociationCommand createAssociationCommand = new CreateAssociationCommand(validRequest, AggregationKind.COMPOSITE_LITERAL);
		Assert.assertTrue("The createAssociationCommand should be executable", createAssociationCommand.canExecute()); //$NON-NLS-1$

		InternalTransaction startTransaction = editingDomain.startTransaction(false, null);
		editingDomain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(createAssociationCommand));
		startTransaction.commit();
		Object result = createAssociationCommand.getCommandResult().getReturnValue();
		Assert.assertTrue("The result of a seNestedPathCommand should be a Connector", result instanceof Property); //$NON-NLS-1$
		Association association = ((Property) result).getAssociation();
		Assert.assertNotNull("The association wasn't created", association); //$NON-NLS-1$
		EList<Property> memberEnds = association.getMemberEnds();
		// save the reference of the first execution
		Property firstDoMemberEnd = memberEnds.get(0);
		Property secondDoMemberEnd = memberEnds.get(1);
		editingDomain.getCommandStack().undo();
		editingDomain.getCommandStack().redo();
		Assert.assertEquals("The first member end should stay the same",firstDoMemberEnd, association.getMemberEnds().get(0)); //$NON-NLS-1$
		Assert.assertEquals("The second member end should stay the same",secondDoMemberEnd, association.getMemberEnds().get(1)); //$NON-NLS-1$
	}
	
}
