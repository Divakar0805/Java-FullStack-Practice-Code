package in;

import java.util.Scanner;

public class SumOfTheDegit {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		System.out.println(sum);
	}

}
//given number is 6
//1*2*3=6
//1+2+3=6