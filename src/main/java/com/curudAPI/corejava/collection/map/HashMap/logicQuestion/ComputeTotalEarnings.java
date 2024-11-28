package org.example.corejava.collection.map.HashMap.logicQuestion;

import java.util.HashMap;
import java.util.Map;

public class ComputeTotalEarnings {
    public static Map<Integer, Double> computeTotalEarnings(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        // Create a new map to store total earnings
        Map<Integer, Double> totalEarningsMap = new HashMap<>();

        // Iterate over entries in map1 (assuming map1 and map2 have the same keys)
        for (Map.Entry<Integer, Double> entry : map1.entrySet()) {
            Integer employeeId = entry.getKey();
            Double salary = entry.getValue();
            Double bonus = map2.getOrDefault(employeeId, 0.0); // Get bonus from map2 or default to 0.0

            // Compute total earnings
            Double totalEarnings = salary + bonus;

            // Store in totalEarningsMap
            totalEarningsMap.put(employeeId, totalEarnings);
        }

        return totalEarningsMap;
    }

    public static void main(String[] args) {
        // Example maps
        Map<Integer, Double> map1 = new HashMap<>();
        map1.put(1, 5000.0);
        map1.put(2, 6000.0);
        map1.put(3, 7000.0);

        Map<Integer, Double> map2 = new HashMap<>();
        map2.put(1, 1000.0);
        map2.put(3, 1500.0);
        map2.put(4, 2000.0);

        // Compute total earnings
        Map<Integer, Double> totalEarningsMap = computeTotalEarnings(map1, map2);

        // Print total earnings map
        System.out.println("Total Earnings Map:");
        for (Map.Entry<Integer, Double> entry : totalEarningsMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Total Earnings: " + entry.getValue());
        }
    }
}
