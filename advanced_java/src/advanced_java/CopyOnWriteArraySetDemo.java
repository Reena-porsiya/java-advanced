package advanced_java;

import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // 1. Initialization
        Set<String> cowSet = new CopyOnWriteArraySet<>();
        System.out.println("Initialized set: " + cowSet);

        // 2. Adding elements
        cowSet.add("Apple");
        cowSet.add("Banana");
        cowSet.add("Cherry");
        System.out.println("After adding elements: " + cowSet);

        // 3. Check for a specific element
        System.out.println("Contains 'Apple'? " + cowSet.contains("Apple"));

        // 4. Remove an element
        cowSet.remove("Banana");
        System.out.println("After removing 'Banana': " + cowSet);

        // 5. Iterate over the set
        Iterator<String> iterator = cowSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 6. Add element during iteration
        for (String item : cowSet) {
            if ("Apple".equals(item)) {
                cowSet.add("Dragonfruit");
            }
            System.out.println(item);
        }

        System.out.println("After adding 'Dragonfruit' during iteration: " + cowSet);
    }
}

