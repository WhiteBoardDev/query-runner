package com.eh.queryrunner;

public class ExecutionArguments {
	
	private String query;
	private String connectionString;
	
	
	private ExecutionArguments(){
	
	}
	
	public String getQuery(){
		return this.query;
	}
	
	public String getConnectionString(){
		return this.connectionString;
	}
	
	public static ExecutionArguments buildFromCommandLineArguments(String[] args) 
			throws ExecutionArgumentException {
		
		ExecutionArguments exeArgs = new ExecutionArguments();
		
		for(int i = 0; i < args.length; i++){
			if(args[i].equals("-q")){
				exeArgs.query = args[i + 1];
			}else if(args[i].equals("-conn")){
				exeArgs.connectionString = args[i + 1];
			}
		}
		
		if(exeArgs.connectionString == null ||
				exeArgs.query == null){
			throw new ExecutionArgumentException();
		}else{
			return exeArgs;
		}
		
	}
}
