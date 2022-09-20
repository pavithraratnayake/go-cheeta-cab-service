package com.codewithpavi.gocheetacabservicesystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectorImplMySQL implements DbConnector {

	@Override
	public Connection getConnecion() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/gocheetadb";
		String userName = "root";
		String password = "0827";
		return DriverManager.getConnection(url, userName, password);
		
	}
	

}
