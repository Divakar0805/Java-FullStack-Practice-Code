package Training;

public class P10 {
	public static void main(String[] args) {
		int n=121;
		int original=n;
		int rev=0;
		while(n>0) {
			int last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		if(original == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
