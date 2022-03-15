package com.company.dictionariesandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {

        Map<Integer, String> subStrMap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            subStrMap.put(i, s1.substring(i, i + 1));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (subStrMap.containsValue(s2.substring(i, i + 1))) {
                return "YES";
            }
        }
        System.out.println(subStrMap);
        return "NO";
    }

    public static void main(String[] args) {

        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("aardvark", "apple"));
        System.out.println(twoStrings("hi", "world"));
        System.out.println(twoStrings("beetroot", "sandals"));

    }
}
