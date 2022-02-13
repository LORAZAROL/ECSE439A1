package ca.mcgill.emf.examples.hal.controller;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import ca.mcgill.emf.examples.hal.*;

/**
 * HALController: allow the features to modify data using APIs
 * @author loraw
 *
 */
public class HALController {

	/**
	 * Add a new room to a smart home
	 * @param name
	 */
	public void addRoom(String smartHomeAddress, String roomName) {
		// get the target smartRoom
		SmartHome target = getTargetSmartHome(smartHomeAddress);
		
		// create a room with given room name -- no constraint on uniqueness of room name
		Room r = HalFactory.eINSTANCE.createRoom();
		r.setName(roomName);
		
		// Add if target not null
		if(target != null) {
			target.getRooms().add(r);
		}
	}
	
	/**
	 * List the names and types of all sensors and actuators of given room
	 * in the format of:
	 * 
	 * Room name: room01
	 * Device name: temperature sensor 01 	Device type: temperature sensor, humidity sensor
	 * 
	 * @param roomName
	 */
	public String getRoomDevices(String address, String roomName) {
		// get the target room
		Room room = getTargetRoom(address, roomName);
		// get the devices names and types of the room
		EList<Device> devices = room.getDevices();		
		
		String message = "Room name: " + roomName + "\n";
		for(int i = 0; i < devices.size(); i++) {
			Device d = devices.get(i);
			
			// a device can have multiple types => list the types into type string
			EList<DeviceType> dTypeList = d.getDevicetypes();
			String deviceType = "";
			for(int j = 0; j < dTypeList.size(); j++) {
				DeviceType dt = dTypeList.get(j);
				deviceType += dt.getDeviceType() + " ";
			}
			
			// append device name and type to message
			String deviceInfo = "Device name: " + d.getName() + "\t Device type: " + deviceType + "\n";
			message += deviceInfo;
		}
		
		return message;
	}
	
	/**
	 * Update the name of a room
	 * @param newRoomName
	 */
	public void updateRoomName(String address, String oldRoomName, String newRoomName) {
		// get the room given its old name
		Room room = getTargetRoom(address, oldRoomName);
		if(room == null) {
			// todo: report an error not found in view
			return;
		}
		// set the new name
		room.setName(newRoomName);
	}
	
	/**
	 * Delete the room of given name in given smart home
	 * @param roomName
	 */
	public void deleteRoom(String smartHomeAddress, String roomName) {
		// get the home at given address; later delete the room from it if exists a room
		SmartHome home = getTargetSmartHome(smartHomeAddress);
		// get the target room to be deleted
		Room room = getTargetRoom(smartHomeAddress, roomName);
		if(room != null) {
			home.getRooms().remove(room);
		}
		
		// todo: report error when not exist?
	}
	
	/**
	 * Add a new device to an existing room
	 * @param roomName
	 * @param deviceName
	 * @param dType
	 * @param isSensor
	 */
	public void addDeviceToRoom(String address, String roomName, String deviceName, DeviceType dType, boolean isSensor) {
		// todo: a boolean to claim sensor or actuator. Can a device be more than sensor or actuator?
		// 1. two constants string "Sensor" "Actuator"
		// 2. a public enumeration with value Sensor Actuator
		
		// Create a device with given category
		Device device = null;
		if(isSensor) {
			device = HalFactory.eINSTANCE.createSensor();
		}else {
			device = HalFactory.eINSTANCE.createActuator();
		}
		
		if(device != null) {
			device.setName(deviceName); //todo: didn't check the uniqueness of name (already check the property to be ID)
			device.getDevicetypes().add(dType);
			Room room = getTargetRoom(address, roomName);
			room.getDevices().add(device);
		}
		
	}
	
	/**
	 * Delete a device (given device instance) from a room
	 * @param room
	 * @param device
	 */
	public void deleteDeviceOfRoom(String address, String roomName, String deviceName) {
		Room room = getTargetRoom(address, roomName);
		Device targetDevice = getTargetDevice(deviceName);
		
		EList<Device> deviceList = room.getDevices();
		boolean exist = false;
		for(int i = 0; i < deviceList.size(); i++) {
			Device curr = deviceList.get(i);
			if(curr == targetDevice) {
				exist = true;
			}
		}
		
		if(exist) room.getDevices().remove(targetDevice);
	}
	
	
	////// Methods to access certain object in Model //////
	
	/**
	 * Get the smartHome object given an address
	 * @param address
	 * @return
	 */
	private SmartHome getTargetSmartHome(String address) {
		SmartHome target = null;
		
		EList<SmartHome> list = getAllSmartHomes();
		
		// go through all homes to see if the given room exists
		for(int i = 0; i < list.size(); i++) {
			SmartHome cur = list.get(i);
			if(cur.getAddress().equals(address)) {
				target = cur; 
				break;
			}
		}
		
		if(target == null) {
			// todo: send error log
			return null;
		}
		
		return target;
	}
	
	/**
	 * Get target room in a smartHome
	 * @param address
	 * @param roomName
	 * @return
	 */
	private Room getTargetRoom(String address, String roomName) {
		Room target = null;
		
		EList<Room> list = getRoomsOfSmartHome(address);
		
		// go through all homes to see if the given room exists
		for(int i = 0; i < list.size(); i++) {
			Room cur = list.get(i);
			if(cur.getName().equals(roomName)) {
				target = cur;
			}
		}
		
		if(target == null) {
			// todo: send error log
			return null;
		}
		
		return target;
	}
	
	/**
	 * Get a device with given name
	 * @param deviceName
	 * @return
	 */
	private Device getTargetDevice(String deviceName) {
		Device target = null;
		
		ArrayList<Device> devices = getAllDevices();
		for(int i = 0; i < devices.size(); i++) {
			Device cur = devices.get(i);
			if(cur.getName().equals(deviceName)) {
				target = cur;
				break;
			}
		}
		
		return target;
	} 
	
	/**
	 * Get all smartHome objects in current EInstance
	 * @return
	 */
	private EList<SmartHome> getAllSmartHomes(){
		EList<SmartHome> list = HalFactory.eINSTANCE.createHomeAutomationSystem().getSmarthome();
		return list;
	}
	
	/**
	 * Get all room objects of given address
	 * @return
	 */
	private EList<Room> getRoomsOfSmartHome(String address){
		// get all smart homes and add their rooms into rooms list
		SmartHome home = getTargetSmartHome(address);
		EList<Room> rooms = home.getRooms();
		
		return rooms;
	}
	
	/**
	 * Get all device objects in current EInstance
	 * @return
	 */
	private ArrayList<Device> getAllDevices(){
		// a container to store all devices (using ArrayList as it can be iterated)
		// also EList cannot be instantiated
		ArrayList<Device> devices = new ArrayList<Device>();
		
		// get all rooms and add their devices into device list
		EList<SmartHome> allSmartHome = getAllSmartHomes();
		for(int i = 0; i < allSmartHome.size(); i++) {
			EList<Room> roomsOfHome = getRoomsOfSmartHome(allSmartHome.get(i).getAddress());
			for(int j = 0; j < roomsOfHome.size(); j++) {
				EList<Device> deviceOfRoom = roomsOfHome.get(i).getDevices();
				for(int k = 0; k < deviceOfRoom.size(); k++) {
					Device d = deviceOfRoom.get(k);
					devices.add(d);
				}
			}
		}
		
		return devices;
	}
	
}
