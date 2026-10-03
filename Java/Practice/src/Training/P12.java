package Training;

public class P12 {
	public static void main(String[] args) {
		int n=23579;
		int largest=0;
		while(n>0) {
			int digit=n%10;
			if(digit>largest) {
				largest=digit;
			}
			n=n/10;
		}
		System.out.println(largest);
	}
}
