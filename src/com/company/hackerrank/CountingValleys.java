package com.company.hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {


        return 0;

    }

    public static <Char> void main(String[] args) {

//        String path = "DDUUDDUDUUUD"; // 2 Valleys deep
        String path = "UDDDUDUU"; // 1 Valley deep
//        String path = "DDUUUUDD";

        HashMap<Character, Integer> countingValleys = new HashMap<>();

        int count = 0;
        for (int i = 0; i < path.length() - 1; i++) {

            if (path.charAt(i) == 'D' && path.charAt(i + 1) == 'D') {
                count++;
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
        System.out.println(countingValleys);
        System.out.println(count);


        String[] pathArray = path.split("");

        HashMap<String, Integer> valleyCount = new HashMap<>();

        for (String s : pathArray) {

//            valleyCount.put(s, Collections.frequency(List.of(pathArray), s));
        }
    }
}
