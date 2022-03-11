package com.company.hackerrank;

public class JumpingOnCloudsRevisited {

    /*

     ********************** S O L V E D *****************************

     */

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

//        int[] clouds = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0}; // 1, 1, 1, 0, 1, 1, 0, 0, 0, 0 / k = 3 / Expected output: 80 Health remaining
        int[] clouds = {0, 0, 1, 0, 0, 1, 1, 0}; // 0, 0, 1, 0, 0, 1, 1, 0 / k = 2 / Expected output: 92 Health remaining

        System.out.println(jumpingOnClouds(2, clouds));

        int energy = 100, distance = 2;

        for (int cloud = 0; cloud < clouds.length; cloud++) {
            cloud = (cloud + distance) % clouds.length;

            if (clouds[cloud] == 0) {
                energy--;
            }

            if (clouds[cloud] == 1) {
                energy -= 3;
            }

            if (cloud == 0) {
                break;
            }
        }
        System.out.println(energy);
    }
}
