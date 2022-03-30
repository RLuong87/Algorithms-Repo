package com.company.hackerrank;

import java.util.Arrays;

public class ViralAdvertising {

    /*

     ***** SOLVED *****

    */

    public static int viralAdvertising(int n) {

        int people = 5, totalLikes = 0;

        for (int i = 1; i < n + 1; i++) {
            int liked = people / 2;
            people = people / 2 * 3;
            totalLikes += liked;
            System.out.println("Day Shared  Liked  Cumulative");
            System.out.println(i + "     " + people + "     " + liked + "        " + totalLikes);
        }
        return totalLikes;
    }

    public static void main(String[] args) {

        System.out.println(viralAdvertising(3));
        System.out.println();
        System.out.println(viralAdvertising(4));
        System.out.println();
        System.out.println(viralAdvertising(5));
//        System.out.println(viralAdvertising(50));
//        System.out.println(viralAdvertising(49));
//        System.out.println(viralAdvertising(34));
    }
}
