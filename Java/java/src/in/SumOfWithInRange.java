package in;

import java.util.Scanner;

public class SumOfWithInRange {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Starting value:");
		int str=sc.nextInt();
		System.out.println("Enter Ending value:");
		int end=sc.nextInt();
		int sum=0;
		for(int i=str;i<=end;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
