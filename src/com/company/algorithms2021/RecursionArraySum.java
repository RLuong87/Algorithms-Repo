package com.company;

public class RecursionArraySum {

    /*
    Write a function that finds the sum of an array. Make your function recursive.

    Examples:
    sum([1, 2, 3, 4]) ➞ 10

    sum([1, 2]) ➞ 3

    sum([1]) ➞ 1

    sum([]) ➞ 0

    Notes:
    Return 0 for an empty array.
    Check the Resources tab for info on recursion
     */

    public static int sum(int[] arr, int l) {

        if (l <= 0)
            return 0;

        return (sum(arr, l - 1) + arr[l - 1]);
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        System.out.println(sum(numbers, numbers.length));
    }
}
