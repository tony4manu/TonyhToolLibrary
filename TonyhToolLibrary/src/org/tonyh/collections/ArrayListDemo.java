/*	p512
ArrayListDemo.java
20200514
Source: Java The Complete Reference, Herbert Schult, JavaSE8. 2014

The ArrayList Class

Demonstrate ArrayList 

A simple use of ArrayList. An array list is created for
objects of type String, and then several strings are added to it. (Recall that a quoted string
is translated into a String object.) The list is then displayed. Some of the elements are
removed and the list is displayed again.
*/

// Demonstrate ArrayList
package org.tonyh.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Create an array list.
		ArrayList<String> a1 = new ArrayList<String>();
		
		System.out.println("Initial size of a1: " + a1.size());
		
		// Add elements to the array list.
		a1.add("C");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add("F");
		a1.add(1, "A2");

		System.out.println("Size of a1 after additions: " + a1.size());
		
		// Display the array list.
		System.out.println("Contents of a1: " + a1);
		
		// Remove elements from the array list.
		a1.remove("F");
		a1.remove(2);
		
		System.out.println("Size of a1 after deletions: " + a1.size());
		
		System.out.println("Contents of a1: " + a1);
		
		
		// Enhanced For loop to iterate through list
		System.out.println("\n==============> New Enhanced For loop Example..");
		for (String temp : a1 ) {
			System.out.println(temp);
		}
		
	}

}
/* Output:
Initial size of a1: 0
Size of a1 after additions: 7
Contents of a1: [C, A2, A, E, B, D, F]
Size of a1 after deletions: 5
Contents of a1: [C, A2, E, B, D]

==============> New Enhanced For loop Example..
C
A2
E
B
D
*/
