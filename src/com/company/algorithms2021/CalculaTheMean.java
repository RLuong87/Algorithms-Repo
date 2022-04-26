package com.company.algorithms2021;

public class CalculaTheMean {

    /*
    https://edabit.com/challenge/W64jA8hmGCmjbR7Fb

    Create a function that takes an array of numbers and returns the mean (average) of all those numbers.

    Examples:
    mean([1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3]) ➞ 2.55

    mean([2, 3, 2, 3]) ➞ 2.50

    mean([3, 3, 3, 3, 3]) ➞ 3.00

    Notes:
    Round to two decimal places.
    You can expect a number ranging from 0 to 10,000.
     */

    public static double mean(int[] nums) {
        double sum = 0;

        for (int num : nums) {
            sum += num;
        }
        return (double) Math.round(sum / nums.length * 100)/100;
    }

    public static void main(String[] args) {


        int[] nums = {3, 3, 3, 3, 3};
        int[] nums2 = {2, 3, 2, 3};
        int[] nums3 = {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
        System.out.println(mean(nums));
        System.out.println(mean(nums2));
        System.out.println(mean(nums3));

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
//        System.out.println((double) sum / nums.length);
    }
}
