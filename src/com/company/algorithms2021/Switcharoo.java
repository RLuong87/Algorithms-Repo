package com.company.algorithms2021;

public class Switcharoo {

    /*
    Edabit Challenge

    Create a function that takes a string and returns a new string with its first and last characters swapped, except under two conditions:

    1. If the length of the string is less than two, return "Incompatible.".
    2. If the first and last characters are the same, return "Two's a pair.".

    Examples:
    flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"

    flipEndChars("ada") ➞ "Two's a pair."

    flipEndChars("Ada") ➞ "adA"

    flipEndChars("z") ➞ "Incompatible."

    Notes:
    Tests are case sensitive (e.g. "A" and "a" are not the same character)
    */

    public static String flipEndChars(String s) {

        int length = s.length(); // Store the length of the string in an int variable

        if (length < 2) { // if the length of the string is less than 2
            return "Incompatible";
        } else if (s.charAt(0) == s.charAt(length - 1)) { // if the first character is equal to the last character
            return "Two's a pair.";
        } else { // if the length is greater than 2
            // Take the last character, concatenate using substring method to capture characters between the first and last character
            // Then concatenate the first character to the end of the string
            return s.charAt(length - 1) + s.substring(1, length - 1) + s.charAt(0);
        }
    }

    public static void main(String[] args) {

        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("z"));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("Ada"));

        String str = "Cat, dog, and mouse.";

        int len = str.length();

        if (len < 2) {
//            System.out.println(str);
        } else {
//            System.out.println(str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0));
        }
    }
}
