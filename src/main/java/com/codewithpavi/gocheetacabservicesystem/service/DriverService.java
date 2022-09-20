package com.codewithpavi.gocheetacabservicesystem.service;

import java.util.List;

import com.codewithpavi.gocheetacabservicesystem.dao.DriverManager;
import com.codewithpavi.gocheetacabservicesystem.model.Driver;

public class DriverService {
	
	public Driver getSpecificDriverByDriverId (int driverId) {
		
		return DriverManager.getSpecificDriverByDriverId(driverId);
	}
	
	public List<Driver> getAllDrivers() {
		
		return DriverManager.getAllDrivers();
	}
	
	public boolean addDriver(Driver driverFirstName) {
		
		return DriverManager.addDriver(driverFirstName);
	}
	
	public boolean updateDriver(Driver driverFirstName) {
		
		return DriverManager.updateDriver(driverFirstName);
	}
	
	public boolean deleteDriver(Driver driverId) {
		
		return DriverManager.deleteDriver(driverId);
	}

}
