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

package org.eclipse.papyrus.sysml16.architecture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.architecture.commands.IModelCreationCommand;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * The Class CreateSysMLModelCommand.
 */
public class CreateSysML16ModelCommand extends ModelCreationCommandBase implements IModelCreationCommand {

	/**
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#createRootElement()
	 *
	 * @return
	 */

	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	/**
	 * A standard SysML model should have : - the SysML profile applied - the UML standard profile applied - the UML primitive library imported - the SysML library imported
	 * 
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#initializeModel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param owner
	 */

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		Package packageOwner = (Package) owner;

		// Retrieve SysML profile and apply with Sub-profile
		Profile sysml = (Profile) PackageUtil.loadPackage(URI.createURI(SysMLResource.PROFILE_PATH), owner.eResource().getResourceSet());
		if (sysml != null) {
			PackageUtil.applyProfile(packageOwner, sysml, true);
		}

		Profile standardUMLProfile = (Profile) PackageUtil.loadPackage(URI.createURI(UMLResource.STANDARD_PROFILE_URI), owner.eResource().getResourceSet());
		if (standardUMLProfile != null) {
			PackageUtil.applyProfile(packageOwner, standardUMLProfile, true);
		}

		Package umlPrimitiveTypes = PackageUtil.loadPackage(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), owner.eResource().getResourceSet());
		if (umlPrimitiveTypes != null) {
			PackageImport pi = UMLFactory.eINSTANCE.createPackageImport();
			pi.setImportedPackage(umlPrimitiveTypes);
			packageOwner.getPackageImports().add(pi);
		}

		Package sysmlLibrary = PackageUtil.loadPackage(URI.createURI(SysMLResource.LIBRARY_PATH), owner.eResource().getResourceSet());
		if (sysmlLibrary != null) {
			PackageImport pi = UMLFactory.eINSTANCE.createPackageImport();
			pi.setImportedPackage(sysmlLibrary);
			packageOwner.getPackageImports().add(pi);
		}

	}

}
