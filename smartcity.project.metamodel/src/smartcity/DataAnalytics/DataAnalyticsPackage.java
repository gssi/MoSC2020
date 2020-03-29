/**
 */
package smartcity.DataAnalytics;

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
 * @see smartcity.DataAnalytics.DataAnalyticsFactory
 * @model kind="package"
 * @generated
 */
public interface DataAnalyticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataAnalytics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.gssi.it/smartcity/dataanalytics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataAnalytics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataAnalyticsPackage eINSTANCE = smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.DataImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getData()
	 * @generated
	 */
	int DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SRC = 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.RealValueImpl <em>Real Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.RealValueImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getRealValue()
	 * @generated
	 */
	int REAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE__UNIT = DATA__UNIT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE__SRC = DATA__SRC;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.BoolValueImpl <em>Bool Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.BoolValueImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getBoolValue()
	 * @generated
	 */
	int BOOL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE__UNIT = DATA__UNIT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE__SRC = DATA__SRC;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.IntegerValueImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__UNIT = DATA__UNIT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__SRC = DATA__SRC;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.DataPackageImpl <em>Data Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.DataPackageImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getDataPackage()
	 * @generated
	 */
	int DATA_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKAGE__DATA = 1;

	/**
	 * The number of structural features of the '<em>Data Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.SourceImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 5;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.SocialMediaImpl <em>Social Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.SocialMediaImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getSocialMedia()
	 * @generated
	 */
	int SOCIAL_MEDIA = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA__URL = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA__NAME = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Social Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Social Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.OpenDataImpl <em>Open Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.OpenDataImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getOpenData()
	 * @generated
	 */
	int OPEN_DATA = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA__URL = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA__NAME = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Open Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Open Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartcity.DataAnalytics.impl.ProvidedDataImpl <em>Provided Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.DataAnalytics.impl.ProvidedDataImpl
	 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getProvidedData()
	 * @generated
	 */
	int PROVIDED_DATA = 8;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DATA__PROVIDER = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DATA_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provided Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DATA_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see smartcity.DataAnalytics.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcity.DataAnalytics.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.Data#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see smartcity.DataAnalytics.Data#getUnit()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Unit();

	/**
	 * Returns the meta object for the reference '{@link smartcity.DataAnalytics.Data#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see smartcity.DataAnalytics.Data#getSrc()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Src();

	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Value</em>'.
	 * @see smartcity.DataAnalytics.RealValue
	 * @generated
	 */
	EClass getRealValue();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.RealValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smartcity.DataAnalytics.RealValue#getValue()
	 * @see #getRealValue()
	 * @generated
	 */
	EAttribute getRealValue_Value();

	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.BoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Value</em>'.
	 * @see smartcity.DataAnalytics.BoolValue
	 * @generated
	 */
	EClass getBoolValue();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.BoolValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smartcity.DataAnalytics.BoolValue#isValue()
	 * @see #getBoolValue()
	 * @generated
	 */
	EAttribute getBoolValue_Value();

	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see smartcity.DataAnalytics.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smartcity.DataAnalytics.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.DataPackage <em>Data Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Package</em>'.
	 * @see smartcity.DataAnalytics.DataPackage
	 * @generated
	 */
	EClass getDataPackage();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.DataPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcity.DataAnalytics.DataPackage#getName()
	 * @see #getDataPackage()
	 * @generated
	 */
	EAttribute getDataPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcity.DataAnalytics.DataPackage#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see smartcity.DataAnalytics.DataPackage#getData()
	 * @see #getDataPackage()
	 * @generated
	 */
	EReference getDataPackage_Data();

	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see smartcity.DataAnalytics.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.SocialMedia <em>Social Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Media</em>'.
	 * @see smartcity.DataAnalytics.SocialMedia
	 * @generated
	 */
	EClass getSocialMedia();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.SocialMedia#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see smartcity.DataAnalytics.SocialMedia#getUrl()
	 * @see #getSocialMedia()
	 * @generated
	 */
	EAttribute getSocialMedia_Url();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.SocialMedia#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcity.DataAnalytics.SocialMedia#getName()
	 * @see #getSocialMedia()
	 * @generated
	 */
	EAttribute getSocialMedia_Name();

	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.OpenData <em>Open Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Data</em>'.
	 * @see smartcity.DataAnalytics.OpenData
	 * @generated
	 */
	EClass getOpenData();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.OpenData#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see smartcity.DataAnalytics.OpenData#getUrl()
	 * @see #getOpenData()
	 * @generated
	 */
	EAttribute getOpenData_Url();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.DataAnalytics.OpenData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcity.DataAnalytics.OpenData#getName()
	 * @see #getOpenData()
	 * @generated
	 */
	EAttribute getOpenData_Name();

	/**
	 * Returns the meta object for class '{@link smartcity.DataAnalytics.ProvidedData <em>Provided Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Data</em>'.
	 * @see smartcity.DataAnalytics.ProvidedData
	 * @generated
	 */
	EClass getProvidedData();

	/**
	 * Returns the meta object for the reference list '{@link smartcity.DataAnalytics.ProvidedData#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provider</em>'.
	 * @see smartcity.DataAnalytics.ProvidedData#getProvider()
	 * @see #getProvidedData()
	 * @generated
	 */
	EReference getProvidedData_Provider();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataAnalyticsFactory getDataAnalyticsFactory();

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
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.DataImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__UNIT = eINSTANCE.getData_Unit();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SRC = eINSTANCE.getData_Src();

		/**
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.RealValueImpl <em>Real Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.RealValueImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getRealValue()
		 * @generated
		 */
		EClass REAL_VALUE = eINSTANCE.getRealValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_VALUE__VALUE = eINSTANCE.getRealValue_Value();

		/**
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.BoolValueImpl <em>Bool Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.BoolValueImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getBoolValue()
		 * @generated
		 */
		EClass BOOL_VALUE = eINSTANCE.getBoolValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_VALUE__VALUE = eINSTANCE.getBoolValue_Value();

		/**
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.IntegerValueImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.DataPackageImpl <em>Data Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.DataPackageImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getDataPackage()
		 * @generated
		 */
		EClass DATA_PACKAGE = eINSTANCE.getDataPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PACKAGE__NAME = eINSTANCE.getDataPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PACKAGE__DATA = eINSTANCE.getDataPackage_Data();

		/**
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.SourceImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.SocialMediaImpl <em>Social Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.SocialMediaImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getSocialMedia()
		 * @generated
		 */
		EClass SOCIAL_MEDIA = eINSTANCE.getSocialMedia();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_MEDIA__URL = eINSTANCE.getSocialMedia_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_MEDIA__NAME = eINSTANCE.getSocialMedia_Name();

		/**
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.OpenDataImpl <em>Open Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.OpenDataImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getOpenData()
		 * @generated
		 */
		EClass OPEN_DATA = eINSTANCE.getOpenData();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA__URL = eINSTANCE.getOpenData_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA__NAME = eINSTANCE.getOpenData_Name();

		/**
		 * The meta object literal for the '{@link smartcity.DataAnalytics.impl.ProvidedDataImpl <em>Provided Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.DataAnalytics.impl.ProvidedDataImpl
		 * @see smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl#getProvidedData()
		 * @generated
		 */
		EClass PROVIDED_DATA = eINSTANCE.getProvidedData();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_DATA__PROVIDER = eINSTANCE.getProvidedData_Provider();

	}

} //DataAnalyticsPackage
