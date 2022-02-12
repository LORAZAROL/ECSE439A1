package ca.mcgill.emf.examples.hal.application;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;

import ca.mcgill.emf.examples.hal.*;
/**
 * Application main entry
 * 
 * @author loraw
 *
 */
public class HALApplication {

	public static void main(String[] args) {

		/**
		 * Initialize Hal package.
		 */
		HalPackage.eINSTANCE.eClass();

		/**
		 * Create Home Automation System.
		 */
		HomeAutomationSystem homeAutomationSystem = HalFactory.eINSTANCE.createHomeAutomationSystem();
		
		DeviceType tempSensor = HalFactory.eINSTANCE.createSensorType();
		tempSensor.setDeviceType("Temperature Sensor");
		
		DeviceType movementSensor = HalFactory.eINSTANCE.createSensorType();
		movementSensor.setDeviceType("Movement Sensor");
		
		DeviceType lightSensor = HalFactory.eINSTANCE.createSensorType();
		lightSensor.setDeviceType("Light Sensor");
		
		DeviceType heater = HalFactory.eINSTANCE.createActuatorType();
		heater.setDeviceType("Heater");
		
		DeviceType lock = HalFactory.eINSTANCE.createActuatorType();
		lock.setDeviceType("Lock");
		
		DeviceType lightSwitch = HalFactory.eINSTANCE.createActuatorType();
		lightSwitch.setDeviceType("Light Switch");

		/**
		 * Get notified when the tournament is changed. This would be in your UI or so.
		 * Alternatively, the interface org.eclipse.emf.common.notify.Adapter can be
		 * used.
		 */
		tournament.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				if (notification.getFeature() == TournamentPackage.Literals.TOURNAMENT__MATCHES) {
					switch (notification.getEventType()) {
					case Notification.ADD:
						System.out.println("Match added: " + notification.getNewValue());
						break;
					case Notification.REMOVE:
						System.out.println("Match removed: " + notification.getOldValue());
						break;
					}
				} else if (notification.getFeature() == TournamentPackage.Literals.TOURNAMENT__GROUPS) {
					switch (notification.getEventType()) {
					case Notification.ADD:
						System.out.println("Group added: " + notification.getNewValue());
						break;
					case Notification.REMOVE:
						System.out.println("Group removed: " + notification.getOldValue());
						break;
					}
				}
			}
		});

		 
		/**
		 * For tournament models the specific resource factory should be used instead,
		 * which will use the TournamentResourceImpl class for resources. This resource
		 * uses UUIDs.
		 */
		ResourceHelper.INSTANCE.addResourceFactory("tournament", new TournamentResourceFactoryImpl());

		/**
		 * Save the model.
		 */
		ResourceHelper.INSTANCE.saveResource(tournament, "examples/WorldCup2014.tournament");

		Resource resource = ResourceHelper.INSTANCE.loadResource("examples/WorldCup2014.tournament");

		/**
		 * Get the root object.
		 */
		Tournament savedTournament = (Tournament) resource.getContents().get(0);
		System.out.println(savedTournament.getName());

		/**
		 * Use dynamic access to properties.
		 */
		@SuppressWarnings("unchecked")
		List<Group> groups = (List<Group>) savedTournament.eGet(TournamentPackage.Literals.TOURNAMENT__GROUPS);

		EObject newGroup = TournamentFactory.eINSTANCE.create(TournamentPackage.Literals.GROUP);
		newGroup.eSet(TournamentPackage.Literals.NAMED_ELEMENT__NAME, "Group B");
		groups.add((Group) newGroup);
		System.out.println(groups.get(2).eGet(TournamentPackage.Literals.NAMED_ELEMENT__NAME));

		@SuppressWarnings("unchecked")
		List<Team> teams = (List<Team>) savedTournament.eGet(TournamentPackage.Literals.TOURNAMENT__TEAMS);

		EObject newTeam = TournamentFactory.eINSTANCE.create(TournamentPackage.Literals.TEAM);
		newTeam.eSet(TournamentPackage.Literals.NAMED_ELEMENT__NAME, "Canada");
		teams.add((Team) newTeam);
		System.out.println(teams.get(4).eGet(TournamentPackage.Literals.NAMED_ELEMENT__NAME));

		/**
		 * Showcase validation.
		 */
		validate(tournament);

		/**
		 * Remove the newly created temporary group and team to avoid a validation
		 * error.
		 */
		groups.remove(newGroup);
		teams.remove(newTeam);

		validate(tournament);
	}

	private static void validate(EObject eObject) {
		System.out.format("Validating %s...\n", eObject);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);

		if (diagnostic.getSeverity() == Diagnostic.OK) {
			System.out.println("No validation problems found.");
		} else {
			System.out.format("Validation Error for: %s\n", diagnostic.getData().get(0));
			for (Diagnostic child : diagnostic.getChildren()) {
				System.out.format("    %s\n", child.getData());
				System.out.format("    %s\n", child.getMessage());
			}
		}
	}

}
