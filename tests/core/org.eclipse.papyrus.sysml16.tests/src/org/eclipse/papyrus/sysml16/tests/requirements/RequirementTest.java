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

package org.eclipse.papyrus.sysml16.tests.requirements;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.sysml16.requirements.Requirement;
import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;
import org.eclipse.papyrus.sysml16.requirements.TestCase;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Requirement</b></em>'.
 *
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getDerived() <em>Derived</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getDerivedFrom() <em>Derived From</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getSatéisfiedBy() <em>Satisfied By</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getRefinedBy() <em>Refined By</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getTracedTo() <em>Traced To</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getVerifiedBy() <em>Verified By</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getMaster() <em>Master</em>}</li>
 * </ul>
 * </p>
 *
 * 
 */
public class RequirementTest {

	private Requirement defaultReq = null;

	private Class copy = null;

	private Requirement copyReq = null;

	private Requirement masterReq = null;

	private Class derived1 = null;

	private Class derived2 = null;

	private Requirement derive1Req = null;

	private Requirement derive2Req = null;

	private Requirement derived1Req = null;

	private Requirement derived2Req = null;

	private Class satisfyingNE1 = null;

	private Class satisfyingNE2 = null;

	private Requirement satisfiedReq = null;

	private Class refiningNE1 = null;

	private Class refiningNE2 = null;

	private Requirement refinedReq = null;

	private Class traced1 = null;

	private Class traced2 = null;

	private Requirement traceReq = null;

	private Requirement verifiedReq = null;

	private TestCase testCase1 = null;

	private NamedElement verifierNamedElement = null;

