package javaclass;

public class StaticNestedClass {

	static class StaticNested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
    	StaticNestedClass.StaticNested nested = new StaticNestedClass.StaticNested();
        nested.display();
    }
}
