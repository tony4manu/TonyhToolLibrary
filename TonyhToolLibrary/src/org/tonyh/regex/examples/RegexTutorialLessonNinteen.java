/*
Java Video Tutorial 19 - Regular Expressions Tutorial
160,870 views
https://www.youtube.com/watch?v=s_PfopWcMwI

Location E Drv HowTo : Java Video Tutorial 19_Regex_20120225_DerekBanas.mp4

=============
 Java Video Tutorial 19
Posted by Derek Banas on Feb 25, 2012 in Java Video Tutorial, Regular Expressions, Web Design | 25 comments

Java Regular ExpressionsIn this part of my Java Video Tutorial, I cover Java Regular Expressions. You use regular expressions when you want to search for data. You then use codes to define what that data looks like.

So, if you are looking for a 5 digit number, you could type \\d{5} and Java does the rest!

The code that follows the video will help you see how easy regular expressions are.

Source (20200105Su): 
  https://www.youtube.com/watch?v=s_PfopWcMwI
*/

package org.tonyh.regex.examples;

import java.util.regex.*;

public class RegexTutorialLessonNinteen {

	public static void main(String[] args){
		
		//String longString = " Derek Banas CA AK 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		//String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		String longString = " Derek Banas CA AK 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-6789 ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { cccc ";
	
		/*
		[0-9]   Any digit characters you want
		[A-G]  Any alphabetic uppercase characters you want A through Z
		[^A-G]  Any alphabetic uppercase characters you want A through G Starting from beginning of the line/string
		[^a-g]  Any alphabetic lowercase characters you want a through g Starting from beginning of the line/string
		[ ]  Insert characters that are valid
		[^ ]  Insert characters that are not valid
		\\s  Any white space
		\\S  Any non white space
		{n,m}  Whatever proceeds must occur between n and m times
		*/
		
		// Word must contain letters that are 2 to 20 characters in length
		// [A-Za-z]{2,20} 0r \\w{2,20}
		
		System.out.println("Test 1 - Find all words in 'longSting'");
		System.out.format("longString: '%s'\n", longString);
		System.out.println("Test 1 - regexChecker(\"\\\\s[A-Za-z]{2,20}\\\\s\", longString);");
		
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);	// Test 1
		
		/*
		\\d  Any digits 0-9
		\\D  Anything not a number
		{n}  Whatever proceeds must occur n times
		*/
			
		// A search that has a minimum but no maximum characters
		// {n,}
		
		System.out.println("Test 2 - Find a minimum of 5 digits in longString");
		System.out.format("longString: '%s'\n", longString);
		System.out.println("Test 2 - [regexChecker(\"\\\\s\\\\d{5}\\\\s\", longString);]");
		
		regexChecker("\\s\\d{5}\\s", longString);	// Test 2

		
		// Only 5 digits - Example: USA Zip Code
		// \\s[0-9]{5}\\s or \\d{5}
		
		System.out.println("Test 3 - Find 5 digit USA Zip Code in 'longString'");
		System.out.format("longString: '%s'\n", longString);
		System.out.println("Test 3 - regexChecker(\"\\\\s\\\\d{5}\\\\s\", longString);");
		
		regexChecker("\\s\\d{5}\\s", longString);	// Test 3
		
		/*
		|  Is used for OR clause situations
		*/
		
		// Must start with a A or C, followed by 1 letter in brackets
		// Must be a maximum of 2 characters in length
		// A[KLRZ]|C[AOT]
		//
		// Find USA States - 2 characters that start with a C or A
		// (Does not find PA because it does'nt begin with an A or A).
		// A[KLRZ]|C[AOT]
		
		System.out.println("Test 4 - Find 2 character USA states in 'longString'");
		System.out.format("longString: '%s'\n", longString);
		System.out.println("Test 4 - regexChecker(\"A[KLRZ]|C[AOT]\", longString);");
		
		regexChecker("A[KLRZ]|C[AOT]", longString);	// Test 4
		
