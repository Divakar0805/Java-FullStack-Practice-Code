package com;

import org.springframework.stereotype.Component;

@Component("e1")
public class Employee {
	Employee(){
		System.out.println("Employee Constructor Called");
	}
	void m1() {
		System.out.println("hello world");
	}

}
