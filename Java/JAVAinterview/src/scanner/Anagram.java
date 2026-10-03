package scanner;

import java.util.Arrays;

public class Anagram {


	public static boolean isAnagram(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[]a=s1.toCharArray();
		char[]b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
		
	}
	
	public static void main(String[] args) {
		String s1="Earth",s2="Heart";
		System.out.println(isAnagram(s1, s2));
	}
}
