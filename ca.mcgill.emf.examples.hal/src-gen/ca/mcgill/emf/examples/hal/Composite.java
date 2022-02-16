/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Composite#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Composite#getBooleanOperator <em>Boolean Operator</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends Precondition {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Precondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getComposite_Precondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Precondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Boolean Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.examples.hal.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Operator</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.BooleanOperator
	 * @see #setBooleanOperator(BooleanOperator)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getComposite_BooleanOperator()
	 * @model
	 * @generated
	 */
	BooleanOperator getBooleanOperator();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Composite#getBooleanOperator <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Operator</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.BooleanOperator
	 * @see #getBooleanOperator()
	 * @generated
	 */
	void setBooleanOperator(BooleanOperator value);

} // Composite
