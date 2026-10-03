package Training;

public class P20 {
	public static void main(String[] args) {
		int n=3;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is a Prime");
		}
		else {
			System.out.println("It is not a Prime");
		}
	}
}
