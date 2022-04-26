package com.company;

import java.util.ArrayList;

public class DisariumNumber {

    /*
    Edabit Challenge
    https://edabit.com/challenge/GjCgCugvh4eorPmgM

    A number is said to be Disarium if the sum of its digits raised to their respective positions is the number itself.

    Create a function that determines whether a number is a Disarium or not.

    Examples:
    isDisarium(75) ➞ false
    // 7^1 + 5^2 = 7 + 25 = 32

    isDisarium(135) ➞ true
    // 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135

    isDisarium(518) ➞ true

    isDisarium(544) ➞ false

    isDisarium(8) ➞ true

    isDisarium(466) ➞ false

    Notes:
    Position of the digit is 1-indexed.
    A recursive version of this challenge can be found via this link.
     */

    public static boolean isDisarium(int n) {

        ArrayList<Integer> numsList = new ArrayList<>();
        ArrayList<Integer> numsArr = new ArrayList<>();
        String strNumArr = String.valueOf(n); // convert the number to a string
        String[] numStr = strNumArr.split(""); // split the string

        for (String s : numStr) { // iterate through the array of substrings
            numsList.add(Integer.parseInt(s)); // Parse the substrings to an integer and add to an arraylist
        }
        
        for (int i = 0; i < numsList.size(); i++) {
            int numPow = (int) Math.pow(numsList.get(i), i + 1); // Store the sum of integers to a variable
            numsArr.add(numPow); // Add to arraylist
        }
        int sum = numsArr.stream().mapToInt(i -> i).sum(); // Using stream to get the sum
        return sum == n;
    }

    public static void main(String[] args) {

        System.out.println(isDisarium(75));
        System.out.println(isDisarium(135));
        System.out.println(isDisarium(518));
        System.out.println(isDisarium(544));
        System.out.println(isDisarium(8));
        System.out.println(isDisarium(466));

//        System.out.println(Math.pow(1, 1) + Math.pow(3, 2) + Math.pow(5, 3));
//        System.out.println(Math.pow(7, 1) + Math.pow(5, 2));
//        System.out.println(Math.pow(5, 3));
    }
}
