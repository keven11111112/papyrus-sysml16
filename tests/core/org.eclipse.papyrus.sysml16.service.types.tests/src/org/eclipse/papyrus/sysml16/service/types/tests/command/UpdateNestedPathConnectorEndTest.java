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

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransaction;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd;
import org.eclipse.papyrus.sysml16.service.types.command.UpdateNestedPathConnectorEnd;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for connector creation
 */
public class UpdateNestedPathConnectorEndTest {

	private ResourceSetImpl resourceSet;

	private Model model;
	private org.eclipse.uml2.uml.Class blockRoot;
	private Property p1;
	private Property p2;
	private Property p3;

	private Node p1View;
	private Node p2View;
	private Node p3ViewInP1;
	private Node p3ViewInP2;

	/**
	 * Data structure:
	 * | blockRoot 		| | classType 	   |
	 * |----------------| |----------------|
	 * | p1 : classType | | p3 : classType |
	 * | p2 : classType | | 			   |
	 * 
	 * View structure:
	 * +-------------------------+
	 * |      blockRootView      |
	 * +-------------------------+
	 * |   p1View   |   p2View   |
	 * |+----------+|+----------+|
	 * ||p3ViewInP1|||p3ViewInP2||
	 * |+----------+|+----------+|
	 * +-------------------------+
	 * 
	 */
	@Before
	public void setUp() {
		// Prepare test
		resourceSet = new ResourceSetImpl();
		model = SysMLResource.createSysMLModel(resourceSet);
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty());

		// Data structure
		StereotypeApplicationHelper stereotypeApplicationHelper = StereotypeApplicationHelper.getInstance(null);
		blockRoot = model.createOwnedClass("blockClass", false); //$NON-NLS-1$
		stereotypeApplicationHelper.applyStereotype(blockRoot, BlocksPackage.eINSTANCE.getBlock(),null);
		Class classType = model.createOwnedClass("classType", false);
		p1 = blockRoot.createOwnedAttribute("p1", classType); //$NON-NLS-1$
		p2 = blockRoot.createOwnedAttribute("p2", classType); //$NON-NLS-1$
		p3 = classType.createOwnedAttribute("p3", classType); //$NON-NLS-1$

		// View structure
		p3ViewInP1 = NotationFactory.eINSTANCE.createNode();
		p3ViewInP1.setElement(p3);
		
		p3ViewInP2 = NotationFactory.eINSTANCE.createNode();
		p3ViewInP2.setElement(p3);

		p2View = NotationFactory.eINSTANCE.createNode();
		p2View.setElement(p2);
		p2View.insertChild(p3ViewInP2);

		p1View = NotationFactory.eINSTANCE.createNode();
		p1View.setElement(p1);
		p1View.insertChild(p3ViewInP1);

		Node blockRootView = NotationFactory.eINSTANCE.createNode();
		blockRootView.setElement(blockRoot);
		blockRootView.insertChild(p1View);
		blockRootView.insertChild(p2View);
	}

	/**
	 * The connector: connect the property p3 (p3ViewInP1) and the property p2 (p2View)
	 * 
	 * @throws InterruptedException
	 * @throws RollbackException
	 */
	@Test
	public void testExecution() throws InterruptedException, RollbackException {
		Connector connector = blockRoot.createOwnedConnector("bindingConnector");
		ConnectorEnd sourceEnd = connector.createEnd();
		sourceEnd.setRole(p3);
		ConnectorEnd targetEnd = connector.createEnd();
		targetEnd.setRole(p2);

		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		InternalTransactionalEditingDomain editingDomain = (InternalTransactionalEditingDomain) TransactionUtil.getEditingDomain(model);

		IElementType type = ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_BINDINGCONNECTOR);
		IEditCommandRequest validRequest = new ConfigureRequest(editingDomain, connector, type);
		UpdateNestedPathConnectorEnd createAssociationCommand = new UpdateNestedPathConnectorEnd("UpdateNestedPathConnectorEnd test source", p3ViewInP1, validRequest, true); //$NON-NLS-1$
		Assert.assertTrue("The createAssociationCommand should be executable", createAssociationCommand.canExecute()); //$NON-NLS-1$

		InternalTransaction startTransaction = editingDomain.startTransaction(false, null);
		editingDomain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(createAssociationCommand));
		startTransaction.commit();
		NestedConnectorEnd stereotypeApplication = UMLUtil.getStereotypeApplication(sourceEnd, NestedConnectorEnd.class);
		Assert.assertTrue("The sourceEnd should have a NestedConnectorEnd applied", stereotypeApplication != null); //$NON-NLS-1$
	}

	/**
	 * Test the case when the source connector end and the target connector end roles are equals
	 * The connector: connect the property p3 (p3ViewInP1) and the property p3 (p3ViewInP2)
	 * 
	 * @throws InterruptedException 
	 * @throws RollbackException 
	 */
	@Test
	public void testExecution_sourceRoleEqualTargetRole() throws InterruptedException, RollbackException {
		Connector connector = blockRoot.createOwnedConnector("bindingConnector"); //$NON-NLS-1$
		ConnectorEnd sourceEnd = connector.createEnd();
		sourceEnd.setRole(p3);
		ConnectorEnd targetEnd = connector.createEnd();
		targetEnd.setRole(p3);

		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		InternalTransactionalEditingDomain editingDomain = (InternalTransactionalEditingDomain) TransactionUtil.getEditingDomain(model);
		IElementType type = ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_BINDINGCONNECTOR);
		IEditCommandRequest validRequest = new ConfigureRequest(editingDomain, connector, type);
		
		UpdateNestedPathConnectorEnd createAssociationCommand = new UpdateNestedPathConnectorEnd("UpdateNestedPathConnectorEnd test source", p3ViewInP1, validRequest, true); //$NON-NLS-1$
		Assert.assertTrue("The createAssociationCommand should be executable", createAssociationCommand.canExecute()); //$NON-NLS-1$

		InternalTransaction startTransaction = editingDomain.startTransaction(false, null);
		editingDomain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(createAssociationCommand));
		startTransaction.commit();
		NestedConnectorEnd stereotypeApplication = UMLUtil.getStereotypeApplication(sourceEnd, NestedConnectorEnd.class);
		Assert.assertTrue("The sourceEnd should have a NestedConnectorEnd applied", stereotypeApplication != null);
		
		UpdateNestedPathConnectorEnd createAssociationCommandTarget = new UpdateNestedPathConnectorEnd("UpdateNestedPathConnectorEnd test target", p3ViewInP2, validRequest, false); //$NON-NLS-1$
		Assert.assertTrue("The createAssociationCommand should be executable", createAssociationCommandTarget.canExecute()); //$NON-NLS-1$

		InternalTransaction startTransactionTarget = editingDomain.startTransaction(false, null);
		editingDomain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(createAssociationCommandTarget));
		startTransactionTarget.commit();
		NestedConnectorEnd stereotypeApplicationTarget = UMLUtil.getStereotypeApplication(targetEnd, NestedConnectorEnd.class);
		Assert.assertTrue("The targetEnd should have a NestedConnectorEnd applied", stereotypeApplicationTarget != null); //$NON-NLS-1$
	}

}
