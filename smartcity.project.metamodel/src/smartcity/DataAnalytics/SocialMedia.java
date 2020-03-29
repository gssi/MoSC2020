/**
 */
package smartcity.DataAnalytics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcity.DataAnalytics.SocialMedia#getUrl <em>Url</em>}</li>
 *   <li>{@link smartcity.DataAnalytics.SocialMedia#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see smartcity.DataAnalytics.DataAnalyticsPackage#getSocialMedia()
 * @model
 * @generated
 */
public interface SocialMedia extends Source {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see smartcity.DataAnalytics.DataAnalyticsPackage#getSocialMedia_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link smartcity.DataAnalytics.SocialMedia#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartcity.DataAnalytics.DataAnalyticsPackage#getSocialMedia_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartcity.DataAnalytics.SocialMedia#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SocialMedia
