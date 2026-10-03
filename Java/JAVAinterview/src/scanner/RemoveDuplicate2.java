package scanner;


import java.util.*;


public class RemoveDuplicate2 {

	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 2, 4, 3, 5, 4, 6, 8, 7, 5, 1 };
		int count=0;
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if(a[i]==Integer.MIN_VALUE)
				continue;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=Integer.MIN_VALUE;
					count++;
				}
			}
		}
		
		int[]res=new int[a.length-count];
		for (int i = 0,x=0; i <a.length; i++) {
			
			if(a[i]!=Integer.MIN_VALUE)
				res[x++]=a[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
