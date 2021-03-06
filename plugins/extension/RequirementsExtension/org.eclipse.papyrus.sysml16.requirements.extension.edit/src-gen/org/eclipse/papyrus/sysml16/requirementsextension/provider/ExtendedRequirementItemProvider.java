/**
 * Copyright (c) 2019 CEA LIST.
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
 */
package org.eclipse.papyrus.sysml16.requirementsextension.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.sysml16.requirements.provider.RequirementItemProvider;

import org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement;
import org.eclipse.papyrus.sysml16.requirementsextension.RequirementsExtensionPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.sysml16.requirementsextension.ExtendedRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedRequirementItemProvider extends RequirementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedRequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourcePropertyDescriptor(object);
			addRiskPropertyDescriptor(object);
			addVerifyMethodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedRequirement_source_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedRequirement_source_feature", "_UI_ExtendedRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 RequirementsExtensionPackage.Literals.EXTENDED_REQUIREMENT__SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Risk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRiskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedRequirement_risk_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedRequirement_risk_feature", "_UI_ExtendedRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 RequirementsExtensionPackage.Literals.EXTENDED_REQUIREMENT__RISK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Verify Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerifyMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedRequirement_verifyMethod_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedRequirement_verifyMethod_feature", "_UI_ExtendedRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 RequirementsExtensionPackage.Literals.EXTENDED_REQUIREMENT__VERIFY_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ExtendedRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtendedRequirement")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExtendedRequirement)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ExtendedRequirement_type") : //$NON-NLS-1$
			getString("_UI_ExtendedRequirement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExtendedRequirement.class)) {
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__SOURCE:
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__RISK:
			case RequirementsExtensionPackage.EXTENDED_REQUIREMENT__VERIFY_METHOD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RequirementsExtensionEditPlugin.INSTANCE;
	}

}
