package component;

import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
	Student(){
		System.out.println("Student constructor called");
	}
	public void m1() {
		System.out.println("hello world");
	}

}
