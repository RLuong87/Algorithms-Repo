package com.company.algorithms2021;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {

        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;
        } else isLeap = year % 4 == 0 && year % 100 != 0;
        return isLeap;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2009));
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(2020));
    }
}
