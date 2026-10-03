package in;

public class FetchLastDegit {
	public static void main(String[] args) {
		int num=12345;
		int last=num%10;
		num=num/10;
		System.out.println(last);
		System.out.println(num);
	}

}
