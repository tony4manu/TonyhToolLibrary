/*
Hex.java	p391

Source (20200208): Thinking in Java- Bruce Eckel 2006; p172

Hex Dumper.
Often you want to look at the bytes inside a binary file using hex format. 
Here’s a small utility that displays a binary array of bytes in a readable
hex format, using
*/

//: net/mindview/util/Hex.java
package org.tonyh.util;

import java.io.File;

//import java.io.*;

public class Hex {
	
	public static String format(byte[] data ) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		
		for (byte b : data) {
			if (n % 16 == 0)
				result.append(String.format("%05X: ", n));
			
			result.append(String.format("%02X ",  b));
			n++;
			if (n % 16 == 0)  result.append("\n");
		}
		
		result.append("\n");
		return result.toString();
	}
	
	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			// Test by displaying this class file:
			//System.out.println( format( BinaryFile.read("Hex.class")));
			System.out.println(
					format( BinaryFile.read("./bin/org/tonyh/util/Hex.class")));
		}
		else
			System.out.println(
					format( BinaryFile.read( new File(args[0]))));
	}

} ///:~
