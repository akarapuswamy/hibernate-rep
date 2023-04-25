 package Demo;

public class FindFactorial {
	public static void main(String[] args) {
		int n =4;
		int results = factorial(n);
		System.out.println("factorial of " + n + " is " + results);
	}

	private static int factorial(int n) {
	     if (n==0) {
	    	 return 1;
		}else {
		return n * factorial(n-1);	
		}
		
	}

}
