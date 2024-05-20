package javaclass;

public class NonStatic {
    class Inner {
        void display() {
            System.out.println("Inner Class");
        }
    }

    public static void main(String[] args) {
    	NonStatic outer = new NonStatic();
    	NonStatic.Inner inner = outer.new Inner();
        inner.display();
    }
}
