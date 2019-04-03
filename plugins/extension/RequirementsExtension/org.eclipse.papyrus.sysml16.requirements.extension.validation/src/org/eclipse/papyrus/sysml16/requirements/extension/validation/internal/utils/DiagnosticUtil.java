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

package org.eclipse.papyrus.sysml16.requirements.extension.validation.internal.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.uml2.uml.Element;

/**
 * This is an utility class for managing Diagnostic
 */
// TODO : this functionalities should be provided by Papyrus core or other upper framework
public final class DiagnosticUtil {

	private DiagnosticUtil() {
	}

	/**
	 * Find diagnostic by source (Should be unique per element if the source is correctly defined)
	 * 
	 * @param diagnostic
	 * @param source
	 * @return
	 */
	public static List<Diagnostic> findDiagnosticBySource(Diagnostic diagnostic, String source) {
		List<Diagnostic> foundDiagnostic = new ArrayList<>();
		List<Diagnostic> children = diagnostic.getChildren();
		if (source.equals(diagnostic.getSource())) {
			foundDiagnostic.add(diagnostic);
		}
		if (children != null && !children.isEmpty()) {
			for (Diagnostic diagnosticChild : children) {
				foundDiagnostic.addAll(findDiagnosticBySource(diagnosticChild, source));
			}
		}
		return foundDiagnostic;
	}

	/**
	 * Get diagnostics by element
	 * 
	 * @param diagnostics
	 * @param element
	 * @return
	 */
	public static List<Diagnostic> filterDiagnosticsByElement(List<Diagnostic> diagnostics, Element element) {
		List<Diagnostic> filteredDiagnostics = new ArrayList<>();
		for (Diagnostic diagnostic : diagnostics) {
			List<?> datas = diagnostic.getData();
			if (datas != null && !datas.isEmpty()) {
				// According to Diagnostic#getData documentation : The first element is typically the object that is the primary source of the problem;
				if (element.equals(datas.get(0))) {
					filteredDiagnostics.add(diagnostic);
				}
			}
		}
		return filteredDiagnostics;
	}

}
