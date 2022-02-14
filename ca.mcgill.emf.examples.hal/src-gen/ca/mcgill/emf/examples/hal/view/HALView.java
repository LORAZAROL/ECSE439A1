package ca.mcgill.emf.examples.hal.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.GroupLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.SmartHome;
import ca.mcgill.emf.examples.hal.controller.*;

public class HALView extends JFrame {

	private static final long serialVersionUID = -4426310869335015542L;
	
	// UI elements
	private JLabel errorMessage = new JLabel();
	// Room
	private JComboBox<String> roomsList = new JComboBox<String>(new String[0]);
	private JComboBox<String> smartHomesList = new JComboBox<String>(new String[0]);
	private JLabel newSmartHomeAddressLabel = new JLabel();
	private JTextField newSmartHomeAddressTextField = new JTextField();
	private JButton addSmartHomeButton = new JButton();
	private JButton showRoomButton = new JButton();
	private JButton showSmartHomeRoomsButton = new JButton();
	private JButton deleteRoomButton = new JButton();
	private JButton clearRoomButton = new JButton();
	private JLabel roomNameLabel = new JLabel();
	private JLabel roomNameText = new JLabel();
	private JLabel newRoomNameLabel = new JLabel();
	private JTextField newRoomNameTextField = new JTextField();
	private JButton addRoomButton = new JButton();
	private JButton updateRoomButton = new JButton();
	// Room's devices
	private JLabel removeDevicesLabel = new JLabel();
	private JLabel newDeviceLabel = new JLabel();
	private JTextField newDeviceNameTextField = new JTextField();
	private JButton addDeviceButton = new JButton();
	private JButton removeDeviceButton = new JButton();
	public ButtonGroup deviceButtonGroup = new ButtonGroup();
	private JRadioButton actuatorDeviceRadioButton = new JRadioButton("Actuator");
	private JRadioButton sensorDeviceRadioButton = new JRadioButton("Sensor");
	private JLabel deviceTypeLabel = new JLabel();
	private JComboBox<String> devicesList = new JComboBox<String>(new String[0]);
	private JComboBox<String> deviceTypesList = new JComboBox<String>(new String[0]);
	private ArrayList<String> listOfDeviceTypes = new ArrayList<>(
			Arrays.asList("Temperature Sensor", "Movement Sensor", "Light Sensor", "Heater", "Lock", "Light Switch"));
	
	
	// data elements
	private String error = null;

	public HALView() {
		initComponents();
	}

