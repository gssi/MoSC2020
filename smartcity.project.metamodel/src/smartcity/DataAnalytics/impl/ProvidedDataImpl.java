/**
 */
package smartcity.DataAnalytics.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smartcity.DataAnalytics.DataAnalyticsPackage;
import smartcity.DataAnalytics.ProvidedData;

import smartcity.stakeholder.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartcity.DataAnalytics.impl.ProvidedDataImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedDataImpl extends SourceImpl implements ProvidedData {
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> provider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsPackage.Literals.PROVIDED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stakeholder> getProvider() {
		if (provider == null) {
			provider = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, DataAnalyticsPackage.PROVIDED_DATA__PROVIDER);
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsPackage.PROVIDED_DATA__PROVIDER:
				return getProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataAnalyticsPackage.PROVIDED_DATA__PROVIDER:
				getProvider().clear();
				getProvider().addAll((Collection<? extends Stakeholder>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataAnalyticsPackage.PROVIDED_DATA__PROVIDER:
				getProvider().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataAnalyticsPackage.PROVIDED_DATA__PROVIDER:
				return provider != null && !provider.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvidedDataImpl
