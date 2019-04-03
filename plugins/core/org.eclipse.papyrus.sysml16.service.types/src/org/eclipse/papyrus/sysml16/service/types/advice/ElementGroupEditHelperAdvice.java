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

import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;

/**
 * 7.3.2. ElementGroup
 * /member: Element[0..*]
 *   Set specifying the members of the group.
 *   Derived from Comment::annotatedElement.
 * orderedMember: Element[0..*] {ordered, subsets member}
 *   Organize member according to an arbitrary order.
 *
 */
public class ElementGroupEditHelperAdvice extends AbstractEditHelperAdvice {

}
