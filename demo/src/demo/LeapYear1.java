package demo;

public class LeapYear1 {
	public static void main(String[] args) {
		int year = 1999;
		if (year %400==0) {
			System.out.println(year+"is a leap year");	
		}else if (year%100==0) {
		}else {
			System.out.println("not a leap year");
		}
		
	}

}
