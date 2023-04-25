package Demo;

import java.util.Scanner;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = input.nextLine();
		String vowels = " ";
		String consonants = " ";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels += c;
			} else if (c >= 'a' && c <= 'z') {
				consonants += c;
			}
		}
		System.out.println("vowels:" + vowels);
		System.out.println("consonants:" + consonants);
	}
}
