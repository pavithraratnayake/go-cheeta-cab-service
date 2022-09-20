package com.codewithpavi.gocheetacabservicesystem.model;

public class AcceptBooking {
	
	private int accReserveId;
	private int customerId;
	private int driverId;
	private String driverFirstName;
	private String status;
	
	
	public AcceptBooking() {
		
	}


	public AcceptBooking(int customerId, int driverId, String driverFirstName, String status) {
		super();
		this.customerId = customerId;
		this.driverId = driverId;
		this.driverFirstName = driverFirstName;
		this.status = status;
	}


	public AcceptBooking(int accReserveId, int customerId, int driverId, String driverFirstName, String status) {
		super();
		this.accReserveId = accReserveId;
		this.customerId = customerId;
		this.driverId = driverId;
		this.driverFirstName = driverFirstName;
		this.status = status;
	}


	public int getAccReserveId() {
		return accReserveId;
	}


	public void setAccReserveId(int accReserveId) {
		this.accReserveId = accReserveId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	public String getDriverFirstName() {
		return driverFirstName;
	}


	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	
	
	
	

}
