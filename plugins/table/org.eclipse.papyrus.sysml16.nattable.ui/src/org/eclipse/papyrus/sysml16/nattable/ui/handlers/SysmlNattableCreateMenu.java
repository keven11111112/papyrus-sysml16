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

package org.eclipse.papyrus.sysml16.nattable.ui.handlers;

import org.eclipse.papyrus.infra.nattable.utils.NattableWidgetPropertyTester;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

/**
 * Menu contributions for the creation of Sysml elements from the Nattable editor
 */
public class SysmlNattableCreateMenu extends AbstractCreateSysmlChildMenu {

	private static NattableWidgetPropertyTester tester = new NattableWidgetPropertyTester();

	@Override
	public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {
		IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if (tester.test(part, NattableWidgetPropertyTester.IS_NATTABLE_WIDGET, null, Boolean.TRUE)) {
			super.createContributionItems(serviceLocator, additions);
		}
	}
}
