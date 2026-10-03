package in;

import java.util.Scanner;

public class Fibonacci {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int f=1;
		int s=1;
		for(int i=1;i<=num;i++) {
			System.out.print(f+" ");
			int t=f+s;
			f=s;
			s=t;
		}
	}

}
