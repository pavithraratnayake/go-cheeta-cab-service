package com.codewithpavi.gocheetacabservicesystem.model;

public class Driver {
	
	private int driverId;
	private String driverFirstName;
	private String driverLastName;
	private String contactNo;
	private String email;
	private String driverUserName;
	private String driverPassword;
	
	
	public Driver() {
		
	}


	public Driver(String driverFirstName, String driverLastName, String contactNo, String email, String driverUserName,
			String driverPassword) {
		super();
		this.driverFirstName = driverFirstName;
		this.driverLastName = driverLastName;
		this.contactNo = contactNo;
		this.email = email;
		this.driverUserName = driverUserName;
		this.driverPassword = driverPassword;
	}


	public Driver(int driverId, String driverFirstName, String driverLastName, String contactNo, String email,
			String driverUserName, String driverPassword) {
		super();
		this.driverId = driverId;
		this.driverFirstName = driverFirstName;
		this.driverLastName = driverLastName;
		this.contactNo = contactNo;
		this.email = email;
		this.driverUserName = driverUserName;
		this.driverPassword = driverPassword;
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


	public String getDriverLastName() {
		return driverLastName;
	}


	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDriverUserName() {
		return driverUserName;
	}


	public void setDriverUserName(String driverUserName) {
		this.driverUserName = driverUserName;
	}


	public String getDriverPassword() {
		return driverPassword;
	}


	public void setDriverPassword(String driverPassword) {
		this.driverPassword = driverPassword;
	}


	
	

}
