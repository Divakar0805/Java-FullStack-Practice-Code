package javacreater;

public class FirstCaps {
	static String conf(String s) {
		s=s.toLowerCase();
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(i==0) {
				s1=s1+Character.toUpperCase(c);
			}else {
				s1=s1+c;
			}
		}
		return s1;
	}
	public static void main(String[] args) {
		String s="hello world";
		String s1="";
		String arr[]=s.split(" ");
		for(String a:arr) {
			s1=s1+conf(a)+" ";
		}
		System.out.println(s1.trim());
	}

}
