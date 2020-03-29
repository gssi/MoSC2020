/**
 */
package smartcity.infrastructure.impl;

import org.eclipse.emf.ecore.EClass;

import smartcity.infrastructure.InfrastructurePackage;
import smartcity.infrastructure.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SensorImpl extends IoTDevImpl implements Sensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.SENSOR;
	}

} //SensorImpl
