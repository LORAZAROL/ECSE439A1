package ca.mcgill.emf.examples.hal.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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
	private JButton showSmartHomesButton = new JButton();
	private JButton deleteRoomButton = new JButton();
	private JButton clearRoomButton = new JButton();
	private JLabel RoomNameLabel = new JLabel();
	private JLabel RoomNameText = new JLabel();
	private JLabel newRoomNameLabel = new JLabel();
	private JTextField newRoomNameTextField = new JTextField();
	private JButton addRoomButton = new JButton();
	private JButton updateRoomButton = new JButton();
	// Room's teams
	private JLabel removeTeamLabel = new JLabel();
	private JTable teamsTable = new JTable();
	private JScrollPane teamsScrollPane = new JScrollPane(teamsTable);
	private JLabel newTeamNameLabel = new JLabel();
	private JTextField newTeamNameTextField = new JTextField();
	private JButton addTeamButton = new JButton();

	// data elements
	private String error = null;
	// Room's teams
	private DefaultTableModel teamsDtm;
	private String teamsColumnNames[] = {"Team"};
	private static final int HEIGHT_TEAMS_TABLE = 100;

	public HALView() {
		initComponents();
		refreshData(null);
	}

	/** This method is called from within the constructor to initialize the form.
	 */
	@SuppressWarnings("serial")
	private void initComponents() {
		// elements for error message
		errorMessage.setForeground(Color.RED);
		
		// Elements for a SmartHome
		initializeButton(showSmartHomesButton, "Show SmartHomes", this::showSmartHomesButtonActionPerformed);
		newSmartHomeAddressLabel.setText("New SmartHome Address:");
		newSmartHomeAddressTextField.setText("");
		initializeButton(addSmartHomeButton, "Add SmartHome", this::addSmartHomeButtonActionPerformed);
		
		// elements for Room
		initializeButton(showRoomButton, "Show", this::showRoomButtonActionPerformed);
		initializeButton(deleteRoomButton, "Delete", this::deleteRoomButtonActionPerformed);
		initializeButton(clearRoomButton, "Clear", this::clearRoomButtonActionPerformed);
		RoomNameLabel.setText("Room Name:");
		RoomNameText.setText("");
		newRoomNameLabel.setText("New Room Name:");
		initializeButton(addRoomButton, "Add", this::addRoomButtonActionPerformed);
		initializeButton(updateRoomButton, "Update", this::updateRoomButtonActionPerformed);
		
		
		
		// elements for Room's teams
		removeTeamLabel.setText("Select a row in the table and hit the delete key to remove a room");
		this.add(teamsScrollPane);
		Dimension d = teamsTable.getPreferredSize();
		teamsScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
		teamsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		teamsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// enable delete key in table to remove a row (team)
		InputMap inputMap = teamsTable.getInputMap(JComponent.WHEN_FOCUSED);
		ActionMap actionMap = teamsTable.getActionMap();
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
//		actionMap.put("delete", new AbstractAction() {
//			public void actionPerformed(ActionEvent deleteEvent) {
//		    	teamsTableDeleteKeyActionPerformed(deleteEvent);
//		    }
//		});
		newTeamNameLabel.setText("New Team Name:");
//		initializeButton(addTeamButton, "Add Team", this::addTeamButtonActionPerformed);

		// global settings and listeners
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Home Automation System");

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
								.addComponent(showSmartHomesButton)
						.addComponent(horizontalLine)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomsList, 200, 200, 400)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createSequentialGroup()
								.addComponent(RoomNameLabel)
								.addComponent(RoomNameText))
						.addGroup(layout.createSequentialGroup()
								.addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField, 200, 200, 400)
								.addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(removeTeamLabel)
						.addComponent(teamsScrollPane)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newTeamNameLabel)
								.addComponent(newTeamNameTextField, 200, 200, 400)
								.addComponent(addTeamButton)))
				);

		layout.setVerticalGroup(
				layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
						.addComponent(errorMessage)
						.addGroup(layout.createParallelGroup())
								.addComponent(newSmartHomeAddressLabel)
								.addComponent(newSmartHomeAddressTextField)
								.addComponent(addSmartHomeButton)
								.addComponent(smartHomesList)
								.addComponent(showSmartHomesButton)
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomsList)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup()
								.addComponent(RoomNameLabel)
								.addComponent(RoomNameText))
						.addGroup(layout.createParallelGroup()
								.addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField)
								.addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(removeTeamLabel)
						.addComponent(teamsScrollPane)
						.addGroup(layout.createParallelGroup()
								.addComponent(newTeamNameLabel)
								.addComponent(newTeamNameTextField)
								.addComponent(addTeamButton)))
				);
		
		pack();
	}
	
	
	/** This method is called each time the page needs to be updated to the latest data.
	 *  An empty page is shown if null is passed into the method.
	 */
	private void refreshSmartHomeData() {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			// populate group list
			smartHomesList.removeAllItems();
			int index = 0, foundIndex = -1;
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
	private void refreshData(String RoomName) {
//		// error
//		errorMessage.setText(error);
//		if (error == null || error.length() == 0) {
//			// retrieve the Room
//			TORoom foundRoom = null;
//			if (RoomName != null) {
//				foundRoom = HALController.getRoom(RoomName);
//			}
//			// populate Room list
//			roomsList.removeAllItems();
//			int index = 0, foundIndex = -1;
//			for (String rName : HALController.getRooms()) {
//				roomsList.addItem(rName);
//				if (rName.equals(foundRoom == null ? null : foundRoom.getName())) {
//					foundIndex = index;
//				}
//				index++;
//			};
//			// enable Rooms list UI elements only if at least one Room exist
//			roomsList.setEnabled(index > 0);
//			roomsList.setSelectedIndex(foundIndex);
//			showRoomButton.setEnabled(index > 0);
//			deleteRoomButton.setEnabled(index > 0);
//			// populate other UI elements depending on whether a Room was found or not
//			if (foundIndex == -1) {
//				foundRoom = null;
//				// Room
//				RoomNameText.setText("");
//				newRoomNameTextField.setText("");
//				// Room's teams
//				//populateTeamsTable(null);
//				newTeamNameTextField.setText("");
//				// set allowed UI elements to enabled 
//				clearRoomButton.setEnabled(false);
//				addRoomButton.setEnabled(true);
//				updateRoomButton.setEnabled(false);
//				newTeamNameTextField.setEnabled(false);
//				addTeamButton.setEnabled(false);
//			} else {
//				// Room
//				RoomNameText.setText(foundRoom.getName());
//				newRoomNameTextField.setText(foundRoom.getName());
//				// Room's teams
//				populateTeamsTable(foundRoom);
//				newTeamNameTextField.setText("");
//				// set allowed UI elements to enabled
//				clearRoomButton.setEnabled(true);
//				addRoomButton.setEnabled(false);
//				updateRoomButton.setEnabled(true);
//				newTeamNameTextField.setEnabled(true);
//				addTeamButton.setEnabled(true);
//			}
//			Dimension d = teamsTable.getPreferredSize();
//			teamsScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
//		}

		// this is needed because the size of the window changes depending on whether an error message is shown or not
		pack();
	}

	/** The following ...ActionPerformed methods first call the Controller and then refresh the page with the desired Room.
	 */
	
	private void addSmartHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.addSmartHome(newSmartHomeAddressTextField.getText());
	}
	
	
	private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//error = HALController.addRoom(newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}
	
	private void clearRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData(null);
	}
	
	private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (roomsList.getSelectedIndex() != -1) {
			String roomName = (String) roomsList.getSelectedItem();
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete Room " + roomName + "?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) { 
				//error = HALController.deleteRoom(roomName);
				refreshData(null);
			}
		}
	}
	
	private void showRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData((String) roomsList.getSelectedItem());
	}
	
	private void showSmartHomesButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshSmartHomeData();
	}
	
	private void updateRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//error = HALController.updateRoomName(RoomNameText.getText(), newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}
