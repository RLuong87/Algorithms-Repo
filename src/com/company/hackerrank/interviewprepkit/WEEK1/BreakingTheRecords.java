package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = scores.get(0), max = scores.get(0), minCount = 0, maxCount = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
            }

            if (scores.get(i) > max) {
                max = scores.get(i);
                maxCount++;
            }
//            System.out.println("Min count = " + minCount);
            System.out.println("Max count = " + maxCount);

        }
        System.out.println(max);
        System.out.println(maxCount);

        return new ArrayList<>(Arrays.asList(maxCount, minCount));
    }

    public static void main(String[] args) {

        List<Integer> test1 = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        System.out.println(breakingRecords(test1));
    }
}
