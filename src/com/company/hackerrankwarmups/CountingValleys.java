package com.company.hackerrankwarmups;

import java.util.*;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {

        int count = 0;

        String[] pathArray = path.split("");

        for (int i = 0; i < pathArray.length - 1; i++) {

            if (Objects.equals(pathArray[i], "D") && Objects.equals(pathArray[i + 1], "D") && !pathArray[i].endsWith("DD")) {
                count++;
            }
        }
        return count;
    }

    public static <Char> void main(String[] args) {

//        String path = "DDUUDDUDUUUD"; // 2 Valleys deep
//        String path = "UDDDUDUU"; // 1 Valley deep
        String path = "DDUUUUDD"; // 1 valley deep

        System.out.println(countingValleys(path.length(), path));

    }
}
