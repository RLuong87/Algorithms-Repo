package com.company.algorithms2021;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LinkedList {

    public static void main(String[] args) {

        String[] items = {"apples", "noobs", "pwnge", "bacon", "goATS"};
        List<String> list1 = new java.util.LinkedList<>(Arrays.asList(items));

        String[] items2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new java.util.LinkedList<>(Arrays.asList(items2));

        list1.addAll(list2);

        printMe(list1);
        removeStuff(list1);
        printMe(list1);
        reverseMe(list1);

    }

    // printMe method
    private static void printMe(List<String> list) {
        for (String b : list) {
                System.out.printf("%s ", b);
            System.out.println();
        }
    }

    // removeStuff method
    private static void removeStuff(List<String> list) {
        list.subList(2, 5).clear();
    }

    //reverseMe method
    private static void reverseMe(List<String> list) {
        ListIterator<String> richie = list.listIterator(list.size());
        while (richie.hasPrevious())
            System.out.printf("%s ", richie.previous());
    }
}
