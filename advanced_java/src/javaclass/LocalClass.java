package javaclass;

public class LocalClass {
    void outerMethod() {
        class Local {
            void display() {
                System.out.println("Local Class");
            }
        }

        Local local = new Local();
        local.display();
    }

    public static void main(String[] args) {
    	LocalClass outer = new LocalClass();
        outer.outerMethod();
    }
}
