/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.Activity;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.HomeAutomationSystem;
import ca.mcgill.emf.examples.hal.SmartHome;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home Automation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HomeAutomationSystemImpl#getSmarthomes <em>Smarthomes</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HomeAutomationSystemImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeAutomationSystemImpl extends MinimalEObjectImpl.Container implements HomeAutomationSystem {
	/**
	 * The cached value of the '{@link #getSmarthomes() <em>Smarthomes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmarthomes()
	 * @generated
	 * @ordered
	 */
	protected EList<SmartHome> smarthomes;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeAutomationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.HOME_AUTOMATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmartHome> getSmarthomes() {
		if (smarthomes == null) {
			smarthomes = new EObjectContainmentEList<SmartHome>(SmartHome.class, this,
					HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOMES);
		}
		return smarthomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this,
					HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOMES:
			return ((InternalEList<?>) getSmarthomes()).basicRemove(otherEnd, msgs);
		case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITY:
			return ((InternalEList<?>) getActivity()).basicRemove(otherEnd, msgs);
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
		case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOMES:
			return getSmarthomes();
		case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITY:
			return getActivity();
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
		case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOMES:
			getSmarthomes().clear();
			getSmarthomes().addAll((Collection<? extends SmartHome>) newValue);
			return;
		case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITY:
			getActivity().clear();
			getActivity().addAll((Collection<? extends Activity>) newValue);
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
		case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOMES:
			getSmarthomes().clear();
			return;
		case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITY:
			getActivity().clear();
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
		case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOMES:
			return smarthomes != null && !smarthomes.isEmpty();
		case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITY:
			return activity != null && !activity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HomeAutomationSystemImpl
