package ca.mcgill.emf.examples.hal.controller;

import org.eclipse.emf.common.util.EList;

import ca.mcgill.emf.examples.hal.*;

/**
 * HALController: allow the features to modify data using APIs
 * @author loraw
 *
 */
public class HALController {

	/**
	 * Add a room
	 * @param name
	 */
	public void addRoom(SmartHome smartHome, String roomName) {
		// get the target smartRoom
		SmartHome target = getTargetSmartHome(smartHome);
		
		// create a room with given room name -- no constraint on uniqueness of room name
		Room r = HalFactory.eINSTANCE.createRoom();
		r.setName(roomName);
		
		// Add if target not null
		if(target != null) {
			target.getRoom().add(r);
		}
	}
	
	/**
	 * List the names and types of all sensors and actuators of given room
	 * @param roomName
	 */
	public String getRoomDevices(Room room) {
		// get the name of the room
		String roomName = room.getName();
		// get the devices names and types of the room
		EList<Device> devices = room.getDevices();		
		
		String message = "room name: " + roomName + "\n";
		for(int i = 0; i < devices.size(); i++) {
			Device d = devices.get(i);
			
			// a device can have multiple types => list the types into type string
			EList<DeviceType> dTypeList = d.getDevicetype();
			String deviceType = "";
			for(int j = 0; j < dTypeList.size(); j++) {
				DeviceType dt = dTypeList.get(j);
				deviceType += dt.getDeviceType() + " ";
			}
			
			// append device name and type to message
			String deviceInfo = "device name: " + d.getName() + "\t device type: " + deviceType + "\n";
			message += deviceInfo;
		}
		
		return message;
	}
	
	/**
	 * Update the name of a room
	 * @param newRoomName
	 */
	public void setRoomName(Room room, String newRoomName) {
		room.setName(newRoomName);
	}
	
	/**
	 * Delete the room of given name
	 * @param roomName
	 */
	public void deleteRoom(SmartHome home, Room room) {
		EList<Room> rooms = home.getRoom();
		
		boolean existRoom = false;
		// check whether room exists
		for(int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i) == room) existRoom = true;
		}
		
		// remove room 
		if(existRoom) rooms.remove(room);
		
		// todo: report error when not exist?
	}
	
	/**
	 * Add a new device to an existing room
	 * @param roomName
	 * @param deviceName
	 * @param dType
	 * @param isSensor
	 */
	public void addDeviceToRoom(Room room, String deviceName, DeviceType dType, boolean isSensor) {
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
			device.getDevicetype().add(dType);
			room.getDevices().add(device);
		}
		
	}
	
	/**
	 * Delete a device (given name) from a room.
	 * We can do this because device name is unique
	 * @param deviceName
	 * @param roomName
	 */
	public void deleteDeviceOfRoom(Room room, String deviceName) {
		// iterate through the device in the room to get given device
		EList<Device> deviceList = room.getDevices();
		Device target = null;
		for(int i = 0; i < deviceList.size(); i++) {
			Device curr = deviceList.get(i);
			if(curr.getName().equals(deviceName)) {
				target = curr;
			}
		}
		// if exists, delete
		if(target != null) {
			deviceList.remove(target);
		}
	}
	
	/**
	 * Delete a device (given device instance) from a room
	 * @param room
	 * @param device
	 */
	public void deleteDeviceOfRoom(Room room, Device device) {
		EList<Device> deviceList = room.getDevices();
		boolean exist = false;
		for(int i = 0; i < deviceList.size(); i++) {
			Device curr = deviceList.get(i);
			if(curr == device) {
				exist = true;
			}
		}
		
		if(exist) room.getDevices().remove(device);
	}
	
	/**
	 * Helper method to get the target smart home if there exists one in HomeAutomation system
	 * If not, return null
	 * @param home
	 * @return
	 */
	private SmartHome getTargetSmartHome(SmartHome home) {
		boolean smartHomeExist = false;
		SmartHome target = null;
		
		EList<SmartHome> list = HalFactory.eINSTANCE.createHomeAutomationSystem().getSmarthome();
		
		// go through all homes to see if the given room exists
		for(int i = 0; i < list.size(); i++) {
			SmartHome cur = list.get(i);
			if(cur == home) {
				smartHomeExist = true;
				target = cur; 
				break;
			}
		}
		
		if(!smartHomeExist || target == null) {
			// todo: send error log
			return null;
		}
		
		return target;
	}
	
}
