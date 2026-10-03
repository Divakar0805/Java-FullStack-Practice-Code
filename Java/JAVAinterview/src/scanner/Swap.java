package scanner;
import java.util.Arrays;
public class Swap {

	public static void main(String[] args) {
		int[]a= {0,1,0,0,1,1,0,1};
		int l=0,r=a.length-1;
		System.out.println(Arrays.toString(a));
		while(l<r) {
			//swap Cond
			if(a[l]==0 && a[r]==1) {
				int temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}		
			if(a[l]==1)
				l++;
			
			if(a[r]==0)
				r--;
		}
		System.out.println(Arrays.toString(a));
	}
}
