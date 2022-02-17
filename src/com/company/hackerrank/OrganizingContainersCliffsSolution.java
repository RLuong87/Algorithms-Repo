package com.company.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganizingContainersCliffsSolution {

    public static String organizingContainers(List<List<Integer>> container) {

        HashMap<Integer, Integer> ballQtys = new HashMap<>();
        HashMap<Integer, Integer> containers = new HashMap<>();

        for (List<Integer> row : container) {
            int currentContainerCap = 0;

            for (int count = 0; count < row.size(); count++) {
                int ballQty = row.get(count);
                if (!ballQtys.containsKey(count)) {
                    ballQtys.put(count, 0);
                }
                ballQtys.put(count, ballQtys.get(count) + ballQty);
                currentContainerCap += ballQty;
            }

            if (!containers.containsKey(currentContainerCap)) {
                System.out.println(containers);
                containers.put(currentContainerCap, 0);
                System.out.println(containers);
            }
            containers.put(currentContainerCap, containers.get(currentContainerCap) + 1);
        }

        for (Integer qty : ballQtys.values()) {
            if (!containers.containsKey(qty)) {
                return "Impossible";
            }
            if (containers.get(qty) <= 0) {
                return "Impossible";
            }
            containers.put(qty, containers.get(qty) - 1);
        }
        return "Possible";
    }

    public static void main(String[] args) {

        List<List<Integer>> containers = new ArrayList<>();

        containers.add(List.of(1, 3, 1));
        containers.add(List.of(2, 1, 2));
        containers.add(List.of(3, 3, 3));
//        containers.add(List.of(997612619, 934920795, 998879231, 999926463));
//        containers.add(List.of(960369681, 997828120, 999792735, 979622676));
//        containers.add(List.of(999013654, 998634077, 997988323, 958769423));
//        containers.add(List.of(997409523, 999301350, 940952923, 993020546));

        System.out.println(organizingContainers(containers));

    }
}
