package demo;

public class FibonacciSeries1 {
	public static void main(String[] args) {
		int a= 50,ft=0,sc=1;
		for (int i = 1; i < a; ++i) {
			System.out.println(ft);
			int next=ft+sc;
			ft=sc;
			sc=next;	
       }
	}
}