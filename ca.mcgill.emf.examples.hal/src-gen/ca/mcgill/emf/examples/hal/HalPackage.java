/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.examples.hal.HalFactory
 * @model kind="package"
 * @generated
 */
public interface HalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalPackage eINSTANCE = ca.mcgill.emf.examples.hal.impl.HalPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceTypeImpl <em>Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.DeviceTypeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__DEVICE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__DEVICES = 1;

	/**
	 * The number of structural features of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.DeviceImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Devicetypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICETYPES = 2;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActuatorImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ROOM = DEVICE__ROOM;

	/**
	 * The feature id for the '<em><b>Devicetypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DEVICETYPES = DEVICE__DEVICETYPES;

	/**
	 * The feature id for the '<em><b>Actuatoractivity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTUATORACTIVITY = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controlcommand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CONTROLCOMMAND = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__STATUS = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actuatortype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTUATORTYPE = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.RoomImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DEVICES = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl <em>Smart Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.SmartHomeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSmartHome()
	 * @generated
	 */
	int SMART_HOME = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__POSTAL_CODE = 1;

	/**
	 * The feature id for the '<em><b>Automationrule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__AUTOMATIONRULE = 2;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__ROOMS = 3;

	/**
	 * The number of structural features of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.OwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.OwnerImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 5;

	/**
	 * The feature id for the '<em><b>Smarthome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__SMARTHOME = 0;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.HomeAutomationSystemImpl <em>Home Automation System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.HomeAutomationSystemImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getHomeAutomationSystem()
	 * @generated
	 */
	int HOME_AUTOMATION_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Smarthomes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_AUTOMATION_SYSTEM__SMARTHOMES = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_AUTOMATION_SYSTEM__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Home Automation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_AUTOMATION_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Home Automation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_AUTOMATION_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.AutomationRuleImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getAutomationRule()
	 * @generated
	 */
	int AUTOMATION_RULE = 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PASSWORD = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Controlcommand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__CONTROLCOMMAND = 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PRECONDITION = 3;

	/**
	 * The number of structural features of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActivityImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.AutomationActivityImpl <em>Automation Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.AutomationActivityImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getAutomationActivity()
	 * @generated
	 */
	int AUTOMATION_ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_ACTIVITY__TIMESTAMP = ACTIVITY__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Automation Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Automation Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorActivityImpl <em>Actuator Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActuatorActivityImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuatorActivity()
	 * @generated
	 */
	int ACTUATOR_ACTIVITY = 10;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_ACTIVITY__TIMESTAMP = ACTIVITY__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Actuator Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.SensorActivityImpl <em>Sensor Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.SensorActivityImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensorActivity()
	 * @generated
	 */
	int SENSOR_ACTIVITY = 11;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTIVITY__TIMESTAMP = ACTIVITY__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Measured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTIVITY__MEASURED_VALUE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ControlCommandImpl <em>Control Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ControlCommandImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getControlCommand()
	 * @generated
	 */
	int CONTROL_COMMAND = 12;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__INSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__ACTUATOR = 1;

	/**
	 * The number of structural features of the '<em>Control Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.SensorImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ROOM = DEVICE__ROOM;

	/**
	 * The feature id for the '<em><b>Devicetypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DEVICETYPES = DEVICE__DEVICETYPES;

	/**
	 * The feature id for the '<em><b>Sensoractivity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSORACTIVITY = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensortypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSORTYPES = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.PreconditionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 14;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.OperandImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 15;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__PRECONDITION = PRECONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__SENTENCE = PRECONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__SENSOR = PRECONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = PRECONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_OPERATION_COUNT = PRECONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.OperationImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Boolean Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BOOLEAN_OPERATOR = PRECONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = PRECONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = PRECONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.SensorTypeImpl <em>Sensor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.SensorTypeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE__DEVICE_TYPE = DEVICE_TYPE__DEVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE__DEVICES = DEVICE_TYPE__DEVICES;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE__SENSORS = DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorTypeImpl <em>Actuator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActuatorTypeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE__DEVICE_TYPE = DEVICE_TYPE__DEVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE__DEVICES = DEVICE_TYPE__DEVICES;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE__ACTUATORS = DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.BooleanOperator
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 19;

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.DeviceType
	 * @generated
	 */
	EClass getDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.DeviceType#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.DeviceType#getDeviceType()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_DeviceType();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.DeviceType#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see ca.mcgill.emf.examples.hal.DeviceType#getDevices()
	 * @see #getDeviceType()
	 * @generated
	 */
	EReference getDeviceType_Devices();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.Device#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device#getRoom()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Room();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Device#getDevicetypes <em>Devicetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devicetypes</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device#getDevicetypes()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Devicetypes();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Actuator#getActuatoractivity <em>Actuatoractivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuatoractivity</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator#getActuatoractivity()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Actuatoractivity();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Actuator#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlcommand</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator#getControlcommand()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Controlcommand();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Actuator#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator#isStatus()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Status();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Actuator#getActuatortype <em>Actuatortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuatortype</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator#getActuatortype()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Actuatortype();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Room#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room#getDevices()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Devices();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.SmartHome <em>Smart Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Home</em>'.
	 * @see ca.mcgill.emf.examples.hal.SmartHome
	 * @generated
	 */
	EClass getSmartHome();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.SmartHome#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ca.mcgill.emf.examples.hal.SmartHome#getAddress()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_Address();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.SmartHome#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see ca.mcgill.emf.examples.hal.SmartHome#getPostalCode()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_PostalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.SmartHome#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see ca.mcgill.emf.examples.hal.SmartHome#getRooms()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Rooms();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.SmartHome#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Automationrule</em>'.
	 * @see ca.mcgill.emf.examples.hal.SmartHome#getAutomationrule()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Automationrule();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see ca.mcgill.emf.examples.hal.Owner
	 * @generated
	 */
	EClass getOwner();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Owner#getSmarthome <em>Smarthome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Smarthome</em>'.
	 * @see ca.mcgill.emf.examples.hal.Owner#getSmarthome()
	 * @see #getOwner()
	 * @generated
	 */
	EReference getOwner_Smarthome();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.HomeAutomationSystem <em>Home Automation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Automation System</em>'.
	 * @see ca.mcgill.emf.examples.hal.HomeAutomationSystem
	 * @generated
	 */
	EClass getHomeAutomationSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.HomeAutomationSystem#getSmarthomes <em>Smarthomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smarthomes</em>'.
	 * @see ca.mcgill.emf.examples.hal.HomeAutomationSystem#getSmarthomes()
	 * @see #getHomeAutomationSystem()
	 * @generated
	 */
	EReference getHomeAutomationSystem_Smarthomes();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.HomeAutomationSystem#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see ca.mcgill.emf.examples.hal.HomeAutomationSystem#getActivity()
	 * @see #getHomeAutomationSystem()
	 * @generated
	 */
	EReference getHomeAutomationSystem_Activity();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule</em>'.
	 * @see ca.mcgill.emf.examples.hal.AutomationRule
	 * @generated
	 */
	EClass getAutomationRule();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.AutomationRule#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ca.mcgill.emf.examples.hal.AutomationRule#getPassword()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Password();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.AutomationRule#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ca.mcgill.emf.examples.hal.AutomationRule#isStatus()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Status();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.AutomationRule#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlcommand</em>'.
	 * @see ca.mcgill.emf.examples.hal.AutomationRule#getControlcommand()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Controlcommand();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.AutomationRule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.examples.hal.AutomationRule#getPrecondition()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Precondition();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see ca.mcgill.emf.examples.hal.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Activity#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see ca.mcgill.emf.examples.hal.Activity#getTimestamp()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Timestamp();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.AutomationActivity <em>Automation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Activity</em>'.
	 * @see ca.mcgill.emf.examples.hal.AutomationActivity
	 * @generated
	 */
	EClass getAutomationActivity();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.ActuatorActivity <em>Actuator Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Activity</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActuatorActivity
	 * @generated
	 */
	EClass getActuatorActivity();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.SensorActivity <em>Sensor Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Activity</em>'.
	 * @see ca.mcgill.emf.examples.hal.SensorActivity
	 * @generated
	 */
	EClass getSensorActivity();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.SensorActivity#getMeasuredValue <em>Measured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measured Value</em>'.
	 * @see ca.mcgill.emf.examples.hal.SensorActivity#getMeasuredValue()
	 * @see #getSensorActivity()
	 * @generated
	 */
	EAttribute getSensorActivity_MeasuredValue();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.ControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Command</em>'.
	 * @see ca.mcgill.emf.examples.hal.ControlCommand
	 * @generated
	 */
	EClass getControlCommand();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.ControlCommand#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction</em>'.
	 * @see ca.mcgill.emf.examples.hal.ControlCommand#getInstruction()
	 * @see #getControlCommand()
	 * @generated
	 */
	EAttribute getControlCommand_Instruction();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.ControlCommand#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see ca.mcgill.emf.examples.hal.ControlCommand#getActuator()
	 * @see #getControlCommand()
	 * @generated
	 */
	EReference getControlCommand_Actuator();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Sensor#getSensoractivity <em>Sensoractivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensoractivity</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor#getSensoractivity()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Sensoractivity();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Sensor#getSensortypes <em>Sensortypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensortypes</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor#getSensortypes()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Sensortypes();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.examples.hal.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see ca.mcgill.emf.examples.hal.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Operand#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.examples.hal.Operand#getPrecondition()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Operand#getSentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentence</em>'.
	 * @see ca.mcgill.emf.examples.hal.Operand#getSentence()
	 * @see #getOperand()
	 * @generated
	 */
	EAttribute getOperand_Sentence();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Operand#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensor</em>'.
	 * @see ca.mcgill.emf.examples.hal.Operand#getSensor()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_Sensor();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ca.mcgill.emf.examples.hal.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Operation#getBooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Operator</em>'.
	 * @see ca.mcgill.emf.examples.hal.Operation#getBooleanOperator()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_BooleanOperator();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.SensorType
	 * @generated
	 */
	EClass getSensorType();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.SensorType#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see ca.mcgill.emf.examples.hal.SensorType#getSensors()
	 * @see #getSensorType()
	 * @generated
	 */
	EReference getSensorType_Sensors();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActuatorType
	 * @generated
	 */
	EClass getActuatorType();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.ActuatorType#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuators</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActuatorType#getActuators()
	 * @see #getActuatorType()
	 * @generated
	 */
	EReference getActuatorType_Actuators();

	/**
	 * Returns the meta object for enum '{@link ca.mcgill.emf.examples.hal.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see ca.mcgill.emf.examples.hal.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HalFactory getHalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceTypeImpl <em>Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.DeviceTypeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDeviceType()
		 * @generated
		 */
		EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__DEVICE_TYPE = eINSTANCE.getDeviceType_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TYPE__DEVICES = eINSTANCE.getDeviceType_Devices();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.DeviceImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ROOM = eINSTANCE.getDevice_Room();

		/**
		 * The meta object literal for the '<em><b>Devicetypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__DEVICETYPES = eINSTANCE.getDevice_Devicetypes();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActuatorImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Actuatoractivity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ACTUATORACTIVITY = eINSTANCE.getActuator_Actuatoractivity();

		/**
		 * The meta object literal for the '<em><b>Controlcommand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__CONTROLCOMMAND = eINSTANCE.getActuator_Controlcommand();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__STATUS = eINSTANCE.getActuator_Status();

		/**
		 * The meta object literal for the '<em><b>Actuatortype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ACTUATORTYPE = eINSTANCE.getActuator_Actuatortype();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.RoomImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DEVICES = eINSTANCE.getRoom_Devices();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.SmartHomeImpl <em>Smart Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.SmartHomeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSmartHome()
		 * @generated
		 */
		EClass SMART_HOME = eINSTANCE.getSmartHome();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__ADDRESS = eINSTANCE.getSmartHome_Address();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__POSTAL_CODE = eINSTANCE.getSmartHome_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__ROOMS = eINSTANCE.getSmartHome_Rooms();

		/**
		 * The meta object literal for the '<em><b>Automationrule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__AUTOMATIONRULE = eINSTANCE.getSmartHome_Automationrule();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.OwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.OwnerImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getOwner()
		 * @generated
		 */
		EClass OWNER = eINSTANCE.getOwner();

		/**
		 * The meta object literal for the '<em><b>Smarthome</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNER__SMARTHOME = eINSTANCE.getOwner_Smarthome();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.HomeAutomationSystemImpl <em>Home Automation System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.HomeAutomationSystemImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getHomeAutomationSystem()
		 * @generated
		 */
		EClass HOME_AUTOMATION_SYSTEM = eINSTANCE.getHomeAutomationSystem();

		/**
		 * The meta object literal for the '<em><b>Smarthomes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME_AUTOMATION_SYSTEM__SMARTHOMES = eINSTANCE.getHomeAutomationSystem_Smarthomes();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME_AUTOMATION_SYSTEM__ACTIVITY = eINSTANCE.getHomeAutomationSystem_Activity();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.AutomationRuleImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getAutomationRule()
		 * @generated
		 */
		EClass AUTOMATION_RULE = eINSTANCE.getAutomationRule();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__PASSWORD = eINSTANCE.getAutomationRule_Password();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__STATUS = eINSTANCE.getAutomationRule_Status();

		/**
		 * The meta object literal for the '<em><b>Controlcommand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__CONTROLCOMMAND = eINSTANCE.getAutomationRule_Controlcommand();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__PRECONDITION = eINSTANCE.getAutomationRule_Precondition();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActivityImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TIMESTAMP = eINSTANCE.getActivity_Timestamp();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.AutomationActivityImpl <em>Automation Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.AutomationActivityImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getAutomationActivity()
		 * @generated
		 */
		EClass AUTOMATION_ACTIVITY = eINSTANCE.getAutomationActivity();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorActivityImpl <em>Actuator Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActuatorActivityImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuatorActivity()
		 * @generated
		 */
		EClass ACTUATOR_ACTIVITY = eINSTANCE.getActuatorActivity();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.SensorActivityImpl <em>Sensor Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.SensorActivityImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensorActivity()
		 * @generated
		 */
		EClass SENSOR_ACTIVITY = eINSTANCE.getSensorActivity();

		/**
		 * The meta object literal for the '<em><b>Measured Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_ACTIVITY__MEASURED_VALUE = eINSTANCE.getSensorActivity_MeasuredValue();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ControlCommandImpl <em>Control Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ControlCommandImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getControlCommand()
		 * @generated
		 */
		EClass CONTROL_COMMAND = eINSTANCE.getControlCommand();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_COMMAND__INSTRUCTION = eINSTANCE.getControlCommand_Instruction();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_COMMAND__ACTUATOR = eINSTANCE.getControlCommand_Actuator();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.SensorImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensoractivity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SENSORACTIVITY = eINSTANCE.getSensor_Sensoractivity();

		/**
		 * The meta object literal for the '<em><b>Sensortypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SENSORTYPES = eINSTANCE.getSensor_Sensortypes();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.PreconditionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.OperandImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__PRECONDITION = eINSTANCE.getOperand_Precondition();

		/**
		 * The meta object literal for the '<em><b>Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND__SENTENCE = eINSTANCE.getOperand_Sentence();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__SENSOR = eINSTANCE.getOperand_Sensor();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.OperationImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Boolean Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__BOOLEAN_OPERATOR = eINSTANCE.getOperation_BooleanOperator();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.SensorTypeImpl <em>Sensor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.SensorTypeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensorType()
		 * @generated
		 */
		EClass SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_TYPE__SENSORS = eINSTANCE.getSensorType_Sensors();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorTypeImpl <em>Actuator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActuatorTypeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuatorType()
		 * @generated
		 */
		EClass ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_TYPE__ACTUATORS = eINSTANCE.getActuatorType_Actuators();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.BooleanOperator
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

	}

} //HalPackage
