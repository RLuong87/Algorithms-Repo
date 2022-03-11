package com.company.hackerrankwarmups;

import java.util.*;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {

        int count = 0;

        for (int i = 0; i < path.length() - 1; i++) {
            path = path.substring(0, steps - 2);

            if (path.charAt(i) == 'D' && path.charAt(i + 1) == 'D') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

//        String path = "DDUUDDUDUUUD"; // 2 Valleys deep
//        String path = "UDDDUDUU"; // 1 Valley deep
        String path = "DDUUUUDD"; // 1 valley deep

        System.out.println(countingValleys(path.length(), path));

    }
}
