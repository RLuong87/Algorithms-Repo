package com.company.hackerrank;

import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {

        int jumps = 0;

        for (int i = 0; i != c.size() - 1; i++) {

            if ((i + 2) <= c.size() - 1 && c.get(i + 2) == 0) {
                i++;
            }
            jumps++;
        }
//        System.out.println(c);
        return jumps;
    }

    public static void main(String[] args) {

        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0))); // -> 4 jumps
        System.out.println(jumpingOnClouds(List.of(0, 0, 0, 0, 1, 0))); // -> 3 jumps
        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 0))); // -> 6 jumps
        System.out.println(jumpingOnClouds(List.of(
                0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0,
                0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0))); // Expected output -> 28 jumps
    }
}
