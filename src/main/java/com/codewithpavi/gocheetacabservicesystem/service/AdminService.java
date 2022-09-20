package com.codewithpavi.gocheetacabservicesystem.service;

import java.sql.SQLException;

import com.codewithpavi.gocheetacabservicesystem.dao.AdminManager;
import com.codewithpavi.gocheetacabservicesystem.model.Admin;

public class AdminService {
	
	private static AdminService service;
	
	private AdminService() {
		
	}
	
	public static AdminService getAdminServiceInstance() {
		if(service == null) {
			service = new AdminService();
		}
		return service;
	}
	
	public Admin searchUser(String username, String password) throws ClassNotFoundException, SQLException {
		
		return AdminManager.searchuser(username, password);
	}
	 
}
