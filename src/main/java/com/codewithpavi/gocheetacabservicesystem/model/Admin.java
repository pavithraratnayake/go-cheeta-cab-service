package com.codewithpavi.gocheetacabservicesystem.model;

public class Admin {
	
	private int adminId;
	private String adminFirstName;
	private String adminLastName;
	private String adminUserName;
	private String adminPassword;
	
	
	public Admin() {
		
	}


	public Admin(String adminFirstName, String adminLastName, String adminUserName, String adminPassword) {
		super();
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}


	public Admin(int adminId, String adminFirstName, String adminLastName, String adminUserName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdminFirstName() {
		return adminFirstName;
	}


	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}


	public String getAdminLastName() {
		return adminLastName;
	}


	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}


	public String getAdminUserName() {
		return adminUserName;
	}


	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
	
	

}
