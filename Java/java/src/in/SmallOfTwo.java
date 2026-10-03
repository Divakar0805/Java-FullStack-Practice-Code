package in;

import java.util.Scanner;

public class SmallOfTwo {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter FirstNumber:");
		int a=sc.nextInt();
		System.out.println("Enter SecondNumber:");
		int b=sc.nextInt();
		if(a<=b && b>=a) {
			System.out.println("a is Smaller");
		}else {
			System.out.println("b is Smaller");
		}
		}

}
