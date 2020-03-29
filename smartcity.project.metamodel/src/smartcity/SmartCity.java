/**
 */
package smartcity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import smartcity.DataAnalytics.DataPackage;

import smartcity.infrastructure.PublicInfrastructureLayer;

import smartcity.stakeholder.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcity.SmartCity#getCity <em>City</em>}</li>
 *   <li>{@link smartcity.SmartCity#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link smartcity.SmartCity#getData <em>Data</em>}</li>
 *   <li>{@link smartcity.SmartCity#getInfrastructurelayer <em>Infrastructurelayer</em>}</li>
 * </ul>
 *
 * @see smartcity.SmartcityPackage#getSmartCity()
 * @model
 * @generated
 */
public interface SmartCity extends EObject {
	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see smartcity.SmartcityPackage#getSmartCity_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link smartcity.SmartCity#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Stakeholders</b></em>' containment reference list.
	 * The list contents are of type {@link smartcity.stakeholder.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholders</em>' containment reference list.
	 * @see smartcity.SmartcityPackage#getSmartCity_Stakeholders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stakeholder> getStakeholders();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link smartcity.DataAnalytics.DataPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see smartcity.SmartcityPackage#getSmartCity_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPackage> getData();

	/**
	 * Returns the value of the '<em><b>Infrastructurelayer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructurelayer</em>' containment reference.
	 * @see #setInfrastructurelayer(PublicInfrastructureLayer)
	 * @see smartcity.SmartcityPackage#getSmartCity_Infrastructurelayer()
	 * @model containment="true"
	 * @generated
	 */
	PublicInfrastructureLayer getInfrastructurelayer();

	/**
	 * Sets the value of the '{@link smartcity.SmartCity#getInfrastructurelayer <em>Infrastructurelayer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructurelayer</em>' containment reference.
	 * @see #getInfrastructurelayer()
	 * @generated
	 */
	void setInfrastructurelayer(PublicInfrastructureLayer value);

} // SmartCity
