package Threading;

class Drop {
    // Message sent from producer to consumer
    private String message;
    // True if consumer should wait for producer to send message, false if producer should wait for consumer to retrieve message
    private boolean empty = true;

    public synchronized String take() {
        // Wait until the message is available
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
            }
        }
        // Toggle status
        empty = true;
        // Notify producer that status has changed
        notifyAll();
        return message;
    }

    public synchronized void put(String message) {
        // Wait until the message has been retrieved
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Toggle status
        empty = false;
        // Store message
        this.message = message;
        // Notify consumer that status has changed
        notifyAll();
    }
}

class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String[] messages = {
            "Message 1",
            "Message 2",
            "Message 3"
        };
        for (String message : messages) {
            drop.put(message);
            try {
                Thread.sleep(1000); // Simulate time taken to produce a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        drop.put("DONE");
    }
}

class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        for (String message = drop.take(); !message.equals("DONE"); message = drop.take()) {
            System.out.println("Received: " + message);
            try {
                Thread.sleep(1000); // Simulate time taken to process a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class GuardedBlocksExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        new Thread(new Producer(drop)).start();
        new Thread(new Consumer(drop)).start();
    }
}
