package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.*;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        List<Long> sumList = new ArrayList<>();
        long sum1 = 0L, sum2 = 0L, sum3 = 0L, sum4 = 0L, sum5 = 0L;
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            sum1 = (long) arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4);
            sum2 = (long) arr.get(0) + arr.get(2) + arr.get(3) + arr.get(4);
            sum3 = (long) arr.get(0) + arr.get(1) + arr.get(3) + arr.get(4);
            sum4 = (long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(4);
            sum5 = (long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3);
        }
        sumList.add(sum1);
        sumList.add(sum2);
        sumList.add(sum3);
        sumList.add(sum4);
        sumList.add(sum5);
        System.out.println(sumList);

        for (Long sum : sumList) {
            if (min > sum) {
                min = sum;
            }
        }

        for (Long sum : sumList) {
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(min + " " + max);
    }

    public static void miniMaxSum2(List<Integer> arr) {
        //keep track of the min number and max number
        //subtract min number with total sum
        //subtract max number with total sum

        int min = arr.get(0), max = arr.get(0);
        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println((totalSum - max) + " " + (totalSum - min));
    }

    public static void main(String[] args) {

        List<Integer> test1 = new java.util.ArrayList<>(List.of(1, 3, 5, 7, 9));
        List<Integer> test2 = new java.util.ArrayList<>(List.of(256741038, 623958417, 467905213, 714532089, 938071625));

        miniMaxSum2(test1); // Expected output --> 16 24
        miniMaxSum2(test2); // Expected output --> 2063136757 2744467344
    }
}