//
//	private void addTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		error = HALController.addTeam(RoomNameText.getText(), newTeamNameTextField.getText());
//		refreshData(RoomNameText.getText());
//	}
	
//	private void teamsTableDeleteKeyActionPerformed(java.awt.event.ActionEvent evt) {
//		if (teamsTable.getSelectedRow() != -1) {
//			String teamName = (String) teamsTable.getModel().getValueAt(teamsTable.getSelectedRow(), 0);
//	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete team " + teamName + "?", 
//	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//			if (choice == 0) { 
//				error = HALController.removeTeam(teamName);
//				refreshData(RoomNameText.getText());
//			}
//		}
//	}

	/** The following methods are helper methods to simplify the methods.
	 */
	
	private void initializeButton(JButton button, String text, ActionListener actionListener) {
		button.setText(text);
		button.addActionListener(actionListener);
	}

//	private void populateTeamsTable(TORoom foundRoom) {
//		teamsDtm = new DefaultTableModel(0, 0);
//		teamsDtm.setColumnIdentifiers(teamsColumnNames);
//		teamsTable.setModel(teamsDtm);
//		if (foundRoom != null) {
//			for (String teamName : foundRoom.getTeamNames()) {
//				Object[] obj = {teamName};
//				teamsDtm.addRow(obj);
//			}
//		}
//	}
	
}
