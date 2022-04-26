package com.company.algorithms2021;

public class CarriageCapacity {

    /*
    Edabit Challenge

    A train has a maximum capacity of n passengers overall, which means each carriage's capacity will share an equal proportion of the maximum capacity.

    Create a function which returns the index of the first carriage which holds 50% or less of its maximum capacity. If no such carriage exists, return -1.

    Worked Examples:
    findSeat(200, [35, 23, 18, 10, 40]) ➞ 2
    There are 5 carriages which each have a maximum capacity of 40 (200 / 5 = 40).
    Index 0's carriage is too full (35 is 87.5% of the maximum).
    Index 1's carriage is too full (23 is 57.5% of the maximum).
    Index 2's carriage is good enough (18 is 45% of the maximum).
    Return 2.

    Examples:
    findSeat(20, [3, 5, 4, 2]) ➞ 3

    findSeat(1000, [50, 20, 80, 90, 100, 60, 30, 50, 80, 60]) ➞ 0

    findSeat(200, [35, 23, 40, 21, 38]) ➞ -1

    Notes:
    If a train can hold 200 passengers, and has 5 carriages, then that means that each carriage can hold a maximum of 40 passengers each.
    All carriage numbers will be positive integers, which will be able to divide evenly.
    Remember to return -1 if no carriage is empty enough.
    */

    public static int findSeat(int n, int[] arr) {
        int maximumCap = (n / arr.length); // First find the maximum capacity for each carriage, n divided by the number of carriages

        for (int i = 0; i < arr.length; i++) {
            double percent = (double) arr[i] / maximumCap * 100; // Find the percentage of each carriage

            if (percent <= 50) { // if the percentage is 50 or less
                return i; // returns the index when the first carriage is found
            }
        }
        return -1; // return -1 if the carriage doesn't exist
    }

    public static void main(String[] args) {

        int[] capArr = {50, 20, 80, 90, 100, 60, 30, 50, 80, 60};
        int[] capArr2 = {35, 23, 18, 10, 40};
        int[] capArr3 = {35, 23, 40, 21, 38};
        int[] capArr4 = {3, 5, 4, 2};
        System.out.println(findSeat(1000, capArr));
        System.out.println(findSeat(200, capArr2));
        System.out.println(findSeat(200, capArr3));
        System.out.println(findSeat(20, capArr4));

//        System.out.println((double) 35 / 40 * 100);

        int number = 1000;
        int maxCap = number / capArr.length;
        int index = 0, full = 0;

        for (int i = 0; i < capArr.length; i++) {
            double percentCap = (double) capArr[i] / maxCap * 100;
//            System.out.println(i + " " + capArr[i] + " " + (percentCap));

            if (percentCap <= 50) {
                index = i;
//                System.out.println(i);
            } else {
                full = -1;
//                System.out.println(-1);
            }

        }
//        System.out.println(index);
//        System.out.println(full);
//        System.out.println(maxCap);
    }
}
