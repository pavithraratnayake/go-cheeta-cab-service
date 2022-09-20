package com.codewithpavi.gocheetacabservicesystem.model;

public class Customer {
	
	private int cutomerId;
	private String cusFirstName;
	private String cusLastName;
	private String contactNo;
	private String email;
	private String cusUserName;
	private String cusPassword;
	
	
	public Customer() {
		
	}


	public Customer(String cusFirstName, String cusLastName, String contactNo, String email, String cusUserName,
			String cusPassword) {
		super();
		this.cusFirstName = cusFirstName;
		this.cusLastName = cusLastName;
		this.contactNo = contactNo;
		this.email = email;
		this.cusUserName = cusUserName;
		this.cusPassword = cusPassword;
	}


	public Customer(int cutomerId, String cusFirstName, String cusLastName, String contactNo, String email,
			String cusUserName, String cusPassword) {
		super();
		this.cutomerId = cutomerId;
		this.cusFirstName = cusFirstName;
		this.cusLastName = cusLastName;
		this.contactNo = contactNo;
		this.email = email;
		this.cusUserName = cusUserName;
		this.cusPassword = cusPassword;
	}


	public int getCutomerId() {
		return cutomerId;
	}


	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}


	public String getCusFirstName() {
		return cusFirstName;
	}


	public void setCusFirstName(String cusFirstName) {
		this.cusFirstName = cusFirstName;
	}


	public String getCusLastName() {
		return cusLastName;
	}


	public void setCusLastName(String cusLastName) {
		this.cusLastName = cusLastName;
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


	public String getCusUserName() {
		return cusUserName;
	}


	public void setCusUserName(String cusUserName) {
		this.cusUserName = cusUserName;
	}


	public String getCusPassword() {
		return cusPassword;
	}


	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}
	
	


	

}
