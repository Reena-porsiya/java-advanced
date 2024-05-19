package javabasic;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overriding
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.sound();     // Output: Dog barks

        // Upcasting
        Animal anotherDog = new Dog();
        anotherDog.sound();  // Output: Dog barks (Dynamic method dispatch)
    }
}
