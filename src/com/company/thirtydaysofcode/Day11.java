package com.company.thirtydaysofcode;

import java.util.ArrayList;
import java.util.List;

public class Day11 {



    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        arr.add(List.of(1, 1, 1));
        arr.add(List.of(0, 0, 0));
        arr.add(List.of(1, 0, 1));
        arr.add(List.of(1, 1, 1));
        arr.add(List.of(0, 0, 0));
        arr.add(List.of(1, 0, 1));


        System.out.println(arr);

    }
}
