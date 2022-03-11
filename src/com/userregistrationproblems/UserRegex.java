package com.userregistrationproblems;

import java.util.Scanner;
/**
 * Class to take user input and pass it to respective method
 * Object of the UserDetails created to use the methods.
 * @author Moinuddin
 *
 */
public class UserRegex {

	Scanner scanner = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    /**
     * Input taken from Scanner passed to method to check.
     */
    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = scanner.next();
        userDetails.firstName(firstName);
    }
}