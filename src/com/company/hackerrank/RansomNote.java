package com.company.hackerrank;

import java.util.*;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {

        Map<String, String> checkMagazine = new HashMap<>();
        Map<String, Integer> countOfWords = new HashMap<>();

        for (String m : magazine) {
            checkMagazine.put(m, m);
        }

        for (String n : note) {
            if (!countOfWords.containsKey(n)) {
                countOfWords.put(n, 0);
            }
            countOfWords.put(n, countOfWords.get(n) + 1);
        }

        for (String s : magazine) {

            for (Map.Entry<String, Integer> count : countOfWords.entrySet()) {

                if (!checkMagazine.containsValue(count.getKey())) {
                    System.out.println("No");
                    break;
                } else if (count.getValue() > 1) {
                    System.out.println("No");
                    break;
                } else if (!s.equals(count.getKey())) {
                    System.out.println("No");
                    break;
                } else {
                    System.out.println("Yes");
                    break;
                }
            }
            break;
        }
    }

    public static void main(String[] args) {

//        String mag = "attack at dawn", rNote = "Attack at dawn";
//        String mag = "ive got a lovely bunch of coconuts", rNote = "ive got some coconuts";
        String mag = "give me one grand today night", rNote = "give one grand today";
//        String mag = "two times three is not four", rNote = "two times two is four";
        List<String> magazine = new ArrayList<>(Arrays.asList(mag.split(" ")));
        List<String> noteR = new ArrayList<>(Arrays.asList(rNote.split(" ")));

        checkMagazine(magazine, noteR);

        HashMap<Integer, String> checkMagazine = new HashMap<>();
//        HashMap<Integer, String> ransomNote = new HashMap<>();


        for (int i = 0; i < magazine.size(); i++) {
            checkMagazine.put(i, magazine.get(i));
        }

        boolean check = false;

        for (String s : noteR) {

            for (String notes : checkMagazine.values()) {

                if (s.equals(notes)) {
                    check = true;
//                    System.out.println("Yes");
                } else {
                    check = true;
//                    System.out.println("No");
                }
            }
        }
    }
}
