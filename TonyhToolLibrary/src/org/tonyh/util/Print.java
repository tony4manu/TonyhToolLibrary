/*
Class Print.java	p173

Source (20200208): Thinking in Java- Bruce Eckel 2006; p172

A custom tool library

With this knowledge, you can now create your own libraries of tools to 
reduce or eliminate duplicate code. Consider, for example, the alias 
we've been using for System.out.println(), to reduce typing. 
This can be part of a class called Print so that you end up with a 
readable static import:

You can use the printing shorthand to print anything, either 
with a newline (print()) or without a newline (printnb()).

Print methods that can be used without qualifiers, 
using Java SE5 static imports:
*/

package org.tonyh.util;

//import java.io.*;
import java.io.PrintStream;

/**
 * Print - Printing shorthand to print anything, either with a 
 * newline (print()) or without a newline (printnb()). 
 * The intent is for  to be used as a "static" import.
 * 
 * @author Bruce Eckel, 2006.
 */
public class Print {

	/**
	 *  Print with a newline:
	 * @param obj
	 */
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	/**
	 *  Print a newline by itself:
	 */
	public static void print() {
		System.out.println();
	}
	
	/**
	 *  Print with no line break:
	 * @param obj
	 */
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
	
	/**
	 * The Java SE5 printf() (from the C Programming Language):
	 * @param format
	 * @param args
	 * @return
	 */
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}
}
