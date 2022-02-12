/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Sensor#getSensoractivity <em>Sensoractivity</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Sensor#getSensortypes <em>Sensortypes</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Device {
	/**
	 * Returns the value of the '<em><b>Sensoractivity</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SensorActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensoractivity</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor_Sensoractivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorActivity> getSensoractivity();

	/**
	 * Returns the value of the '<em><b>Sensortypes</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SensorType}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorType#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensortypes</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor_Sensortypes()
	 * @see ca.mcgill.emf.examples.hal.SensorType#getSensors
	 * @model opposite="sensors"
	 * @generated
	 */
	EList<SensorType> getSensortypes();

} // Sensor
