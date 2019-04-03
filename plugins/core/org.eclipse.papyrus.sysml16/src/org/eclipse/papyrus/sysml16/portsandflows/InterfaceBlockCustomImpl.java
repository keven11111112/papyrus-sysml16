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

package org.eclipse.papyrus.sysml16.portsandflows;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InterfaceBlockImpl;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 *
 */
public class InterfaceBlockCustomImpl extends InterfaceBlockImpl {

	/**
	 * Implementation of 'getConjugated' function.
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InterfaceBlockImpl#getConjugated()
	 */
	@Override
	public EList<InterfaceBlock> getConjugated() {

		final EList<InterfaceBlock> conjugatedBy = new BasicEList<>();
		if (getBase_Class() != null) {
			final Iterator<DirectedRelationship> itDep = getBase_Class().getSourceDirectedRelationships().iterator();

			// Find DeriveReqt link
			while (itDep.hasNext()) {
				final DirectedRelationship currentDRelationship = itDep.next();

				if (currentDRelationship instanceof Dependency && ((Dependency) currentDRelationship).getSuppliers().contains(getBase_Class())) {
					final EList<NamedElement> suppliers = ((Dependency) currentDRelationship).getClients();
					final Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext()) {
						final ConjugatedInterfaceBlock conjugatedInterfaceBlock = UMLUtil.getStereotypeApplication(it.next(), ConjugatedInterfaceBlock.class);
						if (conjugatedInterfaceBlock != null && this.equals(conjugatedInterfaceBlock.getOriginal())) {
							conjugatedBy.add(conjugatedInterfaceBlock);
						}
					}
				}
			}
		}

		return new UnmodifiableEList<>(this, null, conjugatedBy.size(), conjugatedBy.toArray());
	}

}
