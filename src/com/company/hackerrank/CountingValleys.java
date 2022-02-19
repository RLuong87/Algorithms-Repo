package com.company.hackerrank;

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

        HashMap<Character, Integer> countingValleys = new HashMap<>();

        int count = 0;
        for (int i = 0; i < path.length() - 1; i++) {

            if (path.charAt(i) == 'D' && path.charAt(i + 1) == 'D') {
//                count++;
            }
            if (path.endsWith("DD")) {
//                path = path.substring(0, path.length() - 1);
                break;
            }

            if (!countingValleys.containsKey(path.charAt(i))) {
                countingValleys.put(path.charAt(i), 1);
            } else {
                countingValleys.put(path.charAt(i), countingValleys.get(path.charAt(i)) + 1);
            }
        }
//        System.out.println(countingValleys);
//        System.out.println(count);


        String[] pathArray = path.split("");

        for (int i = 0; i < pathArray.length - 1; i++) {

            if (Objects.equals(pathArray[i], "D") && Objects.equals(pathArray[i + 1], "D") && !pathArray[i].endsWith("DD")) {
                count++;
            }
        }
//        System.out.println(count);
    }
}
