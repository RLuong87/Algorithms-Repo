package com.company.hackerrank;

import java.util.Arrays;

public class ViralAdvertising {

    /*



     */

    public static int viralAdvertising(int n) {

        int[] days = new int[n];
        int people = 5;

        for (int i = 0; i <= days.length; i++) {
            people = people / 2;

//            people++;
//            System.out.println(Arrays.toString(days));
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(viralAdvertising(5));

    }
}
