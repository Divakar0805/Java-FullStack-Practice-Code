package map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("MapConfig.xml");
		Hotel h=(Hotel) context.getBean("h1");
		System.out.println(h);
	}

}
