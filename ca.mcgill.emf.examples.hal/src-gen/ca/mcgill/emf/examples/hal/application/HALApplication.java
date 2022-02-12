package ca.mcgill.emf.examples.hal.application;

import org.eclipse.emf.ecore.resource.Resource;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.util.*;
import ca.mcgill.emf.examples.hal.view.*;


public class HALApplication {

	private static HomeAutomationSystem homeAutomationSystem;
	private static String filename = "data/data.homeautomationsystem";

	public static void main(String[] args) {

		// Initialize HAL package and prepare resource helper
		HalPackage.eINSTANCE.eClass();
		ResourceHelper.INSTANCE.addResourceFactory("tournament", new HalResourceFactoryImpl());

		// start UI
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new HALView().setVisible(true);
			}
		});

	}

	public static HomeAutomationSystem getHomeAutomationSystem() {
		// make sure that only one instance of Tournament exists
		if (homeAutomationSystem == null) {
			homeAutomationSystem = load();
		}
		return homeAutomationSystem;
	}

	public static void save() {
		ResourceHelper.INSTANCE.saveResource(homeAutomationSystem, filename);
	}

	public static HomeAutomationSystem load() {
		HomeAutomationSystem homeAutomationSystem;
		try {
			Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
			homeAutomationSystem = (HomeAutomationSystem) resource.getContents().get(0);
		} catch (RuntimeException e) {
			// model cannot be loaded - create an empty Tournament
			homeAutomationSystem = HalFactory.eINSTANCE.createHomeAutomationSystem();
		}
		return homeAutomationSystem;
	}

}
