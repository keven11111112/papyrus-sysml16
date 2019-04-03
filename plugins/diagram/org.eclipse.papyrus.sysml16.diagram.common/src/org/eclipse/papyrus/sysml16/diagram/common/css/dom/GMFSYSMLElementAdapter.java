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

package org.eclipse.papyrus.sysml16.diagram.common.css.dom;



import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.css.dom.GMFElementAdapter;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.ExtendedCSSEngine;
import org.eclipse.papyrus.infra.tools.util.ListHelper;
import org.eclipse.papyrus.sysml16.diagram.common.css.helper.CSSDOMSYSMLSemanticElementHelper;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.papyrus.sysml16.util.DeprecatedElementUtil;
import org.eclipse.papyrus.uml.diagram.common.stereotype.display.helper.StereotypeDisplayConstant;
import org.eclipse.papyrus.uml.diagram.common.stereotype.display.helper.StereotypeDisplayUtil;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

/**
 * DOM Element Adapter for SYSML Elements
 *
 * Supports applied stereotypes and stereotype properties
 */
public class GMFSYSMLElementAdapter extends GMFElementAdapter {


	/**
	 * Name of the CSS Simple Selector to match on the Stereotype Compartment Shape
	 */
	private static final String STEREOTYPE_COMMENT = "StereotypeComment"; //$NON-NLS-1$

	/** The stereotype helper. */
	public final StereotypeDisplayUtil stereotypeHelper = StereotypeDisplayUtil.getInstance();

	/** The Constant IS_CONSTRAINT. */
	private static final String IS_CONSTRAINT = "isConstraint"; //$NON-NLS-1$

	/** The Constant IS_PART. */
	private static final String IS_PART = "isPart"; //$NON-NLS-1$

	/** The Constant IS_REFERENCE. */
	private static final String IS_REFERENCE = "isReference"; //$NON-NLS-1$

	/** The Constant APPLIED_STEREOTYPES_PROPERTY. */
	public static final String APPLIED_STEREOTYPES_PROPERTY = "appliedStereotypes"; //$NON-NLS-1$

	/** The Constant TYPE_APPLIED_STEREOTYPES_PROPERTY */
	private static final String TYPE_APPLIED_STEREOTYPES_PROPERTY = "typeAppliedStereotypes"; //$NON-NLS-1$

	/** The Constant DEPRECATED. */
	public static final String DEPRECATED = "deprecated"; //$NON-NLS-1$

	/** The Constant IS_ABSTRACT. */
	private static final String IS_ABSTRACT = "isAbstract"; //$NON-NLS-1$

	/** The Constant IS_TIME_EVENT_ACTION. */
	private static final String IS_TIME_EVENT_ACTION_PROPERTY = "isTimeEventAction"; //$NON-NLS-1$

	/** The Constant IS_FRAMEZABLE. */
	public static final String IS_FRAME = "isFrame"; //$NON-NLS-1$

	/**
	 * The CSS Separator for qualifiers, when we must use CSS ID
	 * When we can use CSS String, we use the standard UML "::" qualifier separator
	 *
	 * NOTE: Separator "__" does not work
	 */
	public static final String QUALIFIER_SEPARATOR = "--"; //$NON-NLS-1$

