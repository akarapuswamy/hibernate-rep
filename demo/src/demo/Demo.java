package demo;

public class Demo {
	public static void main(String[] args) {
		String name="RRUCHITHA";
		char[] ch=name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			for (int j = i+1; j < name.length(); j++) {
				if (ch[i]==ch[j]) {
					System.out.println(ch[j]);	
				}
			}
		}
	}
}