package javabasic;

public class VarargsExample {

    // Method with varargs
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        // Calling sum method with different number of arguments
        int sum1 = sum(1, 2, 3);
        System.out.println("Sum 1: " + sum1);  // Output: 6

        int sum2 = sum(10, 20, 30, 40, 50);
        System.out.println("Sum 2: " + sum2);  // Output: 150

        int sum3 = sum();  // No arguments
        System.out.println("Sum 3: " + sum3);  // Output: 0
    }
}
