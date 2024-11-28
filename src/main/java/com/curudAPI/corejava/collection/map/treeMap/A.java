package org.example.corejava.collection.map.treeMap;

import java.util.Map;
import java.util.TreeMap;

    public class A {
    public static void main(String[] args) {
        // Create a TreeMap instance
        Map<Integer, String> x = new TreeMap<>();
        // Put some key-value pairs into the TreeMap
        x.put(2, "B");
        x.put(3, "C");
        x.put(1, "A");
        // Not Thread Safe and Not Synchronized:
        // Print the TreeMap, which will be sorted by keys in ascending order
        System.out.println(x); // Output: {1=A, 2=B, 3=C}
        // Demonstrate that TreeMap does not allow null keys
        try {
            x.put(null, "D");
        } catch (NullPointerException e) {
            System.out.println("TreeMap does not allow null keys."); // Output: TreeMap does not allow null keys.
        }

        // Demonstrate that TreeMap allows multiple null values
        x.put(4, null);
        x.put(5, null);
        System.out.println(x); // Output: {1=A, 2=B, 3=C, 4=null, 5=null}

        // Demonstrate entrySet method
        for (Map.Entry<Integer, String> entry : x.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
