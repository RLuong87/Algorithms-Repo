package com.company.hackerrank.interviewprepkit.WARMUPS;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int candleCount = 0;

        for (Integer candle : candles) {
            if (!countMap.containsKey(candle)) {
                countMap.put(candle, 1);
            } else {
                countMap.put(candle, countMap.get(candle) + 1);
            }
        }
        System.out.println(countMap);

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > candleCount) {
                candleCount = entry.getValue();
            }
        }
        return candleCount;
    }

    public static void main(String[] args) {

        List<Integer> test1 = List.of(4, 2, 4, 1);
        System.out.println(birthdayCakeCandles(test1));

        List<Integer> test2 = List.of(18, 90, 90, 13, 90, 75, 90, 8, 90, 43);
        System.out.println(birthdayCakeCandles(test2));
    }
}
