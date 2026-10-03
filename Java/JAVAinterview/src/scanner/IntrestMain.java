package scanner;

import java.util.Scanner;

public class IntrestMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Amount:");
		double amount = sc.nextDouble();
		System.out.println("Enter the Duration:");
		double time=sc.nextDouble();
		System.out.println("Enter the Intrest:");
		double ratio=sc.nextDouble();
		Intrest i=null;
		System.out.println("1.Simple Intrest\n2.Compound Intrest");
		System.out.println("\t\t\tSelect Here:");
		int user=sc.nextInt();
		if(user==1)
			i=new SimpleIntrest();
		else if(user==2)
			i=new CompoundIntrest();
		
		System.out.println(i.calculateIntrest(amount, time, ratio));
	}
}
