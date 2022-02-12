/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Device#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Device#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getDevice()
 * @model abstract="true"
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getDevice_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Room#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getDevice_Room()
	 * @see ca.mcgill.emf.examples.hal.Room#getDevices
	 * @model opposite="devices" required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Device#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Device
