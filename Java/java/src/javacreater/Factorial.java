package javacreater;

import java.util.Scanner;

public class Factorial {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter a Number:");
	int num=sc.nextInt();
	long res=1;
	for(int i=1;i<=num;i++) {
		res=res*i;
	}
	System.out.println("Factorial of Number:"+res);
	}
	
}
