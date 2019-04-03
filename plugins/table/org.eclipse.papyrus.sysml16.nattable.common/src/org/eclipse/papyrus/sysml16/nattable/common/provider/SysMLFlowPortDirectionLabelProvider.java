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

package org.eclipse.papyrus.sysml16.nattable.common.provider;

import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.nattable.utils.Constants;
import org.eclipse.papyrus.infra.nattable.utils.LabelProviderCellContextElementWrapper;
import org.eclipse.papyrus.sysml16.service.types.matcher.FlowPortNAMatcher;
import org.eclipse.papyrus.sysml16.util.SysMLQualifiedName;
import org.eclipse.papyrus.uml.nattable.provider.AbstractUMLNattableCellLabelProvider;
import org.eclipse.uml2.uml.Port;

/**
 * This label provider allows to display N/A for the direction of the FlowPort when its required.
 */
public class SysMLFlowPortDirectionLabelProvider extends AbstractUMLNattableCellLabelProvider {

	/**
	 * N/A FlowPort matcher
	 */
	private static final FlowPortNAMatcher matcher = new FlowPortNAMatcher();

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.provider.GenericCellLabelProvider#accept(java.lang.Object)
	 */
	@Override
	public boolean accept(final Object element) {
		if (element instanceof LabelProviderCellContextElementWrapper) {
			final ILayerCell cell = ((LabelProviderCellContextElementWrapper) element);
			final IConfigRegistry registry = ((LabelProviderCellContextElementWrapper) element).getConfigRegistry();
			final Object columnObject = getColumnObject(cell, registry);
			String str = AxisUtils.getPropertyId(columnObject);
			if (str == null) {
				final Object rowObject = getRowObject(cell, registry);
				str = AxisUtils.getPropertyId(rowObject);
			}
			if (str != null) {
				return str.endsWith(SysMLQualifiedName.STEREOTYPE_FLOWPORT_DIRECTION);
			}
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.provider.GenericCellLabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		final ILayerCell cell = (LabelProviderCellContextElementWrapper) element;
		final IConfigRegistry configRegistry = ((LabelProviderCellContextElementWrapper) element).getConfigRegistry();
		final Object rowObject = AxisUtils.getRepresentedElement(getRowObject(cell, configRegistry));
		final Object columObject = AxisUtils.getRepresentedElement(getColumnObject(cell, configRegistry));
		Port port = null;
		if (rowObject instanceof Port) {
			port = (Port) rowObject;
		} else if (columObject instanceof Port) {
			port = (Port) columObject;
		}
		if (port != null && matcher.matches(port)) {
			return Constants.NOT_AVALAIBLE;
		}
		return super.getText(element);
	}
}
