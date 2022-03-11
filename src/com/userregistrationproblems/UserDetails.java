package com.userregistrationproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class created for methods required for user registration
 * 
 * @author Moinuddin
 *
 */
public class UserDetails {
	/**
	 * regex - regex pattern to be matched with user input
	 */
	public String regex;

	/**
	 * Method to match first name with regex
	 * 
	 * @param firstName - User's First Name
	 */
	public void firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("Input follows required regex");
		} else {
			System.out.println("Sorry!! Input doesn't follow required regex");
		}
	}

	/**
	 * Method to match last name with regex
	 * 
	 * @param lastName - User's Last Name
	 */
	public void lastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (matcher.matches()) {
			System.out.println("Input follows required regex");
		} else {
			System.out.println("Sorry!! Input doesn't follow required regex");
		}
	}
}