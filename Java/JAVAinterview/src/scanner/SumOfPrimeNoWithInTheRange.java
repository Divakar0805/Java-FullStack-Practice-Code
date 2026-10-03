package scanner;
import java.util.Scanner;
public class SumOfPrimeNoWithInTheRange {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter start:");
		int start=sc.nextInt();
		System.out.print("Enter end:");
		int end=sc.nextInt();
		int sum=0;
		for (int i = start; i <=end; i++) {
			if(isPrime(i))
				sum+=i;
		}
		System.out.println(sum);
	}
	public static boolean isPrime(int number) {
		if(number==0||number==1)
			return false;
		for (int i = 2; i <number; i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
}
