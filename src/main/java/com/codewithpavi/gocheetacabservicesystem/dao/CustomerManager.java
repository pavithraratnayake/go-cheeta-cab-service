package com.codewithpavi.gocheetacabservicesystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.codewithpavi.gocheetacabservicesystem.model.Customer;


public class CustomerManager {
	
	public static Customer getCustomerByID(int customerID) throws ClassNotFoundException, SQLException{
		
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		String query = "SELECT * FROM gocheetadb.customer WHERE customerID=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, customerID);
		
		ResultSet rs = ps.executeQuery();
		
		Customer customer = new Customer();
		
		if(rs.next()) {
			
			customer.setCustomerID(rs.getInt("customerID"));
			customer.setfName(rs.getString("custFirstName"));
			customer.setlName(rs.getString("cusLastName"));
			customer.setUserName(rs.getString("cusUserName"));
			customer.setContact(rs.getString("contactNo"));
			customer.setEmail(rs.getString("email"));
			customer.setPassword(rs.getString("cusPassword"));
		}
		
		rs.close();
		connection.close();
		
		return customer;
	}
	
	public static List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException{
		
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		String query = "SELECT * FROM gocheetadb.customer";
		Statement st = connection.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		List<Customer> customers = new ArrayList<Customer>();
		
		while(rs.next()) {
			Customer customer = new Customer(rs.getInt("customerID"), rs.getString("custFirstName"), 
					rs.getString("cusLastName"), rs.getString("cusUserName"), 
					rs.getString("contactNo"), rs.getString("email"), rs.getString("cusPassword"));
			
			customers.add(customer);
		}
		
		st.close();
		connection.close();
	
		
		return customers;
	}
	
	 public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		String query = "INSERT INTO gocheetadb.customer (custFirstName, cusLastName, cusUserName, contactNo, email, cusPassword) VALUES (?,?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, customer.getfName());
		ps.setString(2, customer.getlName());
		ps.setString(3, customer.getUserName());
		ps.setString(4, customer.getContact());
		ps.setString(5, customer.getEmail());
		ps.setString(6, customer.getPassword());
		
		boolean result = ps.executeUpdate() >0;

		ps.close();
		connection.close();
		 
		 return result;
	 }
	 
	 public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {

		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();

		String query = "UPDATE gocheetadb.customer SET custFirstName=?, cusLastName=?, cusUserName=?, contactNo=?, email=?, cusPassword=? WHERE customerID=?";

		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, customer.getfName());
		ps.setString(2, customer.getlName());
		ps.setString(3, customer.getUserName());
		ps.setString(4, customer.getContact());
		ps.setString(5, customer.getEmail());
		ps.setString(6, customer.getPassword());
		ps.setInt(7, customer.getCustomerID());
		
		boolean result = ps.executeUpdate() >0;

		ps.close();
		connection.close();
		 
		 return result;
	 }
	 
	 public static boolean deleteCustomer(int customerID) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();

		String query = "DELETE FROM gocheetadb.customer WHERE customerID=?";
		PreparedStatement ps = connection.prepareStatement(query);

		ps.setInt(1, customerID);

		boolean result = ps.executeUpdate() > 0;

		ps.close();
		connection.close();

		 return result;
	 }

	 public static Customer searchuser(String username, String password) throws SQLException, ClassNotFoundException {
		 
		DbConnector connector = new DbConnectorImplMySQL();
		Connection connection = connector.getConnecion();
		
		String query = "SELECT * FROM gocheetadb.customer WHERE email=? AND password=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
	
		Customer customer = null;
		if(rs.next()) {
			customer = new Customer();
			customer.setCustomerID(rs.getInt("customerID"));
			customer.setfName(rs.getString("custFirstName"));
			customer.setlName(rs.getString("cusLastName"));
			customer.setUserName(rs.getString("cusUserName"));
			customer.setContact(rs.getString("contactNo"));
			customer.setEmail(rs.getString("email"));
			customer.setPassword(rs.getString("cusPassword"));
		}
		
		ps.close();
		connection.close();
		
		return customer;
 }

}
