/*
RegexMatcherTest.java

Tony Higgins
20200329

Test for Regular expression matcher class

*/
package org.tonyh.util;

import static org.tonyh.util.Print.*;
import static org.tonyh.util.RegexMatcher.*;

public class RegexMatcherTest {

	private static void printPercentage() {
		String str = "28.1% - Last reduced: \r\n" + "28th Oct 2019\r\n" + "";
		//str = "< 0.1% - Last reduced: \r\n" + "24th Sep 2018\r\n" +"";
		
		System.out.printf("printPercentage() - TOP - String: [%s]\n", str);
		
		String percentage = regexChecker("^[<]?[ ]?([0-9.]+)%", str);
		if (percentage.length() > 0) {
			System.out.println("printPercentage() - percentage: [" + percentage + "]\n");
		}
	}
	
	private static void printPropertyType() {
		String str = "End terrace house for sale\r\n"+"";
		String regex = "^([Ee]nd terrace \\w+) ";
		
		System.out.println("printPropertyType() - TOP - String [" + str + "]");
		
		String ptyType = regexChecker(regex, str);
		if (ptyType.length() > 0) {
			System.out.println("printPropertyType() ptyType: [" + ptyType + "]");
		}
	}
	
	private static void printAddressCommas3Format6() {
		// Split to: Addr1, Addr2, Postcode, City
		String str ="Baskerville Court, 120 Selhurst Road SE25, London,\r\n"+"";
		System.out.println("printAddressCommas3Format6() - TOP - String [" + str + "]");
		
		int idx = 4;
		String[] arr = new String[idx];
		String regex = "([0-9A-Za-z'-. ]+), ([0-9A-Za-z ]+) (\\w{2,5}), ([A-Za-z ]+),$";

		arr = multiStringRegexChecker(regex, str, idx);
		if (!checkArrayHasData(arr))
			System.out.println("Address not found");
		else {
			System.out.println("\nprintAddressCommas3Format6() - Result:"
					+ "\n  Addr1 [" + arr[0]
					+ "]\n  Addr2 [" + arr[1]
					+ "]\n  City [" + arr[3]
					+ "]\n  Postcode [" + arr[2] + "]");
		}
	}
	
	/**
	 * Check all string array elements contain data 
	 * @return - True if they do else return false.
	 */ 
	private static boolean checkArrayHasData(String[] arr) {
		//System.out.println("checkArrayHasData() -  Number of strings: " + arr.length);  //delthis test
		
		for (String str : arr) { // WARNING: Empty string is null!!  NullPointerException
			if (str == null)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		printPropertyType();
		
		print("\n");
		printPercentage();
		
		print("\n");
		printAddressCommas3Format6();
	}

} /* Output:
printPropertyType() - TOP - String [End terrace house for sale
]
printPropertyType() ptyType: [End terrace house]


printPercentage() - TOP - String: [28.1% - Last reduced: 
28th Oct 2019
]
printPercentage() - percentage: [28.1]



printAddressCommas3Format6() - TOP - String [Baskerville Court, 120 Selhurst Road SE25, London,
]

printAddressCommas3Format6() - Result:
  Addr1 [Baskerville Court]
  Addr2 [120 Selhurst Road]
  City [London]
  Postcode [SE25]
*///:~
