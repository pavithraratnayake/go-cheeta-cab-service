package com.codewithpavi.gocheetacabservicesystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codewithpavi.gocheetacabservicesystem.model.AcceptBooking;
import com.codewithpavi.gocheetacabservicesystem.model.Admin;

public class AdminManager {
	
	 public static Admin searchuser(String username, String password) throws SQLException, ClassNotFoundException {
		 
			DbConnector connector = new DbConnectorImplMySQL();
			Connection connection = connector.getConnecion();
			
			String query = "SELECT * FROM gocheetadb.admin WHERE adminUserName=? AND adminPassword=?";

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
		
			Admin admin = null;
			if(rs.next()) {
				admin = new Admin();
				admin.setAdminUserName("username");
				admin.setAdminPassword("password");
			}
			
			ps.close();
			connection.close();
			
			return admin;
	 }
	 
	 
	 
	 
	 public static Admin getSpecificAdminByadminId (int adminId) throws ClassNotFoundException, SQLException {
			
			//Establish the connection
			DbConnector connector = new DbConnectorImplMySQL();
			Connection connection = connector.getConnecion();
			
			//4.-->Prepare the Statement 
			
			String query = "SELECT * FROM admin WHERE adminId = ? ";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, adminId);
			
			
			//5.--> Execute the query
			ResultSet rs = ps.executeQuery();
			
			//6.--> Evaluate the response/ result set
			Admin admin = new Admin();
			if(rs.next())
			{
				admin.setAdminId(rs.getInt("adminId"));
				admin.setAdminFirstName(rs.getString("adminFirstName;"));
				admin.setAdminLastName(rs.getString("adminLastName"));
				admin.setAdminUserName(rs.getString("adminUserName"));
				admin.setAdminPassword(rs.getString("adminPassword"));
			}
			
			//7.--> Close the Statement and the connection
			
			ps.close();
			connection.close();
			return admin;
		}
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	

	
	public static boolean addAdmin(Admin adminFirstName) {
		
		return false; 
	}
	
	public static boolean updateAdmin(Admin adminFirstName) {
		
		return false;
	}
	
	public static boolean deleteAdmin(Admin adminId) {
		
		
		return false;
	}

}
