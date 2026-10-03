package javacreater;

public class FirstCapital {
	public static void main(String[] args) {
		String s="hello world";
		String result="";
		boolean upper=true;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(upper && c!=' ') {
				result=result+Character.toUpperCase(c);
				upper=false;
			}
			else if(c==' ') {
				upper=true;
				result+=c;
			}else {
				result=result+c;
			}
		}
		System.out.println(result);
	}

}
