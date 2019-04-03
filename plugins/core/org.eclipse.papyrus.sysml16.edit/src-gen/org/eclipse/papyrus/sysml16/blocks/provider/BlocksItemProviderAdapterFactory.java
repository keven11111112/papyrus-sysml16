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
package org.eclipse.papyrus.sysml16.blocks.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.papyrus.sysml16.blocks.util.BlocksAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlocksItemProviderAdapterFactory extends BlocksAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlocksItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.AdjunctProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdjunctPropertyItemProvider adjunctPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.AdjunctProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdjunctPropertyAdapter() {
		if (adjunctPropertyItemProvider == null) {
			adjunctPropertyItemProvider = new AdjunctPropertyItemProvider(this);
		}

		return adjunctPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.BindingConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingConnectorItemProvider bindingConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.BindingConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingConnectorAdapter() {
		if (bindingConnectorItemProvider == null) {
			bindingConnectorItemProvider = new BindingConnectorItemProvider(this);
		}

		return bindingConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.Block} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if (blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.BoundReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundReferenceItemProvider boundReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.BoundReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundReferenceAdapter() {
		if (boundReferenceItemProvider == null) {
			boundReferenceItemProvider = new BoundReferenceItemProvider(this);
		}

		return boundReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.EndPathMultiplicity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPathMultiplicityItemProvider endPathMultiplicityItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.EndPathMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPathMultiplicityAdapter() {
		if (endPathMultiplicityItemProvider == null) {
			endPathMultiplicityItemProvider = new EndPathMultiplicityItemProvider(this);
		}

		return endPathMultiplicityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.ClassifierBehaviorProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierBehaviorPropertyItemProvider classifierBehaviorPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.ClassifierBehaviorProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassifierBehaviorPropertyAdapter() {
		if (classifierBehaviorPropertyItemProvider == null) {
			classifierBehaviorPropertyItemProvider = new ClassifierBehaviorPropertyItemProvider(this);
		}

		return classifierBehaviorPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.ConnectorProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorPropertyItemProvider connectorPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.ConnectorProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorPropertyAdapter() {
		if (connectorPropertyItemProvider == null) {
			connectorPropertyItemProvider = new ConnectorPropertyItemProvider(this);
		}

		return connectorPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.DistributedProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributedPropertyItemProvider distributedPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.DistributedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistributedPropertyAdapter() {
		if (distributedPropertyItemProvider == null) {
			distributedPropertyItemProvider = new DistributedPropertyItemProvider(this);
		}

		return distributedPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedConnectorEndItemProvider nestedConnectorEndItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.NestedConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNestedConnectorEndAdapter() {
		if (nestedConnectorEndItemProvider == null) {
			nestedConnectorEndItemProvider = new NestedConnectorEndItemProvider(this);
		}

		return nestedConnectorEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.ParticipantProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantPropertyItemProvider participantPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.ParticipantProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantPropertyAdapter() {
		if (participantPropertyItemProvider == null) {
			participantPropertyItemProvider = new ParticipantPropertyItemProvider(this);
		}

		return participantPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.PropertySpecificType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertySpecificTypeItemProvider propertySpecificTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.PropertySpecificType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertySpecificTypeAdapter() {
		if (propertySpecificTypeItemProvider == null) {
			propertySpecificTypeItemProvider = new PropertySpecificTypeItemProvider(this);
		}

		return propertySpecificTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml16.blocks.ValueType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeItemProvider valueTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml16.blocks.ValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueTypeAdapter() {
		if (valueTypeItemProvider == null) {
			valueTypeItemProvider = new ValueTypeItemProvider(this);
		}

		return valueTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (adjunctPropertyItemProvider != null) adjunctPropertyItemProvider.dispose();
		if (bindingConnectorItemProvider != null) bindingConnectorItemProvider.dispose();
		if (blockItemProvider != null) blockItemProvider.dispose();
		if (boundReferenceItemProvider != null) boundReferenceItemProvider.dispose();
		if (endPathMultiplicityItemProvider != null) endPathMultiplicityItemProvider.dispose();
		if (classifierBehaviorPropertyItemProvider != null) classifierBehaviorPropertyItemProvider.dispose();
		if (connectorPropertyItemProvider != null) connectorPropertyItemProvider.dispose();
		if (distributedPropertyItemProvider != null) distributedPropertyItemProvider.dispose();
		if (nestedConnectorEndItemProvider != null) nestedConnectorEndItemProvider.dispose();
		if (participantPropertyItemProvider != null) participantPropertyItemProvider.dispose();
		if (propertySpecificTypeItemProvider != null) propertySpecificTypeItemProvider.dispose();
		if (valueTypeItemProvider != null) valueTypeItemProvider.dispose();
	}

}
