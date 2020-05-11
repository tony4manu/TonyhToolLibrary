/*
Class ForEachIntRangeTest.java

Based on ForEachInt.java

Source (20200208): Thinking in Java- Bruce Eckel 2006; p120

A custom tool library

With this knowledge, you can now create your own libraries
of tools to reduce or eliminate duplicate code. Consider, 
for example, the alias we�ve been using for System.out.println( ), 
to reduce typing. This can be part of a class called Print 
so that you end up with a readable static import:


The foreach syntax won't work unless you want to create an array of first.
To simply this tas, Mr Eckel created a method called range() that automatically
generates the appropiate array. The intent is for range() to be used as a
"static" import.  p120 in book
*/



package org.tonyh.util;

import static org.tonyh.util.Print.*;
import static org.tonyh.util.Range.*;

public class ForEachIntRangeTest {

	public static void main(String[] args) {
		for (int i : range(10))	// 0..9
			printnb(i + " ");
		print();
		
		for (int i : range(5, 10))	// 5..9
			printnb(i + " ");
		print();
			
		for (int i : range(5, 20, 3))	// 5..20 step 3
			printnb(i + " ");
		print();
	}

} /* Output:
0 1 2 3 4 5 6 7 8 9 
5 6 7 8 9 
5 8 11 14 17 
*///:~
