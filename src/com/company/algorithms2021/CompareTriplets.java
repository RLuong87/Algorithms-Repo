package com.company.algorithms2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aCount = 0, bCount = 0;

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) > b.get(i)) {
                aCount++;
            } else if (b.get(i) > a.get(i)) {
                bCount++;
            }
        }
        return new ArrayList<>(Arrays.asList(aCount, bCount));
    }

    public static void main(String[] args) {

//        17 28 30
//        99 16 8

        List<Integer> aliceRating = Arrays.asList(17, 28, 30);
        List<Integer> bobRating = Arrays.asList(99, 16, 8);
        List<Integer> totalRatings = new ArrayList<>();

        System.out.println(compareTriplets(aliceRating, bobRating));

        int aCount = 0, bCount = 0;

        for (int i = 0; i < aliceRating.size(); i++) {

            if (aliceRating.get(i) > bobRating.get(i)) {
                aCount++;
            } else if (bobRating.get(i) > aliceRating.get(i)) {
                bCount++;
            }
        }
        totalRatings.add(aCount);
        totalRatings.add(bCount);

        System.out.println(totalRatings);
    }
}
