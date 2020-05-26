/*
Datatypes.java

Print Datatypes
Source(20200514): https://www.codesdope.com/java-know-data-types/
20200515
*/
package org.tonyh.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		printTableOfDataTypeMinAndMaxValues();
		
		// Note: 10E5 means 105 i.e. 100000.
		System.out.println();
		examplesOfFloatDoubleBoolean();

		System.out.println("\nSmallest and Largest Float and Double");
		printMinAndMaxFloatDoubleInExponentialNotation();

		System.out.println();
		printMinAndMaxChar();

	}

	private static void printTableOfDataTypeMinAndMaxValues() {
		/*
		 Data Type	Maximum Value	Minimum Value
		int	2,147,483,647	- 2,147,483,648
		float	3.4028235E38	1.4E-45
		double	1.7976931348623157E308	4.9E-324
		char	65,535	0
		short	32767	-32768
		long	9223372036854775807	-9223372036854775808
		 */
		System.out.println("Table of Primitive Data Types");
		System.out.println("Data Type\tMaximum Value\t\tMinimum Value");
		System.out.println("int\t\t2,147,483,647\t\t-2,147,483,648");
		System.out.println("float\t\t3.4028235E38\t\t1.4E-45");
		System.out.println("double\t\t1.7976931348623157E308\t4.9E-324");
		System.out.println("char\t\t65,535\t\t\t0");
		System.out.println("short\t\t32767\t\t\t-32768");
		System.out.println("long\t\t9223372036854775807\t-9223372036854775808");
	}

	private static void printMinAndMaxChar() {
		System.out.println("minChar length: 0");
		System.out.println("maxChar length: 65,535");
	}

	private static void printMinAndMaxFloatDoubleInExponentialNotation() {
		// Display smallest and largest data type in exponential notation
		
		// Float
		float minFloat = 1.4E-45f;
		float maxFloat = 3.4028235E-38f;
		System.out.println("minFloat: " + minFloat);
		System.out.println("maxFloat: " + maxFloat);
		
		// Double
		double minDouble = 4.9E-324d; // 'd' is optional
		double maxDouble = 1.7976931348623157E-308d;
		System.out.println("minDouble: " + minDouble);
		System.out.println("maxDouble: " + maxDouble);
	}

	private static void examplesOfFloatDoubleBoolean() {
		double b = 123.43555;
	    char c = 'e';
	    boolean d = true;
	    System.out.println("Double: " + b);
	    System.out.println("Character: " + c);
	    System.out.println("Boolean: " + d);
		
	}

}
