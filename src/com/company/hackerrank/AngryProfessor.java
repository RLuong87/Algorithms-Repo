package com.company.hackerrank;

import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {

        int onTime = 0;

        for (Integer integer : a) {

            if (integer <= 0) {
                onTime++;
            }
        }
        if (onTime < k) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {

        List<Integer> test = List.of(-1, -3, 4, 2);
        List<Integer> test2 = List.of(0, -1, 2, 1);
        List<Integer> test3 = List.of(-1, -3, -2, 4, 2);

        System.out.println(angryProfessor(3, test));
        System.out.println(angryProfessor(2, test2));
        System.out.println(angryProfessor(3, test3));

    }
}
