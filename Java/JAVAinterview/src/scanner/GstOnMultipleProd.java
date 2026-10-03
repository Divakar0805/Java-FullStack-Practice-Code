package scanner;

import java.util.*;

public class GstOnMultipleProd {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Map<String,Double>m=new HashMap<>();
		double total_price=0;
		System.out.println("Enter Number of Product:");
		int count=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=count;i++) {
			System.out.println("Enter Product Name:");
			String name=sc.nextLine();
			System.out.println("Enter the Price:");
			double price=sc.nextDouble();
			sc.nextLine();
			total_price+=price;
			m.put(name, price);
		}
		double gst=total_price*0.18;
		double bill=total_price+gst;
		System.out.println("Total Bill:"+bill);
		System.out.println("GST:"+gst);
		System.out.println("Product:"+m);
	}
}
