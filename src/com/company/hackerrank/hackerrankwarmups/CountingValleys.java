package com.company.hackerrank.hackerrankwarmups;

public class CountingValleys {

    /*

     ********************** S O L V E D *****************************

     */

    public static int countingValleys(int steps, String path) {

        int seaLevel = 0, count = 0;
        boolean isSeaLevel = true;

        for (int i = 0; i < path.length(); i++) {

            if (path.charAt(i) == 'D') {
                seaLevel--;
            } else {
                seaLevel++;
            }
            System.out.println(seaLevel);

            if (seaLevel < 0 && isSeaLevel) {
                count++;
                isSeaLevel = false;
            }

            if (seaLevel == 0) {
                isSeaLevel = true;
            }
        }
        System.out.print("Number of valleys entered: ");
        return count;
    }

    public static void main(String[] args) {

        String path = "DDUUDDUDUUUD"; // 2 Valleys deep
//        String path = "UDDDUDUU"; // 1 Valley deep
//        String path = "DDUUUUDD"; // 1 valley deep

        System.out.println(countingValleys(path.length(), path));

    }
}
