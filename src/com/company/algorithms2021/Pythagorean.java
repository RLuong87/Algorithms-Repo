package com.company;

import java.util.Arrays;

public class Pythagorean {

    /*
    Edabit Challenge
    https://edabit.com/challenge/p3BhJuodwuhrNjQJ5

    Create a function that validates whether the three given integers form a Pythagorean triplet which is
    defined as the sum of the squares of the two smallest integers must be equal to the square of the largest integer.

    Examples:
    isTriplet(3, 4, 5) ➞ true
    // 3² + 4² = 25
    // 5² = 25

    isTriplet(13, 5, 12) ➞ true
    // 5² + 12² = 169
    // 13² = 169

    isTriplet(1, 2, 3) ➞ false
    // 1² + 2² = 5
    // 3² = 9

    isTriplet(72, 54, 90) ➞ true

    isTriplet(54, 46, 77) ➞ false

    isTriplet(80, 48, 64) ➞ true

    Notes:
    Numbers may not be given in a sorted order.
     */

    public static boolean isTriplet(int a, int b, int c) {

        int[] numbers = new int[]{a, b, c};
        Arrays.sort(numbers);

        int pow = (int) Math.pow(numbers[0], 2) + (int) Math.pow(numbers[1], 2), numPow = (int) Math.pow(numbers[2], 2);

        return pow == numPow;
    }

    public static void main(String[] args) {

        System.out.println(isTriplet(3, 4, 5));
        System.out.println(isTriplet(13, 5, 12));
        System.out.println(isTriplet(1, 2, 3));
        System.out.println(isTriplet(72, 54, 90));
        System.out.println(isTriplet(54, 46, 77));
        System.out.println(isTriplet(80, 48, 64));


        int[] numbers = new int[]{13, 5, 12};
        Arrays.sort(numbers);

        int pows = 0, numPows = 0;

        for (int i = 0; i < numbers.length; i++) {
            pows = (int) Math.pow(numbers[0], 2) + (int) Math.pow(numbers[1], 2);
            numPows = (int) Math.pow(numbers[2], 2);

        }
//        System.out.println(pows == numPows);
    }
}
