package com.company;

import java.util.Arrays;

public class LargestGap {

    /*
    Edabit Challenge
    https://edabit.com/challenge/qSJ5hZfG52Nf2hXWS

    Given an array of integers, return the largest gap between the sorted elements of the array.

    For example, consider the array:

    [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
    ... in which, after sorting, the array becomes:

    [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
    ... so that we now see that the largest gap in the array is between 9 and 20 which is 11.

    Examples:
    largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11
    After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
    Largest gap between 9 and 20 is 11

    largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 4
    After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]
    Largest gap between 7 and 11 is 4

    largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 2
    After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]
    Largest gap between 6 and 8 is 2
     */

    public static int largestGap(int[] numbers) {
        int largestGap = 0;
        Arrays.sort(numbers); // sort the array in ascending order

        for (int i = 0; i < numbers.length - 1; i++) {
            int gap = numbers[i + 1] - numbers[i]; // Subtract the number that's before each number
            if (gap > largestGap) { // check which sum is the largest
                largestGap = gap; // store the largest sum
            }
        }
        return largestGap;
    }

    public static void main(String[] args) {

        System.out.println(largestGap(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
        System.out.println(largestGap(new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}));
        System.out.println(largestGap(new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}));

        int[] numbers = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int largestGap = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int gap = (numbers[i + 1] - numbers[i]);
            if (gap > largestGap) {
                largestGap = gap;
            }
        }
//        System.out.println(largestGap);
    }
}
