/*
Book: Regular Expression Pocket Reference
TonyH.
20200106Mn 
*/

package org.tonyh.regex.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcherTutoiralFromBook {
	
	public static void main(String[] args) throws Exception {
		// Example 1-5. Simple match
		// Find Spider-Man, Spiderman, SPIDER-MAN, etc. 
		simpleMatchTest();
		
		// Example 1-6. Match and capture group
		//  Match dates formatted like MM/DD/YYYY, MM-DD-YY,...
		matchAndCaptureGroupTest();
		
		// Example 1-7. Simple substitution
		// Convert <br> to <br /> for XHTML compliance
		simpleSubstitutionTest();
		
		// Example 1-8. Harder substitution
		// Urlify - turn URLs into HTML links
		harderSubstitutionUrlify();
	}
	
	
	/*
	 *  harderSubstitutionUrlify()
	 *  Urlify - turn URLs into HTML links
	 */
	private static void harderSubstitutionUrlify() throws Exception {
		String text = "Check the web site, http://www.orielly.com/catalog/regexppr.";
		String regex =
			  "\\b		                   # start at word\n"
			+ "                            # boundary\n"
			+ "(                           # capture to $1\n"
			+ "(https?|telnet|gopher|file|wais|ftp) : \n"
			+ "                            # resource and colon\n"
			+ "[\\w/\\#~:.?+=&%@!\\-] +?   # one or more valid\n"
			+ "                            # characters\n"
			+ "                            # but take as little\n"
			+ "                            # as possible\n"
			+ ")\n"
			+ "(?=                         # lookahead\n"
			+ "[.:?\\-] *                  # for possible punc\n"
			+ "(?: [^\\w/\\#~:.?+=&%@!\\-] # invalid character\n"
			+ "| $ )                       # or end of string\n"
			+ ")";
		
		Pattern p = Pattern.compile(regex,
				Pattern.CASE_INSENSITIVE + Pattern.COMMENTS);
		Matcher m = p.matcher(text);
		
		String result = m.replaceAll("<a href=\"$1\">$1</a>");
		System.out.println("harderSubstitutionUrlify() - " + result);
	}
	
	/*
	 * simpleSybstitutionTest()
	 * Example -. Simple substitution
	 * Convert <br> to <br /> for XHTML compliance
	 */
	private static void simpleSubstitutionTest() throws Exception  {
		String text = "Hello world. <br>";
		Pattern p = Pattern.compile("<br>", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		
		String result = m.replaceAll("<br />");
		System.out.printf("simpleSybstitutionTest() - %s\n", result);
	}

	/*
	 *  matchAndCaptureGroup()
	 *  Example 1-6. Match and capture group
	 *  Match dates formatted like MM/DD/YYYY, MM-DD-YY,...
	 */
	private static void matchAndCaptureGroupTest() throws Exception {
		// Match dates formatted like MM/DD/YYYY, MM-DD-YY,...
		String date = "12/30/1969";
		Pattern p =
			Pattern.compile("^(\\d\\d)[-/](\\d\\d)[-/](\\d\\d(?:\\d\\d)?)$");
		Matcher m = p.matcher(date);
		
		if (m.find()) {
			String month = m.group(1);
			String day   = m.group(2);
			String year  = m.group(3);
			System.out.printf("matchAndCaptureGroupTest() - Found: %s-%s-%s\n", year, month, day);
		}
	}
	
	/*
	 * simpleMatch()
	 * Example 1-5. Simple match
	 * Find Spider-Man, Spiderman, SPIDER-MAN, etc.
	 */
	private static void simpleMatchTest() throws Exception {
		// Find Spider-Man, Spiderman, SPIDER-MAN, etc.
		String dailyBugle = "Spider-Man Menaces City!";
		
		// regex must match entire string
		String regex = "(?i).*spider[- ]?man.*";
		
		if (dailyBugle.matches(regex)) {
			System.out.println("simpleMatch() - Matched: " + dailyBugle);
		}
	}


}
