/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.Actuator;
import ca.mcgill.emf.examples.hal.ActuatorActivity;
import ca.mcgill.emf.examples.hal.ActuatorType;
import ca.mcgill.emf.examples.hal.ControlCommand;
import ca.mcgill.emf.examples.hal.HalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl#getActuatoractivity <em>Actuatoractivity</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl#getControlcommand <em>Controlcommand</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl#getActuatortype <em>Actuatortype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends DeviceImpl implements Actuator {
	/**
	 * The cached value of the '{@link #getActuatoractivity() <em>Actuatoractivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatoractivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorActivity> actuatoractivity;

	/**
	 * The cached value of the '{@link #getControlcommand() <em>Controlcommand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlcommand()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlCommand> controlcommand;

	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActuatortype() <em>Actuatortype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatortype()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorType> actuatortype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorActivity> getActuatoractivity() {
		if (actuatoractivity == null) {
			actuatoractivity = new EObjectContainmentEList<ActuatorActivity>(ActuatorActivity.class, this,
					HalPackage.ACTUATOR__ACTUATORACTIVITY);
		}
		return actuatoractivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlCommand> getControlcommand() {
		if (controlcommand == null) {
			controlcommand = new EObjectWithInverseResolvingEList<ControlCommand>(ControlCommand.class, this,
					HalPackage.ACTUATOR__CONTROLCOMMAND, HalPackage.CONTROL_COMMAND__ACTUATOR);
		}
		return controlcommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorType> getActuatortype() {
		if (actuatortype == null) {
			actuatortype = new EObjectWithInverseResolvingEList.ManyInverse<ActuatorType>(ActuatorType.class, this,
					HalPackage.ACTUATOR__ACTUATORTYPE, HalPackage.ACTUATOR_TYPE__ACTUATORS);
		}
		return actuatortype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.ACTUATOR__CONTROLCOMMAND:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControlcommand()).basicAdd(otherEnd, msgs);
		case HalPackage.ACTUATOR__ACTUATORTYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActuatortype()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.ACTUATOR__ACTUATORACTIVITY:
			return ((InternalEList<?>) getActuatoractivity()).basicRemove(otherEnd, msgs);
		case HalPackage.ACTUATOR__CONTROLCOMMAND:
			return ((InternalEList<?>) getControlcommand()).basicRemove(otherEnd, msgs);
		case HalPackage.ACTUATOR__ACTUATORTYPE:
			return ((InternalEList<?>) getActuatortype()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.ACTUATOR__ACTUATORACTIVITY:
			return getActuatoractivity();
		case HalPackage.ACTUATOR__CONTROLCOMMAND:
			return getControlcommand();
		case HalPackage.ACTUATOR__STATUS:
			return isStatus();
		case HalPackage.ACTUATOR__ACTUATORTYPE:
			return getActuatortype();
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
		case HalPackage.ACTUATOR__ACTUATORACTIVITY:
			getActuatoractivity().clear();
			getActuatoractivity().addAll((Collection<? extends ActuatorActivity>) newValue);
			return;
		case HalPackage.ACTUATOR__CONTROLCOMMAND:
			getControlcommand().clear();
			getControlcommand().addAll((Collection<? extends ControlCommand>) newValue);
			return;
		case HalPackage.ACTUATOR__STATUS:
			setStatus((Boolean) newValue);
			return;
		case HalPackage.ACTUATOR__ACTUATORTYPE:
			getActuatortype().clear();
			getActuatortype().addAll((Collection<? extends ActuatorType>) newValue);
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
		case HalPackage.ACTUATOR__ACTUATORACTIVITY:
			getActuatoractivity().clear();
			return;
		case HalPackage.ACTUATOR__CONTROLCOMMAND:
			getControlcommand().clear();
			return;
		case HalPackage.ACTUATOR__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case HalPackage.ACTUATOR__ACTUATORTYPE:
			getActuatortype().clear();
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
		case HalPackage.ACTUATOR__ACTUATORACTIVITY:
			return actuatoractivity != null && !actuatoractivity.isEmpty();
		case HalPackage.ACTUATOR__CONTROLCOMMAND:
			return controlcommand != null && !controlcommand.isEmpty();
		case HalPackage.ACTUATOR__STATUS:
			return status != STATUS_EDEFAULT;
		case HalPackage.ACTUATOR__ACTUATORTYPE:
			return actuatortype != null && !actuatortype.isEmpty();
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
