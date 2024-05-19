package javabasic;

public class PrimitiveDataTypeExample {

    // Method to swap two integers
    public static void swapIntegers(int a, int b) {
        System.out.println("Before swapping - a: " + a + ", b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping - a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Before method call - x: " + x + ", y: " + y);
        swapIntegers(x, y);
        System.out.println("After method call - x: " + x + ", y: " + y);
    }
}
