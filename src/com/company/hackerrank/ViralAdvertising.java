package com.company.hackerrank;

import java.util.Arrays;

public class ViralAdvertising {

    /*

     ***** SOLVED *****

    */

    public static int viralAdvertising(int n) {

        int[] days = new int[n];
        int people = 5, liked, totalLikes = 0;

        for (int i = 0; i < days.length; i++) {
            liked = people / 2;
            people = people / 2 * 3;
            totalLikes += liked;
        }
        return totalLikes;
    }

    public static void main(String[] args) {

        System.out.println(viralAdvertising(3));
        System.out.println(viralAdvertising(4));
        System.out.println(viralAdvertising(5));
        System.out.println(viralAdvertising(50));
        System.out.println(viralAdvertising(49));
        System.out.println(viralAdvertising(34));
    }
}
