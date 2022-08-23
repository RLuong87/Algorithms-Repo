package com.company.hackerrank.hackerrankwarmups;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftToRight = 0, rightToLeft = 0, N = arr.get(0).size() - 1;

        for (int i = 0; i < arr.size(); i++, N--) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(N);
        }
        return Math.abs(leftToRight - rightToLeft);
    }

    public static void main(String[] args) {

        List<List<Integer>> test1 = new ArrayList<>();
        test1.add(List.of(11, 2, 4));
        test1.add(List.of(4, 5, 6));
        test1.add(List.of(10, 8, -12));
//        System.out.println(diagonalDifference(test1));

        List<List<Integer>> test2 = new ArrayList<>();
        test2.add(List.of(-10, 3, 0, 5, -4));
        test2.add(List.of(2, -1, 0, 2, -8));
        test2.add(List.of(9, -2, -5, 6, 0));
        test2.add(List.of(9, -7, 4, 8, -2));
        test2.add(List.of(3, 7, 8, -5, 0));
        System.out.println(diagonalDifference(test2));
    }
}
