package advanced_java;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList
        List<String> list = new CopyOnWriteArrayList<>();

        // Add some initial elements to the list
        list.add("A");
        list.add("B");
        list.add("C");

        // Start a thread to add elements to the list
        Thread writerThread = new Thread(new Writer(list));
        writerThread.start();

        // Start a thread to read elements from the list
        Thread readerThread = new Thread(new Reader(list));
        readerThread.start();

        try {
            // Wait for the threads to finish
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Writer implements Runnable {
    private final List<String> list;

    public Writer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Adding elements to the list
            list.add("Element " + i);
            System.out.println("Added: Element " + i);
            try {
                // Sleep for a while to simulate time taken to add elements
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Reader implements Runnable {
    private final List<String> list;

    public Reader(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Reading elements from the list
            System.out.println("Reading list: " + list);
            try {
                // Sleep for a while to simulate time taken to read elements
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
