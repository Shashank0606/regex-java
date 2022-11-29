package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Method To Check First Name With Regex Start With Cap And 3 Min. Character
		System.out.println("Enter the first Name: ");
		String firstName = scan.nextLine();
		System.out.println("Enter the last Name :");
		String lastName = scan.nextLine();
		System.out.println("Enter The Mail : ");
		String mail = scan.nextLine();
		System.out.println("Enter The Mobile Number With County Code : ");
		String mobileNumber = scan.nextLine();
		System.out.println("Enter the valid password: ");
		String password = scan.nextLine();

		if (Pattern.matches("^[A-Z][a-z]{2,}", firstName)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Method To Check Last Name With Regex Start With Cap And 3 Min. Character
		if (Pattern.matches("^[A-Z][a-z]{2,}", lastName)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Method to check Valid Mail with Regex
		if (Pattern.matches("^[a-zA-Z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,5}", mail)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		if (Pattern.matches("^[+]91{1}\\s[0-9]{10}", mobileNumber)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		// Password at least one upper case
		if (Pattern.matches("^[A-Z]+[a-z].{7}", password)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		scan.close();
	}
}