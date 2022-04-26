package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargestNums {

    /*
    Edabit Challenge

    Create a function that takes an array of arrays with numbers.
    Return a new (single) array with the largest numbers of each

    findLargestNums([[4, 2, 7, 1], [20, 70, 40, 90], [1, 2, 0]]) ➞ [7, 90, 2]

    findLargestNums([[-34, -54, -74], [-32, -2, -65], [-54, 7, -43]]) ➞ [-34, -2, 7]

    findLargestNums([[0.4321, 0.7634, 0.652], [1.324, 9.32, 2.5423, 6.4314], [9, 3, 6, 3]]) ➞ [0.7634, 9.32, 9]
    */

    public static double[] findLargestNums(double[][] arr) {

        List<Integer> largeNumbers = new ArrayList<>();
        double[] digits = new double[0];

        for (double[] numbers : arr) {
            double numCheck = numbers[0];

            for (double num : numbers) {

                if (num > numCheck) {
                    numCheck = num;
                }
            }
            largeNumbers.add((int) numCheck);
        }
        System.out.println(largeNumbers);
        return digits;
    }

    public static void main(String[] args) {

        double[][] doubleNumbers = {{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}};
        System.out.println(Arrays.toString(findLargestNums(doubleNumbers)));

        // Create a list to place the biggest numbers when found
        List<Integer> largestNumbers = new ArrayList<>();
        // Loop through this 2d array
        int[][] numbers = {{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}};

        // Iterate through the sub arrays
        for (int[] number : numbers) {
            // Store first numbers from each array in a variable
            int numCheck = number[0];

            // Iterate the arrays again to access each element in each array
            for (int num : number) {
                // Compare each number to the first number that is stored in numCheck
                if (num > numCheck) {
                    // Make numCheck equal to each biggest number found
                    numCheck = num;
                }
            }
            // Add the largest numbers to the array list
            largestNumbers.add(numCheck);
        }
        System.out.println(largestNumbers);
    }
}
