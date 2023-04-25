package Demo;

public class RS {
	public static void main(String[] args) {
		int num = 12345678;
		int resver=0;
		while (num!=0) {
			int remainder=num%10;
			resver=resver*10+remainder;
			num=num/10;
		}
		System.out.println(resver);
	}

}
