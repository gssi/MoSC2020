/**
 */
package smartcity.infrastructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Infrastructure Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcity.infrastructure.PublicInfrastructureLayer#getName <em>Name</em>}</li>
 *   <li>{@link smartcity.infrastructure.PublicInfrastructureLayer#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see smartcity.infrastructure.InfrastructurePackage#getPublicInfrastructureLayer()
 * @model
 * @generated
 */
public interface PublicInfrastructureLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartcity.infrastructure.InfrastructurePackage#getPublicInfrastructureLayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartcity.infrastructure.PublicInfrastructureLayer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link smartcity.infrastructure.InfrastructureComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see smartcity.infrastructure.InfrastructurePackage#getPublicInfrastructureLayer_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfrastructureComponent> getComponents();

} // PublicInfrastructureLayer
