package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
	    Object o=context.getBean("s1");
	    Student s=(Student) o;
	    s.m1();
	}

}
