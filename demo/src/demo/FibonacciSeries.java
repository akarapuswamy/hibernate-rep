package demo;
public class FibonacciSeries {
	public static void main(String[] args) {
		int a=30, firstterm=0,secondterm=1;
		for (int i = 1; i < a; ++i) {
			System.out.println(firstterm);	
		int nextterm=firstterm+secondterm;
		firstterm=secondterm;
		secondterm=nextterm;
}
}
}