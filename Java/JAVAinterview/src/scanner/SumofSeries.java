package scanner;
import java.util.Scanner;
public class SumofSeries {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter X:");
		int x = sc.nextInt();
		System.out.println("Enter N:");
		int n = sc.nextInt();
		double result = solve(x, n);
		System.out.println("Sum of Series=" + result);
	}
	private static double solve(int x, int n) {
		double sum = 1;
		for (int i = 1; i <= n; i++) {
			sum += (Math.pow(x, i) / findfactorial(i));
		}
		return sum;
	}
	private static double findfactorial(int n) {
		double ans = 1;
		for (int i = n; i >= 2; i--) {
			ans *= i;
		}
		return ans;
	}
}
