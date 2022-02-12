/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home Automation System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.HomeAutomationSystem#getSmarthome <em>Smarthome</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.HomeAutomationSystem#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getHomeAutomationSystem()
 * @model
 * @generated
 */
public interface HomeAutomationSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Smarthome</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SmartHome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smarthome</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHomeAutomationSystem_Smarthome()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartHome> getSmarthome();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHomeAutomationSystem_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivity();

} // HomeAutomationSystem
