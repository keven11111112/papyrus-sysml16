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

package org.eclipse.papyrus.sysml16.ui.template;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.sysml16.ui.Activator;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.papyrus.uml.diagram.wizards.transformation.IGenerator;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.PackageImport;

/**
 * Utility class to provide QUDV in the new model wizard
 */
public class ImportSysMLQUDVLibraryInModel implements IGenerator {

	private ModelSet modelSet;

	private org.eclipse.uml2.uml.Package root;

	private org.eclipse.uml2.uml.Package qudv;

	@Override
	public void execute() {

		// Get its resource
		Resource umlResource = UmlUtils.getUmlModel(modelSet).getResource();

		// Select the root element to add the wanted imports
		root = (org.eclipse.uml2.uml.Package) umlResource.getContents().get(0);

		URI qudvURI = URI.createURI(SysMLResource.QUDV_LIBRARY_PATH).appendFragment(SysMLResource.QUDV_LIBRARY_ROOT_ID);
		qudv = (org.eclipse.uml2.uml.Package) modelSet.getEObject(qudvURI, true);

		// Creates the import packages at the root of the model (elements of type packageImport)
		this.getCommandStack(modelSet).execute(new RecordingCommand(modelSet.getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				PackageImport importPrimitivePack = root.createPackageImport(qudv);
				if (!root.getPackageImports().contains(importPrimitivePack)) {
					root.getPackageImports().add(importPrimitivePack);
				}

				try {
					root.eResource().save(Collections.emptyMap());
				} catch (IOException e) {
					Activator.getLogHelper().error(e);
				}
			}
		});

	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.wizards.transformation.IGenerator#setModelSet(org.eclipse.papyrus.uml.diagram.wizards.transformation.ModelSet)
	 *
	 * @param modelSet
	 */
	@Override
	public void setModelSet(ModelSet modelSet) {
		this.modelSet = modelSet;
	}

	protected final CommandStack getCommandStack(ModelSet modelSet) {
		return modelSet.getTransactionalEditingDomain().getCommandStack();
	}

	public ModelSet getModelSet() {
		return this.modelSet;
	}

}
