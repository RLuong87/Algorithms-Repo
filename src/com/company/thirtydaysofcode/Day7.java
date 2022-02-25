package com.company.thirtydaysofcode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day7 {

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt).toList();
//
//        for (int i = arr.size() - 1; i > 0 ; i--) {
//            System.out.print(arr.get(i));
//        }
//
//        bufferedReader.close();
//    }

    public static void main(String[] args) {

        int[] numbers = {1, 4, 3, 2};
        List<Integer> numbers2 = List.of(1, 2, 3, 4);

        displayNumbers(numbers2);
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {

            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }

    public static void displayNumbers(List<Integer> numbers) {

        for (int i = numbers.size() - 1; i >= 0; i--) {

            System.out.print(numbers.get(i));
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}
