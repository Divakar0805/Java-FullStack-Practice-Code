package scanner;

import java.util.Scanner;

public class SimpleIntrest1 {
	public static double calculateIntrest(double p, double r, double t) {
		double res = (p * r * t) / 100;
		return res;
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a principle:");
		double p = sc.nextDouble();
		System.out.println("Enter a Intrest:");
		double r = sc.nextDouble();
		System.out.println("Enter a Lenth of Year:");
		double t = sc.nextDouble();
		double result = calculateIntrest(p, r, t);

		System.out.println("SimpleIntrest Total=" + result);

	}

}
