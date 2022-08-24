package com.company.hackerrank.interviewprepkit.WARMUPS;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here

        int total = 0;

        for (Integer integer : ar) {
            total += integer;
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1, 2, 3, 4, 10, 11);
        System.out.println(simpleArraySum(test));
    }
}
