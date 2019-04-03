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

package org.eclipse.papyrus.sysml16.modelelements;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.profile.standard.Create;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 
 *
 */
public class ViewpointCustomImpl extends ViewpointImpl {

	/**
	 * 7.3.2.8 Viewpoint : /method: Behavior [*] The behavior is derived from the method of the operation with the Create stereotype.
	 * 
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getMethod()
	 * @return
	 */
	@Override
	public EList<Behavior> getMethod() {
		EList<Behavior> behaviorEList = new BasicEList<>();
		Class clazz = getBase_Class();
		if (clazz != null) {
			EList<Operation> operations = clazz.getOperations();
			if (operations != null){
				Iterator<Operation> it = operations.iterator();

				while (it.hasNext()) {
					Operation operation = it.next();
					Create create = UMLUtil.getStereotypeApplication(operation, Create.class);
					if (create != null) {
						behaviorEList.addAll(operation.getMethods());
						break;
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, ModelElementsPackage.eINSTANCE.getViewpoint_Method(), behaviorEList.size(), behaviorEList.toArray());
	}

	/**
	 * 7.3.2.8 Viewpoint : /concern: String [*] The interest of the stakeholders displayed as the body of the comments from concernList.
	 * 
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.ViewpointImpl#getConcern()
	 *
	 * @return
	 */
	@Override
	public EList<String> getConcern() {
		EList<String> concernEList = new BasicEList<>();
		EList<Comment> theConcernList = getConcernList();
		for (Comment comment : theConcernList) {
			String body = comment.getBody();
			if (body != null && !"".equals(body)){//$NON-NLS-1$
				concernEList.add(body);
			}				
		}
		return concernEList;
	}

}
