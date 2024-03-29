/**
 */
package smartcity.DataAnalytics.provider;

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

import smartcity.DataAnalytics.util.DataAnalyticsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAnalyticsItemProviderAdapterFactory extends DataAnalyticsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public DataAnalyticsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartcity.DataAnalytics.RealValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealValueItemProvider realValueItemProvider;

	/**
	 * This creates an adapter for a {@link smartcity.DataAnalytics.RealValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealValueAdapter() {
		if (realValueItemProvider == null) {
			realValueItemProvider = new RealValueItemProvider(this);
		}

		return realValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartcity.DataAnalytics.BoolValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolValueItemProvider boolValueItemProvider;

	/**
	 * This creates an adapter for a {@link smartcity.DataAnalytics.BoolValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoolValueAdapter() {
		if (boolValueItemProvider == null) {
			boolValueItemProvider = new BoolValueItemProvider(this);
		}

		return boolValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartcity.DataAnalytics.IntegerValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerValueItemProvider integerValueItemProvider;

	/**
	 * This creates an adapter for a {@link smartcity.DataAnalytics.IntegerValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerValueAdapter() {
		if (integerValueItemProvider == null) {
			integerValueItemProvider = new IntegerValueItemProvider(this);
		}

		return integerValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartcity.DataAnalytics.DataPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPackageItemProvider dataPackageItemProvider;

	/**
	 * This creates an adapter for a {@link smartcity.DataAnalytics.DataPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPackageAdapter() {
		if (dataPackageItemProvider == null) {
			dataPackageItemProvider = new DataPackageItemProvider(this);
		}

		return dataPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartcity.DataAnalytics.SocialMedia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialMediaItemProvider socialMediaItemProvider;

	/**
	 * This creates an adapter for a {@link smartcity.DataAnalytics.SocialMedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSocialMediaAdapter() {
		if (socialMediaItemProvider == null) {
			socialMediaItemProvider = new SocialMediaItemProvider(this);
		}

		return socialMediaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartcity.DataAnalytics.OpenData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDataItemProvider openDataItemProvider;

	/**
	 * This creates an adapter for a {@link smartcity.DataAnalytics.OpenData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpenDataAdapter() {
		if (openDataItemProvider == null) {
			openDataItemProvider = new OpenDataItemProvider(this);
		}

		return openDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link smartcity.DataAnalytics.ProvidedData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedDataItemProvider providedDataItemProvider;

	/**
	 * This creates an adapter for a {@link smartcity.DataAnalytics.ProvidedData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidedDataAdapter() {
		if (providedDataItemProvider == null) {
			providedDataItemProvider = new ProvidedDataItemProvider(this);
		}

		return providedDataItemProvider;
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
		if (realValueItemProvider != null) realValueItemProvider.dispose();
		if (boolValueItemProvider != null) boolValueItemProvider.dispose();
		if (integerValueItemProvider != null) integerValueItemProvider.dispose();
		if (dataPackageItemProvider != null) dataPackageItemProvider.dispose();
		if (socialMediaItemProvider != null) socialMediaItemProvider.dispose();
		if (openDataItemProvider != null) openDataItemProvider.dispose();
		if (providedDataItemProvider != null) providedDataItemProvider.dispose();
	}

}
