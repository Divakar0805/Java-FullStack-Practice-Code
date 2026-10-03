package scanner;

public class Patt3 {

	public static void main(String[] args) {
		int n=4,x=1,y=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				
				if(i>=j) {
					System.out.print(x+" ");
					int temp=x;
					x=y;
					y=temp;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
