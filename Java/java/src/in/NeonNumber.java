package in;

import java.util.Scanner;

public class NeonNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int sq = num * num;
		int sum = 0;
		while (sq > 0) {
			int last = sq % 10;
			sum = sum + last;
			sq = sq / 10;
		}
		if (sum == num) {
			System.out.println("Given number is Neon Number");
		} else {
			System.out.println("Given Number is Not a Neon Number");
		}
	}

}
//given number is 9
//9*9=81-->8+1=9