package com.company.hackerrank.interviewprepkit.WARMUPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here

        List<Integer> totalRatings = new ArrayList<>();

        int aCount = 0, bCount = 0;

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) > b.get(i)) {
                aCount++;
            } else if (b.get(i) > a.get(i)) {
                bCount++;
            }
        }
        totalRatings.add(aCount);
        totalRatings.add(bCount);

        return totalRatings;
    }

    public static void main(String[] args) {

        List<Integer> test1 = Arrays.asList(1, 2, 3);
        List<Integer> test2 = Arrays.asList(3, 2, 1);
        System.out.println(compareTriplets(test1, test2));

        List<Integer> test3 = Arrays.asList(5, 6, 7);
        List<Integer> test4 = Arrays.asList(3, 6, 10);
        System.out.println(compareTriplets(test3, test4));

        List<Integer> test5 = Arrays.asList(17, 28, 30);
        List<Integer> test6 = Arrays.asList(99, 16, 8);
        System.out.println(compareTriplets(test5, test6));
    }
}
