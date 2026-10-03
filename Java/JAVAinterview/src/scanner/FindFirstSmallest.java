package scanner;

import java.util.Arrays;

public class FindFirstSmallest {

	public static void main(String[] args) {
		int[]a= {8,1,7,4,5,24,17,41,6};
		System.out.println(Arrays.toString(a));
		System.out.println(findFirstSmallest(a));
	}
	
	public static int findFirstSmallest(int[]a) {
		int smallest=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<smallest)
				smallest=a[i];
		}
		return smallest;
	}
}
