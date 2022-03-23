package com.company.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day11 {

    public static int day11(List<List<Integer>> arr) {

        for (int i = 0; i < arr.size(); i++) {

            for (int j = 0; j < arr.get(i).size(); j++) {

                System.out.println(arr.get(i).get(j));
            }
        }
        return 0;
    }

    public static void diplayList(List<List<Integer>> l) {

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

        diplayList(test);

        int total = 0, hourGlass = 0;

        for (int i = 0; i < test.size(); i++) {


            for (int j = 0; j < test.get(i).size(); j++) {

                if ((j + 2) < 6 && (i + 2) < 6) {
//                    System.out.println(test.get(i).get(j));
                    hourGlass = test.get(i).get(j) + test.get(i).get(j + 1) + test.get(i).get(j + 2) + test.get(i + 1).get(j + 1) + test.get(i + 2).get(j) + test.get(i + 2).get(j + 1) + test.get(i + 2).get(j + 2);
                }
                if (hourGlass > total) {
                    total = hourGlass;
                }
            }
        }
        System.out.println();
//        System.out.println(hourGlass);
        System.out.println(total);
    }
}
