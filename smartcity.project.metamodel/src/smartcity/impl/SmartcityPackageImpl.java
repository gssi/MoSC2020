/**
 */
package smartcity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smartcity.DataAnalytics.DataAnalyticsPackage;

import smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl;

import smartcity.SmartCity;
import smartcity.SmartCityModel;
import smartcity.SmartcityFactory;
import smartcity.SmartcityPackage;

import smartcity.infrastructure.InfrastructurePackage;

import smartcity.infrastructure.impl.InfrastructurePackageImpl;

import smartcity.stakeholder.StakeholderPackage;

import smartcity.stakeholder.impl.StakeholderPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartcityPackageImpl extends EPackageImpl implements SmartcityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartCityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartCityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see smartcity.SmartcityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmartcityPackageImpl() {
		super(eNS_URI, SmartcityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SmartcityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmartcityPackage init() {
		if (isInited) return (SmartcityPackage)EPackage.Registry.INSTANCE.getEPackage(SmartcityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSmartcityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SmartcityPackageImpl theSmartcityPackage = registeredSmartcityPackage instanceof SmartcityPackageImpl ? (SmartcityPackageImpl)registeredSmartcityPackage : new SmartcityPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataAnalyticsPackage.eNS_URI);
		DataAnalyticsPackageImpl theDataAnalyticsPackage = (DataAnalyticsPackageImpl)(registeredPackage instanceof DataAnalyticsPackageImpl ? registeredPackage : DataAnalyticsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StakeholderPackage.eNS_URI);
		StakeholderPackageImpl theStakeholderPackage = (StakeholderPackageImpl)(registeredPackage instanceof StakeholderPackageImpl ? registeredPackage : StakeholderPackage.eINSTANCE);

		// Create package meta-data objects
		theSmartcityPackage.createPackageContents();
		theDataAnalyticsPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theStakeholderPackage.createPackageContents();

		// Initialize created meta-data
		theSmartcityPackage.initializePackageContents();
		theDataAnalyticsPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theStakeholderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmartcityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmartcityPackage.eNS_URI, theSmartcityPackage);
		return theSmartcityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmartCityModel() {
		return smartCityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSmartCityModel_SmartCities() {
		return (EReference)smartCityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmartCity() {
		return smartCityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSmartCity_City() {
		return (EAttribute)smartCityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSmartCity_Stakeholders() {
		return (EReference)smartCityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSmartCity_Data() {
		return (EReference)smartCityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSmartCity_Infrastructurelayer() {
		return (EReference)smartCityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmartcityFactory getSmartcityFactory() {
		return (SmartcityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		smartCityModelEClass = createEClass(SMART_CITY_MODEL);
		createEReference(smartCityModelEClass, SMART_CITY_MODEL__SMART_CITIES);

		smartCityEClass = createEClass(SMART_CITY);
		createEAttribute(smartCityEClass, SMART_CITY__CITY);
		createEReference(smartCityEClass, SMART_CITY__STAKEHOLDERS);
		createEReference(smartCityEClass, SMART_CITY__DATA);
		createEReference(smartCityEClass, SMART_CITY__INFRASTRUCTURELAYER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DataAnalyticsPackage theDataAnalyticsPackage = (DataAnalyticsPackage)EPackage.Registry.INSTANCE.getEPackage(DataAnalyticsPackage.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		StakeholderPackage theStakeholderPackage = (StakeholderPackage)EPackage.Registry.INSTANCE.getEPackage(StakeholderPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDataAnalyticsPackage);
		getESubpackages().add(theInfrastructurePackage);
		getESubpackages().add(theStakeholderPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(smartCityModelEClass, SmartCityModel.class, "SmartCityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmartCityModel_SmartCities(), this.getSmartCity(), null, "smartCities", null, 0, -1, SmartCityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartCityEClass, SmartCity.class, "SmartCity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartCity_City(), ecorePackage.getEString(), "city", null, 0, 1, SmartCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartCity_Stakeholders(), theStakeholderPackage.getStakeholder(), null, "stakeholders", null, 0, -1, SmartCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartCity_Data(), theDataAnalyticsPackage.getDataPackage(), null, "data", null, 0, -1, SmartCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartCity_Infrastructurelayer(), theInfrastructurePackage.getPublicInfrastructureLayer(), null, "infrastructurelayer", null, 0, 1, SmartCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SmartcityPackageImpl
