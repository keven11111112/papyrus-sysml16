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

package org.eclipse.papyrus.sysml16.validation.tests.rules.activities;

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
import org.eclipse.papyrus.sysml16.activities.ActivitiesPackage;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.papyrus.sysml16.validation.Activator;
import org.eclipse.papyrus.sysml16.validation.internal.utils.DiagnosticUtil;
import org.eclipse.papyrus.uml.service.validation.internal.UMLDiagnostician;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test on RequirementId constraint
 *
 */
@SuppressWarnings("nls")
public class DiscreteNoContinuousModelConstraintTest {

	public static final String CONSTRAINT_ID = "constraint.discrete.nocontinuous";

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
		Activity activity = UMLFactory.eINSTANCE.createActivity();
		activity.setPackage(model);
		Parameter validParameter = activity.createOwnedParameter("validParameter", null);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(validParameter, ActivitiesPackage.eINSTANCE.getDiscrete(), null);

		Parameter invalidParameter = activity.createOwnedParameter("invalidParameter", null);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(invalidParameter, ActivitiesPackage.eINSTANCE.getDiscrete(), null);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(invalidParameter, ActivitiesPackage.eINSTANCE.getContinuous(), null);

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

		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should not trigger an issue for this use case ", 0, DiagnosticUtil.filterDiagnosticsByElement(constraintDiagnosticList, validParameter).size());
		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should trigger an issue for this use case ", 1, DiagnosticUtil.filterDiagnosticsByElement(constraintDiagnosticList, invalidParameter).size());
	}
}
