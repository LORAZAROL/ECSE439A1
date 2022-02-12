/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.examples.hal.HalPackage
 * @generated
 */
public interface HalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalFactory eINSTANCE = ca.mcgill.emf.examples.hal.impl.HalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Smart Home</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Home</em>'.
	 * @generated
	 */
	SmartHome createSmartHome();

	/**
	 * Returns a new object of class '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owner</em>'.
	 * @generated
	 */
	Owner createOwner();

	/**
	 * Returns a new object of class '<em>Home Automation System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Home Automation System</em>'.
	 * @generated
	 */
	HomeAutomationSystem createHomeAutomationSystem();

	/**
	 * Returns a new object of class '<em>Automation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automation Rule</em>'.
	 * @generated
	 */
	AutomationRule createAutomationRule();

	/**
	 * Returns a new object of class '<em>Automation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automation Activity</em>'.
	 * @generated
	 */
	AutomationActivity createAutomationActivity();

	/**
	 * Returns a new object of class '<em>Actuator Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Activity</em>'.
	 * @generated
	 */
	ActuatorActivity createActuatorActivity();

	/**
	 * Returns a new object of class '<em>Sensor Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Activity</em>'.
	 * @generated
	 */
	SensorActivity createSensorActivity();

	/**
	 * Returns a new object of class '<em>Control Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Command</em>'.
	 * @generated
	 */
	ControlCommand createControlCommand();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand</em>'.
	 * @generated
	 */
	Operand createOperand();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Sensor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Type</em>'.
	 * @generated
	 */
	SensorType createSensorType();

	/**
	 * Returns a new object of class '<em>Actuator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Type</em>'.
	 * @generated
	 */
	ActuatorType createActuatorType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HalPackage getHalPackage();

} //HalFactory
