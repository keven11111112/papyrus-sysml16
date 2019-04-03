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

package org.eclipse.papyrus.sysml16.validation.tests.rules.blocks;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransaction;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.papyrus.sysml16.validation.Activator;
import org.eclipse.papyrus.sysml16.validation.internal.utils.DiagnosticUtil;
import org.eclipse.papyrus.uml.service.validation.internal.UMLDiagnostician;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test on CONSTRAINT_ID
 *
 */
@SuppressWarnings("nls")
public class BindingConnectorSameEndsTypeModelConstraintTest {

	public static final String CONSTRAINT_ID = "constraint.bindingconnector.sameendstype";

	/**
	 * Test method for the constraint
	 * 
	 * @throws InterruptedException
	 * @throws RollbackException
	 */
	@Test
	public void checkRuleValidation() throws InterruptedException, RollbackException {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Model model = SysMLResource.createSysMLModel(resourceSet);
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty());

		Class clazz = model.createOwnedClass("Class", false);
		Class clazz2 = model.createOwnedClass("Class2", false);
		Property sameType1 = clazz.createOwnedAttribute("sameType", clazz);
		Property sameType2 = clazz.createOwnedAttribute("sameType", clazz);
		Property differentType = clazz.createOwnedAttribute("differentType", clazz2);

		Connector validBindingConnector = clazz.createOwnedConnector("validBindingConnector");
		StereotypeApplicationHelper.getInstance(null).applyStereotype(validBindingConnector, BlocksPackage.eINSTANCE.getBindingConnector(), null);

		// Add source connector end
		ConnectorEnd connectorEndSameType1 = UMLFactory.eINSTANCE.createConnectorEnd();
		connectorEndSameType1.setRole(sameType1);
		ConnectorEnd connectorEndSameType2 = UMLFactory.eINSTANCE.createConnectorEnd();
		connectorEndSameType2.setRole(sameType2);
		validBindingConnector.getEnds().add(connectorEndSameType1);
		validBindingConnector.getEnds().add(connectorEndSameType2);

		Connector invalidBindingConnector = clazz.createOwnedConnector("invalidBindingConnector");
		StereotypeApplicationHelper.getInstance(null).applyStereotype(invalidBindingConnector, BlocksPackage.eINSTANCE.getBindingConnector(), null);
		ConnectorEnd connectorEndDifferentType = UMLFactory.eINSTANCE.createConnectorEnd();
		connectorEndDifferentType.setRole(differentType);
		invalidBindingConnector.getEnds().add(connectorEndSameType1);
		invalidBindingConnector.getEnds().add(connectorEndDifferentType);

		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		InternalTransactionalEditingDomain editingDomain = (InternalTransactionalEditingDomain) TransactionUtil.getEditingDomain(model);
		final ValidateModelCommand validateModelCommand = new ValidateModelCommand(model, new UMLDiagnostician());

		InternalTransaction startTransaction = editingDomain.startTransaction(false, null);
		editingDomain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(validateModelCommand));
		startTransaction.commit();
		// check that the constraint exist
		ConstraintRegistry instance = ConstraintRegistry.getInstance();
		IConstraintDescriptor descriptor = instance.getDescriptor(Activator.PLUGIN_ID, CONSTRAINT_ID);
		Assert.assertNotNull("Constraint is missing " + CONSTRAINT_ID, descriptor);

		List<Diagnostic> constraintDiagnosticList = DiagnosticUtil.findDiagnosticBySource(validateModelCommand.getDiagnostic(), Activator.PLUGIN_ID + "." + CONSTRAINT_ID);

		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should not trigger an issue for this use case ", 0, DiagnosticUtil.filterDiagnosticsByElement(constraintDiagnosticList, validBindingConnector).size());
		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should trigger an issue for this use case ", 1, DiagnosticUtil.filterDiagnosticsByElement(constraintDiagnosticList, invalidBindingConnector).size());
	}
}
