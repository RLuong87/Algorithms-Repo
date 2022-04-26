package com.company.algorithms2021;

public class MagicDate {

    /*
    Edabit Challenge
    https://edabit.com/challenge/g7dRyiCi5dpKxuFRa

    You are to read each part of the date into its own integer type variable. The year should be a 4-digit number.
    You can assume the user enters a correct date formatted d m yyyy (no error checking required).

    Determine whether the entered date is a magic date. Here are the rules for a magic date:

    mm * dd is a 1-digit number that matches the last digit of yyyy or
    mm * dd is a 2-digit number that matches the last 2 digits of yyyy or
    mm * dd is a 3-digit number that matches the last 3 digits of yyyy
    The program should then display true if the date is magic, or false if it is not.

    Examples:
    Magic("1 1 2011") ➞ true

    Magic("4 1 2001") ➞ false

    Magic("5 2 2010") ➞ true

    Magic("9 2 2011") ➞ false
     */

    public static boolean magic(String str) {

        int n;
        String[] strNumbers = str.split(" ");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            n = Integer.parseInt(strNumbers[i]);
            numbers[i] = n;
        }
        int sum = numbers[0] * numbers[1];

        String morph = "", formed = String.valueOf(sum);
        for (int i = 0; i < numbers.length; i++) {
            morph += String.valueOf(numbers[i]);
        }
        return morph.endsWith(formed);
    }

    public static void main(String[] args) {

        System.out.println(magic("1 1 2011"));
        System.out.println(magic("4 1 2001"));
        System.out.println(magic("5 2 2010"));
        System.out.println(magic("9 2 2011"));

        int n;
        String str = "9 2 2011";
        String[] strNumbers = str.split(" ");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            n = Integer.parseInt(strNumbers[i]);
            numbers[i] = n;
        }
        int sum = numbers[0] * numbers[1];

        String morph = "";
        for (int i = 0; i < numbers.length; i++) {
            morph += String.valueOf(numbers[i]);

        }
//        String formed = String.valueOf(sum);
//        System.out.println(formed);
//        System.out.println(morph);
//        System.out.println(morph.endsWith(formed));
    }
}
