package scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s = "OppO";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {

		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return s.equals(rev);
	}
}
