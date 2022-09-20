package com.codewithpavi.gocheetacabservicesystem.dao;

//-->Import the packages
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.codewithpavi.gocheetacabservicesystem.model.AcceptBooking;

public class AcceptBookingManager {
	
	public static AcceptBooking getSpecificAcceptBookingByaccReserveId (int accReserveId) throws ClassNotFoundException, SQLException {
		
		//Establish the connection
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		//4.-->Prepare the Statement 
		
		String query = "SELECT * FROM acceptbooking WHERE accReserveId = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, accReserveId);
		
		
		//5.--> Execute the query
		ResultSet rs = ps.executeQuery();
		
		//6.--> Evaluate the response/ result set
		AcceptBooking acceptbooking = new AcceptBooking();
		if(rs.next())
		{
			acceptbooking.setAccReserveId(rs.getInt("accReserveId"));
			acceptbooking.setCustomerId(rs.getInt("customerId"));
			acceptbooking.setDriverId(rs.getInt("driverId"));
			acceptbooking.setDriverFirstName(rs.getString("driverFirstName"));
			acceptbooking.setStatus(rs.getString("status"));
		}
		
		//7.--> Close the Statement and the connection
		
		ps.close();
		connection.close();
		return acceptbooking;
	}
	
	public static List<AcceptBooking> getAllAcceptedBookings() throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		String query = "SELECT * FROM acceptbooking";
		Statement st = connection.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		List<AcceptBooking> acceptbookings = new ArrayList();
		
		while(rs.next()) {
			AcceptBooking acceptbooking = new AcceptBooking(rs.getInt("accReserveId"), rs.getInt("customerId"), rs.getInt("driverId"), rs.getString("driverFirstName"), rs.getString("status"));
			acceptbookings.add(acceptbooking);
			
		}
		
		st.close();
		connection.close();
		return acceptbookings;
				
	}
	
	
	public static boolean addAcceptBooking(AcceptBooking accReserveId) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		String query = "INSERT INTO acceptbooking (customerId,driverId,driverFirstName,status) VALUES (?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		
		AcceptBooking acceptbooking = new AcceptBooking();
		
		ps.setInt(1, acceptbooking.getCustomerId());
		ps.setInt(2, acceptbooking.getDriverId());
		ps.setString(3, acceptbooking.getDriverFirstName());
		ps.setString(4, acceptbooking.getStatus());
		
		boolean result = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		return result;
	}
	
	public static boolean updateAcceptBooking(AcceptBooking accReserveId) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		String query = "UPDATE acceptbooking SET(driverId = ?, driverFirstName = ?, status = ?) WHERE accReserveId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		
		AcceptBooking acceptbooking = new AcceptBooking();
		
		ps.setInt(1, acceptbooking.getCustomerId());
		ps.setInt(2, acceptbooking.getDriverId());
		ps.setString(3, acceptbooking.getDriverFirstName());
		ps.setString(4, acceptbooking.getStatus());
		
		boolean result = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		return result;
		
	}
	
	public static boolean deleteAcceptBooking(int accReserveId) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		String query = "DELETE acceptbooking WHERE accReserveId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1, accReserveId);
		
		boolean result = ps.executeUpdate() > 0;
		ps.close();
		connection.close();
		
		return result;
		
	}

	public static boolean deleteAcceptBooking(AcceptBooking accReserveId) {
		// TODO Auto-generated method stub
		return false;
	}

}
