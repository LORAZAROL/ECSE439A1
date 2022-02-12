/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.DeviceType#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.DeviceType#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getDeviceType()
 * @model abstract="true"
 * @generated
 */
public interface DeviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Type</em>' attribute.
	 * @see #setDeviceType(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getDeviceType_DeviceType()
	 * @model
	 * @generated
	 */
	String getDeviceType();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.DeviceType#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(String value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Device}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Device#getDevicetypes <em>Devicetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getDeviceType_Devices()
	 * @see ca.mcgill.emf.examples.hal.Device#getDevicetypes
	 * @model opposite="devicetypes"
	 * @generated
	 */
	EList<Device> getDevices();

} // DeviceType
