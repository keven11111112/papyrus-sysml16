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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test on CONSTRAINT_ID constraint
 *
 */
@SuppressWarnings("nls")
public class RequirementNestedRequirementModelConstraintTest {

	public static final String CONSTRAINT_ID = "constraint.requirement.nestedrequirement";

	/**
	 * Test method for {@link org.eclipse.papyrus.sysml16.service.types.command.SetNestedPathCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)}.
	 * 
	 * @throws InterruptedException
	 * @throws RollbackException
	 */
	@Test
	public void checkRuleValidation() throws InterruptedException, RollbackException {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Model model = SysMLResource.createSysMLModel(resourceSet);
		Assert.assertFalse("the SysML profil must be applied.", model.getAppliedProfiles().isEmpty());

		Class valid = model.createOwnedClass("valid", false);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(valid, RequirementsPackage.eINSTANCE.getRequirement(), null);
		Classifier validNestedRequirement = valid.createNestedClassifier("validNestedClassifier", valid.eClass());
		StereotypeApplicationHelper.getInstance(null).applyStereotype(validNestedRequirement, RequirementsPackage.eINSTANCE.getRequirement(), null);

		Class invalid = model.createOwnedClass("invalid", false);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(invalid, RequirementsPackage.eINSTANCE.getRequirement(), null);
		invalid.createNestedClassifier("invalidNestedClassifier", invalid.eClass());

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

		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should not trigger an issue for this requirement", 0, DiagnosticUtil.filterDiagnosticsByElement(constraintDiagnosticList, valid).size());
		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should trigger an issue for this requirement", 1, DiagnosticUtil.filterDiagnosticsByElement(constraintDiagnosticList, invalid).size());
	}
}
