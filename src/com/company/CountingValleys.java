package com.company;

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
//        String path = "UDDDUDUU"; // 1 Valley deep
        String path = "DDUUUUDD";

        boolean countValleys = false;
        int count = 0;
        for (int i = 0; i < path.length() - 1; i++) {

            if (path.charAt(i) == 'D' && path.charAt(i + 1) == 'D') {
                count++;
                countValleys = true;
            }
            if (path.charAt(i) != 'D' && path.charAt(i + 1) != 'D') {
            }
        }
        System.out.println(count);


        String[] pathArray = path.split("");

        HashMap<String, Integer> valleyCount = new HashMap<>();

        for (String s : pathArray) {

            valleyCount.put(s, Collections.frequency(List.of(pathArray), s));
        }

        int countOfValleys = 0;
        for (Map.Entry<String, Integer> entry : valleyCount.entrySet()) {
            if (entry.getKey().equals("D")) {
//                System.out.println(entry);

            }
        }
    }
}
