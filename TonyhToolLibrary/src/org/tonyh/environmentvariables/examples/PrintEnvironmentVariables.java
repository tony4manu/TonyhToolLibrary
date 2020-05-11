/*
PrintEnvironmentVariables.java
Tony H, 20200509Sa 

Retrieve and Print environment variables from Windows PC. 
*/

package org.tonyh.environmentvariables.examples;

import java.util.Map;

public class PrintEnvironmentVariables {
	
	public static void main(String[] args) {
		
		printSpecificEnvironmentVariables();
		
		printEnvironmentVariablesLambda();
		
//		readAllEnvVarsUsingMap();
		
		//System.out.println( System.getenv().toString() ); // works. - Print toString. Ie., all on one line
	}
	
	
	/**
	 * Retrieve PATH, JAVA_HOME, Temporary directory and SHELL from Window's environment variables.
	 * Just need to call the getenv() method and pass the env variable name to it.
	 * All these env vars are OS-dependent.
	 */
	private static void printSpecificEnvironmentVariables() {
		System.out.println("# Print specific environment varables:");
		
		String opSystem = System.getenv("OS");
		System.out.println("OS : " + opSystem);

		//ProgramW6432
		String programW64 = System.getenv("ProgramW6432");
		System.out.println("ProgramW6432 : " + programW64);

		//PROCESSOR_ARCHITECTURE
		String procArchitecture = System.getenv("PROCESSOR_ARCHITECTURE");
		System.out.println("PROCESSOR_ARCHITECTURE : " + procArchitecture);
		
		//PROCESSOR_IDENTIFIER
		String procIdentifier = System.getenv("PROCESSOR_IDENTIFIER");
		System.out.println("PROCESSOR_IDENTIFIER : " + procIdentifier);
		
		String tmp = System.getenv("TMP");
		System.out.println("TMP : " + tmp);
		
		String temp = System.getenv("TEMP");
		System.out.println("TEMP : " + temp);

		String temp_dir = System.getenv("TEMP_DIR");
		System.out.println("TEMP_DIR : " + temp_dir);

		String data_dir = System.getenv("DATA_DIR");
		System.out.println("DATA_DIR : " + data_dir);
		
		String log_dir = System.getenv("LOG_DIR");
		System.out.println("LOG_DIR : " + log_dir);
		
		String pathValue = System.getenv("PATH");
		System.out.println("PATH : " + pathValue);
		
		String JavaHomeValue = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : " + JavaHomeValue);
		
		// gets the value of the specified environment variable "USERNAME"
	    // System.out.println("System.getenv(\"DATA_DIR\") : " + System.getenv("DATA_DIR"));  
		System.out.print("System.getenv(\"USERNAME\") = " + System.getenv("USERNAME"));

		System.out.println("\n\n");
	}


	/**
	Reading all Env Variables in Java
	Along with the getting value for a specific env var, System class has 
	another method to fetch all keys and values in the OS. All are retrieved 
	with System.getEnv() method. getEnv() method returns a Map and the 
	iterating map will return key/value pairs.
	Source (20200509Sa): Java Reading Environment Variable - System.getEnv() Examples; 
	   Venkatesh Nukala  Wednesday, 29 January 2020;
	   https://www.javaprogramto.com/2020/01/java-reading-environment-variable.html
	*/
	@SuppressWarnings("unused")
	private static void readAllEnvVarsUsingMap() {
		System.out.println("# Print environment varables using Map:");
		Map<String, String> env = System.getenv();
		
		for (String key : env.keySet()) {
			String value = env.get(key);
			System.out.println(key + " : " + value);
		}

		System.out.println("\n\n");
	}
	
	@SuppressWarnings("unused")
	private static void printEnvironmentVariablesLambda() {
		System.out.println("# Print environment varables using Lambda expression:");
		
		System.getenv().forEach((k, v) -> {
		    System.out.println(k + ":" + v);
		});
		
		System.out.println("\n\n");
	}
	
}


/*

*/