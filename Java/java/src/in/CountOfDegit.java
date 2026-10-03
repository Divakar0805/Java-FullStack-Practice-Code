package in;

import java.util.Scanner;

public class CountOfDegit {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}

}
