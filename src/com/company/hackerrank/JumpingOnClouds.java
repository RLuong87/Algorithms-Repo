package com.company.hackerrank;

import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {

        int countOfJumps = 0;

        for (int i = 0; i < c.size() - 1; i++) {

            if (c.get(i) % 2 == 0 && c.get(i + 1) % 2 == 0) {
                countOfJumps++;
            }
        }
        System.out.println(c);
        System.out.println(c.size());
        return countOfJumps;
    }

    public static void main(String[] args) {

        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)));
        System.out.println(jumpingOnClouds(List.of(0, 0, 0, 0, 1, 0)));
        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 0)));
        System.out.println(jumpingOnClouds(List.of(
                0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0,
                0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0))); //

    }
}
