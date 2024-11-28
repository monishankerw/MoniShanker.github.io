package org.example.corejava.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class B {
    public static void main(String[] args) {
        // Create a list using ArrayList and Arrays.asList
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        // Obtain an iterator for the list
        Iterator<String> iterator = list.iterator();

        // Iterate over the list using the iterator
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);

            // Example: Remove element during iteration if it's "B"
            if ("B".equals(item)) {
                iterator.remove();
            }
        }

        // Print the list after removal
        System.out.println("List after removal: " + list);
    }
}