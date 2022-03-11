package com.company.hackerrank;

import java.util.List;

public class AppleAndOrange {

    /*
     ********************** S O L V E D *****************************
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int countOfApples = 0, countOfOranges = 0;

        for (Integer apple : apples) {
            if ((apple + a) >= s && (apple + a) <= t) {
                countOfApples++;
            }
        }

        for (Integer orange : oranges) {
            if ((orange + b) >= s && (orange + b) <= t) {
                countOfOranges++;
            }
        }
        System.out.println(countOfApples);
        System.out.println(countOfOranges);
    }

    public static void main(String[] args) {

        List<Integer> apples = List.of(2, 3, -4);
        List<Integer> oranges = List.of(3, -2, -4);

        countApplesAndOranges(7, 10, 4, 12, apples, oranges);

    }
}
