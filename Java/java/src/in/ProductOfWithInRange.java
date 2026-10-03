package in;

import java.util.Scanner;

public class ProductOfWithInRange {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Statring value:");
		int str=sc.nextInt();
		System.out.println("Enter the Ending value:");
		int end=sc.nextInt();
		int prd=1;
		for(int i=str;i<=end;i++) {
			prd=prd*i;
		}
		System.out.println(prd);
	}

}
