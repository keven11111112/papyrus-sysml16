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

package org.eclipse.papyrus.sysml16.service.types.tests;

import java.util.Map;

import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.eclipse.papyrus.sysml16.service.types.util.SysMLServiceTypeUtil;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * This class is to check any change in the SysML 1.6 element type id
 * (since the ids can be used a specialization they are part of public API)
 *
 */
@SuppressWarnings("nls")
public class SysML16ElementTypesTest {

	@BeforeClass
	public static void loadSysML16Defintion() {
		ElementTypeSetConfigurationRegistry instance = ElementTypeSetConfigurationRegistry.getInstance();
		Map<String, Map<String, ElementTypeSetConfiguration>> elementTypeSetConfigurations = instance.getElementTypeSetConfigurations();
		Map<String, ElementTypeSetConfiguration> map = elementTypeSetConfigurations.get(SysMLServiceTypeUtil.SYSML16_CONTEXT_ID);
		ElementTypeSetConfiguration elementTypeSetConfiguration = map.get("org.eclipse.papyrus.sysml16.service.types.elementTypeSet"); //$NON-NLS-1$
		Assert.assertNotNull("The SysML 1.6 element type set definition is missing", elementTypeSetConfiguration); //$NON-NLS-1$
	}

    @Test
	public void testRegistryContentForAcceptChangeStructuralFeatureEventAction() {
		Assert.assertTrue("AcceptChangeStructuralFeatureEventAction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.AcceptChangeStructuralFeatureEventAction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForAdjunctProperty() {
		Assert.assertTrue("AdjunctProperty element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.AdjunctProperty")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForAllocateActivityPartition() {
		Assert.assertTrue("AllocateActivityPartition element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.AllocateActivityPartition")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForAllocateAbstraction() {
		Assert.assertTrue("Allocate Abstraction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Allocate_Abstraction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForAllocateDirectedRelationship() {
		Assert.assertTrue("Allocate DirectedRelationship element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Allocate_DirectedRelationship")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForBindingConnector() {
		Assert.assertTrue("BindingConnector element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.BindingConnector")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForBlock() {
		Assert.assertTrue("Block element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Block")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForBoundReference() {
		Assert.assertTrue("BoundReference element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.BoundReference")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForChangeStructuralFeatureEvent() {
		Assert.assertTrue("ChangeStructuralFeatureEvent element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ChangeStructuralFeatureEvent")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForClassifierBehaviorProperty() {
		Assert.assertTrue("ClassifierBehaviorProperty element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ClassifierBehaviorProperty")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForConform() {
		Assert.assertTrue("Conform element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Conform")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForConnectorProperty() {
		Assert.assertTrue("ConnectorProperty element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ConnectorProperty")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForConstraintBlock() {
		Assert.assertTrue("ConstraintBlock element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ConstraintBlock")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForContinuousActivityEdge() {
		Assert.assertTrue("Continuous ActivityEdge element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Continuous_ActivityEdge")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForContinuousObjectNode() {
		Assert.assertTrue("Continuous ObjectNode element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Continuous_ObjectNode")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForContinuousParameter() {
		Assert.assertTrue("Continuous Parameter element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Continuous_Parameter")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForControlOperatorBehavior() {
		Assert.assertTrue("ControlOperator Behavior element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ControlOperator_Behavior")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForControlOperatorOperation() {
		Assert.assertTrue("ControlOperator Operation element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ControlOperator_Operation")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForCopyAbstraction() {
		Assert.assertTrue("Copy Abstraction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Copy_Abstraction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForCopyDirectedRelationship() {
		Assert.assertTrue("Copy DirectedRelationship element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Copy_DirectedRelationship")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForDeriveReqtAbstraction() {
		Assert.assertTrue("DeriveReqt Abstraction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.DeriveReqt_Abstraction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForDeriveReqtDirectedRelationship() {
		Assert.assertTrue("DeriveReqt DirectedRelationship element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.DeriveReqt_DirectedRelationship")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForDirectedFeature() {
		Assert.assertTrue("DirectedFeature element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.DirectedFeature")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForDirectedRelationshipPropertyPath() {
		Assert.assertTrue("DirectedRelationshipPropertyPath element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.DirectedRelationshipPropertyPath")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForDiscreteActivityEdge() {
		Assert.assertTrue("Discrete ActivityEdge element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Discrete_ActivityEdge")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForDiscreteObjectNode() {
		Assert.assertTrue("Discrete ObjectNode element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Discrete_ObjectNode")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForDiscreteParameter() {
		Assert.assertTrue("Discrete Parameter element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Discrete_Parameter")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForDistributedProperty() {
		Assert.assertTrue("DistributedProperty element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.DistributedProperty")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForElementGroup() {
		Assert.assertTrue("ElementGroup element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ElementGroup")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForElementPropertyPath() {
		Assert.assertTrue("ElementPropertyPath element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ElementPropertyPath")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForEndPathMultiplicity() {
		Assert.assertTrue("EndPathMultiplicity element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.EndPathMultiplicity")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForExpose() {
		Assert.assertTrue("Expose element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Expose")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForFlowPort() {
		Assert.assertTrue("FlowPort element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.FlowPort")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForFlowProperty() {
		Assert.assertTrue("FlowProperty element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.FlowProperty")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForFlowSpecification() {
		Assert.assertTrue("FlowSpecification element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.FlowSpecification")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForFullPort() {
		Assert.assertTrue("FullPort element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.FullPort")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForInterfaceBlock() {
		Assert.assertTrue("InterfaceBlock element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.InterfaceBlock")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForInvocationOnNestedPortActionElement() {
		Assert.assertTrue("InvocationOnNestedPortAction Element element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.InvocationOnNestedPortAction_Element")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForInvocationOnNestedPortActionInvocationAction() {
		Assert.assertTrue("InvocationOnNestedPortAction InvocationAction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.InvocationOnNestedPortAction_InvocationAction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForItemFlow() {
		Assert.assertTrue("ItemFlow element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ItemFlow")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForNestedConnectorEndConnectorEnd() {
		Assert.assertTrue("NestedConnectorEnd ConnectorEnd element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.NestedConnectorEnd_ConnectorEnd")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForNestedConnectorEndElement() {
		Assert.assertTrue("NestedConnectorEnd Element element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.NestedConnectorEnd_Element")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForNoBuffer() {
		Assert.assertTrue("NoBuffer element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.NoBuffer")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForOptional() {
		Assert.assertTrue("Optional element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Optional")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForOverwrite() {
		Assert.assertTrue("Overwrite element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Overwrite")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForParticipantProperty() {
		Assert.assertTrue("ParticipantProperty element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ParticipantProperty")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForProbabilityActivityEdge() {
		Assert.assertTrue("Probability ActivityEdge element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Probability_ActivityEdge")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForProbabilityParameterSet() {
		Assert.assertTrue("Probability ParameterSet element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Probability_ParameterSet")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForProblem() {
		Assert.assertTrue("Problem element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Problem")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForPropertySpecificType() {
		Assert.assertTrue("PropertySpecificType element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.PropertySpecificType")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForProxyPort() {
		Assert.assertTrue("ProxyPort element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ProxyPort")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForRateActivityEdge() {
		Assert.assertTrue("Rate ActivityEdge element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Rate_ActivityEdge")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForRateObjectNode() {
		Assert.assertTrue("Rate ObjectNode element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Rate_ObjectNode")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForRateParameter() {
		Assert.assertTrue("Rate Parameter element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Rate_Parameter")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForRationale() {
		Assert.assertTrue("Rationale element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Rationale")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForRefineAbstraction() {
		Assert.assertTrue("Refine Abstraction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Refine_Abstraction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForRefineDirectedRelationship() {
		Assert.assertTrue("Refine DirectedRelationship element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Refine_DirectedRelationship")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForRequirement() {
		Assert.assertTrue("Requirement element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Requirement")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForSatisfyAbstraction() {
		Assert.assertTrue("Satisfy Abstraction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Satisfy_Abstraction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForSatisfyDirectedRelationship() {
		Assert.assertTrue("Satisfy DirectedRelationship element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Satisfy_DirectedRelationship")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForStakeholder() {
		Assert.assertTrue("Stakeholder element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Stakeholder")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForTestCaseBehavior() {
		Assert.assertTrue("TestCase Behavior element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.TestCase_Behavior")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForTestCaseOperation() {
		Assert.assertTrue("TestCase Operation element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.TestCase_Operation")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForTraceAbstraction() {
		Assert.assertTrue("Trace Abstraction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Trace_Abstraction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForTraceDirectedRelationship() {
		Assert.assertTrue("Trace DirectedRelationship element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Trace_DirectedRelationship")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForTriggerOnNestedPortElement() {
		Assert.assertTrue("TriggerOnNestedPort Element element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.TriggerOnNestedPort_Element")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForTriggerOnNestedPortTrigger() {
		Assert.assertTrue("TriggerOnNestedPort Trigger element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.TriggerOnNestedPort_Trigger")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForValueType() {
		Assert.assertTrue("ValueType element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.ValueType")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForVerifyAbstraction() {
		Assert.assertTrue("Verify Abstraction element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Verify_Abstraction")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForVerifyDirectedRelationship() {
		Assert.assertTrue("Verify DirectedRelationship element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Verify_DirectedRelationship")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForView() {
		Assert.assertTrue("View element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.View")); //$NON-NLS-1$ //$NON-NLS-2$
	}

    @Test
	public void testRegistryContentForViewpoint() {
		Assert.assertTrue("Viewpoint element type not found in SysML element type set ", SysMLServiceTypeUtil.isKnown("org.eclipse.papyrus.SysML16.Viewpoint")); //$NON-NLS-1$ //$NON-NLS-2$
	}



}
