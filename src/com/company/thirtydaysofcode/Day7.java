package com.company.thirtydaysofcode;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Day7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(""))
                .map(Integer::parseInt).toList();

        for (int i = arr.size() - 1; i >= 0; i--) {

            System.out.print(arr.get(i));
            if (i > 0) {
                System.out.print(" ");
            }
        }
        bufferedReader.close();
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
