package com.codewithpavi.gocheetacabservicesystem.service;

import java.util.List;

import com.codewithpavi.gocheetacabservicesystem.dao.CustomerManager;
import com.codewithpavi.gocheetacabservicesystem.model.Customer;

public class CustomerService {
	
	public Customer getSpecificCustomerByCustomerId (int customerId) {
		
		return CustomerManager.getSpecificCustomerByCustomerId(customerId);
	}
	
	public List<Customer> getAllCustomers() {
		
		return CustomerManager.getAllCustomers();
	}
	
	public boolean addCustomer(Customer cusFirstName) {
		
		return CustomerManager.addCustomer(cusFirstName);
	}
	
	public boolean updateCustomer(Customer cusFirstName) {
		
		return CustomerManager.updateCustomer(cusFirstName);
	}
	
	public boolean deleteCustomer(Customer customerId) {
		
		return CustomerManager.deleteCustomer(customerId);
	}

}
