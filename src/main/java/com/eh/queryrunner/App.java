package com.eh.queryrunner;



public class App {
	
	public static void main(String[] args) throws Exception {
		
		ExecutionArguments arguments = ExecutionArguments.buildFromCommandLineArguments(args);
		StatementExecutor statementExecutor = new StatementExecutor( 
				ConnectionFactory.createConnection(arguments.getConnectionString()));
		statementExecutor.execute(arguments.getQuery());
	}
	
}
