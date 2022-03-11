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

	/**
	 * Method to match email with regex
	 * 
	 * @param email - User's email
	 */
	public void email(String email) {
		regex = "^[a-z0-9]+([.][a-z0-9]+)*@bl[.]co[.][a-z]{2,3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("Input follows required regex");
		} else {
			System.out.println("Sorry!! Input doesn't follow required regex");
		}
	}

	/**
	 * Method to match phone with regex
	 * 
	 * @param mobile - User's mobile
	 */
	public void mobile(String mobile) {
		regex = "^[0-9]{2}(\s){1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobile);
		if (matcher.matches()) {
			System.out.println("Input follows required regex");
		} else {
			System.out.println("Sorry!! Input doesn't follow required regex");
		}
	}

	/***
	 * Method to match password with regex
	 * 
	 * @param password - User's password
	 */
	public void password(String password) {
		regex = "^[a-zA-Z0-9]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			System.out.println("Input follows required regex");
		} else {
			System.out.println("Sorry!! Input doesn't follow required regex");
		}
	}
	public void upperCase(String upperCase) {
		regex = "^(?=.*[A-Z]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(upperCase);
		if (matcher.matches()) {
			System.out.println("Input follows required regex");
		} else {
			System.out.println("Sorry!! Input doesn't follow required regex");
		}
	}
}