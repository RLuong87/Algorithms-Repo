package com.company.dictionariesandhashmaps;

import java.util.*;

public class RansomNote {

    /*

    SOLVED

     */

    public static void checkMagazine(List<String> magazine, List<String> note) {

        Map<String, Integer> countOfWords = new HashMap<>();

        for (String m : magazine) {
            if (!countOfWords.containsKey(m)) {
                countOfWords.put(m, 0);
            }
            countOfWords.put(m, countOfWords.get(m) + 1);
        }

        for (String n : note) {

            if (countOfWords.containsKey(n)) {
                countOfWords.put(n, countOfWords.get(n) - 1);
            }
            if (countOfWords.get(n) < 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {

        String mag = "ive got a lovely bunch of coconuts", rNote = "ive got some coconuts";
//        String mag = "give me one grand today night", rNote = "give one grand today";
//        String mag = "two times three is not four", rNote = "two times two is four";
        List<String> magazine = new ArrayList<>(Arrays.asList(mag.split(" ")));
        List<String> note = new ArrayList<>(Arrays.asList(rNote.split(" ")));

        checkMagazine(magazine, note);
    }
}
