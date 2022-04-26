package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindTheMissingNumber {

    /*
    Edabit Challenge

    Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.

    Examples:
    missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

    missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10

    missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7

    Notes:
    The array of numbers will be unsorted (not in order).
    Only one number will be missing
    */

    public static int missingNum(int[] nums) {
        
        int sum = ((nums.length + 1) * (nums.length + 2)) / 2;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 5, 1, 2, 4, 6, 8, 3, 9};
//        Arrays.sort(numbers);
        Arrays.sort(numbers, 1, 4);
//        System.out.println(Arrays.toString(numbers));
//        System.out.printf("Modified array[]: %s (In numerical order from index 1 to index 5)", Arrays.toString(numbers));

        // Note: Integer[] instead of int[], Collections.reverseOrder
        // doesn't work for primitive types
        Integer[] numArr = {7, 2, 3, 6, 5, 9, 1, 4, 8};
        // Sorts numArr[] in descending order using reverseOrder() of Collections class
        // in Arrays.sort() as an argument
        Arrays.sort(numArr, Collections.reverseOrder());
//        System.out.printf("\nModified array[]: %s (In descending order)", Arrays.toString(numArr));


        String[] array = {"google.com", "facebook.com", "github.com"};
        Arrays.sort(array);
//        System.out.printf("\nModified array[]: %s (In alphabetical order)", Arrays.toString(array));


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int[] inputArr = new int[n];
        System.out.println("Enter (n-1) numbers: ");
        for (int i = 0; i <= n - 2; i++) {
            inputArr[i] = sc.nextInt();
        }
        //Finding the missing number
        int sumOfAll = (n * (n + 1)) / 2;
        int sumOfArray = 0;
        for (int i = 0; i <= n - 2; i++) {
            sumOfArray = sumOfArray + inputArr[i];
        }
        int missingNumber = sumOfAll - sumOfArray;
        System.out.println("Missing number is: " + missingNumber);
    }
}
