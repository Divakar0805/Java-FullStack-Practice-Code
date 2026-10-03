package no;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("BatchConfig.xml");
		Bathch b=(Bathch) context.getBean("b1");
		System.out.println(b);
	}

}
