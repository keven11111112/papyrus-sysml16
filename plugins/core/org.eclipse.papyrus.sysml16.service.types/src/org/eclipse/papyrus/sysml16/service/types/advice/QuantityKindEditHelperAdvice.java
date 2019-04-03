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

package org.eclipse.papyrus.sysml16.service.types.advice;



import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.papyrus.sysml16.service.types.command.InstanceSpecificationWithSlotConfigureElementCommand;
import org.eclipse.papyrus.sysml16.util.QUDVUtil;
import org.eclipse.uml2.uml.Classifier;

/**
 * The helperadvice class used for QuantityKind.
 *  - Init the type of the instance specification
 *  - create all slot corresponding to quantityKind attributes
 */
public class QuantityKindEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getBeforeConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getBeforeConfigureCommand(ConfigureRequest request) {
		Classifier quantityKindClassifier = QUDVUtil.getClassifierByNameSpaceFromQUDV(QUDVUtil.UNIT_AND_QUANTITY_KIND, QUDVUtil.QUANTITY_KIND);		
		return new InstanceSpecificationWithSlotConfigureElementCommand(request,quantityKindClassifier);
	}

}
