package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> strCount = new ArrayList<>();

        for (String query : queries) {
            if (strings.contains(query)) {
                strCount.add(Collections.frequency(strings, query));
            } else {
                strCount.add(0);
            }
        }
        return strCount;
    }

    public static void main(String[] args) {
        List<String> test = List.of("test", "hello", "test", "hello", "yes", "no");
        List<String> test2 = List.of("test", "hello", "yes", "no", "and");
        System.out.println(matchingStrings(test, test2));

        List<String> test3 = List.of("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf");
        List<String> test4 = List.of("abcde", "sdaklfj", "asdjf", "na", "basdn");
        System.out.println(matchingStrings(test3, test4));
    }
}
