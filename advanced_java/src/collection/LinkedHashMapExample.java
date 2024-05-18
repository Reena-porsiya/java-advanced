package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 30);
        linkedHashMap.put(null, 40); // Adding null key
        linkedHashMap.put("Grapes", null); // Adding null value

        // Display the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Iterate over the LinkedHashMap
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get the initial default capacity of LinkedHashMap
        int initialCapacity = new LinkedHashMap<>().size();
        System.out.println("Initial default capacity of LinkedHashMap: " + initialCapacity);
    }
}
