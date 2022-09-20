package com.codewithpavi.gocheetacabservicesystem.service;

import java.util.List;

import com.codewithpavi.gocheetacabservicesystem.dao.VehicleManager;
import com.codewithpavi.gocheetacabservicesystem.model.Vehicle;

public class VehicleService {
	
	public Vehicle getSpecificVehicleByVehicleId (int vehicleId) {
		
		return VehicleManager.getSpecificVehicleByVehicleId(vehicleId);
	}
	
	public List<Vehicle> getAllVehicles() {
		
		return VehicleManager.getAllVehicles();
	}
	
	public boolean addVehicle(Vehicle vehicleName) {
		
		return VehicleManager.addVehicle(vehicleName);
	}
	
	public boolean updateVehicle(Vehicle vehicleName) {
		
		return VehicleManager.updateVehicle(vehicleName);
	}
	
	public boolean deleteVehicle(Vehicle vehicleId) {
		
		return VehicleManager.deleteVehicle(vehicleId);
	}

}
