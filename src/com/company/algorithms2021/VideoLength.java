package com.company;

public class VideoLength {

    /*
    Edabit Challenge https://edabit.com/challenge/9D39q2q9yAFCDM9da

    You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54").
    Create a function that takes the video length and return it in seconds.

    Examples:
    minutesToSeconds("01:00") ➞ 60

    minutesToSeconds("13:56") ➞ 836

    minutesToSeconds("10:60") ➞ -1

    Notes:
    The video length is given as a string.
    If the number of seconds is 60 or over, return -1 (see example #3).
    You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid)
     */

    public static int minutesToSeconds(String tm) {

        //String fm = tm.replaceAll("\\D+", ""); // This will ignore the colon with regex and take just the numbers
        String[] numArr = tm.split(":"); // Split the string of numbers
        int[] newNums = new int[2];
        int convertedNums = 0;

        for (int i = 0; i < numArr.length; i++) {
            newNums[i] = Integer.parseInt(numArr[i]);
            if (newNums[1] >= 60) {
                return -1;
            } else {
                convertedNums = (newNums[0] * 60) + newNums[1];
            }
        }
        return convertedNums;
    }

    public static void main(String[] args) {
        System.out.println(minutesToSeconds("13:56"));
        System.out.println(minutesToSeconds("01:00"));
        System.out.println(minutesToSeconds("10:60"));
    }
}
