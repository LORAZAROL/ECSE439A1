package ca.mcgill.emf.examples.hal.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HALView extends JFrame {
	private JTextField txtHomeAutomationSystem;
	private JTextField txtRooms;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtAddDeviceTo;
	private JTextField txtDeleteDeviceOf;
	public HALView() {
		this.setSize(new Dimension(900, 600));
		getContentPane().setLayout(null);
		
		txtHomeAutomationSystem = new JTextField();
		txtHomeAutomationSystem.setHorizontalAlignment(SwingConstants.CENTER);
		txtHomeAutomationSystem.setText("Home Automation System");
		txtHomeAutomationSystem.setBounds(330, 6, 192, 55);
		getContentPane().add(txtHomeAutomationSystem);
		txtHomeAutomationSystem.setColumns(10);
		
		txtRooms = new JTextField();
		txtRooms.setHorizontalAlignment(SwingConstants.CENTER);
		txtRooms.setText("Room");
		txtRooms.setBounds(682, 6, 130, 26);
		getContentPane().add(txtRooms);
		txtRooms.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Room Name");
		lblNewLabel.setBounds(593, 44, 91, 16);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(682, 39, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Room");
		btnNewButton.setBounds(682, 79, 117, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblRooms = new JLabel("Rooms");
		lblRooms.setBounds(593, 139, 91, 16);
		getContentPane().add(lblRooms);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(682, 135, 52, 27);
		getContentPane().add(comboBox);
		
		JButton btnUpdateRoomName = new JButton("Update Room Name");
		btnUpdateRoomName.setBounds(740, 175, 160, 29);
		getContentPane().add(btnUpdateRoomName);
		
		JButton btnDeleteRoom = new JButton("Delete Room");
		btnDeleteRoom.setBounds(740, 134, 160, 29);
		getContentPane().add(btnDeleteRoom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(603, 174, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtAddDeviceTo = new JTextField();
		txtAddDeviceTo.setText("Add Device to Selected Room");
		txtAddDeviceTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddDeviceTo.setColumns(10);
		txtAddDeviceTo.setBounds(593, 232, 307, 26);
		getContentPane().add(txtAddDeviceTo);
		
		JLabel lblDeviceType = new JLabel("Device Type");
		lblDeviceType.setBounds(593, 279, 91, 16);
		getContentPane().add(lblDeviceType);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(682, 275, 52, 27);
		getContentPane().add(comboBox_1);
		
		JLabel lblDeviceName = new JLabel("Device Name");
		lblDeviceName.setBounds(593, 327, 91, 16);
		getContentPane().add(lblDeviceName);
		
		JButton btnAddDevice = new JButton("Add Device");
		btnAddDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddDevice.setBounds(692, 322, 160, 29);
		getContentPane().add(btnAddDevice);
		
		txtDeleteDeviceOf = new JTextField();
		txtDeleteDeviceOf.setText("Delete Device of Selected Room");
		txtDeleteDeviceOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeleteDeviceOf.setColumns(10);
		txtDeleteDeviceOf.setBounds(593, 369, 307, 26);
		getContentPane().add(txtDeleteDeviceOf);
		
		JLabel lblListOfDevices = new JLabel("List of Devices");
		lblListOfDevices.setBounds(593, 412, 123, 16);
		getContentPane().add(lblListOfDevices);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(756, 408, 52, 27);
		getContentPane().add(comboBox_1_1);
		
		JButton btnDeleteDevice = new JButton("Delete Device");
		btnDeleteDevice.setBounds(631, 450, 160, 29);
		getContentPane().add(btnDeleteDevice);
	}
}
