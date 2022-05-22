package com.company.hackerrank.dictionariesandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
    
    /*
    
    Solved
    
    */

    public static String twoStrings(String s1, String s2) {

        Map<String, String> subStrMap1 = new HashMap<>();
//        Map<String, String> subStrMap2 = new HashMap<>();

        for (String s : s1.split("")) {
            subStrMap1.put(s, s);
        }

        for (String s : s2.split("")) {
//            subStrMap2.put(s, s);
            if (subStrMap1.containsKey(s)) {
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
