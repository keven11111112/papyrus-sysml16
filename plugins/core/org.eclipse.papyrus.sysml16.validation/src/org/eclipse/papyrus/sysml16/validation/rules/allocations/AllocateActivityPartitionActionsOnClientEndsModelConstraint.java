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

package org.eclipse.papyrus.sysml16.validation.rules.allocations;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml16.allocations.Allocate;
import org.eclipse.papyrus.sysml16.allocations.AllocateActivityPartition;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * 15.3.2.2 AllocateActivityPartition [2] An Action appearing in an "AllocateActivityPartition" shall be the /client (from) end of an "allocate"
 * dependency. The element that represents the "AllocateActivityPartition" shall be the /supplier (to) end
 * of the same "allocate" dependency. In the «AllocateActivityPartition» name field, Properties are
 * designated by the use of a fully qualified name (including colon, e.g., "part_name:Block_Name"), and
 * Classifiers are designated by a simple name (no colons, e.g., "Block_Name").
 */
public class AllocateActivityPartitionActionsOnClientEndsModelConstraint extends AbstractModelConstraint {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(final IValidationContext context) {
		final AllocateActivityPartition allocateActivityPartition = (AllocateActivityPartition) context.getTarget();
		final ActivityPartition activityPartition = allocateActivityPartition.getBase_ActivityPartition();

		if (null != activityPartition) {
			for (final ActivityNode node : activityPartition.getNodes()) {
				if (node instanceof Action) {

					// check if there is an allocate abstraction from (client) action to (supplier) activity representation
					boolean found = false;
					final Iterator<Relationship> relationshipIterator = node.getRelationships().iterator();
					while (relationshipIterator.hasNext() && !found) {
						final Relationship relationship = relationshipIterator.next();
						if (relationship instanceof Abstraction &&
								((Abstraction) relationship).getClients().contains(node) &&
								((Abstraction) relationship).getSuppliers().contains(activityPartition.getRepresents()) &&
								null != UMLUtil.getStereotypeApplication(relationship, Allocate.class)) {
							found = true;
						}
					}

					if (!found) {
						return context.createFailureStatus(context.getTarget());
					}
				}
			}

		}

		return context.createSuccessStatus();
	}

}
