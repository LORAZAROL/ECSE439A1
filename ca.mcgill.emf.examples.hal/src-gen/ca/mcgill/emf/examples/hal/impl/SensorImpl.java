/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Sensor;
import ca.mcgill.emf.examples.hal.SensorActivity;

import ca.mcgill.emf.examples.hal.SensorType;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorImpl#getSensoractivity <em>Sensoractivity</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorImpl#getSensortypes <em>Sensortypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends DeviceImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getSensoractivity() <em>Sensoractivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensoractivity()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorActivity> sensoractivity;

	/**
	 * The cached value of the '{@link #getSensortypes() <em>Sensortypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensortypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorType> sensortypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorActivity> getSensoractivity() {
		if (sensoractivity == null) {
			sensoractivity = new EObjectContainmentEList<SensorActivity>(SensorActivity.class, this,
					HalPackage.SENSOR__SENSORACTIVITY);
		}
		return sensoractivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorType> getSensortypes() {
		if (sensortypes == null) {
			sensortypes = new EObjectWithInverseResolvingEList.ManyInverse<SensorType>(SensorType.class, this,
					HalPackage.SENSOR__SENSORTYPES, HalPackage.SENSOR_TYPE__SENSORS);
		}
		return sensortypes;
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
		case HalPackage.SENSOR__SENSORTYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSensortypes()).basicAdd(otherEnd, msgs);
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
		case HalPackage.SENSOR__SENSORACTIVITY:
			return ((InternalEList<?>) getSensoractivity()).basicRemove(otherEnd, msgs);
		case HalPackage.SENSOR__SENSORTYPES:
			return ((InternalEList<?>) getSensortypes()).basicRemove(otherEnd, msgs);
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
		case HalPackage.SENSOR__SENSORACTIVITY:
			return getSensoractivity();
		case HalPackage.SENSOR__SENSORTYPES:
			return getSensortypes();
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
		case HalPackage.SENSOR__SENSORACTIVITY:
			getSensoractivity().clear();
			getSensoractivity().addAll((Collection<? extends SensorActivity>) newValue);
			return;
		case HalPackage.SENSOR__SENSORTYPES:
			getSensortypes().clear();
			getSensortypes().addAll((Collection<? extends SensorType>) newValue);
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
		case HalPackage.SENSOR__SENSORACTIVITY:
			getSensoractivity().clear();
			return;
		case HalPackage.SENSOR__SENSORTYPES:
			getSensortypes().clear();
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
		case HalPackage.SENSOR__SENSORACTIVITY:
			return sensoractivity != null && !sensoractivity.isEmpty();
		case HalPackage.SENSOR__SENSORTYPES:
			return sensortypes != null && !sensortypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl
