package scanner;

import java.util.Scanner;

public class IntrestFinder {

	static Scanner sc=new Scanner(System.in);

	public static double findCompoundIntrest(double p,double r,double t) {
		double ans=p*Math.pow((1+r/100),t);
		double ci=ans-p;
		return ci;
	}
	
	public static double findSimpleIntrest(double p,double r,double t) {
		return ((p*r*t)/100);
	}
	public static void main(String[] args) {
		System.out.print("Enter Principle:");
		double p=sc.nextDouble();
		
		double r=10;
		System.out.print("Enter Time:");
		double t=sc.nextDouble();
		System.out.println(findCompoundIntrest(p, r, t));
		System.out.println(findSimpleIntrest(p, r, t));
	}
}
