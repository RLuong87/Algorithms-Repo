package com.company.algorithms2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganizingContainers {

    public static String organizingContainers(List<List<Integer>> container) {

        //TODO: things to try, use an incrementer to use as a key in a hashmap. As the list grows dynamically, create a method to handle multiple lists
        //TODO: Tally up the values of indices from 0 -> n-1, store in a hashmap or a list. Check if each item is equal to each other

        int diffTypeOfBalls = container.get(0).size();
        System.out.println("different number of balls = " + diffTypeOfBalls);

        HashMap<Integer, Integer> ballCount = new HashMap<>();

        int maxContainerSize = Integer.MIN_VALUE;
        int minContainerSize = Integer.MAX_VALUE;

        int totalValueInContainer = 0, ball = 0;
        for (int i = 0; i < container.size(); i++) {

            for (int j = 0; j < container.get(i).size(); j++) {
                ball = container.get(i).get(j); // current ball
                totalValueInContainer += ball; // Totaling all the balls inside a container

                System.out.println(ball);
                if (ballCount.containsKey(j)) { // checking if the ball(j) exists inside the hashmap
                    int amount = ball; // storing the balls(j) from i container into a variable
                    amount += ballCount.get(j); // get the balls and add it all together
                    ballCount.put(j, amount); // update the ball and put it in the map
                } else {
                    ballCount.put(j, ball); // if ball(j) does not exist, then put it in the map
                }
            }
            // 0, 1, 2, 3 = 6
            // 5, 1, 2, 3 = 11
            // if the number of balls exceeds the amount a container can hold
            if (totalValueInContainer != 0 && totalValueInContainer > maxContainerSize) {
                maxContainerSize = totalValueInContainer; // 6, 11
            }
            if (totalValueInContainer != 0 && totalValueInContainer < minContainerSize){
                minContainerSize = totalValueInContainer; // 6
            }
            totalValueInContainer = 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : ballCount.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
            }
        }

//        System.out.println("MaxContainer: " + maxContainerSize);
//        System.out.println("MinContainer: " + minContainerSize);
//        System.out.println("MaxNumber: " + max);
//        System.out.println("MinNumber: " + min);

        if (max <= maxContainerSize && min <= minContainerSize) {
            return "Possible";
        }
        return "Impossible";
    }

    public static void main(String[] args) {

        List<List<Integer>> containers = new ArrayList<>();

//        containers.add(List.of(997612619, 934920795, 998879231, 999926463));
//        containers.add(List.of(960369681, 997828120, 999792735, 979622676));
//        containers.add(List.of(999013654, 998634077, 997988323, 958769423));
//        containers.add(List.of(997409523, 999301350, 940952923, 993020546));
        containers.add(List.of(1, 4));
        containers.add(List.of(2, 3));

        System.out.println(organizingContainers(containers));


        /*
            997612619, 934920795, 998879231, 999926463
            960369681, 997828120, 999792735, 979622676
            999013654, 998634077, 997988323, 958769423
            997409523, 999301350, 940952923, 993020546
         */


//        System.out.println(container3);


        int totalOfZeroBalls = 0, totalOfOneBalls = 0;
        StringBuilder possible = new StringBuilder();

        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer> countList = new ArrayList<>();
        for (int i = 0; i < containers.size(); i++) {

            totalOfZeroBalls += containers.get(i).get(0);

            totalOfOneBalls += containers.get(i).get(1);

            count.put(0, totalOfOneBalls);
            count.put(1, totalOfZeroBalls);
        }
        countList.add(totalOfZeroBalls);
        countList.add(totalOfOneBalls);

        for (int i = 0; i < countList.size(); i++) {

            if (countList.get(0) <= countList.get(i)) {
//                System.out.println("Possible");
            } else {
//                System.out.println("Impossible");
            }

        }


//        System.out.println(containers);
//        System.out.println(totalOfZeroBalls);
//        System.out.println(totalOfOneBalls);


//        int total = container.get(0).get(1).stream


//        int index = 0;
////        int[] temp = new int[container.get(index).size()];
//        countList.add(container.get(index).size());
//
//        for (int i = 0; i < container.get(i).size(); i++){
//            int sum = 0;
//
//            for (int j = 0; j < container.size(); j++){
//                sum += container.get(i).get(j);
//
//            }
//            countList.set(index, sum);
//            index++;
//        }

    }
}