	public GMFSYSMLElementAdapter(View view, ExtendedCSSEngine engine) {
		super(view, engine);
		helper = CSSDOMSYSMLSemanticElementHelper.getInstance();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Applied Stereotypes are manipulated as DOM Attributes
	 */
	@Override
	protected String doGetAttribute(String attr) {
		String parentValue = super.doGetAttribute(attr);
		if (parentValue != null) {
			return parentValue;
		}

		// This is present only for performance issues
		// isAbstract isn't a SysML feature but will be called many time for UML
		// and is very slow to answer (Check : L172)
		if (IS_ABSTRACT.equals(attr)) {
			return null;
		}

		// get stereotype Label attribute
		if (stereotypeHelper.isStereotypeLabel(semanticElement)) {
			String value = getStereotypeLabelAttribute(attr);
			if (value != null && !value.isEmpty()) {
				return value;
			}
		}

		// get stereotype Compartment attribute
		if (stereotypeHelper.isStereotypeCompartment(semanticElement) || stereotypeHelper.isStereotypeBrace(semanticElement)) {
			String value = getStereotypeCompartmentAttribute(attr);
			if (value != null && !value.isEmpty()) {
				return value;
			}
		}

		// get stereotype Property attribute
		if (stereotypeHelper.isStereotypeProperty(semanticElement) || stereotypeHelper.isStereotypeBraceProperty(semanticElement)) {
			String value = getStereotypePropertyAttribute(attr);
			if (value != null && !value.isEmpty()) {
				return value;
			}
		}

		if (semanticElement instanceof Element) {
			// Applied stereotypes
			Element currentElement = (Element) semanticElement;

			// IMPORTANT set the faster test first
			if (DEPRECATED.equals(attr)) {
				return String.valueOf(DeprecatedElementUtil.isDeprecatedElement(semanticElement));
			}
			boolean isProperty = semanticElement instanceof Property;
			// manage of isConstraint=true attribute for Property
			if (IS_CONSTRAINT.equals(attr) && isProperty) {
				IElementMatcher constraint = ((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTPROPERTY)).getMatcher();
				return String.valueOf(constraint.matches((Property) semanticElement));
			}
			// manage of isPart=true attribute for Property
			if (IS_PART.equals(attr) && isProperty) {
				IElementMatcher part = ((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_PART)).getMatcher();
				return String.valueOf(part.matches((Property) semanticElement));
			}
			// manage of isReference=true attribute for Property
			if (IS_REFERENCE.equals(attr) && isProperty) {
				IElementMatcher reference = ((ISpecializationType) ElementTypeRegistry.getInstance().getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML16_REFERENCE)).getMatcher();
				return String.valueOf(reference.matches((Property) semanticElement));
			}


			// Get applied STereotypes Attributes
			if (APPLIED_STEREOTYPES_PROPERTY.equals(attr)) {
				List<String> appliedStereotypes = new LinkedList<String>();
				for (Stereotype stereotype : currentElement.getAppliedStereotypes()) {
					appliedStereotypes.add(stereotype.getName());
					appliedStereotypes.add(stereotype.getQualifiedName());
				}
				if (!appliedStereotypes.isEmpty()) {
					return ListHelper.deepToString(appliedStereotypes, CSS_VALUES_SEPARATOR);
				}
				return null;
			}

			if (TYPE_APPLIED_STEREOTYPES_PROPERTY.equals(attr) && semanticElement instanceof TypedElement) {
				Type type = ((TypedElement) semanticElement).getType();
				if (type != null) {
					List<String> appliedStereotypes = new LinkedList<>();
					for (Stereotype stereotype : type.getAppliedStereotypes()) {
						appliedStereotypes.add(stereotype.getName());
						appliedStereotypes.add(stereotype.getQualifiedName());
					}

					if (!appliedStereotypes.isEmpty()) {
						return ListHelper.deepToString(appliedStereotypes, CSS_VALUES_SEPARATOR);
					}
				}
			}

			for (EObject stereotypeApplication : currentElement.getStereotypeApplications()) {
				EStructuralFeature feature = stereotypeApplication.eClass().getEStructuralFeature(attr);
				if (feature != null) {
					if (feature.isMany()) {
						List<?> values = (List<?>) stereotypeApplication.eGet(feature);
						List<String> cssValues = new LinkedList<String>();
						for (Object value : values) {
							cssValues.add(getCSSValue(feature, value));
						}
						return ListHelper.deepToString(cssValues, CSS_VALUES_SEPARATOR);
					} else {
						Object value = stereotypeApplication.eGet(feature);
						return getCSSValue(feature, value);
					}
				}
				return null;
			}

			if (attr.contains(QUALIFIER_SEPARATOR)) {
				List<String> qualifiers = ListHelper.asList(attr.split(QUALIFIER_SEPARATOR)); // Writable list
				String propertyName = qualifiers.remove(qualifiers.size() - 1); // Last element is the property name
				// Remaining strings can be used to build the Stereotype's qualified name
				String stereotypeName = ListHelper.deepToString(qualifiers, "::"); //$NON-NLS-1$
				Stereotype appliedStereotype = currentElement.getAppliedStereotype(stereotypeName);
				if (appliedStereotype != null) {
					EObject stereotypeApplication = currentElement.getStereotypeApplication(appliedStereotype);
					EStructuralFeature feature = stereotypeApplication.eClass().getEStructuralFeature(propertyName);
					if (feature != null) {
						Object value = stereotypeApplication.eGet(feature);
						return getCSSValue(feature, value);
					}
				}
			}
			// manage of isTimeEventAction=true attribute for AcceptEventAction
			if (IS_TIME_EVENT_ACTION_PROPERTY.equals(attr)) {
				if (semanticElement instanceof AcceptEventAction) {
					return String.valueOf(isAcceptTimeEventAction((AcceptEventAction) semanticElement));
				}
			}
			// manage of isFraezable=true attribute for displaying header/frame
			if (IS_FRAME.equals(attr)) {
				if (notationElement.eContainer() == notationElement.getDiagram()) {
					return String.valueOf(true);
				} else {
					return String.valueOf(false);
				}
			}
		}
		return null;
	}


