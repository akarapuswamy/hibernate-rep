package Demo;

public class ResverseNumber {
	public static void main(String[] args) {
		int num= 12345;
		int resvere=0;
		while (num!=0) {
			int remainder=num%10;
			resvere=resvere*10+remainder;
			num=num/10;
		}
		System.out.println(resvere);
	}

}
