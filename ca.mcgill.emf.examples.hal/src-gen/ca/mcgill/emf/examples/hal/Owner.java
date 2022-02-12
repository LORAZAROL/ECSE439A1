/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Owner#getSmarthome <em>Smarthome</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getOwner()
 * @model
 * @generated
 */
public interface Owner extends EObject {
	/**
	 * Returns the value of the '<em><b>Smarthome</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.SmartHome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smarthome</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getOwner_Smarthome()
	 * @model
	 * @generated
	 */
	EList<SmartHome> getSmarthome();

} // Owner
