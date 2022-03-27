package com.company.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day11 {

    public static int hourGlass(List<List<Integer>> test) {

        int total = Integer.MIN_VALUE, hourGlass = Integer.MIN_VALUE;

        for (int i = 0; i < test.size(); i++) {

            for (int j = 0; j < test.get(i).size(); j++) {

                if ((j + 2) < 6 && (i + 2) < 6) {
                    hourGlass = test.get(i).get(j) + test.get(i).get(j + 1) + test.get(i).get(j + 2) + test.get(i + 1).get(j + 1) + test.get(i + 2).get(j) + test.get(i + 2).get(j + 1) + test.get(i + 2).get(j + 2);
                }
                if (hourGlass > total) {
                    total = hourGlass;
                }
            }
        }
        return total;
    }

    public static void displayList(List<List<Integer>> l) {

        for (List arr : l) {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {

        List<List<Integer>> test = new ArrayList<>();
        test.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        test.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        test.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        test.add(Arrays.asList(0, 0, 2, 4, 4, 0));
        test.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        test.add(Arrays.asList(0, 0, 1, 2, 4, 0));

        List<List<Integer>> test2 = new ArrayList<>();
        test2.add(Arrays.asList(-1, -1, 0, -9, -2, -2));
        test2.add(Arrays.asList(-2, -1, -6, -8, -2, -5));
        test2.add(Arrays.asList(-1, -1, -1, -2, -3, -4));
        test2.add(Arrays.asList(-1, -9, -2, -4, -4, -5));
        test2.add(Arrays.asList(-7, -3, -3, -2, -9, -9));
        test2.add(Arrays.asList(-1, -3, -1, -2, -4, -5));

        List<List<Integer>> test3 = new ArrayList<>();
        test3.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        test3.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        test3.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        test3.add(Arrays.asList(0, 9, 2, -4, -4, 0));
        test3.add(Arrays.asList(0, 0, 0, -2, 0, 0));
        test3.add(Arrays.asList(0, 0, -1, -2, -4, 0));

        displayList(test);
        System.out.println(hourGlass(test));
        System.out.println();

        displayList(test2);
        System.out.println(hourGlass(test2));

        System.out.println();
        displayList(test3);
        System.out.println(hourGlass(test3));

        int maxSum = Integer.MIN_VALUE, hourGlass = Integer.MIN_VALUE;

        for (int i = 0; i < test2.size(); i++) {

            for (int j = 0; j < test2.get(i).size(); j++) {

                if ((i + 2) < 6 && (j + 2) < 6) {
                    hourGlass = test2.get(i).get(j) + test2.get(i).get(j + 1) + test2.get(i).get(j + 2) + test2.get(i + 1).get(j + 1) + test2.get(i + 2).get(j) + test2.get(i + 2).get(j + 1) + test2.get(i + 2).get(j + 2);
                }
                if (hourGlass > maxSum) {
                    maxSum = hourGlass;
                }
            }
        }
        System.out.println(maxSum);
    }
}
