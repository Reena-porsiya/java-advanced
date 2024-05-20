package Threading;

//Define a class that implements the Runnable interface
class NumberPrinter implements Runnable {
 private String threadName;

 NumberPrinter(String threadName) {
     this.threadName = threadName;
 }

 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(threadName + ": " + i);
         try {
             // Sleep for a while to simulate some work and make output more readable
             Thread.sleep(500);
         } catch (InterruptedException e) {
             System.out.println(threadName + " interrupted.");
         }
     }
     System.out.println(threadName + " has finished.");
 }
}

public class MultithreadingExample {
 public static void main(String[] args) {
     // Create two instances of NumberPrinter with different thread names
     Runnable printer1 = new NumberPrinter("Thread 1");
     Runnable printer2 = new NumberPrinter("Thread 2");

     // Create two Thread objects with the Runnable instances
     Thread thread1 = new Thread(printer1);
     Thread thread2 = new Thread(printer2);

     // Start the threads
     thread1.start();
     thread2.start();

     // Optionally, wait for both threads to complete
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
     }

     System.out.println("Main thread has finished.");
 }
}
