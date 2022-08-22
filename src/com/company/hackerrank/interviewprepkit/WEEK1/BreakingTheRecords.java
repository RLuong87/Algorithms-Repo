package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minCount = 0, maxCount = 0;
        for (int i = 0; i < scores.size() - 1; i++) {
        }
        System.out.println(scores);
        return null;
    }

    public static void main(String[] args) {

        List<Integer> test1 = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        System.out.println(breakingRecords(test1));
    }
}
