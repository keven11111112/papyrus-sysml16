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

package org.eclipse.papyrus.sysml16.service.types.util;

import org.eclipse.gmf.runtime.emf.type.core.ClientContextManager;
import org.eclipse.gmf.runtime.emf.type.core.IClientContext;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditServiceProvider;

/**
 * List all SysML 1.6 element type ids.
 */
public final class SysMLServiceTypeUtil {

	/**
	 * Say if an element is know in the SysML 1.6 context
	 * 
	 * @param elementTypeId
	 * @return
	 */
	public static boolean isKnown(String elementTypeId) {
		IClientContext context = ClientContextManager.getInstance().getClientContext(SYSML16_CONTEXT_ID);
		IElementEditServiceProvider editServiceProvider = ElementEditServiceUtils.getEditServiceProvider(context);
		return editServiceProvider.isKnownElementType(elementTypeId);
	}

	public static final String SYSML16_CONTEXT_ID = "org.eclipse.papyrus.infra.services.edit.TypeContext"; //$NON-NLS-1$
			//"org.eclipse.papyrus.sysml.architecture.SysML16"; //$NON-NLS-1$

	
	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_VALUETYPE = "org.eclipse.papyrus.SysML16.ValueType"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_DISTRIBUTEDPROPERTY = "org.eclipse.papyrus.SysML16.DistributedProperty"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CONNECTORPROPERTY = "org.eclipse.papyrus.SysML16.ConnectorProperty"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_PARTICIPANTPROPERTY = "org.eclipse.papyrus.SysML16.ParticipantProperty"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_BINDINGCONNECTOR = "org.eclipse.papyrus.SysML16.BindingConnector"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_BLOCK = "org.eclipse.papyrus.SysML16.Block"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_PROPERTYSPECIFICTYPE = "org.eclipse.papyrus.SysML16.PropertySpecificType"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_NESTEDCONNECTOREND_CONNECTOREND = "org.eclipse.papyrus.SysML16.NestedConnectorEnd_ConnectorEnd"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_NESTEDCONNECTOREND_ELEMENT = "org.eclipse.papyrus.SysML16.NestedConnectorEnd_Element"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_DIRECTEDRELATIONSHIPPROPERTYPATH = "org.eclipse.papyrus.SysML16.DirectedRelationshipPropertyPath"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ELEMENTPROPERTYPATH = "org.eclipse.papyrus.SysML16.ElementPropertyPath"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ENDPATHMULTIPLICITY = "org.eclipse.papyrus.SysML16.EndPathMultiplicity"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_BOUNDREFERENCE = "org.eclipse.papyrus.SysML16.BoundReference"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ADJUNCTPROPERTY = "org.eclipse.papyrus.SysML16.AdjunctProperty"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CLASSIFIERBEHAVIORPROPERTY = "org.eclipse.papyrus.SysML16.ClassifierBehaviorProperty"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ITEMFLOW = "org.eclipse.papyrus.SysML16.ItemFlow"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_FLOWPROPERTY = "org.eclipse.papyrus.SysML16.FlowProperty"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_FULLPORT = "org.eclipse.papyrus.SysML16.FullPort"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_INTERFACEBLOCK = "org.eclipse.papyrus.SysML16.InterfaceBlock"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_PROXYPORT = "org.eclipse.papyrus.SysML16.ProxyPort"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ACCEPTCHANGESTRUCTURALFEATUREEVENTACTION = "org.eclipse.papyrus.SysML16.AcceptChangeStructuralFeatureEventAction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CHANGESTRUCTURALFEATUREEVENT = "org.eclipse.papyrus.SysML16.ChangeStructuralFeatureEvent"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_DIRECTEDFEATURE = "org.eclipse.papyrus.SysML16.DirectedFeature"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_INVOCATIONONNESTEDPORTACTION_INVOCATIONACTION = "org.eclipse.papyrus.SysML16.InvocationOnNestedPortAction_InvocationAction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_INVOCATIONONNESTEDPORTACTION_ELEMENT = "org.eclipse.papyrus.SysML16.InvocationOnNestedPortAction_Element"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_TRIGGERONNESTEDPORT_TRIGGER = "org.eclipse.papyrus.SysML16.TriggerOnNestedPort_Trigger"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_TRIGGERONNESTEDPORT_ELEMENT = "org.eclipse.papyrus.SysML16.TriggerOnNestedPort_Element"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_OVERWRITE = "org.eclipse.papyrus.SysML16.Overwrite"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CONTROLOPERATOR_BEHAVIOR = "org.eclipse.papyrus.SysML16.ControlOperator_Behavior"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CONTROLOPERATOR_OPERATION = "org.eclipse.papyrus.SysML16.ControlOperator_Operation"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_RATE_ACTIVITYEDGE = "org.eclipse.papyrus.SysML16.Rate_ActivityEdge"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_RATE_PARAMETER = "org.eclipse.papyrus.SysML16.Rate_Parameter"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_NOBUFFER = "org.eclipse.papyrus.SysML16.NoBuffer"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_DISCRETE_ACTIVITYEDGE = "org.eclipse.papyrus.SysML16.Discrete_ActivityEdge"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_DISCRETE_PARAMETER = "org.eclipse.papyrus.SysML16.Discrete_Parameter"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CONTINUOUS_ACTIVITYEDGE = "org.eclipse.papyrus.SysML16.Continuous_ActivityEdge"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CONTINUOUS_PARAMETER = "org.eclipse.papyrus.SysML16.Continuous_Parameter"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_PROBABILITY_ACTIVITYEDGE = "org.eclipse.papyrus.SysML16.Probability_ActivityEdge"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_PROBABILITY_PARAMETERSET = "org.eclipse.papyrus.SysML16.Probability_ParameterSet"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_OPTIONAL = "org.eclipse.papyrus.SysML16.Optional"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_RATIONALE = "org.eclipse.papyrus.SysML16.Rationale"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_VIEW = "org.eclipse.papyrus.SysML16.View"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CONFORM = "org.eclipse.papyrus.SysML16.Conform"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_PROBLEM = "org.eclipse.papyrus.SysML16.Problem"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_VIEWPOINT = "org.eclipse.papyrus.SysML16.Viewpoint"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_STAKEHOLDER = "org.eclipse.papyrus.SysML16.Stakeholder"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_EXPOSE = "org.eclipse.papyrus.SysML16.Expose"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ELEMENTGROUP = "org.eclipse.papyrus.SysML16.ElementGroup"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTBLOCK = "org.eclipse.papyrus.SysML16.ConstraintBlock"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ALLOCATEACTIVITYPARTITION = "org.eclipse.papyrus.SysML16.AllocateActivityPartition"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ALLOCATE_ABSTRACTION = "org.eclipse.papyrus.SysML16.Allocate_Abstraction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ALLOCATE_DIRECTEDRELATIONSHIP = "org.eclipse.papyrus.SysML16.Allocate_DirectedRelationship"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_DERIVEREQT_ABSTRACTION = "org.eclipse.papyrus.SysML16.DeriveReqt_Abstraction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_DERIVEREQT_DIRECTEDRELATIONSHIP = "org.eclipse.papyrus.SysML16.DeriveReqt_DirectedRelationship"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_COPY_ABSTRACTION = "org.eclipse.papyrus.SysML16.Copy_Abstraction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_COPY_DIRECTEDRELATIONSHIP = "org.eclipse.papyrus.SysML16.Copy_DirectedRelationship"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_SATISFY_ABSTRACTION = "org.eclipse.papyrus.SysML16.Satisfy_Abstraction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_SATISFY_DIRECTEDRELATIONSHIP = "org.eclipse.papyrus.SysML16.Satisfy_DirectedRelationship"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_TESTCASE_OPERATION = "org.eclipse.papyrus.SysML16.TestCase_Operation"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_TESTCASE_BEHAVIOR = "org.eclipse.papyrus.SysML16.TestCase_Behavior"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_REQUIREMENT = "org.eclipse.papyrus.SysML16.Requirement"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_VERIFY_ABSTRACTION = "org.eclipse.papyrus.SysML16.Verify_Abstraction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_VERIFY_DIRECTEDRELATIONSHIP = "org.eclipse.papyrus.SysML16.Verify_DirectedRelationship"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_TRACE_ABSTRACTION = "org.eclipse.papyrus.SysML16.Trace_Abstraction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_TRACE_DIRECTEDRELATIONSHIP = "org.eclipse.papyrus.SysML16.Trace_DirectedRelationship"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_REFINE_ABSTRACTION = "org.eclipse.papyrus.SysML16.Refine_Abstraction"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_REFINE_DIRECTEDRELATIONSHIP = "org.eclipse.papyrus.SysML16.Refine_DirectedRelationship"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_FLOWPORT = "org.eclipse.papyrus.SysML16.FlowPort"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_FLOWSPECIFICATION = "org.eclipse.papyrus.SysML16.FlowSpecification"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_UNIT = "org.eclipse.papyrus.SysML16.Unit"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_QUANTITYKIND = "org.eclipse.papyrus.SysML16.QuantityKind"; //$NON-NLS-1$

	// List here the elementype present in the extension element type set

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTPROPERTY = "org.eclipse.papyrus.SysML16.ConstraintProperty"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_REFERENCE = "org.eclipse.papyrus.SysML16.Reference"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_PART = "org.eclipse.papyrus.SysML16.Part"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_VALUE = "org.eclipse.papyrus.SysML16.Value"; //$NON-NLS-1$

	public static final String ORG_ECLIPSE_PAPYRUS_SYSML16_ACTORPART = "org.eclipse.papyrus.SysML16.ActorPart"; //$NON-NLS-1$

	private SysMLServiceTypeUtil() {
	}
}
