package javacreater;

import java.util.*;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[]= {10,20,50,27,68,77,88};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}

}
