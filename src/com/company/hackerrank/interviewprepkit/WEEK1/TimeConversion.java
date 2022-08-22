package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.Arrays;

public class TimeConversion {

    public static String timeConversion(String s) {

        String str = s.replaceAll("\\D+", "");
        String sub = str.substring(0, 4);
        System.out.println(sub);
        int n;
        if (s.endsWith("PM") && !s.startsWith("12")) {
            n = Integer.parseInt(sub) + 1200;
            String timeStr = String.valueOf(n);
            s = timeStr.substring(0, 2) + ":" + timeStr.substring(2, 4) + s.substring(5, 8);
        } else if (s.endsWith("AM") && s.startsWith("12") && s.charAt(3) != '0') {
            n = Integer.parseInt(sub);
            int min = n - 1200;
            s = "00:" + String.valueOf(min) + ":" + s.substring(6, 8);
        } else if (s.endsWith("AM") && s.startsWith("12")) {
            n = Integer.parseInt(sub);
            int min = n - 1200;
            s = "00:" + "0" + String.valueOf(min) + ":" + s.substring(6, 8);
        } else if (s.startsWith("12") && s.endsWith("PM")) {
            return s.substring(0, 8);
        } else {
            return s.substring(0, 8);
        }
        return s;
    }

    public static void main(String[] args) {

        String test1 = "12:05:39AM";
//        System.out.println(timeConversion(test1));
        String test2 = "12:45:54PM";
//        System.out.println(timeConversion(test2));
        String test3 = "12:00:00AM";
//        System.out.println(timeConversion(test3));
        String test4 = "12:40:22AM";
//        System.out.println(timeConversion(test4));
        String test5 = "06:40:03AM";
        System.out.println(timeConversion(test5));
        String test6 = "04:59:59AM";
        System.out.println(timeConversion(test6));

    }
}
