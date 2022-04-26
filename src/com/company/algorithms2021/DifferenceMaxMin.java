package com.company;

public class DifferenceMaxMin {

    /*
    Edabit Challenge https://edabit.com/challenge/hymPkXdhmDQLe87QT

    Create a function that takes an array and returns the difference between the biggest and smallest numbers.

    Examples:
    differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
    Smallest number is -50, biggest is 32.

    differenceMaxMin([44, 32, 86, 19]) ➞ 67
    Smallest number is 19, biggest is 86.
    */

    public static int differenceMaxMin(int[] arr) {

        int biggest = 0, smallest = 0, difference = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];

            } else if (arr[i] < arr[0]) {
                smallest = arr[i];
            }
            difference = biggest - smallest;
        }
        return difference;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] numbers2 = {44, 32, 86, 19};

        System.out.println(differenceMaxMin(numbers));
        System.out.println(differenceMaxMin(numbers2));

    }
}
