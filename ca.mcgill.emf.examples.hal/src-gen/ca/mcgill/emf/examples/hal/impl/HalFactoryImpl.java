/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HalFactoryImpl extends EFactoryImpl implements HalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HalFactory init() {
		try {
			HalFactory theHalFactory = (HalFactory) EPackage.Registry.INSTANCE.getEFactory(HalPackage.eNS_URI);
			if (theHalFactory != null) {
				return theHalFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HalPackage.ACTUATOR:
			return createActuator();
		case HalPackage.ROOM:
			return createRoom();
		case HalPackage.SMART_HOME:
			return createSmartHome();
		case HalPackage.OWNER:
			return createOwner();
		case HalPackage.HOME_AUTOMATION_SYSTEM:
			return createHomeAutomationSystem();
		case HalPackage.AUTOMATION_RULE:
			return createAutomationRule();
		case HalPackage.AUTOMATION_ACTIVITY:
			return createAutomationActivity();
		case HalPackage.ACTUATOR_ACTIVITY:
			return createActuatorActivity();
		case HalPackage.SENSOR_ACTIVITY:
			return createSensorActivity();
		case HalPackage.CONTROL_COMMAND:
			return createControlCommand();
		case HalPackage.SENSOR:
			return createSensor();
		case HalPackage.COMPOSITE:
			return createComposite();
		case HalPackage.TERMINAL_EXPRESSION:
			return createTerminalExpression();
		case HalPackage.SENSOR_TYPE:
			return createSensorType();
		case HalPackage.ACTUATOR_TYPE:
			return createActuatorType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case HalPackage.BOOLEAN_OPERATOR:
			return createBooleanOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case HalPackage.BOOLEAN_OPERATOR:
			return convertBooleanOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHome createSmartHome() {
		SmartHomeImpl smartHome = new SmartHomeImpl();
		return smartHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner createOwner() {
		OwnerImpl owner = new OwnerImpl();
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeAutomationSystem createHomeAutomationSystem() {
		HomeAutomationSystemImpl homeAutomationSystem = new HomeAutomationSystemImpl();
		return homeAutomationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationRule createAutomationRule() {
		AutomationRuleImpl automationRule = new AutomationRuleImpl();
		return automationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationActivity createAutomationActivity() {
		AutomationActivityImpl automationActivity = new AutomationActivityImpl();
		return automationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorActivity createActuatorActivity() {
		ActuatorActivityImpl actuatorActivity = new ActuatorActivityImpl();
		return actuatorActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorActivity createSensorActivity() {
		SensorActivityImpl sensorActivity = new SensorActivityImpl();
		return sensorActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCommand createControlCommand() {
		ControlCommandImpl controlCommand = new ControlCommandImpl();
		return controlCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalExpression createTerminalExpression() {
		TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
		return terminalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorType() {
		SensorTypeImpl sensorType = new SensorTypeImpl();
		return sensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType createActuatorType() {
		ActuatorTypeImpl actuatorType = new ActuatorTypeImpl();
		return actuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalPackage getHalPackage() {
		return (HalPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HalPackage getPackage() {
		return HalPackage.eINSTANCE;
	}

} //HalFactoryImpl
