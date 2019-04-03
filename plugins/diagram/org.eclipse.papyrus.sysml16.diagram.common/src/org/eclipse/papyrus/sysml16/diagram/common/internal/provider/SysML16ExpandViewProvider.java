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

package org.eclipse.papyrus.sysml16.diagram.common.internal.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateChildViewOperation;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDescriptionLanguage;
import org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.AbstractRepresentation;
import org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.Representation;
import org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.providers.ExpandViewProvider;
import org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.rendering.ChildrenListRepresentation;
import org.eclipse.papyrus.infra.types.ElementTypeConfiguration;
import org.eclipse.papyrus.infra.types.MetamodelTypeConfiguration;
import org.eclipse.papyrus.infra.types.SpecializationTypeConfiguration;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;
import org.eclipse.papyrus.uml.diagram.common.actions.ShowHideContentsAction;

/**
 * Class created for bug 528773. This ViewProvider works only on diagrams described in the sysml16.architecture file
 * (see method {@link #isAllowedLanguage(CreateChildViewOperation)}) .
 * 
 * This View Provider has been defined to find the view to create by the {@link ShowHideContentsAction}.
 * This action has a generic behavior, creating {@link ViewDescriptor} with a semanticHint=null. Its work fine with generated diagram,
 * but not compartment defined by the expansion model.
 * 
 * So This ViewProvider cross the expansion model to be able to find the semanticHint of the view to create according to the compartment, when the semanticHint exists.
 */
public class SysML16ExpandViewProvider extends ExpandViewProvider {

	/**
	 * The name of the language on which works this ViewProvider
	 */
	private static final String SYSML_16 = "SysML 1.6"; //$NON-NLS-1$

	/**
	 * 
	 * @param operation
	 *            a create child view operation
	 * @return
	 *         <code>true</code> if the current diagram comes from the description language dedicated to SysML 1.6
	 */
	private boolean isAllowedLanguage(final CreateChildViewOperation operation) {
		final View currentView = operation.getContainerView();
		if (null != currentView) {
			final Diagram diagram = currentView.getDiagram();
			final ViewPrototype viewPrototype = org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils.getPrototype(diagram);
			if (null != viewPrototype) {
				final PapyrusRepresentationKind kind = viewPrototype.getRepresentationKind();
				if (null != kind && null != kind.getLanguage()) {
					final ArchitectureDescriptionLanguage language = kind.getLanguage();
					return isAllowedLanguage(language.getName());
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param language
	 *            a language
	 * @return
	 *         <code>true</code> if the current language is allowed
	 */
	protected boolean isAllowedLanguage(final String language) {
		return SYSML_16.equals(language);
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.providers.ExpandViewProvider#getNodeGraphicalType(org.eclipse.core.runtime.IAdaptable, org.eclipse.gmf.runtime.notation.View, java.lang.String)
	 *
	 * @param semanticAdapter
	 * @param containerView
	 * @param semanticHint
	 * @return
	 */
	@Override
	protected String getNodeGraphicalType(final IAdaptable semanticAdapter, final View containerView, final String semanticHint) {
		if (null == semanticHint) {
			final String currentDiagramType = getDiagramType(containerView);
			final String containerType = containerView.getType();
			final List<String> possibleChildrenIDs = this.diagramExpansionRegistry.mapChildreen.get(currentDiagramType).parentChildrenRelation.get(containerType);

			if (possibleChildrenIDs != null) {
				final List<String> supportedChildrenIDs = new ArrayList<>();
				for (final String currentChildId : possibleChildrenIDs) {
					final ChildrenListRepresentation childrenListRepresentation = this.diagramExpansionRegistry.mapChildreen.get(currentDiagramType);
					final AbstractRepresentation answer = childrenListRepresentation.IDMap.get(currentChildId);
					if (answer instanceof Representation) {
						ElementTypeConfiguration elementTypeConfiguration = ((Representation) answer).getGraphicalElementTypeRef();
						List<MetamodelTypeConfiguration> res = getSupportedMetamodelTypeConfiguration(semanticAdapter, elementTypeConfiguration);
						if (!res.isEmpty()) {
							supportedChildrenIDs.add(currentChildId);
						}
					}
				}

				if (supportedChildrenIDs.size() == 1) {// other case not yet supported, we are waiting concrete case to continue implementationS
					return supportedChildrenIDs.get(0);
				}
			}

		}
		return null;// not super because the super return a value !=null even when the element is not supported for the compartment
	}

	/**
	 * 
	 * @param semanticAdapter
	 *            the semantic adapter for the element we would like to be able to create in a compartment
	 * @param elementTypeConfiguration
	 *            an element type configuration
	 * @return
	 *         <code>true</code> if the elementTypeConfiguration is defined on a type (or a subtype) of the current element we are trying to create.
	 */
	private List<MetamodelTypeConfiguration> getSupportedMetamodelTypeConfiguration(final IAdaptable semanticAdapter, final ElementTypeConfiguration elementTypeConfiguration) {
		final List<MetamodelTypeConfiguration> metamodelTypeConfiguration = new ArrayList<>();
		if (elementTypeConfiguration instanceof MetamodelTypeConfiguration) {
			final MetamodelTypeConfiguration mtc = (MetamodelTypeConfiguration) elementTypeConfiguration;
			final EClass metamodelEClass = mtc.getEClass();
			if (null != metamodelEClass) {
				final EObject currentEObject = semanticAdapter.getAdapter(EObject.class);
				if (metamodelEClass.isInstance(currentEObject)) {
					metamodelTypeConfiguration.add((MetamodelTypeConfiguration) elementTypeConfiguration);
				}
			}
		} else if (elementTypeConfiguration instanceof SpecializationTypeConfiguration) {
			final SpecializationTypeConfiguration stc = (SpecializationTypeConfiguration) elementTypeConfiguration;
			final List<ElementTypeConfiguration> specialiedTypes = stc.getSpecializedTypes();
			for (final ElementTypeConfiguration current : specialiedTypes) {
				final List<MetamodelTypeConfiguration> result = getSupportedMetamodelTypeConfiguration(semanticAdapter, current);
				metamodelTypeConfiguration.addAll(result);
			}
		}
		return metamodelTypeConfiguration;
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.providers.ExpandViewProvider#providesFromExpansionModel(org.eclipse.gmf.runtime.diagram.core.services.view.CreateChildViewOperation)
	 *
	 * @param operation
	 * @return
	 */
	@Override
	protected boolean providesFromExpansionModel(final CreateChildViewOperation operation) {
		boolean result = false;
		final String semanticHint = operation.getSemanticHint();
		if (isAllowedLanguage(operation) && (null == semanticHint || semanticHint.isEmpty())) {
			result = null != getNodeGraphicalType(operation.getSemanticAdapter(), operation.getContainerView(), semanticHint);
		}
		return result;
	}


}
