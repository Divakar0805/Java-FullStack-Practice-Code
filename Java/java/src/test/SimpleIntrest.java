package test;
import java.util.*;

public class SimpleIntrest {
	static Scanner sc=new Scanner(System.in);
	public static double findSimpleIntrest(double p,double r,double t) {
		double result=(p*r*t)/100;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Principle:");
		double p=sc.nextDouble();
		System.out.println("Enter a ratio:");
		double r=sc.nextDouble();
		System.out.println("Enter a time:");
		double t=sc.nextDouble();
		System.out.println(findSimpleIntrest(p,r,t));
	}
}