	private TestCase testCase2 = null;

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() {
		// Prepare test
		Model model = SysMLResource.createSysMLModel(new ResourceSetImpl());

		Assert.assertFalse("the SysML profile must be applied.", model.getAppliedProfiles().isEmpty()); //$NON-NLS-1$

		// Create classes & interface
		Class defaultClass = model.createOwnedClass("defaultClass", false); //$NON-NLS-1$

		// Add Requirement stereotypes
		defaultReq = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(defaultClass, RequirementsPackage.eINSTANCE.getRequirement(), null);

		// ////////////////////////////////////////////////////////////////////
		// Prepare getMaster test elements
		// ////////////////////////////////////////////////////////////////////

		Class master = model.createOwnedClass("master", false); //$NON-NLS-1$
		masterReq = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(master, RequirementsPackage.eINSTANCE.getRequirement(), null);
		copy = model.createOwnedClass("copy", false); //$NON-NLS-1$
		copyReq = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(copy, RequirementsPackage.eINSTANCE.getRequirement(), null);

		// Add "copy" (Abstraction) between master and copy
		// copy -> master
		Abstraction copy2Master = UMLFactory.eINSTANCE.createAbstraction();
		copy2Master.getClients().add(copy);
		copy2Master.getSuppliers().add(master);
		model.getPackagedElements().add(copy2Master);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(copy2Master, RequirementsPackage.eINSTANCE.getCopy(), null);

		// ////////////////////////////////////////////////////////////////////

		// ////////////////////////////////////////////////////////////////////
		// Prepare getDerived / getDerivedFrom test elements
		// ////////////////////////////////////////////////////////////////////

		Class derive1 = model.createOwnedClass("d1", false); //$NON-NLS-1$
		derive1Req = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(derive1, RequirementsPackage.eINSTANCE.getRequirement(), null);

		Class derive2 = model.createOwnedClass("d2", false); //$NON-NLS-1$
		derive2Req = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(derive2, RequirementsPackage.eINSTANCE.getRequirement(), null);

		derived1 = model.createOwnedClass("dd1", false); //$NON-NLS-1$
		derived1Req = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(derived1, RequirementsPackage.eINSTANCE.getRequirement(), null);

		derived2 = model.createOwnedClass("dd2", false); //$NON-NLS-1$
		derived2Req = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(derived2, RequirementsPackage.eINSTANCE.getRequirement(), null);

		// Add "DeriveReqt" (Abstraction) between derive and derived
		// derived1 -> derive1, derive2
		// derived2 -> derive2
		Abstraction d11 = UMLFactory.eINSTANCE.createAbstraction();
		d11.getClients().add(derived1);
		d11.getSuppliers().add(derive1);
		model.getPackagedElements().add(d11);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(d11, RequirementsPackage.eINSTANCE.getDeriveReqt(), null);

		Abstraction d12 = UMLFactory.eINSTANCE.createAbstraction();
		d12.getClients().add(derived1);
		d12.getSuppliers().add(derive2);
		model.getPackagedElements().add(d12);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(d12, RequirementsPackage.eINSTANCE.getDeriveReqt(), null);

		Abstraction d22 = UMLFactory.eINSTANCE.createAbstraction();
		d22.getClients().add(derived2);
		d22.getSuppliers().add(derive2);
		model.getPackagedElements().add(d22);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(d22, RequirementsPackage.eINSTANCE.getDeriveReqt(), null);

		// ////////////////////////////////////////////////////////////////////

		// ////////////////////////////////////////////////////////////////////
		// Prepare getSatisfiedBy test elements
		// ////////////////////////////////////////////////////////////////////

		Class satisfied = model.createOwnedClass("satisfied", false); //$NON-NLS-1$
		satisfiedReq = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(satisfied, RequirementsPackage.eINSTANCE.getRequirement(), null);

		satisfyingNE1 = model.createOwnedClass("sNE1", false); //$NON-NLS-1$
		satisfyingNE2 = model.createOwnedClass("sNE2", false); //$NON-NLS-1$

		// Add "Satisfy" (Realization) between satisfyingNE(s) and satisfied
		// requirement
		// satisfyingNE1, satisfyingNE2 -> satisfied
		Realization ne12S1 = UMLFactory.eINSTANCE.createRealization();
		ne12S1.getClients().add(satisfyingNE1);
		ne12S1.getSuppliers().add(satisfied);
		model.getPackagedElements().add(ne12S1);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(ne12S1, RequirementsPackage.eINSTANCE.getSatisfy(), null);

		Realization ne22S1 = UMLFactory.eINSTANCE.createRealization();
		ne22S1.getClients().add(satisfyingNE2);
		ne22S1.getSuppliers().add(satisfied);
		model.getPackagedElements().add(ne22S1);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(ne22S1, RequirementsPackage.eINSTANCE.getSatisfy(), null);

		// ////////////////////////////////////////////////////////////////////

		// ////////////////////////////////////////////////////////////////////
		// Prepare getRefinedBy test elements
		// ////////////////////////////////////////////////////////////////////

		Class refined = model.createOwnedClass("refined", false); //$NON-NLS-1$
		refinedReq = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(refined, RequirementsPackage.eINSTANCE.getRequirement(), null);

		refiningNE1 = model.createOwnedClass("rNE1", false); //$NON-NLS-1$
		refiningNE2 = model.createOwnedClass("rNE2", false); //$NON-NLS-1$

		// Add "Refine" (Abstraction) between refiningNE(s) and refined
		// requirement
		// refiningNE1, refiningNE2 -> refined
		Abstraction rne12S1 = UMLFactory.eINSTANCE.createAbstraction();
		rne12S1.getClients().add(refiningNE1);
		rne12S1.getSuppliers().add(refined);
		model.getPackagedElements().add(rne12S1);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(rne12S1, RequirementsPackage.eINSTANCE.getRefine(), null);

		Abstraction rne22S1 = UMLFactory.eINSTANCE.createAbstraction();
		rne22S1.getClients().add(refiningNE2);
		rne22S1.getSuppliers().add(refined);
		model.getPackagedElements().add(rne22S1);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(rne22S1, RequirementsPackage.eINSTANCE.getRefine(), null);

		// ////////////////////////////////////////////////////////////////////

		// ////////////////////////////////////////////////////////////////////
		// Prepare getTracedTo test elements
		// ////////////////////////////////////////////////////////////////////

		traced1 = model.createOwnedClass("traced1", false); //$NON-NLS-1$
		StereotypeApplicationHelper.getInstance(null).applyStereotype(traced1, RequirementsPackage.eINSTANCE.getRequirement(), null);

		traced2 = model.createOwnedClass("traced2", false); //$NON-NLS-1$
		StereotypeApplicationHelper.getInstance(null).applyStereotype(traced2, RequirementsPackage.eINSTANCE.getRequirement(), null);

		Class trace = model.createOwnedClass("trace", false); //$NON-NLS-1$
		traceReq = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(trace, RequirementsPackage.eINSTANCE.getRequirement(), null);

		// Add "Trace" (Abstraction)
		// [traced1, traced2] -> trace
		Abstraction t11 = UMLFactory.eINSTANCE.createAbstraction();
		t11.getClients().add(traced1);
		t11.getSuppliers().add(trace);
		model.getPackagedElements().add(t11);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(t11, RequirementsPackage.eINSTANCE.getTrace(), null);

		Abstraction t12 = UMLFactory.eINSTANCE.createAbstraction();
		t12.getClients().add(traced2);
		t12.getSuppliers().add(trace);
		model.getPackagedElements().add(t12);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(t12, RequirementsPackage.eINSTANCE.getTrace(), null);

		// ////////////////////////////////////////////////////////////////////

		// ////////////////////////////////////////////////////////////////////
		// Prepare getVerifiedBy test elements
		// ////////////////////////////////////////////////////////////////////

		verifierNamedElement = model.createOwnedClass("verifierNamedElement", false); //$NON-NLS-1$

		Class verified = model.createOwnedClass("verified", false); //$NON-NLS-1$
		verifiedReq = (Requirement) StereotypeApplicationHelper.getInstance(null).applyStereotype(verified, RequirementsPackage.eINSTANCE.getRequirement(), null);

		Class testClass = model.createOwnedClass("testClass", false); //$NON-NLS-1$
		Operation op1 = testClass.createOwnedOperation("op1", null, null, null); //$NON-NLS-1$
		Operation op2 = testClass.createOwnedOperation("op2", null, null, null); //$NON-NLS-1$

		testCase1 = (TestCase) StereotypeApplicationHelper.getInstance(null).applyStereotype(op1, RequirementsPackage.eINSTANCE.getTestCase(), null);
		testCase2 = (TestCase) StereotypeApplicationHelper.getInstance(null).applyStereotype(op2, RequirementsPackage.eINSTANCE.getTestCase(), null);

		// Add "Verify" (Abstraction)
		// testCase1, testCase2 -> verified
		Abstraction t12V = UMLFactory.eINSTANCE.createAbstraction();
		t12V.getClients().add(op1);
		t12V.getSuppliers().add(verified);
		model.getPackagedElements().add(t12V);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(t12V, RequirementsPackage.eINSTANCE.getVerify(), null);

		Abstraction t22V = UMLFactory.eINSTANCE.createAbstraction();
		t22V.getClients().add(op2);
		t22V.getSuppliers().add(verified);
		model.getPackagedElements().add(t22V);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(t22V, RequirementsPackage.eINSTANCE.getVerify(), null);

		// Add "Verify" (Abstraction)
		// verifierNamedElement -> verified
		Abstraction t32V = UMLFactory.eINSTANCE.createAbstraction();
		t32V.getClients().add(verifierNamedElement);
		t32V.getSuppliers().add(verified);
		model.getPackagedElements().add(t32V);
		StereotypeApplicationHelper.getInstance(null).applyStereotype(t32V, RequirementsPackage.eINSTANCE.getVerify(), null);

		// ////////////////////////////////////////////////////////////////////
	}


	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getDerived()
	 * <em>Derived</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement#getDerived()
	 */
	@Test
	public void testGetDerived() {
		Assert.assertTrue("Isolated requirement : default_req.getDerived() = []", defaultReq.getDerived().isEmpty()); //$NON-NLS-1$
		Assert.assertTrue("Verifies : derive1_req.getDerived() = [derived1_req]", derive1Req.getDerived().contains(derived1Req)); //$NON-NLS-1$
		Assert.assertTrue("Verifies : derive2_req.getDerived() = [derived1_req, derived2_req]", derive2Req.getDerived().contains(derived1Req)); //$NON-NLS-1$
		Assert.assertTrue("Verifies : derive2_req.getDerived() = [derived1_req, derived2_req]", derive2Req.getDerived().contains(derived2Req)); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getDerivedFrom()
	 * <em>Derived From</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement#getDerivedFrom()
	 */
	@Test
	public void testGetDerivedFrom() {
		Assert.assertTrue("Isolated requirement : default_req.getDerivedFrom() = []", defaultReq.getDerivedFrom().isEmpty()); //$NON-NLS-1$
		Assert.assertTrue("Verifies : derived2_req.getDerivedFrom() = [derive2_req]", derived2Req.getDerivedFrom().contains(derive2Req)); //$NON-NLS-1$
		Assert.assertTrue("Verifies : derived1_req.getDerivedFrom() = [derive1_req, derive2_req]", derived1Req.getDerivedFrom().contains(derive1Req)); //$NON-NLS-1$
		Assert.assertTrue("Verifies : derived1_req.getDerivedFrom() = [derive1_req, derive2_req]", derived1Req.getDerivedFrom().contains(derive2Req)); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getMaster()
	 * <em>Master</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement#getMaster()
	 */
	@Test
	public void testGetMaster() {
		Assert.assertTrue("Isolated requirement : default_req.getMaster() need to be empty", defaultReq.getMaster().isEmpty()); //$NON-NLS-1$
		Assert.assertEquals("Try retrieving Master from Copy requirement", masterReq, copyReq.getMaster().get(0)); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getRefinedBy()
	 * <em>Refined By</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement#getRefinedBy()
	 */
	@Test
	public void testGetRefinedBy() {
		Assert.assertTrue("Isolated requirement : default_req.getRefinedBy() = []", defaultReq.getRefinedBy().isEmpty()); //$NON-NLS-1$
		Assert.assertTrue("Verifies : refined_req.getRefinedBy() = [refiningNE1, refiningNE2]", refinedReq.getRefinedBy().contains(refiningNE1)); //$NON-NLS-1$
		Assert.assertTrue("Verifies : refined_req.getRefinedBy() = [refiningNE1, refiningNE2]", refinedReq.getRefinedBy().contains(refiningNE2)); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getSatisfiedBy()
	 * <em>Satisfied By</em>}' feature getter.
	 *
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement#getSatisfiedBy()
	 */
	@Test
	public void testGetSatisfiedBy() {
		Assert.assertTrue("Isolated requirement : default_req.getSatisfiedBy() = []", defaultReq.getSatisfiedBy().isEmpty()); //$NON-NLS-1$
		Assert.assertTrue("Verifies : satisfied_req.getSatisfiedBy() = [satisfyingNE1, satisfyingNE2]", satisfiedReq.getSatisfiedBy().contains(satisfyingNE1)); //$NON-NLS-1$
		Assert.assertTrue("Verifies : satisfied_req.getSatisfiedBy() = [satisfyingNE1, satisfyingNE2]", satisfiedReq.getSatisfiedBy().contains(satisfyingNE2)); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getTracedTo()
	 * <em>Traced To</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement#getTracedTo()
	 */
	@Test
	public void testGetTracedTo() {
		Assert.assertTrue("Isolated requirement : default_req.getTracedTo = []", defaultReq.getTracedTo().isEmpty()); //$NON-NLS-1$
		// DeriveReqt / Verify / Copy inherits from Trace
		Assert.assertFalse("Test getter through Copy (should not be taken into account see bug #352563)", masterReq.getTracedTo().contains(copy)); //$NON-NLS-1$
		// Test getter through DeriveReqt (tracedTo = Clients)
		Assert.assertFalse("derived1 -> [derive1_req, derive2_req] (should not be taken into account see bug #352563)", derive1Req.getTracedTo().contains(derived1)); //$NON-NLS-1$
		Assert.assertFalse("derived1 -> [derive1_req, derive2_req] (should not be taken into account see bug #352563)", derive2Req.getTracedTo().contains(derived1)); //$NON-NLS-1$
		Assert.assertFalse("derived2 -> [derive2_req] (should not be taken into account see bug #352563)", derive2Req.getTracedTo().contains(derived2)); //$NON-NLS-1$
		// Should not happen...
		// Direct test
		Assert.assertTrue("Test getter through Verify (should not be taken into account see bug #352563)", traceReq.getTracedTo().contains(traced1)); //$NON-NLS-1$
		Assert.assertTrue("Test getter through Verify (should not be taken into account see bug #352563)", traceReq.getTracedTo().contains(traced2)); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.papyrus.sysml16.requirements.Requirement#getVerifiedBy()
	 * <em>Verified By</em>}' feature getter.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.Requirement#getVerifiedBy()
	 */
	@Test
	public void testGetVerifiedBy() {
		Assert.assertTrue("Isolated requirement : default_req.getVerifiedBy() = []", defaultReq.getVerifiedBy().isEmpty()); //$NON-NLS-1$
		Assert.assertTrue("Test getVerifiedBy getter for [testCase1, testCase2, verifierNamedElement] -> verified_req", verifiedReq.getVerifiedBy().contains(testCase1.getBase_Operation())); //$NON-NLS-1$
		Assert.assertTrue("Test getVerifiedBy getter for [testCase1, testCase2, verifierNamedElement] -> verified_req", verifiedReq.getVerifiedBy().contains(testCase2.getBase_Operation())); //$NON-NLS-1$
		Assert.assertTrue("Test getVerifiedBy getter for [testCase1, testCase2, verifierNamedElement] -> verified_req", verifiedReq.getVerifiedBy().contains(verifierNamedElement)); //$NON-NLS-1$
	}

	/**
	 * Verify that derived attribute is read only (Not present in the official SysML 1.6, hop fully will in SysML 1.5)
	 * This is required to have a working copy paste in Papyrus
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testReadOnlyDerived() {
		EReference derivedEReference = RequirementsPackage.eINSTANCE.getAbstractRequirement_Derived();
		defaultReq.eSet(derivedEReference, ""); //$NON-NLS-1$
	}


}
