package javabasic;
//Base class with a method
class BaseClass {
 public void display() {
     System.out.println("Display method in BaseClass");
 }
}

//Derived class that overrides the method from BaseClass
class DerivedClass extends BaseClass {

 // This annotation indicates that this method overrides a method in the superclass.
 @Override
 public void display() {
     System.out.println("Display method in DerivedClass");
 }
}

public class AnnotationExample{
 public static void main(String[] args) {
     // Create an instance of DerivedClass
     DerivedClass derived = new DerivedClass();
     
     // Call the overridden method
     derived.display();
 }
}
