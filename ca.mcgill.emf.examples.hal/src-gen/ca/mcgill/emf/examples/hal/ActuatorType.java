/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorType#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorType()
 * @model
 * @generated
 */
public interface ActuatorType extends DeviceType {
	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Actuator}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Actuator#getActuatortype <em>Actuatortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorType_Actuators()
	 * @see ca.mcgill.emf.examples.hal.Actuator#getActuatortype
	 * @model opposite="actuatortype"
	 * @generated
	 */
	EList<Actuator> getActuators();

} // ActuatorType
