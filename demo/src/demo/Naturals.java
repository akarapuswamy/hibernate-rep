package demo;

public class Naturals {
	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		for (int i = 0; i <=num; i++) {
			sum+=i;	
		}
		System.out.println("The sum of first " + num + " natural numbers is " + sum);
	}
}
