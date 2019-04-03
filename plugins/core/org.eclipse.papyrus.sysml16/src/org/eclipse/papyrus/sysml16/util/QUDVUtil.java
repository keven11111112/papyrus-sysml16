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

package org.eclipse.papyrus.sysml16.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * @author Benoit Maggi
 *
 */
public final class QUDVUtil {

	public static final String UNIT_AND_QUANTITY_KIND = "UnitAndQuantityKind"; //$NON-NLS-1$

	public static final String QUANTITY_KIND = "QuantityKind"; //$NON-NLS-1$
	
	public static final String UNIT = "Unit"; //$NON-NLS-1$
	
	/** Avoid instantiation for utility class */
	private QUDVUtil() {
	}	
	/**
	 * Return the classifier in QUDV from the namspace
	 * Ex : getClassifierByNameSpaceFromQUDV("UnitAndQuantityKind","Unit") to get Unit Classifier
	 * @param resource
	 * @param packageName
	 * @param classifierName
	 * @return
	 */
	public static Classifier getClassifierByNameSpaceFromQUDV(String packageName, String classifierName) {
		URI createURI = URI.createURI(SysMLResource.LIBRARY_PATH);
		Resource res = new ResourceSetImpl().getResource(createURI,true);
		return getClassifierByNameSpace(res, packageName, classifierName);
	}	
	
	// TODO : this method should be provided as API in an upper level (already exist ?)
	public static Classifier getClassifierByNameSpace(Resource resource, String packageName, String classifierName) {
		EList<EObject> contents = resource.getContents();
		for (EObject eObject : contents) {
			if (eObject instanceof Package){
				Package pkg = (Package) eObject;	
				PackageableElement packagedElement2 = pkg.getPackagedElement(packageName);
				return (Classifier) ((Package) packagedElement2).getPackagedElement(classifierName);
			}
		}
		return null;
	}	
	
}
