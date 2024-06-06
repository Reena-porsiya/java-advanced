package javabasic;

public class Recursion {

	// Recursive method to calculate factorial
	public static int factorial(int n) {
		// Base case: if n is 0 or 1, return 1
		if (n == 0 || n == 1) {
			return 1;
		} else {
			// Recursive case: n * factorial of (n-1)
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		// Test the function
		int result = factorial(5);
		System.out.println("Factorial of 5 is: " + result); // Output: 120
	}
}
