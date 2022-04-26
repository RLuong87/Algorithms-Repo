package com.company.algorithms2021;

import java.util.Objects;

public class AddingNumbers {

    /*
    Edabit Challenge

    Create a function that takes two number strings and returns their sum as a string.

    Examples:
    add("111", "111") ➞ "222"

    add("10", "80") ➞ "90"

    add("", "20") ➞ "Invalid Operation"

    Notes:
    Return "Invalid Operation" If either input is "" or null.
    */

    public static String add(String a, String b) {

        // use .equals method to compare objects
        if (Objects.equals(a, null) || Objects.equals(b, null) || a.equals("") || b.equals("")) {
            return "Invalid Operation";
        } else {
            int num1 = (Integer.parseInt(a) + Integer.parseInt(b)); // Use parse int to convert a string to a number
            return String.valueOf(num1); // Return the string representation of the number value
        }
    }

    public static void main(String[] args) {

        System.out.println(add("10", "9"));
        System.out.println(add("", "4"));
        System.out.println(add(null, "9"));

        String num1 = "111";
        String num2 = "111";

        int numTotal = Integer.parseInt(num1) + Integer.parseInt(num2);

        String num5 = String.valueOf(numTotal);
        System.out.println(num5);
    }
}
