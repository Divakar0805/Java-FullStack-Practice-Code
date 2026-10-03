package in;

import java.util.Scanner;

public class ReverseTheNumber {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int rev=0;
		while(num>0) {
			int last=num%10;
			rev=(rev*10)+last;
			num=num/10;
		}
		System.out.println(rev);
	}
}
