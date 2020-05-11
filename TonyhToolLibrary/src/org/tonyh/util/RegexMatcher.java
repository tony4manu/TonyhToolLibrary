/*
RegexMatcher.java
Tony Higgins
20200329

Regular expression matcher class
*/
package org.tonyh.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

	/**
	 * Regular expression checker.
	 * @param  theRegex - Regular expression pattern
	 * @param  stringToCheck - String to match using regex 
	 * @return  The string matched by 'TheRegex' against 'StringToCheck'
	 *  else returns an empty string ie., no match found.
	 */
	public static String regexChecker(String theRegex, String stringToCheck) {
		Pattern p = Pattern.compile( theRegex);
		Matcher m = p.matcher( stringToCheck);
		
		String str = "";
		if ( m.find()) {  // search for a match
			if (m.group(1).length() > 0)
				str = m.group(1).trim(); // assign the value if match found
		}
		
		return str;
	}

	/**
	 * Takes in theRegex, a stringToCheck and the number of array element
	 * @param  theRegex - Regular expression pattern
	 * @param  stringToCheck - String to match using regex 
	 * @return  An array of strings containing the matches, if found else return null array.
	 */
	public static String[] multiStringRegexChecker(String theRegex, String stringToCheck, int index) {
		String[] arr = new String[index];
		
		Pattern p = Pattern.compile(theRegex);
		Matcher m = p.matcher(stringToCheck);
		
		// If our pattern matches the string, try to extract our groups, assign to array elements
		if ( m.find()) {
			for (int i = 0; i < index; i++) {
				arr[i] = m.group(i+1); // get the groups we were looking for
			}
		}
		
		return arr;
	}
	
	/**
	 * Count instances of substring given
	 * @param  target - String to search for a match
	 * @param  key - String to search for
	 * @return total - Integer count of times 'key' was found in 'target'
	 */
	public static int countMatches(String target, String key) {
		Pattern pattern = Pattern.compile(key);
		Matcher matcher = pattern.matcher(target); // Using regex utilities to achieve what we want
		int total = 0;
		while (matcher.find()) {
			total++;
		}
		
		return total;
	}
}
