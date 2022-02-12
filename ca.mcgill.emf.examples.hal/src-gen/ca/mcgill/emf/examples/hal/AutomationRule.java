/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.AutomationRule#getPassword <em>Password</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.AutomationRule#isStatus <em>Status</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.AutomationRule#getControlcommand <em>Controlcommand</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.AutomationRule#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule()
 * @model
 * @generated
 */
public interface AutomationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.AutomationRule#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.AutomationRule#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Controlcommand</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.ControlCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcommand</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule_Controlcommand()
	 * @model
	 * @generated
	 */
	EList<ControlCommand> getControlcommand();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Precondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule_Precondition()
	 * @model
	 * @generated
	 */
	EList<Precondition> getPrecondition();

} // AutomationRule
