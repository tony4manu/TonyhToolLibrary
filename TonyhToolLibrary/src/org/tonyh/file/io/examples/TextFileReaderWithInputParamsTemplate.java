/*
TextFileReaderWithInputParamsTemplate.java
TonyH
20200508

Takes input filename as command line parameter.
Read contents of a text file display on the console. 
Then Print list of environment variables

Comments:
1. Pass file name as input parameter
*/
package org.tonyh.file.io.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderWithInputParamsTemplate {
	
	private static void printEnvironmentVariables() {
		System.out.println("# Print environment varables using a Lambda expression:");
		System.getenv().forEach((k, v) -> {
		    System.out.println(k + ":" + v);
		});
		
		System.out.println("\n\n");
	}

	public static void textFileReader(String inFile) throws IOException, FileNotFoundException {
		
		FileReader file = new FileReader(inFile); 
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
	}

	public static void main(String[] args)
			throws FileNotFoundException, IOException {
		if (args.length == 0) {
			// Default input file if none entered on command line.
			String inFile = "./src/org/tonyh/file/io/examples/FileReaderTemplate.java";
			textFileReader(inFile);
		} else {
			textFileReader(args[0]);
		}

		printEnvironmentVariables();
	}

}
