/**
 */
package smartcity.DataAnalytics;

import org.eclipse.emf.common.util.EList;

import smartcity.stakeholder.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcity.DataAnalytics.ProvidedData#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see smartcity.DataAnalytics.DataAnalyticsPackage#getProvidedData()
 * @model
 * @generated
 */
public interface ProvidedData extends Source {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference list.
	 * The list contents are of type {@link smartcity.stakeholder.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference list.
	 * @see smartcity.DataAnalytics.DataAnalyticsPackage#getProvidedData_Provider()
	 * @model
	 * @generated
	 */
	EList<Stakeholder> getProvider();

} // ProvidedData
