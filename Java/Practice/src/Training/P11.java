package Training;

public class P11 {
	public static void main(String[] args) {
		int n=153;
		int original=n;
		int temp=n;
		int count=0;
		int sum=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0) {
			int last=temp%10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power=power*last;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if(original==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a Armstrong");
		}
	}
}
