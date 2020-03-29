/**
 */
package smartcity.stakeholder.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smartcity.DataAnalytics.DataAnalyticsPackage;

import smartcity.DataAnalytics.impl.DataAnalyticsPackageImpl;

import smartcity.SmartcityPackage;

import smartcity.impl.SmartcityPackageImpl;

import smartcity.infrastructure.InfrastructurePackage;

import smartcity.infrastructure.impl.InfrastructurePackageImpl;

import smartcity.stakeholder.Stakeholder;
import smartcity.stakeholder.StakeholderFactory;
import smartcity.stakeholder.StakeholderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StakeholderPackageImpl extends EPackageImpl implements StakeholderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;

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
	 * @see smartcity.stakeholder.StakeholderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StakeholderPackageImpl() {
		super(eNS_URI, StakeholderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StakeholderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StakeholderPackage init() {
		if (isInited) return (StakeholderPackage)EPackage.Registry.INSTANCE.getEPackage(StakeholderPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStakeholderPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StakeholderPackageImpl theStakeholderPackage = registeredStakeholderPackage instanceof StakeholderPackageImpl ? (StakeholderPackageImpl)registeredStakeholderPackage : new StakeholderPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SmartcityPackage.eNS_URI);
		SmartcityPackageImpl theSmartcityPackage = (SmartcityPackageImpl)(registeredPackage instanceof SmartcityPackageImpl ? registeredPackage : SmartcityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataAnalyticsPackage.eNS_URI);
		DataAnalyticsPackageImpl theDataAnalyticsPackage = (DataAnalyticsPackageImpl)(registeredPackage instanceof DataAnalyticsPackageImpl ? registeredPackage : DataAnalyticsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);

		// Create package meta-data objects
		theStakeholderPackage.createPackageContents();
		theSmartcityPackage.createPackageContents();
		theDataAnalyticsPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();

		// Initialize created meta-data
		theStakeholderPackage.initializePackageContents();
		theSmartcityPackage.initializePackageContents();
		theDataAnalyticsPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStakeholderPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StakeholderPackage.eNS_URI, theStakeholderPackage);
		return theStakeholderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStakeholder_Name() {
		return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStakeholder_Organization() {
		return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StakeholderFactory getStakeholderFactory() {
		return (StakeholderFactory)getEFactoryInstance();
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
		stakeholderEClass = createEClass(STAKEHOLDER);
		createEAttribute(stakeholderEClass, STAKEHOLDER__NAME);
		createEAttribute(stakeholderEClass, STAKEHOLDER__ORGANIZATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stakeholderEClass.getESuperTypes().add(theDataAnalyticsPackage.getSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStakeholder_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStakeholder_Organization(), ecorePackage.getEString(), "organization", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StakeholderPackageImpl
