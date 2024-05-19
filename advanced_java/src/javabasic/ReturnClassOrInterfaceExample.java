package javabasic;

//Interface representing a Shape
interface Shape {
 double area();
}

//Class representing a Circle
class Circle implements Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Method to calculate the area of the circle
 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}

//Class representing a Square
class Square implements Shape {
 private double side;

 // Constructor
 public Square(double side) {
     this.side = side;
 }

 // Method to calculate the area of the square
 @Override
 public double area() {
     return side * side;
 }
}

public class ReturnClassOrInterfaceExample {

 // Method to return a Shape object based on the given type
 public static Shape createShape(String type, double param) {
     if (type.equals("circle")) {
         return new Circle(param);
     } else if (type.equals("square")) {
         return new Square(param);
     } else {
         throw new IllegalArgumentException("Invalid shape type");
     }
 }

 public static void main(String[] args) {
     // Create a Circle object and calculate its area
     Shape circle = createShape("circle", 5);
     System.out.println("Area of the circle: " + circle.area());

     // Create a Square object and calculate its area
     Shape square = createShape("square", 4);
     System.out.println("Area of the square: " + square.area());
 }
}

