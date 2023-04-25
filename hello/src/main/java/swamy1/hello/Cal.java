package swamy1.hello;

public class Cal {
	public int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
	  Cal c = new Cal();
	  System.out.println(c.sum(10, 30));
	  int actual=c.sum(10, 50);
	  int expected = 30;
	  if(actual==expected) {
		  System.out.println("seccess");
	  }else {
		  System.out.println("false");
	  }
	}

}
