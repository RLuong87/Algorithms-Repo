package com.company.algorithms2022;

import java.util.*;

public class LetterCount {

    public static List<Object> letterCount(String str) {

        Map<String, Integer> letCount = new HashMap<>();
        List<Object> countList = new ArrayList<>();
        for (String s: str.toUpperCase().split("")) {
            if (!letCount.containsKey(s)) {
                letCount.put(s, 1);
            } else {
                letCount.put(s, letCount.get(s) + 1);
            }
        }
        countList.add(letCount.entrySet());
        return countList;
    }

    public static void main(String[] args) {
        System.out.println(letterCount("Mississippi"));

        List<List<Object>> test = new ArrayList<>();
        test.add(List.of(1));
        test.add(List.of("H"));
    }
}
