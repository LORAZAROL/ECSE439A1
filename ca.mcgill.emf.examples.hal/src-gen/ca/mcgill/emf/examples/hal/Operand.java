/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Operand#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Operand#getSentence <em>Sentence</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getOperand()
 * @model
 * @generated
 */
public interface Operand extends Precondition {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Precondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getOperand_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Precondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence</em>' attribute.
	 * @see #setSentence(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getOperand_Sentence()
	 * @model
	 * @generated
	 */
	String getSentence();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Operand#getSentence <em>Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentence</em>' attribute.
	 * @see #getSentence()
	 * @generated
	 */
	void setSentence(String value);

} // Operand
