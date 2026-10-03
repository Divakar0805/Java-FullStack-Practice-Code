package tcs;

public class SumofNumber {
	    public static void main(String[] args) {
	        int N = 9875,
	sum=0;        
	while(N>0) {
	         sum=sum+N%10;
	N=N/10;
	        

	        }
	System.out.println(sum);
	    }
	

}
