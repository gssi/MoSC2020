/**
 */
package smartcity.DataAnalytics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smartcity.DataAnalytics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAnalyticsFactoryImpl extends EFactoryImpl implements DataAnalyticsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataAnalyticsFactory init() {
		try {
			DataAnalyticsFactory theDataAnalyticsFactory = (DataAnalyticsFactory)EPackage.Registry.INSTANCE.getEFactory(DataAnalyticsPackage.eNS_URI);
			if (theDataAnalyticsFactory != null) {
				return theDataAnalyticsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataAnalyticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalyticsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataAnalyticsPackage.REAL_VALUE: return createRealValue();
			case DataAnalyticsPackage.BOOL_VALUE: return createBoolValue();
			case DataAnalyticsPackage.INTEGER_VALUE: return createIntegerValue();
			case DataAnalyticsPackage.DATA_PACKAGE: return createDataPackage();
			case DataAnalyticsPackage.SOCIAL_MEDIA: return createSocialMedia();
			case DataAnalyticsPackage.OPEN_DATA: return createOpenData();
			case DataAnalyticsPackage.PROVIDED_DATA: return createProvidedData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealValue createRealValue() {
		RealValueImpl realValue = new RealValueImpl();
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolValue createBoolValue() {
		BoolValueImpl boolValue = new BoolValueImpl();
		return boolValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPackage createDataPackage() {
		DataPackageImpl dataPackage = new DataPackageImpl();
		return dataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialMedia createSocialMedia() {
		SocialMediaImpl socialMedia = new SocialMediaImpl();
		return socialMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenData createOpenData() {
		OpenDataImpl openData = new OpenDataImpl();
		return openData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedData createProvidedData() {
		ProvidedDataImpl providedData = new ProvidedDataImpl();
		return providedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAnalyticsPackage getDataAnalyticsPackage() {
		return (DataAnalyticsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataAnalyticsPackage getPackage() {
		return DataAnalyticsPackage.eINSTANCE;
	}

} //DataAnalyticsFactoryImpl
