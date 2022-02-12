/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.BooleanOperator;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Operation;

import ca.mcgill.emf.examples.hal.Sensor;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.OperationImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.OperationImpl#getBooleanOperator <em>Boolean Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends PreconditionImpl implements Operation {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensor;

	/**
	 * The default value of the '{@link #getBooleanOperator() <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanOperator BOOLEAN_OPERATOR_EDEFAULT = BooleanOperator.AND;

	/**
	 * The cached value of the '{@link #getBooleanOperator() <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperator booleanOperator = BOOLEAN_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectResolvingEList<Sensor>(Sensor.class, this, HalPackage.OPERATION__SENSOR);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator getBooleanOperator() {
		return booleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanOperator(BooleanOperator newBooleanOperator) {
		BooleanOperator oldBooleanOperator = booleanOperator;
		booleanOperator = newBooleanOperator == null ? BOOLEAN_OPERATOR_EDEFAULT : newBooleanOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.OPERATION__BOOLEAN_OPERATOR,
					oldBooleanOperator, booleanOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.OPERATION__SENSOR:
			return getSensor();
		case HalPackage.OPERATION__BOOLEAN_OPERATOR:
			return getBooleanOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HalPackage.OPERATION__SENSOR:
			getSensor().clear();
			getSensor().addAll((Collection<? extends Sensor>) newValue);
			return;
		case HalPackage.OPERATION__BOOLEAN_OPERATOR:
			setBooleanOperator((BooleanOperator) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HalPackage.OPERATION__SENSOR:
			getSensor().clear();
			return;
		case HalPackage.OPERATION__BOOLEAN_OPERATOR:
			setBooleanOperator(BOOLEAN_OPERATOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HalPackage.OPERATION__SENSOR:
			return sensor != null && !sensor.isEmpty();
		case HalPackage.OPERATION__BOOLEAN_OPERATOR:
			return booleanOperator != BOOLEAN_OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (booleanOperator: ");
		result.append(booleanOperator);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
