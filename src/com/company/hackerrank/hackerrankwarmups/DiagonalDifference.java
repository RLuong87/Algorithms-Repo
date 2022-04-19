package com.company.hackerrank.hackerrankwarmups;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftToRight = 0, rightToLeft = 0;

        for (int i = 0; i < arr.size(); i++) {

           leftToRight = arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
           rightToLeft = arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);

        }
        return Math.abs(leftToRight - rightToLeft);
    }

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(1, 2, 3));
        arr.add(List.of(4, 5, 6));
        arr.add(List.of(9, 8, 9));

        System.out.println(diagonalDifference(arr));

    }
}
