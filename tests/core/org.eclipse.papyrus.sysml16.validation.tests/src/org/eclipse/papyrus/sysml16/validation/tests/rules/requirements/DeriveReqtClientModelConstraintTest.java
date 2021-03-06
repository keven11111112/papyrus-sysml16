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

package org.eclipse.papyrus.sysml16.validation.tests.rules.requirements;

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
import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.papyrus.sysml16.validation.Activator;
import org.eclipse.papyrus.sysml16.validation.internal.utils.DiagnosticUtil;
import org.eclipse.papyrus.uml.service.validation.internal.UMLDiagnostician;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test on DeriveReqt Client constraint
 *
 */
@SuppressWarnings("nls")
public class DeriveReqtClientModelConstraintTest {

	public static final String CONSTRAINT_ID = "constraint.derivereqt.client";

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

		Class clientRequirement = model.createOwnedClass("ClientRequirement", false);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(clientRequirement, RequirementsPackage.eINSTANCE.getRequirement(), null);
		Abstraction deriveReqtValid = UMLFactory.eINSTANCE.createAbstraction();
		model.getPackagedElements().add(deriveReqtValid);
		deriveReqtValid.getClients().add(clientRequirement);
		deriveReqtValid.getSuppliers().add(model.createOwnedClass("uselessSupplier1", false));
		StereotypeApplicationHelper.getInstance(null).applyStereotype(deriveReqtValid, RequirementsPackage.eINSTANCE.getDeriveReqt(), null);

		Class clientClass = model.createOwnedClass("ClientClass", false);
		Abstraction deriveReqtInvalid = UMLFactory.eINSTANCE.createAbstraction();
		model.getPackagedElements().add(deriveReqtInvalid);
		deriveReqtInvalid.getClients().add(clientClass);
		deriveReqtInvalid.getSuppliers().add(model.createOwnedClass("uselessSupplier2", false));
		StereotypeApplicationHelper.getInstance(null).applyStereotype(deriveReqtInvalid, RequirementsPackage.eINSTANCE.getDeriveReqt(), null);

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

		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should not trigger an issue for this use case ", 0, DiagnosticUtil.filterDiagnosticsByElement(constraintDiagnosticList, deriveReqtValid).size());
		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should trigger an issue for this use case ", 1, DiagnosticUtil.filterDiagnosticsByElement(constraintDiagnosticList, deriveReqtInvalid).size());
	}
}
