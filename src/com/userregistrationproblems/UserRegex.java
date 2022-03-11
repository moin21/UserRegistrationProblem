package com.userregistrationproblems;

import java.util.Scanner;

/**
 * Class to take user input and pass it to respective method Object of the
 * UserDetails created to use the methods.
 * 
 * @author Moinuddin
 *
 */
public class UserRegex {

	Scanner scanner = new Scanner(System.in);
	UserDetails userDetails = new UserDetails();

	/**
	 * Input taken from Scanner passed to method to check.
	 */
	/**
	 * Method to take user input for first name
	 */
	public void userFirstName() {
		System.out.println("Enter Your First Name : ");
		String firstName = scanner.next();
		userDetails.firstName(firstName);
	}

	/**
	 * Method to take user input for last name
	 */
	public void userLastName() {
		System.out.println("Enter Your Last Name : ");
		String lastName = scanner.next();
		userDetails.firstName(lastName);
	}
}