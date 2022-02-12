/**
 */
package ca.mcgill.emf.examples.hal.util;

import ca.mcgill.emf.examples.hal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.examples.hal.HalPackage
 * @generated
 */
public class HalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HalSwitch<Adapter> modelSwitch = new HalSwitch<Adapter>() {
		@Override
		public Adapter caseDeviceType(DeviceType object) {
			return createDeviceTypeAdapter();
		}

		@Override
		public Adapter caseDevice(Device object) {
			return createDeviceAdapter();
		}

		@Override
		public Adapter caseActuator(Actuator object) {
			return createActuatorAdapter();
		}

		@Override
		public Adapter caseRoom(Room object) {
			return createRoomAdapter();
		}

		@Override
		public Adapter caseSmartHome(SmartHome object) {
			return createSmartHomeAdapter();
		}

		@Override
		public Adapter caseOwner(Owner object) {
			return createOwnerAdapter();
		}

		@Override
		public Adapter caseHomeAutomationSystem(HomeAutomationSystem object) {
			return createHomeAutomationSystemAdapter();
		}

		@Override
		public Adapter caseAutomationRule(AutomationRule object) {
			return createAutomationRuleAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseAutomationActivity(AutomationActivity object) {
			return createAutomationActivityAdapter();
		}

		@Override
		public Adapter caseActuatorActivity(ActuatorActivity object) {
			return createActuatorActivityAdapter();
		}

		@Override
		public Adapter caseSensorActivity(SensorActivity object) {
			return createSensorActivityAdapter();
		}

		@Override
		public Adapter caseControlCommand(ControlCommand object) {
			return createControlCommandAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter casePrecondition(Precondition object) {
			return createPreconditionAdapter();
		}

		@Override
		public Adapter caseOperand(Operand object) {
			return createOperandAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseSensorType(SensorType object) {
			return createSensorTypeAdapter();
		}

		@Override
		public Adapter caseActuatorType(ActuatorType object) {
			return createActuatorTypeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.DeviceType
	 * @generated
	 */
	public Adapter createDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.SmartHome <em>Smart Home</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.SmartHome
	 * @generated
	 */
	public Adapter createSmartHomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Owner
	 * @generated
	 */
	public Adapter createOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.HomeAutomationSystem <em>Home Automation System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.HomeAutomationSystem
	 * @generated
	 */
	public Adapter createHomeAutomationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.AutomationRule
	 * @generated
	 */
	public Adapter createAutomationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.AutomationActivity <em>Automation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.AutomationActivity
	 * @generated
	 */
	public Adapter createAutomationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.ActuatorActivity <em>Actuator Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.ActuatorActivity
	 * @generated
	 */
	public Adapter createActuatorActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.SensorActivity <em>Sensor Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.SensorActivity
	 * @generated
	 */
	public Adapter createSensorActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.ControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.ControlCommand
	 * @generated
	 */
	public Adapter createControlCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Precondition
	 * @generated
	 */
	public Adapter createPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Operand
	 * @generated
	 */
	public Adapter createOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.SensorType
	 * @generated
	 */
	public Adapter createSensorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.emf.examples.hal.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.emf.examples.hal.ActuatorType
	 * @generated
	 */
	public Adapter createActuatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HalAdapterFactory
