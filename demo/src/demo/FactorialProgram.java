package demo;

public class FactorialProgram {
	public static void main(String[] args) {
		int n = 10;
		int result = factorial(n);
		System.out.println("Factorial of " + n + " is " + result);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1; // base case
		} else {
			return n * factorial(n - 1); // recursive case
		}	
	}
	}