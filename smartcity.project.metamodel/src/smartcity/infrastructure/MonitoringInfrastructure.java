/**
 */
package smartcity.infrastructure;

import org.eclipse.emf.common.util.EList;

import smartcity.DataAnalytics.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcity.infrastructure.MonitoringInfrastructure#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see smartcity.infrastructure.InfrastructurePackage#getMonitoringInfrastructure()
 * @model
 * @generated
 */
public interface MonitoringInfrastructure extends Source, InfrastructureComponent {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link smartcity.infrastructure.IoTDev}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see smartcity.infrastructure.InfrastructurePackage#getMonitoringInfrastructure_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<IoTDev> getDevices();

} // MonitoringInfrastructure
