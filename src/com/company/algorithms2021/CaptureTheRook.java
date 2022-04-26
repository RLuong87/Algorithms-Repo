package com.company.algorithms2021;

public class CaptureTheRook {

    /*
    Edabit Challenge
    https://edabit.com/challenge/rYD9NTBmNhaPM6wx2

    Write a function that returns true if two rooks can attack each other, and false otherwise.

    Examples:
    canCapture(["A8", "E8"]) ➞ true

    canCapture(["A1", "B2"]) ➞ false

    canCapture(["H4", "H3"]) ➞ true

    canCapture(["F5", "C8"]) ➞ false

    Notes:
    Assume no blocking pieces.
    Two rooks can attack each other if they share the same row (letter) or column (number)
     */

    public static boolean canCapture(String[] rooks) {
        // if the first character in the first string is equal to the first character in the second string
        // or if the second character in the first string is equal to the second character in the second string
        // if any of these conditionals equal to true then return true
        return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);
    }

    public static void main(String[] args) {

        System.out.println(canCapture(new String[]{"A8", "E8"}));
        System.out.println(canCapture(new String[]{"A1", "B2"}));
        System.out.println(canCapture(new String[]{"H4", "H3"}));
        System.out.println(canCapture(new String[]{"F5", "C8"}));

    }
}
