package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Verify {
	boolean verify(String regex, String details);

	static void output(Verify obj, String regex, String details) {
		if (obj.verify(regex, details)) {
			System.out.println("'" + details + "' Valid Detail");
		} else {
			System.out.println("'" + details + "' Invalid Detail");
		}
	}
}

public class DetailsVerificationLambdaFunction {

	public static void main(String[] args) {
		// Creating the reference of the interface with the Lambda Expression.
		Verify detailVerification = Pattern::matches;

		// Validation of user details by Lambda Function..
		System.out.println("\nFirst Name");
		Verify.output(detailVerification, "^[A-Z][a-z]{2,}", "Shashank");

		System.out.println("\nLast Name");
		Verify.output(detailVerification, "^[A-Z][a-z]{2,}", "Rathore");

		System.out.println("\nEmail ID");
		Verify.output(detailVerification, "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}",
				"Shashankrathore606@gmail.com");

		System.out.println("\nPhone Number");
		Verify.output(detailVerification, "^[0-9]{1,2} [0-9]{10}", "91 1234567890");

		System.out.println("\nPassword");
		Verify.output(detailVerification, "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "Sam@321");

	}
}