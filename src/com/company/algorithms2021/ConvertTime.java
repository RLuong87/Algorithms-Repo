package com.company.algorithms2021;

public class ConvertTime {

    public static int hoursToSeconds(int hours) {

        return hours * 3600;
    }

    public static int minutesToSeconds(int minutes) {

        return minutes * 60;
    }

    public static void main(String[] args) {

        System.out.println(hoursToSeconds(40));
        System.out.println(minutesToSeconds(60));
    }
}
