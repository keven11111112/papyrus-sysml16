/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.sysml16.all.tests;

import org.eclipse.papyrus.sysml16.architecture.tests.resources.ArchitectureValidationTest;
import org.eclipse.papyrus.sysml16.architecture.tests.util.SysML16ArchitectureUtilTest;
import org.eclipse.papyrus.sysml16.diagram.common.tests.resources.SysML16ClassDiagramElementTypesExtensionTest;
import org.eclipse.papyrus.sysml16.diagram.common.tests.resources.SysML16CompositeDiagramElementTypesExtensionTest;
import org.eclipse.papyrus.sysml16.diagram.common.tests.resources.SysMLDiUMLTest;
import org.eclipse.papyrus.sysml16.diagram.common.tests.util.GraphicalSysMLServiceTypeUtilTest;
import org.eclipse.papyrus.sysml16.edit.tests.requirements.provider.RequirementItemProviderTest;
import org.eclipse.papyrus.sysml16.nattable.allocation.tests.resources.AllocationNattableTest;
import org.eclipse.papyrus.sysml16.nattable.requirement.tests.resources.RequirementNattableTest;
import org.eclipse.papyrus.sysml16.service.types.tests.PrivatePackageImportTest;
import org.eclipse.papyrus.sysml16.service.types.tests.SharedAssociationTest;
import org.eclipse.papyrus.sysml16.service.types.tests.SysML16ElementTypesExtensionTest;
import org.eclipse.papyrus.sysml16.service.types.tests.SysML16ElementTypesTest;
import org.eclipse.papyrus.sysml16.service.types.tests.advice.ConformCreationEditHelperAdviceTest;
import org.eclipse.papyrus.sysml16.service.types.tests.advice.ConformReorientEditHelperAdviceTest;
import org.eclipse.papyrus.sysml16.service.types.tests.advice.DirectedRelationshipPropertyPathEditHelperAdviceTest;
import org.eclipse.papyrus.sysml16.service.types.tests.command.CreateAssociationCommandTest;
import org.eclipse.papyrus.sysml16.service.types.tests.command.UpdateNestedPathConnectorEndTest;
import org.eclipse.papyrus.sysml16.service.types.tests.util.ConnectorUtilTest;
import org.eclipse.papyrus.sysml16.service.types.tests.util.SysMLServiceTypeUtilTest;
import org.eclipse.papyrus.sysml16.tests.SysmlProfileTest;
import org.eclipse.papyrus.sysml16.tests.blocks.BlockTest;
import org.eclipse.papyrus.sysml16.tests.blocks.BoundReferenceTest;
import org.eclipse.papyrus.sysml16.tests.constraintblocks.ConstraintBlockTest;
import org.eclipse.papyrus.sysml16.tests.deprecatedelements.FlowPortTest;
import org.eclipse.papyrus.sysml16.tests.deprecatedelements.FlowSpecificationTest;
import org.eclipse.papyrus.sysml16.tests.library.QUDVTest;
import org.eclipse.papyrus.sysml16.tests.library.SysMLStandardLibraryTest;
import org.eclipse.papyrus.sysml16.tests.modelelements.ElementGroupTest;
import org.eclipse.papyrus.sysml16.tests.modelelements.StakeholderTest;
import org.eclipse.papyrus.sysml16.tests.modelelements.ViewPointTest;
import org.eclipse.papyrus.sysml16.tests.modelelements.ViewTest;
import org.eclipse.papyrus.sysml16.tests.portsandflows.FlowPropertyTest;
import org.eclipse.papyrus.sysml16.tests.requirements.RequirementTest;
import org.eclipse.papyrus.sysml16.tests.resources.ModelValidationTest;
import org.eclipse.papyrus.sysml16.tests.resources.ProfileValidationTest;
import org.eclipse.papyrus.sysml16.tests.util.DeprecatedElementUtilTest;
import org.eclipse.papyrus.sysml16.tests.util.SysmlResourceTest;
import org.eclipse.papyrus.sysml16.ui.tests.images.SysmlProfileImageTest;
import org.eclipse.papyrus.sysml16.ui.tests.resources.ExpressionValidationTest;
import org.eclipse.papyrus.sysml16.ui.tests.resources.NewChildMenuTest;
import org.eclipse.papyrus.sysml16.ui.tests.resources.PaletteIconIdTest;
import org.eclipse.papyrus.sysml16.validation.tests.ocl.RequirementIdTest;
import org.eclipse.papyrus.sysml16.validation.tests.ocl.RequirementTextTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.activities.DiscreteNoContinuousModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.activities.NoBufferNoOverwriteModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.activities.OptionalMultiplicityModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.activities.OverwriteNoNoBufferModelConstraintModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.activities.RateParameterIsStreamModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.allocations.AllocateOneClientSupplierModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.AssociationBlockModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.BindingConnectorSameEndsTypeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.BlockPropertyCompositeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.BlockPropertyNoNameModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.BlockSpecializationModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ClassifierBehaviorPropertyIsCompositeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ClassifierBehaviorPropertyOnBlockModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ClassifierBehaviorPropertyTypedByModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ConnectorPropertyOnlyCompositeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ConnectorPropertyOnlyOnBlockModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ConnectorPropertyReferOwnedConnectorModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ConnectorPropertySameNameModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ConnectorPropertyTypedByAssociationBlockModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.DistributedPropertyTypedByModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.EndPathMultiplicityNotNegativeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ParticipantPropertyEndMultiplicityModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ParticipantPropertyNoAssociationMemberEndsModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ParticipantPropertyOnlyAssociationBlockModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ParticipantPropertyOnlyNoneAggregationModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ParticipantPropertySameEndModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.ParticipantPropertySameTypeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.PropertySpecificTypeMissingNameModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.blocks.PropertySpecificTypeUniquePropertyModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.modelelements.ConformGeneralClassifierViewpointModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.modelelements.ConformSpecificClassifierViewModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.modelelements.ExposeClientStereotypedByViewModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.modelelements.ViewSingleViewpointModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.modelelements.ViewpointOwnedViewModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.FlowPropertyTypedByModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.FullPortNotBehavioralModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.FullPortNotProxyPortModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.InterfaceBlockNoBehaviorConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.InterfaceBlockNoCompositePropertyModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.InterfaceBlockPortTypeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.ProxyPortForceInnerProxyPortModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.ProxyPortNotFullPortModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.portsandflows.ProxyPortTypedByInterfaceBlockModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.CopyBetweenRequirementsModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.CopyReadOnlyModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.DeriveReqtClientModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.DeriveReqtSupplierModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.RefineOneClientSupplierModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.RequirementEmptyOwnedAttributeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.RequirementEmptyOwnedOperationModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.RequirementNestedRequirementModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.RequirementNoAssociationModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.RequirementNoGeneralizationModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.RequirementNotTypeModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.SatisfySupplierModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.TestCaseParameterVerdictKindModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.TraceDependencyModelConstraintTest;
import org.eclipse.papyrus.sysml16.validation.tests.rules.requirements.VerifySupplierModelConstraintTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		// org.eclipse.papyrus.sysml16.tests
		SysmlProfileTest.class,
		BlockTest.class,
		BoundReferenceTest.class,
		ConstraintBlockTest.class,
		FlowPortTest.class,
		FlowSpecificationTest.class,
		QUDVTest.class,
		SysMLStandardLibraryTest.class,
		ElementGroupTest.class,
		StakeholderTest.class,
		ViewPointTest.class,
		ViewTest.class,
		FlowPropertyTest.class,
		RequirementTest.class,
		ModelValidationTest.class,
		ProfileValidationTest.class,
		DeprecatedElementUtilTest.class,
		SysmlResourceTest.class,

		// org.eclipse.papyrus.sysml16.edit.tests
		RequirementItemProviderTest.class,

		// org.eclipse.papyrus.sysml16.service.types.tests
		PrivatePackageImportTest.class,
		SharedAssociationTest.class,
		SysML16ElementTypesExtensionTest.class,
		SysML16ElementTypesTest.class,
		ConformCreationEditHelperAdviceTest.class,
		ConformReorientEditHelperAdviceTest.class,
		DirectedRelationshipPropertyPathEditHelperAdviceTest.class,
		CreateAssociationCommandTest.class,
		UpdateNestedPathConnectorEndTest.class,
		ConnectorUtilTest.class,
		SysMLServiceTypeUtilTest.class,

		// org.eclipse.papyrus.sysml16.architecture.tests
		ArchitectureValidationTest.class,
		org.eclipse.papyrus.sysml16.architecture.tests.resources.ModelValidationTest.class,
		SysML16ArchitectureUtilTest.class,

		// org.eclipse.papyrus.ui.tests
		SysmlProfileImageTest.class,
		ExpressionValidationTest.class,
		org.eclipse.papyrus.sysml16.ui.tests.resources.ModelValidationTest.class,
		NewChildMenuTest.class,
		PaletteIconIdTest.class,

		// org.eclipse.papyrus.sysml.common.tests
		SysML16ClassDiagramElementTypesExtensionTest.class,
		SysML16CompositeDiagramElementTypesExtensionTest.class,
		SysMLDiUMLTest.class,
		GraphicalSysMLServiceTypeUtilTest.class,

		// org.eclipse.papyrus.sysml.blockdefinition.tests
		org.eclipse.papyrus.sysml16.diagram.blockdefinition.tests.resources.ModelValidationTest.class,

		// org.eclipse.papyrus.sysml.internalblock.tests
		org.eclipse.papyrus.sysml16.diagram.internalblock.tests.resources.ModelValidationTest.class,

		// org.eclipse.papyrus.sysml.parametric.tests
		org.eclipse.papyrus.sysml16.diagram.parametric.tests.resources.ModelValidationTest.class,

		// org.eclipse.papyrus.sysml.requirement.tests
		org.eclipse.papyrus.sysml16.diagram.requirement.tests.resources.ModelValidationTest.class,

		// org.eclipse.papyrus.sysml16.nattable.allocation.tests
		AllocationNattableTest.class,

		// org.eclipse.papyrus.sysml16.nattable.requirement.tests
		RequirementNattableTest.class,

		// org.eclipse.papyrus.sysml16.validation.tests
		RequirementIdTest.class,
		RequirementTextTest.class,
		DiscreteNoContinuousModelConstraintTest.class,
		NoBufferNoOverwriteModelConstraintTest.class,
		OptionalMultiplicityModelConstraintTest.class,
		OverwriteNoNoBufferModelConstraintModelConstraintTest.class,
		RateParameterIsStreamModelConstraintTest.class,
		AllocateOneClientSupplierModelConstraintTest.class,
		AssociationBlockModelConstraintTest.class,
		BindingConnectorSameEndsTypeModelConstraintTest.class,
		BlockPropertyCompositeModelConstraintTest.class,
		BlockPropertyNoNameModelConstraintTest.class,
		BlockSpecializationModelConstraintTest.class,
		ClassifierBehaviorPropertyIsCompositeModelConstraintTest.class,
		ClassifierBehaviorPropertyOnBlockModelConstraintTest.class,
		ClassifierBehaviorPropertyTypedByModelConstraintTest.class,
		ConnectorPropertyOnlyCompositeModelConstraintTest.class,
		ConnectorPropertyOnlyOnBlockModelConstraintTest.class,
		ConnectorPropertyReferOwnedConnectorModelConstraintTest.class,
		ConnectorPropertySameNameModelConstraintTest.class,
		ConnectorPropertyTypedByAssociationBlockModelConstraintTest.class,
		DistributedPropertyTypedByModelConstraintTest.class,
		EndPathMultiplicityNotNegativeModelConstraintTest.class,
		ParticipantPropertyEndMultiplicityModelConstraintTest.class,
		ParticipantPropertyNoAssociationMemberEndsModelConstraintTest.class,
		ParticipantPropertyOnlyAssociationBlockModelConstraintTest.class,
		ParticipantPropertyOnlyNoneAggregationModelConstraintTest.class,
		ParticipantPropertySameEndModelConstraintTest.class,
		ParticipantPropertySameTypeModelConstraintTest.class,
		PropertySpecificTypeMissingNameModelConstraintTest.class,
		PropertySpecificTypeUniquePropertyModelConstraintTest.class,
		ConformGeneralClassifierViewpointModelConstraintTest.class,
		ConformSpecificClassifierViewModelConstraintTest.class,
		ExposeClientStereotypedByViewModelConstraintTest.class,
		ViewpointOwnedViewModelConstraintTest.class,
		ViewSingleViewpointModelConstraintTest.class,
		FlowPropertyTypedByModelConstraintTest.class,
		FullPortNotBehavioralModelConstraintTest.class,
		FullPortNotProxyPortModelConstraintTest.class,
		InterfaceBlockNoBehaviorConstraintTest.class,
		InterfaceBlockNoCompositePropertyModelConstraintTest.class,
		InterfaceBlockPortTypeModelConstraintTest.class,
		ProxyPortForceInnerProxyPortModelConstraintTest.class,
		ProxyPortNotFullPortModelConstraintTest.class,
		ProxyPortTypedByInterfaceBlockModelConstraintTest.class,
		CopyBetweenRequirementsModelConstraintTest.class,
		CopyReadOnlyModelConstraintTest.class,
		DeriveReqtClientModelConstraintTest.class,
		DeriveReqtSupplierModelConstraintTest.class,
		RefineOneClientSupplierModelConstraintTest.class,
		RequirementEmptyOwnedAttributeModelConstraintTest.class,
		RequirementEmptyOwnedOperationModelConstraintTest.class,
		RequirementNestedRequirementModelConstraintTest.class,
		RequirementNoAssociationModelConstraintTest.class,
		RequirementNoGeneralizationModelConstraintTest.class,
		RequirementNotTypeModelConstraintTest.class,
		SatisfySupplierModelConstraintTest.class,
		TestCaseParameterVerdictKindModelConstraintTest.class,
		TraceDependencyModelConstraintTest.class,
		VerifySupplierModelConstraintTest.class,
})
public class AllTests {
}