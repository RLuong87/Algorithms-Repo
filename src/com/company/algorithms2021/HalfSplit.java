package com.company.algorithms2021;

import java.util.Arrays;

public class HalfSplit {

    /*
    Number Split Challenge
    https://edabit.com/challenge/E22KYTGMhwpYtjn8x

    Given a number, return a list containing the two halves of the number. If the number is odd, make the rightmost number higher.

    Examples:

    numberSplit(25) ➞ [12, 13]

    numberSplit(4) ➞ [2, 2]

    numberSplit(10) ➞ [5, 5]

    numberSplit(11) ➞ [5, 6]

    numberSplit(-9) ➞ [-5, -4]

    Notes:
    All numbers will be integers.
    You can expect negative numbers too.
     */

    public static int[] numberSplit(int n) {

        return null;
    }

    public static void main(String[] args) {

        int[] nums = new int[2];
        int number = 25;

        for (int i = 0; i < number; i++) {

            if (number == Integer.sum(i, i + 1)) {
                nums[i] = i;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