		/*
		{n,}  Whatever proceeds must occur at least n times
			Eg., {5,} - Must occur 5 at least or more times
		+  Whatever proceeds must occur one or more times
		. ^ * + ? { } [ ] \ | ( )  Characters that must be escaped (with backslash)
		*/
		
		// Grab any string that contains 1 or more !
		
		System.out.println("Test 5 - Find any string that contains 1 or more '!' in strangeString");
		System.out.format("strangeString: '%s'\n", strangeString);
		System.out.println("Test 5 - regexChecker(\"(\\{{1,})\", strangeString);");
		
		regexChecker("(\\{{1,})", strangeString);	// Test 5
		
		
		System.out.println("Test 6 - Find anything that contains one or more '{' characters in strangeString");
		System.out.format("strangeString: '%s'\n", strangeString);
		System.out.println("Test 6 - regexChecker(\"(\\\\{+)\", strangeString);");
		
		regexChecker("(\\{+)", strangeString);		// Test 6
         
        // Get anything that occurs 3 times except newline
		
		System.out.println("Test 7 - Get anything that occurs 3 times except newline in strangeString");
		System.out.format("strangeString: '%s'\n", strangeString);
		System.out.println("Test 7 - regexChecker(\".{3}\", strangeString);");
		
		regexChecker(".{3}", strangeString);		// Test 7
		
		/*
			\\w  Any word type character A-Z, a-z, 0-9, _
			[A-Za-z0-9_]  Same as the above
			\\W  Any non word character
			*  Occurs zero or more times
			+  Occurs one or more times
			. Wildcard, match any character
		*/
		
		System.out.println("Test 8 - Get Any word type characters in strangeString");
		System.out.format("strangeString: '%s'\n", strangeString);
		System.out.println("Test 8 - regexChecker(\"\\\\w*\", strangeString);");
		
		regexChecker("\\w*", strangeString);		// Test 8
		
		;
		System.out.println("Test 9 - Get Any email address in longString");
		System.out.format("longString: '%s'\n", longString);
		System.out.println("Test 9 - regexChecker(\"[A-Za-z0-9._\\\\%-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,4}\", longString);");
		
		regexChecker("[A-Za-z0-9._\\%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", longString);	// Test 9

		// ?  0 or 1 of what proceeds it
		
		System.out.println("Test 10 - 0 or 1 of whatever preceeds it in longString");
		System.out.format("longString: '%s'\n", longString);
		System.out.println("Test 10 - regexChecker(\"([0-9]( |-)?)?(\\\\(?[0-9]{3}\\\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})\", longString);");
		
		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);	// Test 10
		
		System.out.println("Test 11 - Replace All whitespaces with ', ' (comma whitespace) on 'longString': regexReplace(longString);");
		System.out.format("longString: '%s'\n", longString);
		
		regexReplace(longString);	// Test 11
	}
	
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		// You define your regular expression (REGEX) using Pattern
		Pattern checkRegex = Pattern.compile(theRegex);
	 
		// Creates a Matcher object that searches the String for
		// anything that matches the REGEX
		Matcher regexMatcher = checkRegex.matcher( str2Check );
		 
		// Cycle through the positive matches and print them to screen
		// Make sure string isn't empty and trim off any whitespace
		
		while ( regexMatcher.find() ) {  // Find all the matches
			if (regexMatcher.group().length() != 0) {  // Ensure you got match(s)
				System.out.println( regexMatcher.group().trim() );
     
				// You can get the starting and ending indexs (of matches found)
				System.out.println( "Start Index: " + regexMatcher.start());
				System.out.println( "Start Index: " + regexMatcher.end());
			}
		}

		System.out.println();
	}
	
	
	public static void regexReplace(String str2Replace) {

		// REGEX that matches 1 or more white space
	
		Pattern replace = Pattern.compile("\\s+");
	
		// This doesn't really apply, but this is how you ignore case
		// Pattern replace = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
	
		// trim the string t prepare it for a replace
	
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
	
		// replaceAll replaces all white space with commas
	
		System.out.println(regexMatcher.replaceAll(", "));
	}
	
}
