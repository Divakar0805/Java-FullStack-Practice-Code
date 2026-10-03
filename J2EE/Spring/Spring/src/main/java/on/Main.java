package on;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Person.xml");
		Person p=(Person) context.getBean("p1");
		System.out.println(p);
		
	}

}
