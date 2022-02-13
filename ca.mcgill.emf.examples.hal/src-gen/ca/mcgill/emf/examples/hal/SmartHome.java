/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.SmartHome#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SmartHome#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SmartHome#getAutomationrule <em>Automationrule</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SmartHome#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome()
 * @model
 * @generated
 */
public interface SmartHome extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SmartHome#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome_PostalCode()
	 * @model
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SmartHome#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Automationrule</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.AutomationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automationrule</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSmartHome_Automationrule()
	 * @model
	 * @generated
	 */
	EList<AutomationRule> getAutomationrule();

} // SmartHome
