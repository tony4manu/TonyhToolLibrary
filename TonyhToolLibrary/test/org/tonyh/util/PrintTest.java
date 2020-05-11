/*
Class PrintTest.java

Source (20200208): Thinking in Java- Bruce Eckel 2006; p173

A custom tool library

With this knowledge, you can now create your own libraries
of tools to reduce or eliminate duplicate code. Consider, 
for example, the alias we�ve been using for System.out.println( ), 
to reduce typing. This can be part of a class called Print 
so that you end up with a readable static import:


You can use the printing shorthand to print anything, either
with a newline (print( )) or without a newline (printnb( )).

You can guess that the location of this file must be in a directory 
that starts at one of the CLASSPATH locations, then continues into 
net/mindview. After compiling, the static print( ) and printnb( ) 
methods can be used anywhere on your system with an import static
statement:
*/


// Uses the static printing methods in Print.java. 

package org.tonyh.util;
import static org.tonyh.util.Print.*;

public class PrintTest {

	public static void main(String[] args) {
		print("Available from now on!");	// print a string
		print(100);		// print an int.
		print(100L);	// print a long int
		print(3.14159);	// print PI
		print();  // with line break
		
		int num = 32;
		String sayHi = "Hello world!";
		printf("Formatted printing integer [%d] and string [%s]\n", num, sayHi);
		
		printnb("No line break");
		print(". [with line break]"); // with line break
	}
	
} /* Output:
Available from now on!
100
100
3.14159

Formatted printing integer [32] and string [Hello world!]
No line break. [with line break]
*///:~