	/** This method is called from within the constructor to initialize the form.
	 */
	@SuppressWarnings("serial")
	private void initComponents() {
		// elements for error message
		errorMessage.setForeground(Color.RED);
		
		// Elements for a SmartHome
		initializeButton(showSmartHomeRoomsButton, "Show Rooms of SmartHome", this::showSmartHomeRoomsButtonActionPerformed);
		newSmartHomeAddressLabel.setText("New SmartHome Address:");
		newSmartHomeAddressTextField.setText("");
		initializeButton(addSmartHomeButton, "Add SmartHome", this::addSmartHomeButtonActionPerformed);
		
		// elements for Room
		initializeButton(showRoomButton, "Show Room Devices", this::showRoomButtonActionPerformed);
		initializeButton(deleteRoomButton, "Delete Room", this::deleteRoomButtonActionPerformed);
		initializeButton(clearRoomButton, "Clear", this::clearRoomButtonActionPerformed);
		roomNameLabel.setText("Room Name:");
		roomNameText.setText("");
		newRoomNameLabel.setText("New Room Name:");
		initializeButton(addRoomButton, "Add", this::addRoomButtonActionPerformed);
		initializeButton(updateRoomButton, "Update", this::updateRoomButtonActionPerformed);
		
		
		
		// elements for Room's devices
		removeDevicesLabel.setText("Select a room's device and hit the remove button to delete the selected room's sensor or actuator");
		
		
		newDeviceLabel.setText("New Device Name:");
		initializeButton(addDeviceButton, "Add Device", this::addDeviceButtonActionPerformed);
		deviceButtonGroup.add(actuatorDeviceRadioButton);
		deviceButtonGroup.add(sensorDeviceRadioButton);
		deviceTypeLabel.setText("Device Type:");
		initializeButton(removeDeviceButton, "Remove Selected Device", this::deleteDeviceButtonActionPerformed);

		// global settings and listeners
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Home Automation System");
		
		// Programatically add device types to the Home Automation System
		initializeDeviceTypesList(listOfDeviceTypes);
		
		refreshSmartHomesList();

		// horizontal line elements
		JSeparator horizontalLine = new JSeparator();

		// layout
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(errorMessage)
						.addGroup(layout.createSequentialGroup())
								.addComponent(newSmartHomeAddressLabel)
								.addComponent(newSmartHomeAddressTextField)
								.addComponent(addSmartHomeButton)						
								.addComponent(smartHomesList, 200, 200, 200)
								.addComponent(showSmartHomeRoomsButton)
						.addComponent(horizontalLine)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomNameText))
						.addGroup(layout.createSequentialGroup()
								.addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField, 200, 200, 400)
								.addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomNameLabel)
								.addComponent(roomsList, 200, 200, 400)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createSequentialGroup()
								.addComponent(actuatorDeviceRadioButton)
								.addComponent(sensorDeviceRadioButton)
								.addComponent(deviceTypeLabel)
								.addComponent(deviceTypesList, 200, 200, 400)
								.addComponent(newDeviceLabel)
								.addComponent(newDeviceNameTextField, 200, 200, 400)
								.addComponent(addDeviceButton))
						.addComponent(removeDevicesLabel)
						.addComponent(devicesList)
						.addComponent(removeDeviceButton)
				));

		layout.setVerticalGroup(
				layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
						.addComponent(errorMessage)
						.addGroup(layout.createParallelGroup())
								.addComponent(newSmartHomeAddressLabel)
								.addComponent(newSmartHomeAddressTextField)
								.addComponent(addSmartHomeButton)
								.addComponent(smartHomesList)
								.addComponent(showSmartHomeRoomsButton)
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomNameText))
						.addGroup(layout.createParallelGroup()
								.addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField)
								.addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomNameLabel)
								.addComponent(roomsList)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup()
								.addComponent(actuatorDeviceRadioButton)
								.addComponent(sensorDeviceRadioButton)
								.addComponent(deviceTypeLabel)
								.addComponent(deviceTypesList)
								.addComponent(newDeviceLabel)
								.addComponent(newDeviceNameTextField)
								.addComponent(addDeviceButton))
						.addComponent(removeDevicesLabel)
						.addComponent(devicesList, 200, 200, 400)
						.addComponent(removeDeviceButton)
				));
		
		pack();
	}
	
	
	/** This method is called each time the page needs to be updated to the latest data.
	 *  An empty page is shown if null is passed into the method.
	 */
	private void refreshSmartHomesList() {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			// populate group list
			smartHomesList.removeAllItems();
			for (SmartHome smartHomeAddr : HALController.getAllSmartHomes()) {
				smartHomesList.addItem(smartHomeAddr.getAddress());
			};
		}

		// this is needed because the size of the window changes depending on whether an error message is shown or not
		pack();
	}
	
	/** This method is called each time the page needs to be updated to the latest data.
	 *  An empty page is shown if null is passed into the method.
	 */
	private void refreshRoomsList(String smartHomeAddress) {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			// populate group list
			roomsList.removeAllItems();
			for (Room room : HALController.getRoomsOfSmartHome(smartHomeAddress)) {
				roomsList.addItem(room.getName());
			};
		}

		// this is needed because the size of the window changes depending on whether an error message is shown or not
		pack();
	}
	
	/** This method is called each time the page needs to be updated to the latest data.
	 *  An empty page is shown if null is passed into the method.
	 */
	private void refreshDevicesList() {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			devicesList.removeAllItems();
			for (String roomDeviceInfo : HALController.getRoomDevices(String.valueOf(smartHomesList.getSelectedItem()), String.valueOf(roomsList.getSelectedItem()))) {
				devicesList.addItem(roomDeviceInfo);
			}
		}

		// this is needed because the size of the window changes depending on whether an error message is shown or not
		pack();
	}

	/** The following ...ActionPerformed methods first call the Controller and then refresh the page with the desired Room.
	 */
	
	private void addSmartHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.addSmartHome(newSmartHomeAddressTextField.getText());
		newSmartHomeAddressTextField.setText("");
		refreshSmartHomesList();
	}
	
	
	private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.addRoom(String.valueOf(smartHomesList.getSelectedItem()), newRoomNameTextField.getText());
		newRoomNameTextField.setText("");
		refreshRoomsList(String.valueOf(smartHomesList.getSelectedItem()));
	}
	
	private void clearRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
	}
	
	private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (roomsList.getSelectedIndex() != -1) {
			String roomName = (String) roomsList.getSelectedItem();
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete Room " + roomName + "?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) { 
				error = HALController.deleteRoom(String.valueOf(smartHomesList.getSelectedItem()),roomName);
				refreshRoomsList(String.valueOf(smartHomesList.getSelectedItem()));
				refreshDevicesList();
			}
		}
	}
	
	private void deleteDeviceButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (devicesList.getSelectedIndex() != -1) {
			String deviceInfo = (String) devicesList.getSelectedItem();
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete" + deviceInfo + "?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) { 
				//error = HALController.deleteDeviceOfRoom(String.valueOf(smartHomesList.getSelectedItem()),roomsList.getSelectedItem());
				refreshRoomsList(String.valueOf(smartHomesList.getSelectedItem()));
				refreshDevicesList();
			}
		}
	}
	
	private void showRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshRoomsList(String.valueOf(smartHomesList.getSelectedItem()));
	}
	
	private void showSmartHomeRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshRoomsList(String.valueOf(smartHomesList.getSelectedItem()));
	}
	
	private void updateRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.updateRoomName(String.valueOf(smartHomesList.getSelectedItem()), String.valueOf(roomsList.getSelectedItem()), newRoomNameTextField.getText());
		newRoomNameTextField.setText("");
		refreshRoomsList(String.valueOf(smartHomesList.getSelectedItem()));
		refreshDevicesList();
	}

	private void addDeviceButtonActionPerformed(java.awt.event.ActionEvent evt) {
		
		boolean isSensor = sensorDeviceRadioButton.isSelected();
		
		error = HALController.addDeviceToRoom(String.valueOf(
				smartHomesList.getSelectedItem()), 
				String.valueOf(roomsList.getSelectedItem()),
				newDeviceNameTextField.getText(),
				String.valueOf(deviceTypesList.getSelectedItem()),
				isSensor
				);
		
		refreshDevicesList();
	}

	/** The following methods are helper methods to simplify the methods.
	 */
	
	private void initializeButton(JButton button, String text, ActionListener actionListener) {
		button.setText(text);
		button.addActionListener(actionListener);
	}
	
	
	private void initializeDeviceTypesList(ArrayList<String> listOfDeviceTypes) {
		for (String deviceType : listOfDeviceTypes) {
			deviceTypesList.addItem(deviceType);
		}
	}
	
}
