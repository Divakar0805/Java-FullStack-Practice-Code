package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmployee {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Employee e=(Employee) context.getBean("e1");
		e.m1();
	}
}
