package com.bridgelabz.regex;

import java.util.ArrayList;

public class ValidEmailPattern {

    public static void main(String[] args) {
        // 1.Creating an Array list to store the email Addresses which need to be
        // validated
        ArrayList<String> emailAddressList = new ArrayList<>();
        // 2.Adding the email addresses to list which need to be validated
        emailAddressList.add("abc@yahoo.com");
        emailAddressList.add("abc-100@yahoo.com");
        emailAddressList.add("abc.100@yahoo.com");
        emailAddressList.add("abc111@abc.com");
        emailAddressList.add("abc-100@abc.net");
        emailAddressList.add("abc.100@abc.com.au");
        emailAddressList.add("abc@1.com");
        emailAddressList.add("abc@gmail.com.com");
        emailAddressList.add("abc+100@gmail.com");

        ValidEmailPattern emailPatternValidationUtil = new ValidEmailPattern();
        // 4.Iterating and printing valid message if the email addresses entered are
        // valid
        for (String emailAddress : emailAddressList) {
            if (emailPatternValidationUtil.isValidEmail(emailAddress))
                System.out.println(emailAddress + " = Valid mail");
            else
                System.out.println(emailAddress + " = Invalid mail");
        }
    }

    private boolean isValidEmail(String emailAddress) {
        return true;
    }

}