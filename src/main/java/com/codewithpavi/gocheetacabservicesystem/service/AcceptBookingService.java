package com.codewithpavi.gocheetacabservicesystem.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithpavi.gocheetacabservicesystem.dao.AcceptBookingManager;
import com.codewithpavi.gocheetacabservicesystem.model.AcceptBooking;

public class AcceptBookingService {
	
	public AcceptBooking getSpecificAcceptBookingByaccReserveId (int accReserveId) throws ClassNotFoundException, SQLException {
		
		return AcceptBookingManager.getSpecificAcceptBookingByaccReserveId(accReserveId);
	}
	
	public List<AcceptBooking> getAllAcceptBookings() throws ClassNotFoundException, SQLException {
		
		return AcceptBookingManager.getAllAcceptedBookings();
	}
	
	public boolean addAcceptBooking(AcceptBooking accReserveId) throws ClassNotFoundException, SQLException {
		
		return AcceptBookingManager.addAcceptBooking(accReserveId);
	}
	
	public boolean updateAcceptBooking(AcceptBooking accReserveId) throws ClassNotFoundException, SQLException {
		
		return AcceptBookingManager.updateAcceptBooking(accReserveId);
	}
	
	public boolean deleteAcceptBooking(AcceptBooking accReserveId) throws ClassNotFoundException, SQLException {
		
		return AcceptBookingManager.deleteAcceptBooking(accReserveId);
	}

}
