/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Actuator#getActuatoractivity <em>Actuatoractivity</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Actuator#getControlcommand <em>Controlcommand</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Actuator#isStatus <em>Status</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Actuator#getActuatortype <em>Actuatortype</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device {
	/**
	 * Returns the value of the '<em><b>Actuatoractivity</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ActuatorActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatoractivity</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator_Actuatoractivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActuatorActivity> getActuatoractivity();

	/**
	 * Returns the value of the '<em><b>Controlcommand</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ControlCommand}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ControlCommand#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcommand</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator_Controlcommand()
	 * @see ca.mcgill.emf.examples.hal.ControlCommand#getActuator
	 * @model opposite="actuator"
	 * @generated
	 */
	EList<ControlCommand> getControlcommand();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Actuator#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Actuatortype</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ActuatorType}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActuatorType#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatortype</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator_Actuatortype()
	 * @see ca.mcgill.emf.examples.hal.ActuatorType#getActuators
	 * @model opposite="actuators"
	 * @generated
	 */
	EList<ActuatorType> getActuatortype();

} // Actuator
