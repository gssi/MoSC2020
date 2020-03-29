/**
 */
package smartcity.infrastructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import smartcity.DataAnalytics.DataAnalyticsPackage;

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
 * @see smartcity.infrastructure.InfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface InfrastructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "infrastructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.gssi.it/smartcity/infrastructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "infrastructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructurePackage eINSTANCE = smartcity.infrastructure.impl.InfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link smartcity.infrastructure.impl.MonitoringInfrastructureImpl <em>Monitoring Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.infrastructure.impl.MonitoringInfrastructureImpl
	 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getMonitoringInfrastructure()
	 * @generated
	 */
	int MONITORING_INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_INFRASTRUCTURE__NAME = DataAnalyticsPackage.SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_INFRASTRUCTURE__DEVICES = DataAnalyticsPackage.SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monitoring Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_INFRASTRUCTURE_FEATURE_COUNT = DataAnalyticsPackage.SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Monitoring Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_INFRASTRUCTURE_OPERATION_COUNT = DataAnalyticsPackage.SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartcity.infrastructure.impl.IoTDevImpl <em>Io TDev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.infrastructure.impl.IoTDevImpl
	 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getIoTDev()
	 * @generated
	 */
	int IO_TDEV = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDEV__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDEV__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Io TDev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDEV_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Io TDev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDEV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartcity.infrastructure.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.infrastructure.impl.SensorImpl
	 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MODEL = IO_TDEV__MODEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__LOCATION = IO_TDEV__LOCATION;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = IO_TDEV_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = IO_TDEV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartcity.infrastructure.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.infrastructure.impl.ActuatorImpl
	 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MODEL = IO_TDEV__MODEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__LOCATION = IO_TDEV__LOCATION;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = IO_TDEV_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = IO_TDEV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartcity.infrastructure.impl.PublicInfrastructureLayerImpl <em>Public Infrastructure Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.infrastructure.impl.PublicInfrastructureLayerImpl
	 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getPublicInfrastructureLayer()
	 * @generated
	 */
	int PUBLIC_INFRASTRUCTURE_LAYER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INFRASTRUCTURE_LAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INFRASTRUCTURE_LAYER__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Public Infrastructure Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INFRASTRUCTURE_LAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Public Infrastructure Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INFRASTRUCTURE_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartcity.infrastructure.impl.InfrastructureComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcity.infrastructure.impl.InfrastructureComponentImpl
	 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureComponent()
	 * @generated
	 */
	int INFRASTRUCTURE_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link smartcity.infrastructure.MonitoringInfrastructure <em>Monitoring Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Infrastructure</em>'.
	 * @see smartcity.infrastructure.MonitoringInfrastructure
	 * @generated
	 */
	EClass getMonitoringInfrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcity.infrastructure.MonitoringInfrastructure#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see smartcity.infrastructure.MonitoringInfrastructure#getDevices()
	 * @see #getMonitoringInfrastructure()
	 * @generated
	 */
	EReference getMonitoringInfrastructure_Devices();

	/**
	 * Returns the meta object for class '{@link smartcity.infrastructure.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see smartcity.infrastructure.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link smartcity.infrastructure.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see smartcity.infrastructure.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link smartcity.infrastructure.IoTDev <em>Io TDev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TDev</em>'.
	 * @see smartcity.infrastructure.IoTDev
	 * @generated
	 */
	EClass getIoTDev();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.infrastructure.IoTDev#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see smartcity.infrastructure.IoTDev#getModel()
	 * @see #getIoTDev()
	 * @generated
	 */
	EAttribute getIoTDev_Model();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.infrastructure.IoTDev#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see smartcity.infrastructure.IoTDev#getLocation()
	 * @see #getIoTDev()
	 * @generated
	 */
	EAttribute getIoTDev_Location();

	/**
	 * Returns the meta object for class '{@link smartcity.infrastructure.PublicInfrastructureLayer <em>Public Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Infrastructure Layer</em>'.
	 * @see smartcity.infrastructure.PublicInfrastructureLayer
	 * @generated
	 */
	EClass getPublicInfrastructureLayer();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.infrastructure.PublicInfrastructureLayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcity.infrastructure.PublicInfrastructureLayer#getName()
	 * @see #getPublicInfrastructureLayer()
	 * @generated
	 */
	EAttribute getPublicInfrastructureLayer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcity.infrastructure.PublicInfrastructureLayer#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see smartcity.infrastructure.PublicInfrastructureLayer#getComponents()
	 * @see #getPublicInfrastructureLayer()
	 * @generated
	 */
	EReference getPublicInfrastructureLayer_Components();

	/**
	 * Returns the meta object for class '{@link smartcity.infrastructure.InfrastructureComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see smartcity.infrastructure.InfrastructureComponent
	 * @generated
	 */
	EClass getInfrastructureComponent();

	/**
	 * Returns the meta object for the attribute '{@link smartcity.infrastructure.InfrastructureComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcity.infrastructure.InfrastructureComponent#getName()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EAttribute getInfrastructureComponent_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfrastructureFactory getInfrastructureFactory();

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
		 * The meta object literal for the '{@link smartcity.infrastructure.impl.MonitoringInfrastructureImpl <em>Monitoring Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.infrastructure.impl.MonitoringInfrastructureImpl
		 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getMonitoringInfrastructure()
		 * @generated
		 */
		EClass MONITORING_INFRASTRUCTURE = eINSTANCE.getMonitoringInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_INFRASTRUCTURE__DEVICES = eINSTANCE.getMonitoringInfrastructure_Devices();

		/**
		 * The meta object literal for the '{@link smartcity.infrastructure.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.infrastructure.impl.SensorImpl
		 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link smartcity.infrastructure.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.infrastructure.impl.ActuatorImpl
		 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link smartcity.infrastructure.impl.IoTDevImpl <em>Io TDev</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.infrastructure.impl.IoTDevImpl
		 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getIoTDev()
		 * @generated
		 */
		EClass IO_TDEV = eINSTANCE.getIoTDev();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TDEV__MODEL = eINSTANCE.getIoTDev_Model();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TDEV__LOCATION = eINSTANCE.getIoTDev_Location();

		/**
		 * The meta object literal for the '{@link smartcity.infrastructure.impl.PublicInfrastructureLayerImpl <em>Public Infrastructure Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.infrastructure.impl.PublicInfrastructureLayerImpl
		 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getPublicInfrastructureLayer()
		 * @generated
		 */
		EClass PUBLIC_INFRASTRUCTURE_LAYER = eINSTANCE.getPublicInfrastructureLayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_INFRASTRUCTURE_LAYER__NAME = eINSTANCE.getPublicInfrastructureLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_INFRASTRUCTURE_LAYER__COMPONENTS = eINSTANCE.getPublicInfrastructureLayer_Components();

		/**
		 * The meta object literal for the '{@link smartcity.infrastructure.impl.InfrastructureComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcity.infrastructure.impl.InfrastructureComponentImpl
		 * @see smartcity.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureComponent()
		 * @generated
		 */
		EClass INFRASTRUCTURE_COMPONENT = eINSTANCE.getInfrastructureComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_COMPONENT__NAME = eINSTANCE.getInfrastructureComponent_Name();

	}

} //InfrastructurePackage
