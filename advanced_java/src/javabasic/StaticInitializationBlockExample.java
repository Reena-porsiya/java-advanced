package javabasic;

public class StaticInitializationBlockExample {
    // Static variable
    public static int x;
 
    

    // Static initialization block
    static {
        System.out.println("Inside static initialization block");
        x = 10;
    }

    public static void main(String[] args) {
        // Accessing the static variable after initialization
        System.out.println("Value of x: " + x);
    }
}
