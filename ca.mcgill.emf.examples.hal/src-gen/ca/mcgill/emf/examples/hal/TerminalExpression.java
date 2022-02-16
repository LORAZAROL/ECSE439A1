/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.TerminalExpression#getString <em>String</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.TerminalExpression#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getTerminalExpression()
 * @model
 * @generated
 */
public interface TerminalExpression extends Precondition {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getTerminalExpression_String()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.TerminalExpression#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getTerminalExpression_Sensor()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Sensor> getSensor();

} // TerminalExpression
