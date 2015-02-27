/*
 * Blade runners younger brother
 */
package com.eh.queryrunner;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementExecutor {

	private Connection connection;
	
	StatementExecutor(Connection connection){
		this.connection = connection;
	}
	
	public void execute(String command) throws SQLException, IOException{
		Statement statement = connection.createStatement();
		statement.execute(command);
	}
	
	public void testConnection() throws SQLException{
		Statement statement = connection.createStatement();
		statement.execute("SELECT top 1 * FROM sys.all_objects");
	}
}
