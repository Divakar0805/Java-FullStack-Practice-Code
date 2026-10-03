package javacreater;

public class LargestWord {
	public static void main(String[] args) {
		String s="hello programming world";
		String arr[]=s.split(" ");
		String lar=arr[0];
		for(String a:arr) {
			if(a.length()>lar.length()) {
				lar=a;
			}
		}
		System.out.println(lar);
	}

}
