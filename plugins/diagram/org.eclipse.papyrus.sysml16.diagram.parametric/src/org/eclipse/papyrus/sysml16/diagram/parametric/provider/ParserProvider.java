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

package org.eclipse.papyrus.sysml16.diagram.parametric.provider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.papyrus.sysml16.diagram.common.provider.AbstractParserProvider;
import org.eclipse.papyrus.uml.diagram.common.parser.PropertyLabelParser;

/**
 * Parser provider for labels used by the parametric diagram.
 */
public class ParserProvider extends AbstractParserProvider implements IParserProvider {

	private static final String PARAMETER_LABEL = "ParameterLabel"; //$NON-NLS-1$

	/**
	 * Constructor.
	 */
	public ParserProvider() {
		graphicalHintToParser.put(PARAMETER_LABEL, new PropertyLabelParser());
	}

}