	/**
	 * Retrieve the Matching String Value for the StereotypeCompartment Element
	 *
	 * @param attr
	 *            Attribute of the String to match with
	 * @return The matching value for this Attribute
	 */
	protected String getStereotypeCompartmentAttribute(String attr) {
		if (StereotypeDisplayConstant.STEREOTYPE_COMPARTMENT_NAME.equals(attr)) {
			BasicCompartment propertyCompartment = (BasicCompartment) semanticElement;
			return stereotypeHelper.getName(propertyCompartment);
		}
		return "";//$NON-NLS-1$
	}

	/**
	 * Retrieve the Matching String Value for the StereotypeCompartment Element
	 *
	 * @param attr
	 *            Attribute of the String to match with
	 * @return The matching value for this Attribute
	 */
	protected String getStereotypePropertyAttribute(String attr) {
		// CSS can match property level
		if (StereotypeDisplayConstant.STEREOTYPE_PROPERTY_NAME.equals(attr)) {
			DecorationNode propertyLabel = (DecorationNode) semanticElement;
			if (propertyLabel.getElement() instanceof Property) {
				Property prop = (Property) propertyLabel.getElement();
				return prop.getName();
			}
			// CSS can match Container Name
		} else if (StereotypeDisplayConstant.STEREOTYPE_COMPARTMENT_NAME.equals(attr)) {
			EObject propertyCompartment = ((DecorationNode) semanticElement).eContainer();
			if (stereotypeHelper.isStereotypeCompartment(propertyCompartment)) {

				return stereotypeHelper.getName((DecorationNode) propertyCompartment);
			}

		}
		return "";//$NON-NLS-1$
	}

	/**
	 * Get the matching Value of the Attribute
	 *
	 * @param attr
	 *            Attribute of the String to match with
	 * @return The matching value for this Attribute
	 */
	protected String getStereotypeLabelAttribute(String attr) {
		if (StereotypeDisplayConstant.STEREOTYPE_LABEL_NAME.equals(attr)) {
			DecorationNode label = (DecorationNode) semanticElement;
			return stereotypeHelper.getName(label);
		}

		if (KIND.equals(attr) && stereotypeHelper.isStereotypeLabel(semanticElement)) {
			return StereotypeDisplayConstant.STEREOTYPE_LABEL_TYPE;
		}
		return null;
	}

	@Override
	protected String getCSSValue(EStructuralFeature feature, Object value) {
		if (feature instanceof EReference && value instanceof NamedElement) {
			String name = ((NamedElement) value).getName();
			return name == null || name.isEmpty() ? EMPTY_VALUE : name; // Bug 467716: Never return null or empty string if the value is not null
		}
		return super.getCSSValue(feature, value);
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.css.dom.GMFElementAdapter#getLocalName()
	 *
	 * @return The Local name for the CSS matching.
	 */
	@Override
	public String getLocalName() {
		// In case of StereotypeComment type, the selector should match on the Stereotype Comment.
		if (localName == null && stereotypeHelper.isStereotypeComment(getNotationElement())) {
			return STEREOTYPE_COMMENT;
		}
		return super.getLocalName();
	}

	/**
	 * Checks if is accept time event action.
	 *
	 * @param action
	 *            the action
	 * @return true, if is accept time event action
	 */
	public boolean isAcceptTimeEventAction(AcceptEventAction action) {
		boolean hasTimeEvent = false;
		boolean hasOthersTriggers = false;
		// Get triggers
		if (action.getTriggers() != null) {
			for (Trigger trigger : action.getTriggers()) {
				if (trigger != null) {
					Event event = trigger.getEvent();
					if (event instanceof TimeEvent) {
						hasTimeEvent = true;
					} else {
						hasOthersTriggers = true;
					}
				}
			}
		}
		// only time events have been encountered.
		return hasTimeEvent && !hasOthersTriggers;
	}

}
