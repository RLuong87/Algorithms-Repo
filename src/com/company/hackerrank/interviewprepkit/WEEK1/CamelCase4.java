package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String input = scan.nextLine();

            StringBuilder str = new StringBuilder();
            StringBuilder newStr = new StringBuilder();
            if (input.startsWith("S;M;") && input.endsWith("()")) {
                str.append(input.substring(4, input.length() - 2));
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (i != 0 && Character.isUpperCase(c)) {
                        newStr.append(' ');
                        newStr.append(Character.toLowerCase(c));
                    } else if (i == 0 && Character.isUpperCase(c)) {
                        newStr.append(' ');
                        newStr.append(Character.toLowerCase(c));
                    } else {
                        newStr.append(c);
                    }
                }
            } else if (input.startsWith("S;C;") || input.startsWith("S;V;")) {
                str.append(input.substring(4));
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (i != 0 && Character.isUpperCase(c)) {
                        newStr.append(' ');
                        newStr.append(Character.toLowerCase(c));
                    } else if (i == 0 && Character.isUpperCase(c)) {
                        newStr.append(' ');
                        newStr.append(Character.toLowerCase(c));
                    } else {
                        newStr.append(c);
                    }
                }
            } else if (input.startsWith("C;C;")) {
                str.append(input.substring(4));
                String[] arr = str.toString().split(" ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                }
                for (String s : arr) {
                    newStr.append(s);
                }
            } else if (input.startsWith("C;M;")) {
                str.append(input.substring(4));
                String[] arr = str.toString().split(" ");
                for (int i = 1; i < arr.length; i++) {
                    arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                }
                for (String s : arr) {
                    newStr.append(s);
                }
                newStr.append("()");
            } else {
                str.append(input.substring(4));
                String[] arr = str.toString().split(" ");
                for (int i = 1; i < arr.length; i++) {
                    arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                }
                for (String s : arr) {
                    newStr.append(s);
                }
            }
            // String[] arr = str.toString().split("(?=[A-Z])");
            System.out.println(newStr.toString().trim());
        }
        scan.close();
    }
}
