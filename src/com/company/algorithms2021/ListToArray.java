package com.company.algorithms2021;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {

        String[] stuff = {"babies", "watermelon", "melons", "fudge"};
        List<String> list = new java.util.LinkedList<>(Arrays.asList(stuff));

        list.add("pumpkin");
        list.add(0, "first thing");

        stuff = list.toArray(new String[0]);

        for (String s : stuff) {
//            System.out.printf("%s ", s);
        }

        String[] things = {"apples", "lemons", "geese", "bacon", "youtube"};
//        List<String> list1 = Arrays.asList(things);
//
//        Collections.sort(list1);
//        System.out.printf("%s\n", list1);
//
//        list1.sort(Collections.reverseOrder());
//        System.out.printf("%s ", list1);


        // create an array and convert to list
        Character[] array = {'p', 'w', 'n'};
        List<Character> cl = Arrays.asList(array);
        System.out.println("The list is: ");
        output(cl);

        // reverse and print out the list
        Collections.reverse(cl);
        System.out.println("After reverse: ");
        output(cl);

        // create a new array and a new list
        Character[] newArr = new Character[3];
        List<Character> listCopy = Arrays.asList(newArr);

        // copy contents of list into listCopy
        Collections.copy(listCopy, cl);
        System.out.println("Copy of list: ");
        output(listCopy);

        // fill collections with stuff
        Collections.fill(cl, 'X');
        System.out.println("After filling the list: ");
        output(cl);

    }

    // output method
    private static void output(List<Character> list) {
        for (Character thing: list) {
            System.out.printf("%s", thing);
            System.out.println();
        }
    }
}
