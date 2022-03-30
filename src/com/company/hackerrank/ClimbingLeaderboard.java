package com.company.hackerrank;

import java.util.Arrays;
import java.util.List;

public class ClimbingLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {


        return null;
    }

    public static void main(String[] args) {

//        System.out.println(climbingLeaderboard());
        List<Integer> rankedTest = Arrays.asList(100, 100, 50, 40, 40, 20, 10);
        //expecting 6, 4, 2, 1

        for (int i = 0; i < rankedTest.size(); System.out.println(i)) {
            rankedTest.set(i, rankedTest.get(i) * i);
            i++;
        }
        System.out.println(rankedTest);
    }
}
