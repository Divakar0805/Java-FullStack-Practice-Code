package in;

import java.util.Scanner;

public class Palindrom {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0) {
			int last=num%10;
			rev=(rev*10)+last;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Given number is Palindrom");
		}else {
			System.out.println("Given number is Not a Palindrom");
		}
	}

}
