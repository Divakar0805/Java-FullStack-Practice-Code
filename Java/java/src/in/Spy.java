package in;

import java.util.Scanner;

public class Spy {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int prd=1;
		while(num>0) {
			int last=num%10;
			sum=sum+last;
			prd=prd*last;
			num=num/10;
		}
		if(prd==sum) {
			System.out.println("Given number is Spy");
		}else {
			System.out.println("Given number is Not a Spy");
		}
	}
}
