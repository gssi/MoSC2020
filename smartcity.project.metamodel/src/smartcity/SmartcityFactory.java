/**
 */
package smartcity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see smartcity.SmartcityPackage
 * @generated
 */
public interface SmartcityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartcityFactory eINSTANCE = smartcity.impl.SmartcityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Smart City Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart City Model</em>'.
	 * @generated
	 */
	SmartCityModel createSmartCityModel();

	/**
	 * Returns a new object of class '<em>Smart City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart City</em>'.
	 * @generated
	 */
	SmartCity createSmartCity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SmartcityPackage getSmartcityPackage();

} //SmartcityFactory
