package scanner;

import java.util.*;

public class Fibonic {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a count:");
		int count = sc.nextInt();
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 1; i <= count; i++) {
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}

}
