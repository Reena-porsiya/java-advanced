package collection;

import java.util.*;

public class SortedMapExample {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs of country and its capital
        SortedMap<String, String> capitals = new TreeMap<>();

        // Add key-value pairs to the SortedMap
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("UK", "London");
        capitals.put("France", "Paris");

        // Display the SortedMap
        System.out.println("SortedMap: " + capitals);

        // Access the value associated with a specific key
        String capitalOfIndia = capitals.get("India");
        System.out.println("Capital of India: " + capitalOfIndia);

        // Check if the SortedMap contains a specific key
        boolean containsUK = capitals.containsKey("UK");
        System.out.println("Contains UK: " + containsUK);

        // Remove a key-value pair from the SortedMap
        capitals.remove("France");
        System.out.println("SortedMap after removing France: " + capitals);

        // Get the size of the SortedMap
        System.out.println("Size of SortedMap: " + capitals.size());

        // Iterate over the SortedMap
        System.out.println("Iterating over SortedMap:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        // Clear all key-value pairs from the SortedMap
        capitals.clear();
        System.out.println("SortedMap after clearing: " + capitals);
    }
}

