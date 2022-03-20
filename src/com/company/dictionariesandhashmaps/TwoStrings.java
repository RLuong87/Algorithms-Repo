package com.company.dictionariesandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
    
    /*
    
    Solved
    
    */

    public static String twoStrings(String s1, String s2) {

        Map<String, Integer> subStrMap1 = new HashMap<>();
        Map<String, Integer> subStrMap2 = new HashMap<>();

        for (String str1 : s1.split("")) {
            if (!subStrMap1.containsKey(str1)) {
                subStrMap1.put(str1, 0);
            }
            subStrMap1.put(str1, subStrMap1.get(str1) + 1);
        }

        for (String str2 : s2.split("")) {
            if (!subStrMap2.containsKey(str2)) {
                subStrMap2.put(str2, 0);
            }
            subStrMap2.put(str2, subStrMap2.get(str2) + 1);
        }

        for (String s : subStrMap1.keySet()) {
            if (subStrMap2.containsKey(s)) {
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
