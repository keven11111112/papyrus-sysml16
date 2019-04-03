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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.sysml16.modelelements.internal.impl.StakeholderImpl;
import org.eclipse.uml2.uml.Comment;

/**
 * 
 *
 */
public class StakeholderCustomImpl extends StakeholderImpl {
	
	
	/**
	 * 7.3.2.6 Stakeholder : The interests of this stakeholder displayed as the body of the comments from concernList.
	 * @see org.eclipse.papyrus.sysml16.modelelements.internal.impl.StakeholderImpl#getConcernList()
	 * @return
	 */
	@Override
	public EList<String> getConcern() {
		EList<String> concern = new BasicEList<>();
		 EList<Comment> commentEList = getConcernList();
		 if (commentEList!=null && !commentEList.isEmpty()){ 
			 for (Comment comment : commentEList) {
				 String body = comment.getBody();
				 if (body != null){
					 concern.add(body); 
				 }		
			}
		 }
		return concern; 
	}
	
}
