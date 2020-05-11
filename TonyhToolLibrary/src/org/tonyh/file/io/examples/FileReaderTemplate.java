/*
FileReaderTemplate.java
TonyH
20200508

Read/print contents of a text file 
Then Print list of environment variables

Comments:
1. Pass file name as input parameter
*/
package org.tonyh.file.io.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTemplate {
	
	private static void printEnvironmentVariables() {
		System.out.println("# Print environment varables using a Lambda expression:");
		System.getenv().forEach((k, v) -> {
		    System.out.println(k + ":" + v);
		});
		
		System.out.println("\n\n");
	}

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		//--------<< FileReader Begin >>-------------------------------------------------------------
		String path = "./src/org/tonyh/files/examples/";
		String inFile = "FileReaderTemplate.java";
		
		FileReader file = new FileReader(path + inFile); 
		BufferedReader buff = new BufferedReader(file);
		
		// Loop to read file
		boolean eof = false;
		while (!eof) {
			String line = buff.readLine();
			if (line == null) {
				eof = true;
			} else {
				System.out.println(line);
			}
		}
		buff.close();
		//--------<< FileReader End >>-------------------------------------------------------------
		
		printEnvironmentVariables();
	}

}
