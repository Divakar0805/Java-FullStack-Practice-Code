package javacreater;

import java.util.*;

public class Palindrome  {
	static Scanner sc= new Scanner(System.in);
	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		String res=reverse(s);
//		if(s.equals(res))
//			System.out.println("Pallindrome");
//		else
//			System.out.println("Not a Pallindrome");
		System.out.println(res);
	}
}
