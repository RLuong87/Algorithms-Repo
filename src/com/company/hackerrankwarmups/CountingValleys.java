package com.company.hackerrankwarmups;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {

        int count = 0;
        path = path.substring(0, path.length() - 2);
        String[] p = path.split("");

        for (int i = 0; i < p.length - 1; i++) {

            if (p[i].equals("D") && p[i + 1].equals("D")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

//        String path = "DDUUDDUDUUUD"; // 2 Valleys deep
        String path = "UDDDUDUU"; // 1 Valley deep
//        String path = "DDUUUUDD"; // 1 valley deep

        System.out.println(countingValleys(path.length(), path));

    }
}
