package javabasic;

import java.util.ArrayList;

public class PrintFirstStudent {
    public static void main(String[] args) {
     
        ArrayList<String> students = new ArrayList<>();
        students.add("Reena"); 
        students.add("Malar");
        students.add("Santhiya");
        students.add("Aruna");
        
        if (!students.isEmpty()) {
            String firstStudent = students.get(0);
           
            if (firstStudent != null && !firstStudent.trim().isEmpty()) {
                System.out.println("The first student is: " + firstStudent);
            } 
            else {
                System.out.println("The first element is null ");
            }
        } else {
            System.out.println("The student list is empty.");
        }
    }
}
