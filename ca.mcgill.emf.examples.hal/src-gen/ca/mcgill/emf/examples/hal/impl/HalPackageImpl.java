/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.Activity;
import ca.mcgill.emf.examples.hal.Actuator;
import ca.mcgill.emf.examples.hal.ActuatorActivity;
import ca.mcgill.emf.examples.hal.AutomationActivity;
import ca.mcgill.emf.examples.hal.AutomationRule;
import ca.mcgill.emf.examples.hal.BooleanOperator;
import ca.mcgill.emf.examples.hal.ControlCommand;
import ca.mcgill.emf.examples.hal.Device;
import ca.mcgill.emf.examples.hal.DeviceType;
import ca.mcgill.emf.examples.hal.HalFactory;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.HomeAutomationSystem;
import ca.mcgill.emf.examples.hal.Operand;
import ca.mcgill.emf.examples.hal.Operation;
import ca.mcgill.emf.examples.hal.Owner;
import ca.mcgill.emf.examples.hal.Precondition;
import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.Sensor;
import ca.mcgill.emf.examples.hal.SensorActivity;
import ca.mcgill.emf.examples.hal.SmartHome;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HalPackageImpl extends EPackageImpl implements HalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartHomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass homeAutomationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.mcgill.emf.examples.hal.HalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HalPackageImpl() {
		super(eNS_URI, HalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HalPackage init() {
		if (isInited)
			return (HalPackage) EPackage.Registry.INSTANCE.getEPackage(HalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HalPackageImpl theHalPackage = registeredHalPackage instanceof HalPackageImpl
				? (HalPackageImpl) registeredHalPackage
				: new HalPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHalPackage.createPackageContents();

		// Initialize created meta-data
		theHalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HalPackage.eNS_URI, theHalPackage);
		return theHalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceType() {
		return deviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_DeviceType() {
		return (EAttribute) deviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Name() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Devicetype() {
		return (EReference) deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Room() {
		return (EReference) deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Actuatoractivity() {
		return (EReference) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Controlcommand() {
		return (EReference) actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_Status() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Name() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Devices() {
		return (EReference) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartHome() {
		return smartHomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartHome_Address() {
		return (EAttribute) smartHomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartHome_PostalCode() {
		return (EAttribute) smartHomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartHome_Room() {
		return (EReference) smartHomeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartHome_Automationrule() {
		return (EReference) smartHomeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwner() {
		return ownerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwner_Smarthome() {
		return (EReference) ownerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHomeAutomationSystem() {
		return homeAutomationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHomeAutomationSystem_Smarthome() {
		return (EReference) homeAutomationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHomeAutomationSystem_Activity() {
		return (EReference) homeAutomationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomationRule() {
		return automationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomationRule_Password() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomationRule_Status() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomationRule_Controlcommand() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomationRule_Precondition() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Timestamp() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomationActivity() {
		return automationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorActivity() {
		return actuatorActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorActivity() {
		return sensorActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorActivity_MeasuredValue() {
		return (EAttribute) sensorActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlCommand() {
		return controlCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlCommand_Instruction() {
		return (EAttribute) controlCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlCommand_Actuator() {
		return (EReference) controlCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Sensoractivity() {
		return (EReference) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecondition() {
		return preconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperand() {
		return operandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperand_Precondition() {
		return (EReference) operandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperand_Sentence() {
		return (EAttribute) operandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Sensor() {
		return (EReference) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_BooleanOperator() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanOperator() {
		return booleanOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalFactory getHalFactory() {
		return (HalFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		deviceTypeEClass = createEClass(DEVICE_TYPE);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__DEVICE_TYPE);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEReference(deviceEClass, DEVICE__DEVICETYPE);
		createEReference(deviceEClass, DEVICE__ROOM);

		actuatorEClass = createEClass(ACTUATOR);
		createEReference(actuatorEClass, ACTUATOR__ACTUATORACTIVITY);
		createEReference(actuatorEClass, ACTUATOR__CONTROLCOMMAND);
		createEAttribute(actuatorEClass, ACTUATOR__STATUS);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NAME);
		createEReference(roomEClass, ROOM__DEVICES);

		smartHomeEClass = createEClass(SMART_HOME);
		createEAttribute(smartHomeEClass, SMART_HOME__ADDRESS);
		createEAttribute(smartHomeEClass, SMART_HOME__POSTAL_CODE);
		createEReference(smartHomeEClass, SMART_HOME__ROOM);
		createEReference(smartHomeEClass, SMART_HOME__AUTOMATIONRULE);

		ownerEClass = createEClass(OWNER);
		createEReference(ownerEClass, OWNER__SMARTHOME);

		homeAutomationSystemEClass = createEClass(HOME_AUTOMATION_SYSTEM);
		createEReference(homeAutomationSystemEClass, HOME_AUTOMATION_SYSTEM__SMARTHOME);
		createEReference(homeAutomationSystemEClass, HOME_AUTOMATION_SYSTEM__ACTIVITY);

		automationRuleEClass = createEClass(AUTOMATION_RULE);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__PASSWORD);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__STATUS);
		createEReference(automationRuleEClass, AUTOMATION_RULE__CONTROLCOMMAND);
		createEReference(automationRuleEClass, AUTOMATION_RULE__PRECONDITION);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__TIMESTAMP);

		automationActivityEClass = createEClass(AUTOMATION_ACTIVITY);

		actuatorActivityEClass = createEClass(ACTUATOR_ACTIVITY);

		sensorActivityEClass = createEClass(SENSOR_ACTIVITY);
		createEAttribute(sensorActivityEClass, SENSOR_ACTIVITY__MEASURED_VALUE);

		controlCommandEClass = createEClass(CONTROL_COMMAND);
		createEAttribute(controlCommandEClass, CONTROL_COMMAND__INSTRUCTION);
		createEReference(controlCommandEClass, CONTROL_COMMAND__ACTUATOR);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__SENSORACTIVITY);

		preconditionEClass = createEClass(PRECONDITION);

		operandEClass = createEClass(OPERAND);
		createEReference(operandEClass, OPERAND__PRECONDITION);
		createEAttribute(operandEClass, OPERAND__SENTENCE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__SENSOR);
		createEAttribute(operationEClass, OPERATION__BOOLEAN_OPERATOR);

		// Create enums
		booleanOperatorEEnum = createEEnum(BOOLEAN_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actuatorEClass.getESuperTypes().add(this.getDevice());
		automationActivityEClass.getESuperTypes().add(this.getActivity());
		actuatorActivityEClass.getESuperTypes().add(this.getActivity());
		sensorActivityEClass.getESuperTypes().add(this.getActivity());
		sensorEClass.getESuperTypes().add(this.getDevice());
		operandEClass.getESuperTypes().add(this.getPrecondition());
		operationEClass.getESuperTypes().add(this.getPrecondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceType_DeviceType(), ecorePackage.getEString(), "deviceType", null, 0, 1,
				DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Devicetype(), this.getDeviceType(), null, "devicetype", null, 1, -1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Room(), this.getRoom(), this.getRoom_Devices(), "room", null, 1, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActuator_Actuatoractivity(), this.getActuatorActivity(), null, "actuatoractivity", null, 0,
				-1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_Controlcommand(), this.getControlCommand(), this.getControlCommand_Actuator(),
				"controlcommand", null, 0, -1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_Status(), theXMLTypePackage.getBoolean(), "status", null, 0, 1, Actuator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Devices(), this.getDevice(), this.getDevice_Room(), "devices", null, 0, -1, Room.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartHomeEClass, SmartHome.class, "SmartHome", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartHome_Address(), ecorePackage.getEString(), "address", null, 0, 1, SmartHome.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartHome_PostalCode(), ecorePackage.getEString(), "postalCode", null, 0, 1, SmartHome.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartHome_Room(), this.getRoom(), null, "room", null, 0, -1, SmartHome.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSmartHome_Automationrule(), this.getAutomationRule(), null, "automationrule", null, 0, -1,
				SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownerEClass, Owner.class, "Owner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwner_Smarthome(), this.getSmartHome(), null, "smarthome", null, 0, -1, Owner.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(homeAutomationSystemEClass, HomeAutomationSystem.class, "HomeAutomationSystem", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHomeAutomationSystem_Smarthome(), this.getSmartHome(), null, "smarthome", null, 0, -1,
				HomeAutomationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHomeAutomationSystem_Activity(), this.getActivity(), null, "activity", null, 0, -1,
				HomeAutomationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automationRuleEClass, AutomationRule.class, "AutomationRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomationRule_Password(), ecorePackage.getEString(), "password", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomationRule_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Controlcommand(), this.getControlCommand(), null, "controlcommand", null, 0,
				-1, AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Precondition(), this.getPrecondition(), null, "precondition", null, 0, -1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Timestamp(), theXMLTypePackage.getTime(), "timestamp", null, 0, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automationActivityEClass, AutomationActivity.class, "AutomationActivity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorActivityEClass, ActuatorActivity.class, "ActuatorActivity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorActivityEClass, SensorActivity.class, "SensorActivity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorActivity_MeasuredValue(), theXMLTypePackage.getFloat(), "measuredValue", null, 0, 1,
				SensorActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(controlCommandEClass, ControlCommand.class, "ControlCommand", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlCommand_Instruction(), ecorePackage.getEString(), "instruction", null, 0, 1,
				ControlCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlCommand_Actuator(), this.getActuator(), this.getActuator_Controlcommand(), "actuator",
				null, 1, 1, ControlCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Sensoractivity(), this.getSensorActivity(), null, "sensoractivity", null, 0, -1,
				Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preconditionEClass, Precondition.class, "Precondition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operandEClass, Operand.class, "Operand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperand_Precondition(), this.getPrecondition(), null, "precondition", null, 0, -1,
				Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperand_Sentence(), ecorePackage.getEString(), "sentence", null, 0, 1, Operand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Sensor(), this.getSensor(), null, "sensor", null, 1, 2, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_BooleanOperator(), this.getBooleanOperator(), "booleanOperator", null, 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(booleanOperatorEEnum, BooleanOperator.class, "BooleanOperator");
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.AND);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.OR);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //HalPackageImpl
