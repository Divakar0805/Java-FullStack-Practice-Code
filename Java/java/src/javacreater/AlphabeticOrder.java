package javacreater;

import java.util.*;

public class AlphabeticOrder {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		String s = sc.next();
		char[] s1 = s.toCharArray();
		Arrays.sort(s1);
		s = new String(s1);
		System.out.println("Alphabetic Order Of String:" + s);
	}

}
