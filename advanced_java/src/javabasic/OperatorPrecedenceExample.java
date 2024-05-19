package javabasic;

public class OperatorPrecedenceExample {

    public static void main(String[] args) {
        int result1 = 10 + 2 * 5;      // Multiplication (*) has higher precedence than addition (+)
        int result2 = (10 + 2) * 5;    // Parentheses have higher precedence than multiplication (*)
        int result3 = 10 + 2 / 2;      // Division (/) has higher precedence than addition (+)
        int result4 = (10 + 2) / 2;    // Parentheses have higher precedence than division (/)
        int result5 = 10 * 2 + 5 % 3;  // Modulus (%) has higher precedence than multiplication (*) and addition (+)

        System.out.println("Result 1: " + result1);  // Output: 20
        System.out.println("Result 2: " + result2);  // Output: 60
        System.out.println("Result 3: " + result3);  // Output: 11
        System.out.println("Result 4: " + result4);  // Output: 6
        System.out.println("Result 5: " + result5);  // Output: 24
    }
}
