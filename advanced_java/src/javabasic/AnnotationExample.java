package javabasic;

import java.lang.annotation.*;

//Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodInfo {
 String author() default "Unknown";
 String date();
 int revision() default 1;
 String comments();
}

//Class with a method annotated with the custom annotation
public class AnnotationExample {

 @MethodInfo(author = "John", date = "2022-05-27", comments = "Sample method")
 public static void sampleMethod() {
     System.out.println("Executing sampleMethod...");
 }

 public static void main(String[] args) {
     // Get the annotation information at runtime
     try {
         // Retrieve the MethodInfo annotation of the sampleMethod
         MethodInfo methodInfo = AnnotationExample.class.getDeclaredMethod("sampleMethod").getAnnotation(MethodInfo.class);

         // Display the annotation information
         System.out.println("Author: " + methodInfo.author());
         System.out.println("Date: " + methodInfo.date());
         System.out.println("Revision: " + methodInfo.revision());
         System.out.println("Comments: " + methodInfo.comments());
     } catch (NoSuchMethodException e) {
         e.printStackTrace();
     }
 }
}
