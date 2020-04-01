/**
 */
package smartcity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smartcity.DataAnalytics.DataPackage;
import smartcity.DataAnalytics.Source;

import smartcity.SmartCity;
import smartcity.SmartcityPackage;

import smartcity.infrastructure.PublicInfrastructureLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartcity.impl.SmartCityImpl#getCity <em>City</em>}</li>
 *   <li>{@link smartcity.impl.SmartCityImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link smartcity.impl.SmartCityImpl#getData <em>Data</em>}</li>
 *   <li>{@link smartcity.impl.SmartCityImpl#getInfrastructurelayer <em>Infrastructurelayer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartCityImpl extends MinimalEObjectImpl.Container implements SmartCity {
	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStakeholders() <em>Stakeholders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholders()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> stakeholders;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPackage> data;

	/**
	 * The cached value of the '{@link #getInfrastructurelayer() <em>Infrastructurelayer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructurelayer()
	 * @generated
	 * @ordered
	 */
	protected PublicInfrastructureLayer infrastructurelayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartCityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartcityPackage.Literals.SMART_CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartcityPackage.SMART_CITY__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Source> getStakeholders() {
		if (stakeholders == null) {
			stakeholders = new EObjectContainmentEList<Source>(Source.class, this, SmartcityPackage.SMART_CITY__STAKEHOLDERS);
		}
		return stakeholders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataPackage> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<DataPackage>(DataPackage.class, this, SmartcityPackage.SMART_CITY__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicInfrastructureLayer getInfrastructurelayer() {
		return infrastructurelayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfrastructurelayer(PublicInfrastructureLayer newInfrastructurelayer, NotificationChain msgs) {
		PublicInfrastructureLayer oldInfrastructurelayer = infrastructurelayer;
		infrastructurelayer = newInfrastructurelayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER, oldInfrastructurelayer, newInfrastructurelayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfrastructurelayer(PublicInfrastructureLayer newInfrastructurelayer) {
		if (newInfrastructurelayer != infrastructurelayer) {
			NotificationChain msgs = null;
			if (infrastructurelayer != null)
				msgs = ((InternalEObject)infrastructurelayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER, null, msgs);
			if (newInfrastructurelayer != null)
				msgs = ((InternalEObject)newInfrastructurelayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER, null, msgs);
			msgs = basicSetInfrastructurelayer(newInfrastructurelayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER, newInfrastructurelayer, newInfrastructurelayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartcityPackage.SMART_CITY__STAKEHOLDERS:
				return ((InternalEList<?>)getStakeholders()).basicRemove(otherEnd, msgs);
			case SmartcityPackage.SMART_CITY__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER:
				return basicSetInfrastructurelayer(null, msgs);
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
			case SmartcityPackage.SMART_CITY__CITY:
				return getCity();
			case SmartcityPackage.SMART_CITY__STAKEHOLDERS:
				return getStakeholders();
			case SmartcityPackage.SMART_CITY__DATA:
				return getData();
			case SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER:
				return getInfrastructurelayer();
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
			case SmartcityPackage.SMART_CITY__CITY:
				setCity((String)newValue);
				return;
			case SmartcityPackage.SMART_CITY__STAKEHOLDERS:
				getStakeholders().clear();
				getStakeholders().addAll((Collection<? extends Source>)newValue);
				return;
			case SmartcityPackage.SMART_CITY__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataPackage>)newValue);
				return;
			case SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER:
				setInfrastructurelayer((PublicInfrastructureLayer)newValue);
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
			case SmartcityPackage.SMART_CITY__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case SmartcityPackage.SMART_CITY__STAKEHOLDERS:
				getStakeholders().clear();
				return;
			case SmartcityPackage.SMART_CITY__DATA:
				getData().clear();
				return;
			case SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER:
				setInfrastructurelayer((PublicInfrastructureLayer)null);
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
			case SmartcityPackage.SMART_CITY__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case SmartcityPackage.SMART_CITY__STAKEHOLDERS:
				return stakeholders != null && !stakeholders.isEmpty();
			case SmartcityPackage.SMART_CITY__DATA:
				return data != null && !data.isEmpty();
			case SmartcityPackage.SMART_CITY__INFRASTRUCTURELAYER:
				return infrastructurelayer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (city: ");
		result.append(city);
		result.append(')');
		return result.toString();
	}

} //SmartCityImpl
