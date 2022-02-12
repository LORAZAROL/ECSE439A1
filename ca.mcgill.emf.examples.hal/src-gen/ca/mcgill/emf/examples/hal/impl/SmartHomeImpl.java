/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.AutomationRule;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.SmartHome;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl#getAutomationrule <em>Automationrule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartHomeImpl extends MinimalEObjectImpl.Container implements SmartHome {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getAutomationrule() <em>Automationrule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationrule()
	 * @generated
	 * @ordered
	 */
	protected EList<AutomationRule> automationrule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartHomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SMART_HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__POSTAL_CODE, oldPostalCode,
					postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<Room>(Room.class, this, HalPackage.SMART_HOME__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutomationRule> getAutomationrule() {
		if (automationrule == null) {
			automationrule = new EObjectResolvingEList<AutomationRule>(AutomationRule.class, this,
					HalPackage.SMART_HOME__AUTOMATIONRULE);
		}
		return automationrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.SMART_HOME__ADDRESS:
			return getAddress();
		case HalPackage.SMART_HOME__POSTAL_CODE:
			return getPostalCode();
		case HalPackage.SMART_HOME__ROOMS:
			return getRooms();
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			return getAutomationrule();
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
		case HalPackage.SMART_HOME__ADDRESS:
			setAddress((String) newValue);
			return;
		case HalPackage.SMART_HOME__POSTAL_CODE:
			setPostalCode((String) newValue);
			return;
		case HalPackage.SMART_HOME__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			getAutomationrule().clear();
			getAutomationrule().addAll((Collection<? extends AutomationRule>) newValue);
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
		case HalPackage.SMART_HOME__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case HalPackage.SMART_HOME__POSTAL_CODE:
			setPostalCode(POSTAL_CODE_EDEFAULT);
			return;
		case HalPackage.SMART_HOME__ROOMS:
			getRooms().clear();
			return;
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			getAutomationrule().clear();
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
		case HalPackage.SMART_HOME__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case HalPackage.SMART_HOME__POSTAL_CODE:
			return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
		case HalPackage.SMART_HOME__ROOMS:
			return rooms != null && !rooms.isEmpty();
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			return automationrule != null && !automationrule.isEmpty();
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
		result.append(" (address: ");
		result.append(address);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(')');
		return result.toString();
	}

} //SmartHomeImpl
