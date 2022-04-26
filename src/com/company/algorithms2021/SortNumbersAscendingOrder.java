package com.company.algorithms2021;

import java.util.Arrays;

public class SortNumbersAscendingOrder {

    /*
    Edabit Challenge https://edabit.com/challenge/WM5s7vuHnXdcKCEjS

    Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).

    Sort integer array in ascending order.
    If the function's argument is null, an empty array, or undefined; return an empty array.
    Return a new array of sorted numbers.

    Examples:
    sortNumsAscending([1, 2, 10, 50, 5]) ➞ [1, 2, 5, 10, 50]

    sortNumsAscending([80, 29, 4, -95, -24, 85]) ➞ [-95, -24, 4, 29, 80, 85]

    sortNumsAscending(null) ➞ []

    sortNumsAscending([]) ➞ []
     */

    public static int[] sortNumsAscending(int[] nums) {

        int[] sortedNumbers = new int[0];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (nums.length != 0) {
                sortedNumbers = nums;
                return new int[0];
            }
        }
        return sortedNumbers;
    }

    public static void main(String[] args) {

        int[] emptyArray = {};
        int[] sortArray = {1, 2, 10, 50, 5};
        int[] sortArray2 = {80, 29, 4, -95, -24, 85};
        System.out.println(Arrays.toString((emptyArray)));
        System.out.println(Arrays.toString(sortNumsAscending(emptyArray)));
        System.out.println(Arrays.toString(sortNumsAscending(sortArray)));
        System.out.println(Arrays.toString(sortNumsAscending(sortArray2)));

        Arrays.sort(sortArray2);
//        System.out.println(Arrays.toString(x));
    }
}
