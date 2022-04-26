package com.company;

public class ReverseTheNumber {

    /*
    Edabit Challenge https://edabit.com/challenge/tiyPFonvAJ8e6H9jS

    Create a function that takes an integer n and reverses it.

    Examples:
    rev(5121) ➞ "1215"

    rev(69) ➞ "96"

    rev(-122157) ➞ "751221"

    Notes:
    This challenge is about using two operators that are related to division.
    If the number is negative, treat it like it's positive
     */

    public static String rev(int n) {

        String strNum = String.valueOf(Math.abs(n)); // Converting the int to a string using valueOf() method
        String revNum = ""; // Empty string to concatenate the new string

        // Reverse for loop to start at the end of the string array
        for (int i = strNum.length() - 1; i >= 0; i--) {
            revNum += strNum.charAt(i); // Concatenate each element into a new string
        }
        return revNum;
    }

    public static void main(String[] args) {
        System.out.println(rev(5121));
        System.out.println(rev(69));
        System.out.println(rev(-122157));
    }
}
