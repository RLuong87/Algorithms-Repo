package com.company;

import java.util.Arrays;

public class LastElements {

    /*
    https://edabit.com/challenge/CnCvL9vmjYtFG785t

    Write a function that retrieves the last n elements from an array.

    Examples:
    last([1, 2, 3, 4, 5], 1) ➞ [5]

    last([4, 3, 9, 9, 7, 6], 3) ➞ [9, 7, 6]

    last([1, 2, 3, 4, 5], 7) ➞ null

    last([1, 2, 3, 4, 5], 0) ➞ []

    Notes:
    Return null if n exceeds the length of the array.
    Return an empty array if n == 0.
     */

    public static int[] last(int[] r, int n) {

        int[] copy = Arrays.copyOfRange(r, n, r.length);

        for (int i = 0; i < r.length; i++) {

            if (n > r.length) {
                return null;
            } else if (n == 0) {
                return new int[0];
            }
        }
        return copy;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 3, 9, 9, 7, 6};
        int num = 3;

        System.out.println(Arrays.toString(last(numbers, 7)));

        int[] revNums = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(i + " " + numbers[i]);
        }
//        System.out.println(Arrays.toString(revNums));


        int[] copy = Arrays.copyOf(numbers, 3);
        int[] copy2 = Arrays.copyOfRange(numbers, 3, numbers.length);

//        System.out.println(Arrays.toString(copy));
//        System.out.println(Arrays.toString(copy2));


//        int[] lastElements = new int[0];
//        int num = 3;
//
//        for (int i = numbers.length - 1; i > 0; i--) {
//
//        }
//
//        int index = 0, i;
//
//        int fromLast;
//        int[] arrayEx1 = new int[]{4, 3, 9, 9, 7, 6};
//        fromLast = 8;
//
//        for (i = 0; i < arrayEx1.length; i++) {
//
//        }
//
//        System.out.print("Last n items from an array is: ");
//        for (i = index; i < arrayEx1.length; i++)
//            System.out.print(" " + arrayEx1[i]);
    }
}
