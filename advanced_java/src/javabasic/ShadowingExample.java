package javabasic;

public class ShadowingExample {
    // Instance variable
    private int x = 10;

    public void display() {
        // Local variable with the same name as the instance variable
        int x = 20;

        System.out.println("Local variable x: " + x); // Prints the value of the local variable
        System.out.println("Instance variable x: " + this.x); // Prints the value of the instance variable
    }

    public static void main(String[] args) {
        ShadowingExample example = new ShadowingExample();
        example.display();
    }
}
