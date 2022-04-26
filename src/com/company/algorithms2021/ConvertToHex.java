package com.company.algorithms2021;

public class ConvertToHex {

    /*
    https://edabit.com/challenge/ijNrhCjfS2ZMtNkXS

    Create a function that takes a string's characters as ASCII and returns each character's hexadecimal value as a string.

    Examples:
    toHex("hello world") ➞ "68 65 6c 6c 6f 20 77 6f 72 6c 64"

    toHex("Big Boi") ➞ "42 69 67 20 42 6f 69"

    toHex("Marty Poppinson") ➞ "4d 61 72 74 79 20 50 6f 70 70 69 6e 73 6f 6e"

    Notes:
    Each byte must be seperated by a space.
    All alpha hex characters must be lowercase.
     */

    public static String toHex(String str) {

        return "";
    }

    public static void main(String[] args) {

        String str = "Big Boi", hexStr = "";
        int num = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            num = c;
            hexStr += Integer.toHexString(num) + " ";
        }
        System.out.println(hexStr);
    }
}
