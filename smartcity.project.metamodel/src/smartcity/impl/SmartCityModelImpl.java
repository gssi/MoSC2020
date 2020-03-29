/**
 */
package smartcity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smartcity.SmartCity;
import smartcity.SmartCityModel;
import smartcity.SmartcityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart City Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartcity.impl.SmartCityModelImpl#getSmartCities <em>Smart Cities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartCityModelImpl extends MinimalEObjectImpl.Container implements SmartCityModel {
	/**
	 * The cached value of the '{@link #getSmartCities() <em>Smart Cities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartCities()
	 * @generated
	 * @ordered
	 */
	protected EList<SmartCity> smartCities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartCityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartcityPackage.Literals.SMART_CITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SmartCity> getSmartCities() {
		if (smartCities == null) {
			smartCities = new EObjectContainmentEList<SmartCity>(SmartCity.class, this, SmartcityPackage.SMART_CITY_MODEL__SMART_CITIES);
		}
		return smartCities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartcityPackage.SMART_CITY_MODEL__SMART_CITIES:
				return ((InternalEList<?>)getSmartCities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartcityPackage.SMART_CITY_MODEL__SMART_CITIES:
				return getSmartCities();
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
			case SmartcityPackage.SMART_CITY_MODEL__SMART_CITIES:
				getSmartCities().clear();
				getSmartCities().addAll((Collection<? extends SmartCity>)newValue);
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
			case SmartcityPackage.SMART_CITY_MODEL__SMART_CITIES:
				getSmartCities().clear();
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
			case SmartcityPackage.SMART_CITY_MODEL__SMART_CITIES:
				return smartCities != null && !smartCities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SmartCityModelImpl
