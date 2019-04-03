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

package org.eclipse.papyrus.sysml16.validation.quickfix;

import java.util.Optional;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.core.util.CrossReferenceAdapter;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Provide the list of specific solutions for problems related to SysML 1.6.
 */
public class SysMLMarkerResolutionGenerator implements IMarkerResolutionGenerator {

	public IMarkerResolution[] getResolutions(IMarker mk) {
		try {

			Object source = mk.getAttribute("source");
			if (source instanceof String) {
				switch ((String) source) {
				case "org.eclipse.papyrus.sysml16.validation.constraint.discrete.nocontinuous": // See DiscreteNoContinuousModelConstraint
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Element>("Unapply stereotype Continuous", element -> element.unapplyStereotype(element.getAppliedStereotype("SysML::Activities::Continuous"))),
							new ConsumerElementMarkerResolution<Element>("Unapply stereotype Discrete", element -> element.unapplyStereotype(element.getAppliedStereotype("SysML::Activities::Discrete"))),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.requirement.emptyownedattribute":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Element>("Remove all attributes from Requirement", element -> element.getOwnedElements().forEach(Element::destroy)),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.verify.supplier":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Element>("Delete element", Element::destroy),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.rate.parameterisstream":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Parameter>("Set stream to true", parameter -> parameter.setIsStream(true)),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.block.specialization":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Element>("Apply Block stereotype", element -> element.applyStereotype(element.getApplicableStereotype("SysML::Blocks::Block"))),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.propertyspecifictype.missingname":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Classifier>("Empty classifier name", classifier -> classifier.setName(null)),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.requirement.nogeneralization":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Class>("Destroy the generalisation", clazz -> clazz.getGeneralizations().forEach(Element::destroy)),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.connectorproperty.onlyonblock":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Property>("Apply Block stereotype on owner", property -> property.getOwner().applyStereotype(property.getOwner().getApplicableStereotype("SysML::Blocks::Block"))),
					};

				case "org.eclipse.papyrus.sysml16.validation.constraint.requirement.notype":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<org.eclipse.uml2.uml.Class>("Remove type",
									clazz -> {
										CrossReferenceAdapter crossReferenceAdapter = CrossReferenceAdapter.getCrossReferenceAdapter(TransactionUtil.getEditingDomain(clazz).getResourceSet());
										Set<?> inverseReferencers = crossReferenceAdapter.getInverseReferencers(clazz, UMLPackage.eINSTANCE.getTypedElement_Type(), null);
										if (inverseReferencers != null && !inverseReferencers.isEmpty()) {
											for (Object object : inverseReferencers) {
												if (object instanceof Property) {
													((Property) object).setType(null);
												}
											}
										}
									}),
							new ConsumerElementMarkerResolution<org.eclipse.uml2.uml.Class>("Unapply stereotype Requirement", clazz -> clazz.unapplyStereotype(clazz.getAppliedStereotype("SysML::Requirements::Requirement"))),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.distributedproperty.typedby":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Property>("Apply Block stereotype on owner",
									property -> Optional.ofNullable(property.getOwner().getApplicableStereotype("SysML::Blocks::Block")).ifPresent(applicableStereotype -> property.getOwner().applyStereotype(applicableStereotype))),
							new ConsumerElementMarkerResolution<Property>("Apply ValueType stereotype on owner",
									property -> Optional.ofNullable(property.getOwner().getApplicableStereotype("SysML::Blocks::ValueType")).ifPresent(applicableStereotype -> property.getOwner().applyStereotype(applicableStereotype))),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.viewpoint.ownedview":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<org.eclipse.uml2.uml.Class>("Create View operation", clazz -> {
								Operation operation = clazz.createOwnedOperation("View", null, null);
								operation.applyStereotype(operation.getApplicableStereotype("StandardProfile::Create"));
							}),
					};
				case "org.eclipse.papyrus.sysml16.validation.constraint.block.property.asssociationend":
					return new IMarkerResolution[] {
							new ConsumerElementMarkerResolution<Property>("Create association for Property",
									property -> {
										Association association = UMLFactory.eINSTANCE.createAssociation();
										association.setPackage(property.getNearestPackage());
										association.getMemberEnds().add(property);
										Property targetProperty = UMLFactory.eINSTANCE.createProperty();
										targetProperty.setType(property.getClass_());
										association.getOwnedEnds().add(targetProperty);
										association.getMemberEnds().add(targetProperty);
										property.setAggregation(AggregationKind.COMPOSITE_LITERAL);
									}),
					};
				default:
					// TODO: when most quick fixes are done set a logger
					// mk.getAttributes().forEach((k, v) -> System.out.println("(" + k + " , " + v + ")"));
					break;
				}
			}
		} catch (CoreException e) { // missing source of error => no resolution available
			return new IMarkerResolution[0];
		}
		return new IMarkerResolution[0];
	}
}