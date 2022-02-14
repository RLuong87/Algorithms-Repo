package com.company;

import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(int distance, int[] clouds, int health) {

        // 0, 0, 1, 0, 0, 1, 1, 0 // Expected output: 92 Health remaining
        int cloud = 0;

        do {
            cloud = (cloud + distance) % clouds.length;
            if (clouds[cloud] == 0) {
                health = health - 1;
            } else {
                health = health - 3;
            }
        } while (cloud != 0);

        return health;
    }

    public static void main(String[] args) {

//        List<Integer> clouds = Arrays.asList(1, 1, 1, 0, 1, 1, 0, 0, 0, 0); // 1, 1, 1, 0, 1, 1, 0, 0, 0, 0 / Expected output: 80 Health remaining
        int[] clouds = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0}; // 0, 0, 1, 0, 0, 1, 1, 0 / Expected output: 80 Health remaining
        int health = 100, distance = 2;

        System.out.println(jumpingOnClouds(3, clouds, 100));


        for (int i = 0; i < clouds.length - distance; i++) {
            int jump = i + distance, numOfClouds = clouds.length;

            if (clouds[jump] % numOfClouds == 0) {
                health = health - 1;
            } else if (clouds[jump] % numOfClouds != 0) {
                health = health - 3;
            }
            i = jump - 1;
        }
//        System.out.println(health);
    }
}
