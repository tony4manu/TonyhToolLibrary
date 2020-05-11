/*
Range.java	p174

Source (20200208): Thinking in Java- Bruce Eckel 2006; p172

Range - Automatically generates the appropriate array. 
The intent is for range() to be used as a "static" import.  p120 in book
It allows the use of the foreach syntax for simple integer sequences.

The range( ) method has been overloaded, which means the same method name 
can be used with different argument lists (you’ll learn about overloading 
soon). The first overloaded form of range( ) just starts at zero and 
produces values up to but not including the top end of the range. 
The second form starts at the first value and goes until one less than the 
second, and the third form has a step value so it increases by that value.
range( ) is a very simple version of what’s called a generator, which 
you’ll see later in the book.

A second component of this library can be the range( ) methods, introduced
in the Controlling Execution chapter, that allow the use of the foreach 
syntax for simple integer sequences:

NOTE:
The foreach syntax won't work unless you want to create an array of int first.

From now on, whenever you come up with a useful new utility, you can add it 
to your own library.
*/
package org.tonyh.util;

/**
 * Range - Automatically generates the appropriate array. 
 * The intent is for range() to be used as a "static" import.
 * It allows the use of the foreach syntax for simple integer sequences.
 *  
 * @author Bruce Eckel
 * </br>
 * </br></br>
 * #1 Produce a sequence [0..n)</br>
 *   n - End value</br>
 *   Result - integer array</br>
 * </br>
 * #2 Produce a sequence [start..end)</br>
 *   start - Start value</br>
 *   end - End value</br>
 *   Return integer array</br>
 *  </br>
 * #3 Produce a sequence [start..end) incrementing by step</br>
 *   start - Start value</br>
 *   end - End value</br>
 *   step - Step value to increase by</br>
 *   Return  integer array</br>
 */
public class Range {
	
	/**
	 * Produce a sequence [0..n)
	 * @param n - End value
	 * @return  Integer array
	 */
	public static int[] range(int n) {
		int[] result = new int[n];
		for(int i = 0; i < n; i++)
			result[i] = i;
		
		return result;
	}
	
	/**
	 * Produce a sequence [start..end)
	 * @param start - Start value
	 * @param end - End value
	 * @return  Integer array
	 */
	public static int[] range(int start, int end) {
		int sz = end - start;
		int[] result = new int[sz];
		for(int i = 0; i < sz; i++)
			result[i] = start + i;
	
		return result;
	}
	
	/**
	 * Produce a sequence [start..end) incrementing by step
	 * @param start - Start value
	 * @param end - End value
	 * @param step - Step value to increase by
	 * @return  Integer array
	 */
	public static int[] range(int start, int end, int step) {
		int sz = (end - start)/step;
		int[] result = new int[sz];
		for(int i = 0; i < sz; i++)
			result[i] = start + (i * step);
		
		return result;
	}

}
