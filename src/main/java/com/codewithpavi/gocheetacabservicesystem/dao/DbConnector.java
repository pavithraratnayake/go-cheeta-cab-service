package com.codewithpavi.gocheetacabservicesystem.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbConnector {
	
	public Connection getConnecion() throws ClassNotFoundException, SQLException;

}