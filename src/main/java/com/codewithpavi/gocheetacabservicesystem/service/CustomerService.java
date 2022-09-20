package com.codewithpavi.gocheetacabservicesystem.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithpavi.gocheetacabservicesystem.dao.CustomerManager;
import com.codewithpavi.gocheetacabservicesystem.model.Customer;

public class CustomerService {

	public Customer getCustomerByID(int customerID) throws ClassNotFoundException, SQLException {
		return CustomerManager.getCustomerByID(customerID);
	}
	
	public List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException{
	
		return CustomerManager.getAllCustomers();
	}
	
	public boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		
		return CustomerManager.addCustomer(customer);
	}
	
	public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		
		return CustomerManager.updateCustomer(customer);
	}
	
	public boolean deleteCustomer(int customerID) throws ClassNotFoundException, SQLException {
		
		return CustomerManager.deleteCustomer(customerID);
	}
	
	public Customer searchUser(String username, String password) throws ClassNotFoundException, SQLException{
		
		return CustomerManager.searchuser(username, password);
	}
	
}
