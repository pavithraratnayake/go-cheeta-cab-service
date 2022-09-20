package com.codewithpavi.gocheetacabservicesystem.model;

public class Booking {
	
	private int bookingId;
	private String locationPickup;
	private String dropOff;
	private String pickupTime;
	private int customerId;
	private int vehicleId;
	
	
	public Booking() {
		
	}


	public Booking(String locationPickup, String dropOff, String pickupTime, int customerId, int vehicleId) {
		super();
		this.locationPickup = locationPickup;
		this.dropOff = dropOff;
		this.pickupTime = pickupTime;
		this.customerId = customerId;
		this.vehicleId = vehicleId;
	}


	public Booking(int bookingId, String locationPickup, String dropOff, String pickupTime, int customerId,
			int vehicleId) {
		super();
		this.bookingId = bookingId;
		this.locationPickup = locationPickup;
		this.dropOff = dropOff;
		this.pickupTime = pickupTime;
		this.customerId = customerId;
		this.vehicleId = vehicleId;
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public String getLocationPickup() {
		return locationPickup;
	}


	public void setLocationPickup(String locationPickup) {
		this.locationPickup = locationPickup;
	}


	public String getDropOff() {
		return dropOff;
	}


	public void setDropOff(String dropOff) {
		this.dropOff = dropOff;
	}


	public String getPickupTime() {
		return pickupTime;
	}


	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	
	
	
	
	
	

}
