package in;

import java.util.Scanner;

public class CountIOfFactors {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				count++;
			}
			System.out.print(count+" ");
		}
	}

}
