package com.company.algorithms2021;

public class HowManyVowels {

    /*
    Edabit Challenge https://edabit.com/challenge/GBKphScsmDi9ek3ra

    Create a function that takes a string and returns the number (count) of vowels contained within it.

    Examples:
    countVowels("Celebration") ➞ 5

    countVowels("Palm") ➞ 1

    countVowels("Prediction") ➞ 4

    Notes:
    a, e, i, o, u are considered vowels (not y).
    All test cases are one word and only contain letters

     */

    public static int getCount(String str) {
        int vowelsCount = 0; // given int variable to count vowels

        // Kill 2 birds with one stone
        // Convert the string to a char array inside the enhanced for loop
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                // if any of the checks above meets the conditions
                vowelsCount++; // increment the count of vowels found
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("Celebration"));
        System.out.println(getCount("Palm"));
        System.out.println(getCount("Prediction"));

    }
}
