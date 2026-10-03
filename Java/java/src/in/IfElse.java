package in;

import java.util.Scanner;

public class IfElse {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		int i=sc.nextInt();
		if(i%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}

}
