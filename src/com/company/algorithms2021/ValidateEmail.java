package com.company;

public class ValidateEmail {

    /*
    Create a function that accepts a string, checks if it's a valid email address and returns either true or false,
    depending on the evaluation.

    The string must contain an @ character.
    The string must contain a . character.
    The @ must have at least one character in front of it.
    e.g. "e@edabit.com" is valid while "@edabit.com" is invalid.
    The . and the @ must be in the appropriate places.
    e.g. "hello.email@com" is invalid while "john.smith@email.com" is valid.
    If the string passes these tests, it's considered a valid email address.

    Examples:

    validateEmail("@gmail.com") ➞ false

    validateEmail("hello.gmail@com") ➞ false

    validateEmail("gmail") ➞ false

    validateEmail("hello@gmail") ➞ false

    validateEmail("hello@edabit.com") ➞ true

    Notes:
    Check the Tests tab to see exactly what's being evaluated.
    You can solve this challenge with RegEx, but it's intended to be solved with logic.
    Solutions using RegEx will be accepted but frowned upon :(
     */

    public static boolean validateEmail(String s) {

        return true;
    }

    public static void main(String[] args) {

        String email = "hello@edabit.com";
        boolean isEmail = false;

        if (email.contains(".") && email.contains("@")) {
            System.out.println("The string contains . and @");
        } else {
            System.out.println("The string does not contain a .");
        }

        for (int i = 0; i < email.length() - 1; i++) {

            if (email.contains(".") && email.contains("@") && email.charAt(i) > email.charAt(i + 1)) {
                isEmail = true;
            }
        }
//        System.out.println(isEmail);
    }
}
