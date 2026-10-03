package scanner;


import java.util.*;

public class Rotation {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		System.out.print("\t\t\tEnter n value:");
		int n=sc.nextInt();
		rotate(a, n);
	}
	
	public static void rotate(int[]a,int n) {
		System.out.println(Arrays.toString(a));
		for (int k = 1; k <=n; k++) {
			int frst=a[0];
			for (int i = 1; i < a.length; i++) {
				a[i-1]=a[i];
			}
			a[a.length-1]=frst;
		}
		System.out.println(Arrays.toString(a));
	}
}
