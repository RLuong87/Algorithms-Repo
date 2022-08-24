package com.company.hackerrank.interviewprepkit.IMPLEMENTATION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            int diff = Math.abs((int) Math.ceil(grade / 5) * 5 - grade);
            if (grade >= 38 && diff <= 2) {
                roundedGrades.add((int) (Math.ceil((grade + 4) / 5) * 5));
            } else {
                roundedGrades.add(grade);
            }
        }
        return roundedGrades;
    }

    public static void main(String[] args) {

        List<Integer> test1 = Arrays.asList(73, 67, 38, 33);
        System.out.println(gradingStudents(test1));
    }
}
