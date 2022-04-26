package com.company;

import java.util.Arrays;

public class InclusiveArrayRanges {

    /*
    Edabit Challenges (Not completed)

    Write a function that, given the start startNum and end endNum values, return an array containing all the numbers inclusive to that range.
    See examples below.

    Examples:
    inclusiveArray(1, 5) ➞ [1, 2, 3, 4, 5]

    inclusiveArray(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]

    inclusiveArray(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

    inclusiveArray(17, 5) ➞ [17]

    Notes:
    The numbers in the array are sorted in ascending order.
    If startNum is greater than endNum, return an array with the higher value. See example #4.
    */

    public static int[] inclusiveArray(int startNum, int endNum) {

        int[] numbers = new int[startNum + endNum];

        for (int i = startNum; i <= endNum; i++) {
            numbers[i] = i;
        }
        return numbers;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(inclusiveArray(1, 5)));
        System.out.println(Arrays.toString(inclusiveArray(2, 8)));
        System.out.println(Arrays.toString(inclusiveArray(10, 20)));

//        int[] myArray = IntStream.range(indexLow, length).toArray();

        int[] inNums = {1, 5};

        int startNum = 3;
        int endNum = 10;

        int[] numbers = new int[startNum + endNum];
        for (int i = startNum; i <= endNum; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
    }
}
