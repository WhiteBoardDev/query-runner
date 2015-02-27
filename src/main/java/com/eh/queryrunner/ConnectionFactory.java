package com.eh.queryrunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	public static Connection createConnection(String connectionString) throws ClassNotFoundException, SQLException{
		DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());
		return DriverManager.getConnection(connectionString);
	}
	
	
}
