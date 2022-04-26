package com.company;

public class CountDigits {

    /*
    Edabit Challenge

    Create a function that will count the number of digits of a number.
    Conversion of the number to a string is not allowed, thus, the approach is either recursive or iterative.

    Examples:
    digitsCount(4666) ➞ 4

    digitsCount(544) ➞ 3

    digitsCount(121317) ➞ 6

    digitsCount(0) ➞ 1

    digitsCount(12345) ➞ 5

    digitsCount(1289396387328L) ➞ 13
    */

    public static int digitsCount(long n) {

//        int count = 0;
//
//        while (n != 0) {
//            n = n / 10;
//            count++;
//        }
//        return count;

        if (n / 10 == 0) { // Recursive Solution
            return 1;
        }
        return 1 + digitsCount(n / 10);
    }

    public static void main(String[] args) {

        System.out.println(digitsCount(121317));
        System.out.println(digitsCount(1289396387328L));
        System.out.println(digitsCount(4666));
        System.out.println(digitsCount(0));

        long number = 1289396387328L;
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}
