package com.codewithpavi.gocheetacabservicesystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.codewithpavi.gocheetacabservicesystem.model.Driver;

public class DriverManager {
	
	public static Driver getSpecificDriverByDriverId (int driverId) {
		
		return new Driver();
	}
	
	
	public static List<Driver> getAllDrivers() {
		
		return new ArrayList<Driver>();
	}
	
	
	public static boolean addDriver(Driver driverFirstName) {
		
		return false;
	}
	
	public static boolean updateDriver(Driver driverFirstName) {
		
		return false;
	}
	
	public static boolean deleteDriver(Driver driverId) {
		
		return false;
	}

}
