package com.company;

public class SameParity {

    /*
    Edabit Challenge

    Create a function that takes a number as input and returns true if the sum of its digits has the same parity as the entire number.
    Otherwise, return false.

    Examples
    parityAnalysis(243) ➞ true
    243 is odd and so is 9 (2 + 4 + 3)

    parityAnalysis(12) ➞ false
    12 is even but 3 is odd (1 + 2)

    parityAnalysis(3) ➞ true
    3 is odd and 3 is odd and 3 is odd (3)

    Notes:

    Parity is whether a number is even or odd. If the sum of the digits is even and the number itself is even, return true.
    The same goes if the number is odd and so is the sum of its digits.
    Single digits will obviously have the same parities (see example #3)
    */

    public static boolean parityAnalysis(int num) {

        String numVal = String.valueOf(num); // Return the string representation of the given int parameter
        String[] numberArr = numVal.split(""); // Split the string, make it a string array w/ an empty string and no space.
        int sum = 0, number = 0;                    // Therefore, each number will be a substring

        for (String s : numberArr) { // Loop through the numberArr array
            number = Integer.parseInt(s); // Transform the string to an integer
            sum += number; // add the numbers to get the sum
        }
            // These conditions will return true or false. True if the number and the sum has the same parity (both even or both odd),
            // it will return false if the conditions aren't met
        return number % 2 == 0 && sum % 2 == 0 || number % 2 != 0 && sum % 2 != 0;
    }

    public static void main(String[] args) {

        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));
    }
}
