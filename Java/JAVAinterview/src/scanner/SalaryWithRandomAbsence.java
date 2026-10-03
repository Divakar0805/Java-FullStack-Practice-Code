package scanner;


import java.util.Random;
import java.util.Scanner;

public class SalaryWithRandomAbsence {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Random r=new Random();
		System.out.print("\t\t\tEnter Salary PerDay:");
		double sal_per_day=sc.nextDouble();
		
		int absent_day=r.nextInt(5);
		double lost_amount=absent_day*sal_per_day;
		double per_month=(sal_per_day*30)-lost_amount;
		System.out.println("Absent Days:"+absent_day);
		System.out.println("Lost Salary:"+lost_amount);
		System.out.println("Total Salary for this Month:"+per_month);
	}
}
