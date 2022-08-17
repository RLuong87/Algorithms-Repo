package com.company.hackerrank.interviewprepkit;

import java.util.ArrayList;
import java.util.List;

public class LeftRotations {

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        List<Integer> rotList = new ArrayList<>();

        for (int i = 0; i < d; i++) {
            rotList.add(a.get(i));
        }

        return rotList;
    }

    public static void main(String[] args) {


        List<Integer> test = List.of(1, 2, 3, 4, 5);
        System.out.println(rotLeft(test, 2));
        List<Integer> test2 = new ArrayList<>();
        int i = 2;

        for (int j = 0; j < i; j++) {
            test2.add(test.get(j));
        }
    }
}
