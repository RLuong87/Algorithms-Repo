package com.company.algorithms2021;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

//        System.out.println(fact(7));

        String[] words = {"funk", "chunk", "furry", "baconator"};

        //startsWith() method
        for (String w : words) {
            if (w.startsWith("fu")) ;
//                System.out.println(w + " starts with fu");
        }

        //endsWith() method
        for (String w : words) {
            if (w.endsWith("unk")) ;
//                System.out.println(w + " ends with unk");
        }

        String s = "buckyrobertsbuckyroberts";
        // starts from index 5 and searches for character 'x'
        // will return -1(false) because character 'x' does not exist in String s
//        System.out.println(s.indexOf('x', 5));
        // starts searching for the string "rob" from index 10 and so on
//        System.out.println(s.indexOf("rob", 10));

        String[] items = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<>();

        Collections.addAll(list1, items);

        for (String element : list1) {
//            System.out.printf("%s ", element);
        }

        String[] moreItems = {"lasers", "hats"};
        List<String> list2 = new ArrayList<>();

        Collections.addAll(list2, moreItems);

        for (String item : list2) {
//            System.out.printf("%s ", item);
        }

        editList(list1, list2);
        System.out.println();

        for (String value : list1) {
            System.out.printf("%s ", value);
        }
    }

    public static void editList(Collection<String> l1, Collection<String> l2) {
        l1.removeIf(l2::contains);
    }

    public static int fact(int n) {
        if (n <= 1)
            return 1;
        else return n * fact(n - 1);
    }
}
