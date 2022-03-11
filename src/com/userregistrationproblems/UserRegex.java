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

	/**
	 * Method to take user input for email
	 */
	public void userEmail() {
		System.out.println("Enter Your email : ");
		String email = scanner.next();
		userDetails.email(email);
	}

	/**
	 * Method to take user input for mobile
	 */
	public void userMobile() {
		System.out.println("Enter Your mobile : ");
		String mobile = scanner.next();
		userDetails.mobile(mobile);
	}

	/**
	 * Method to take user input for password
	 */
	public void userPassword() {
		System.out.println("Enter Your password : ");
		String password = scanner.next();
		userDetails.password(password);
	}

}