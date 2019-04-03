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

package org.eclipse.papyrus.sysml16.diagram.common.provider;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Parser provider for labels used by diagrams.
 */
public abstract class AbstractParserProvider extends AbstractProvider implements IParserProvider {

	/** map from graphical hint to parsers */
	protected Map<String, IParser> graphicalHintToParser = new HashMap<>();


	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IParser getParser(IAdaptable hint) {
		String parserHint = hint.getAdapter(String.class);
		if (parserHint != null) {
			IParser parser = graphicalHintToParser.get(parserHint);
			if (parser != null) {
				return parser;
			}
		}

		View view = hint.getAdapter(View.class);
		if (view != null) {
			IParser parser = graphicalHintToParser.get(view.getType());
			if (parser != null) {
				return parser;
			}
		}

		return null;
	}

}