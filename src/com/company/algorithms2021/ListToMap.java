package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    /*
    List to map practice
     */

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alondra", 40));
        students.add(new Student(2, "Caroline", 35));
        students.add(new Student(3, "Armando", 25));
        students.add(new Student(4, "Richie", 15));

        //Converting a list to a Map using the stream and collect method
        Map<Integer, Student> studentMap = students.stream().collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println(studentMap);
    }
}

class Student {

    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + (gpa/10) +
                '}';
    }
}
