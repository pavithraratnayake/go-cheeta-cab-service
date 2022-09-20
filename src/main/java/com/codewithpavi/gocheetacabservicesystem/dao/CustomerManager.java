package com.codewithpavi.gocheetacabservicesystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.codewithpavi.gocheetacabservicesystem.model.Customer;

public class CustomerManager {
	
	public static Customer getSpecificCustomerByCustomerId (int customerId) {
		
		return new Customer();
	}
	
	
	public static List<Customer> getAllCustomers() {
		
		return new ArrayList<Customer>();
	}
	
	
	public static boolean addCustomer(Customer cusFirstName) {
		
		return false;
	}
	
	public static boolean updateCustomer(Customer cusFirstName) {
		
		return false;
	}
	
	public static boolean deleteCustomer(Customer customerId) {
		
		return false;
	}

}
