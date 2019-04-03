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

package org.eclipse.papyrus.sysml16.edit.provider;

/**
 * Interfaces which has to be implemented by Root AdapterFactory
 */
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

public interface IRootAdapterFactory {

	/**
	 * Give back the itemProvider which correspond to the given EClass In this
	 * prog : used to get back the UML ItemProvider of the EClass
	 *
	 * @param eClass
	 * @return
	 */
	ItemProviderAdapter getItemProvider(EClass eClass);
}
