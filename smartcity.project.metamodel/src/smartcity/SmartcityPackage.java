/**
 */
package smartcity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smartcity.SmartcityFactory
 * @model kind="package"
 * @generated
 */
public interface SmartcityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smartcity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.gssi.it/smartcity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smartcity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartcityPackage eINSTANCE = smartcity.impl.SmartcityPackageImpl.init();

	/**
	 * The meta object id for the '{@link smartcity.impl.SmartCityModelImpl <em>Smart City Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.impl.SmartCityModelImpl
	 * @see smartcity.impl.SmartcityPackageImpl#getSmartCityModel()
	 * @generated
	 */
	int SMART_CITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Smart Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_MODEL__SMART_CITIES = 0;

	/**
	 * The number of structural features of the '<em>Smart City Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Smart City Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartcity.impl.SmartCityImpl <em>Smart City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.impl.SmartCityImpl
	 * @see smartcity.impl.SmartcityPackageImpl#getSmartCity()
	 * @generated
	 */
	int SMART_CITY = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY__CITY = 0;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY__STAKEHOLDERS = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY__DATA = 2;

	/**
	 * The feature id for the '<em><b>Infrastructurelayer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY__INFRASTRUCTURELAYER = 3;

	/**
	 * The number of structural features of the '<em>Smart City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Smart City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link smartcity.SmartCityModel <em>Smart City Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart City Model</em>'.
	 * @see smartcity.SmartCityModel
	 * @generated
	 */
	EClass getSmartCityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcity.SmartCityModel#getSmartCities <em>Smart Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smart Cities</em>'.
	 * @see smartcity.SmartCityModel#getSmartCities()
	 * @see #getSmartCityModel()
	 * @generated
	 */
	EReference getSmartCityModel_SmartCities();

	/**
	 * Returns the meta object for class '{@link smartcity.SmartCity <em>Smart City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart City</em>'.
	 * @see smartcity.SmartCity
	 * @generated
	 */
	EClass getSmartCity();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.SmartCity#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see smartcity.SmartCity#getCity()
	 * @see #getSmartCity()
	 * @generated
	 */
	EAttribute getSmartCity_City();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcity.SmartCity#getStakeholders <em>Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stakeholders</em>'.
	 * @see smartcity.SmartCity#getStakeholders()
	 * @see #getSmartCity()
	 * @generated
	 */
	EReference getSmartCity_Stakeholders();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcity.SmartCity#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see smartcity.SmartCity#getData()
	 * @see #getSmartCity()
	 * @generated
	 */
	EReference getSmartCity_Data();

	/**
	 * Returns the meta object for the containment reference '{@link smartcity.SmartCity#getInfrastructurelayer <em>Infrastructurelayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infrastructurelayer</em>'.
	 * @see smartcity.SmartCity#getInfrastructurelayer()
	 * @see #getSmartCity()
	 * @generated
	 */
	EReference getSmartCity_Infrastructurelayer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartcityFactory getSmartcityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smartcity.impl.SmartCityModelImpl <em>Smart City Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.impl.SmartCityModelImpl
		 * @see smartcity.impl.SmartcityPackageImpl#getSmartCityModel()
		 * @generated
		 */
		EClass SMART_CITY_MODEL = eINSTANCE.getSmartCityModel();

		/**
		 * The meta object literal for the '<em><b>Smart Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CITY_MODEL__SMART_CITIES = eINSTANCE.getSmartCityModel_SmartCities();

		/**
		 * The meta object literal for the '{@link smartcity.impl.SmartCityImpl <em>Smart City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.impl.SmartCityImpl
		 * @see smartcity.impl.SmartcityPackageImpl#getSmartCity()
		 * @generated
		 */
		EClass SMART_CITY = eINSTANCE.getSmartCity();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CITY__CITY = eINSTANCE.getSmartCity_City();

		/**
		 * The meta object literal for the '<em><b>Stakeholders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CITY__STAKEHOLDERS = eINSTANCE.getSmartCity_Stakeholders();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CITY__DATA = eINSTANCE.getSmartCity_Data();

		/**
		 * The meta object literal for the '<em><b>Infrastructurelayer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CITY__INFRASTRUCTURELAYER = eINSTANCE.getSmartCity_Infrastructurelayer();

	}

} //SmartcityPackage
