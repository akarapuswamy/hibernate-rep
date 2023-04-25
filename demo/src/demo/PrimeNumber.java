package demo;
public class PrimeNumber {
	public static void main(String[] args) {
			int a = 100;
			int count = 0;
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println(i + " is primnumber");
				}
			}
		}
				}