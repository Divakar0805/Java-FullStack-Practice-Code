package scanner;


import java.util.*;
import java.util.Set;

public class RemoveDuplicate1 {

	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 2, 4, 3, 5, 4, 6, 8, 7, 5, 1 };

		Set<Object> s = new LinkedHashSet<>();
		for (int i : a) {
			s.add(i);
		}
		System.out.println(s);
	}
}
