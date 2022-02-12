/**
 */
package ca.mcgill.emf.examples.hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorActivity#getMeasuredValue <em>Measured Value</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorActivity()
 * @model
 * @generated
 */
public interface SensorActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Measured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Value</em>' attribute.
	 * @see #setMeasuredValue(float)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorActivity_MeasuredValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getMeasuredValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorActivity#getMeasuredValue <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Value</em>' attribute.
	 * @see #getMeasuredValue()
	 * @generated
	 */
	void setMeasuredValue(float value);

} // SensorActivity
