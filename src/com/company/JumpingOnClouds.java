package com.company;

public class JumpingOnClouds {

    public static int jumpingOnClouds(int k, int[] clouds) {

        int energy = 100, cloud = 0;

        while (true) {
            cloud = (cloud + k) % clouds.length;
            if (clouds[cloud] == 0)
                energy--;
            else
                energy -= 3;

            if (cloud == 0)
                return energy;
        }
    }

    public static void main(String[] args) {

        int[] clouds = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0}; // 1, 1, 1, 0, 1, 1, 0, 0, 0, 0 / k = 3 / Expected output: 80 Health remaining
//        int[] clouds = {0, 0, 1, 0, 0, 1, 1, 0}; // 0, 0, 1, 0, 0, 1, 1, 0 / k = 2 / Expected output: 92 Health remaining
        int energy = 100, distance = 2;

        System.out.println(jumpingOnClouds(3, clouds));






        for (int i = 0; i < clouds.length - distance; i++) {
            int jump = i + distance, numOfClouds = clouds.length;

            if (clouds[jump] % numOfClouds == 0) {
                energy = energy - 1;
            } else if (clouds[jump] % numOfClouds != 0) {
                energy = energy - 3;
            }
        }
//        System.out.println(health);
    }
}
