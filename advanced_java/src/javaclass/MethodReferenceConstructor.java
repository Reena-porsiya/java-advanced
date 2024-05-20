package javaclass;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class MethodReferenceConstructor {
    public static void main(String[] args) {
        // Using lambda expression
        PersonFactory factory1 = (name) -> new Person(name);
        Person person1 = factory1.create("John");
        person1.display();

        // Using method reference
        PersonFactory factory2 = Person::new;
        Person person2 = factory2.create("Alice");
        person2.display();
    }
}

interface PersonFactory {
    Person create(String name);
}
