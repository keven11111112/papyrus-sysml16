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

package org.eclipse.papyrus.sysml16.requirements;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementImpl;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class has been implemented in order to calculate derived properties of "Requirement" stereotype see Requirement DerivedProperties Req0010
 *
 */
public class RequirementCustomImpl extends RequirementImpl implements Requirement {

	/**
	 * 16.3.2.1 AbstractRequirement : /master: Requirement [0..1]
	 * This is a derived property that lists the master requirement for this slave requirement. The master attribute is
	 * derived from the supplier of the Copy dependency that has this requirement as the slave.
	 *
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getMaster()
	 *
	 * @return The list of requirements.
	 */
	@Override
	public EList<AbstractRequirement> getMaster() {
		// The Requirement is the supplier of the Copy link between the master Requirements
		// This should return the TestCase verifying current Requirements
		EList<Requirement> masters = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<Dependency> itDep = getBase_Class().getClientDependencies().iterator();

			// Find Copy link
			while (itDep.hasNext()) {
				Dependency currentDep = itDep.next();
				Copy currentCopy = UMLUtil.getStereotypeApplication(currentDep, Copy.class);

				if (currentCopy != null) {
					EList<NamedElement> suppliers = currentCopy.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							masters.add(currentRequirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getAbstractRequirement_Master(), masters.size(), masters.toArray());
	}


	/**
	 * 16.3.2.1 AbstractRequirement : /derived: Requirement [*]
	 * Derived from all requirements that are the client of a «deriveReqt» relationship for which this requirement is a
	 * supplier.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getDerived()
	 *
	 * @return The list of requirements.
	 */
	@Override
	public EList<AbstractRequirement> getDerived() {
		// This should return the Requirement(s) derived from current
		EList<Requirement> derived = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find DeriveReqt link
			while (itDep.hasNext()) {
				DirectedRelationship currentDirectedRelationship = itDep.next();
				DeriveReqt currentDeriveReqt = UMLUtil.getStereotypeApplication(currentDirectedRelationship, DeriveReqt.class);

				if (currentDeriveReqt != null) {
					EList<NamedElement> clients = currentDeriveReqt.getBase_Abstraction().getClients();
					Iterator<NamedElement> it = clients.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							derived.add(currentRequirement);
						}
					}
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getAbstractRequirement_Derived(), derived.size(), derived.toArray());
	}

	/**
	 * 16.3.2.1 AbstractRequirement : /derivedFrom: Requirement [*]
	 * Derived from all requirements that are the supplier of a «deriveReqt» relationship for which this requirement is a
	 * client.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getDerivedFrom()
	 *
	 * @return The list of requirements.
	 */
	@Override
	public EList<AbstractRequirement> getDerivedFrom() {
		// This should return the Requirement(s) this Requirement is derived from
		EList<Requirement> derivedFrom = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getSourceDirectedRelationships().iterator();

			// Find DeriveReqt link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				DeriveReqt currentDeriveReqt = UMLUtil.getStereotypeApplication(currentDRelationship, DeriveReqt.class);

				if (currentDeriveReqt != null) {
					EList<NamedElement> suppliers = currentDeriveReqt.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							derivedFrom.add(currentRequirement);
						}
					}
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getAbstractRequirement_DerivedFrom(), derivedFrom.size(), derivedFrom.toArray());
	}


	/**
	 * 16.3.2.1 AbstractRequirement : /refinedBy: NamedElement [*]
	 * Derived from all elements that are the client of a «refine» relationship for which this requirement is a supplier.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getRefinedBy()
	 *
	 * @return The list of refining NamedElements.
	 */
	@Override
	public EList<NamedElement> getRefinedBy() {
		// This should return the NamedElement(s) that refine current Requirement
		EList<NamedElement> refinedBy = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Refine link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				Refine currentRefine = UMLUtil.getStereotypeApplication(currentDRelationship, Refine.class);

				if (currentRefine != null) {
					refinedBy.addAll(currentRefine.getBase_Abstraction().getClients());
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getAbstractRequirement_RefinedBy(), refinedBy.size(), refinedBy.toArray());
	}



	/**
	 * 16.3.2.1 AbstractRequirement : /satisfiedBy: NamedElement [*]
	 * Derived from all elements that are the client of a «satisfy» relationship for which this requirement is a supplier.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getSatisfiedBy()
	 *
	 * @return the list of statisfying NamedElements.
	 */
	@Override
	public EList<NamedElement> getSatisfiedBy() {
		// This should return the NamedElement(s) that satisfy current Requirement
		EList<NamedElement> satisfyBy = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Satisfy link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				Satisfy currentSatisfy = UMLUtil.getStereotypeApplication(currentDRelationship, Satisfy.class);

				if (currentSatisfy != null) {
					satisfyBy.addAll(currentSatisfy.getBase_Abstraction().getClients());
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getAbstractRequirement_SatisfiedBy(), satisfyBy.size(), satisfyBy.toArray());
	}


	/**
	 * 16.3.2.1 AbstractRequirement : /tracedTo: NamedElement [*]
	 * Derived from all elements that are the supplier of a «trace» relationship for which this requirement is a client.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getTracedTo()
	 *
	 * @return The list of tracing NamedElements.
	 */
	@Override
	public EList<NamedElement> getTracedTo() {
		// This should return the NamedElement(s) traced by current Requirement
		// SysML spec. : Derived from all elements that are the client of a <<trace>> relationship for which this requirement is a supplier.
		EList<NamedElement> tracedTo = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Trace link
			while (itDep.hasNext()) {
				DirectedRelationship currentDR = itDep.next();
				Trace currentTrace = UMLUtil.getStereotypeApplication(currentDR, Trace.class);

				// Must be a Trace not a subtype (see bug #352563).
				if (currentTrace != null && currentTrace.eClass() == RequirementsPackage.eINSTANCE.getTrace()) {
					EList<NamedElement> suppliers = currentTrace.getBase_Abstraction().getClients();
					tracedTo.addAll(suppliers);
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getAbstractRequirement_TracedTo(), tracedTo.size(), tracedTo.toArray());
	}


	/**
	 * 16.3.2.1 AbstractRequirement : /verifiedBy: NamedElement [*]
	 * Derived from all elements that are the client of a «verify» relationship for which this requirement is a supplier.
	 * 
	 * @see org.eclipse.papyrus.sysml16.requirements.internal.impl.AbstractRequirementImpl#getVerifiedBy()
	 *
	 * @return The list of verifying NamedElements.
	 */
	@Override
	public EList<NamedElement> getVerifiedBy() {
		// This should return the list of NamedElement verifying current Requirements
		EList<NamedElement> verifiedBy = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Verify link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				Verify currentVerify = UMLUtil.getStereotypeApplication(currentDRelationship, Verify.class);

				if (currentVerify != null) {
					verifiedBy.addAll(currentVerify.getBase_Abstraction().getClients());
				}
			}
		}
		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getAbstractRequirement_VerifiedBy(), verifiedBy.size(), verifiedBy.toArray());
	}

}
