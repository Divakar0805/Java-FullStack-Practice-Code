package scanner;

import java.util.*;

public class EvenOrOdd {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		while(number>=2) {
			number-=2;
		}
		if(number==0)
			System.out.println("This is a Even");
		else
			System.out.println("This is a Odd");
	}
}
