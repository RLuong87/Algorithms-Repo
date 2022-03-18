package com.company.dictionariesandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {

        Map<Integer, String> subStrMap1 = new HashMap<>();
        Map<Integer, String> subStrMap2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            subStrMap1.put(i, s1.substring(i, i + 1));
        }

        for (int i = 0; i < s2.length(); i++) {
            subStrMap2.put(i, s2.substring(i, i + 1));
        }

        for (String s: subStrMap1.values()) {
            if (subStrMap2.containsValue(s)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {

        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("aardvark", "apple"));
        System.out.println(twoStrings("hi", "world"));
        System.out.println(twoStrings("beetroot", "sandals"));
        System.out.println(twoStrings("zoo", "exit"));

    }
}
