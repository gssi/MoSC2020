/**
 */
package smartcity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart City Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcity.SmartCityModel#getSmartCities <em>Smart Cities</em>}</li>
 * </ul>
 *
 * @see smartcity.SmartcityPackage#getSmartCityModel()
 * @model
 * @generated
 */
public interface SmartCityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Smart Cities</b></em>' containment reference list.
	 * The list contents are of type {@link smartcity.SmartCity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smart Cities</em>' containment reference list.
	 * @see smartcity.SmartcityPackage#getSmartCityModel_SmartCities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartCity> getSmartCities();

} // SmartCityModel
