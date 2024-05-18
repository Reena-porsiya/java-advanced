package advanced_java;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample {

    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add some entries
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Display the ConcurrentMap
        System.out.println("Initial map: " + map);

        // Accessing an entry
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Using putIfAbsent to add a new key-value pair if the key is not already present
        map.putIfAbsent("Grapes", 4);
        System.out.println("Map after putIfAbsent: " + map);

        // Using computeIfAbsent to compute a value if the key is not already present
        map.computeIfAbsent("Mango", k -> 5);
        System.out.println("Map after computeIfAbsent: " + map);

        // Using computeIfPresent to compute a new value for an existing key
        map.computeIfPresent("Banana", (k, v) -> v + 10);
        System.out.println("Map after computeIfPresent: " + map);

        // Using replace to update the value of an existing key
        map.replace("Orange", 10);
        System.out.println("Map after replace: " + map);

        // Using remove to remove a key-value pair
        map.remove("Apple");
        System.out.println("Map after remove: " + map);

        // Using forEach to iterate over the map
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
