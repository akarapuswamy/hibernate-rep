package demo;

public class R {
	public static void main(String[] args) {
		int a=12345678;
		int res=0;
		while (a!=0) {
			int remainder=a%=10;
			res=res*10+remainder;
			a=a/10;	
		}
		System.out.println(res);
	}

}
