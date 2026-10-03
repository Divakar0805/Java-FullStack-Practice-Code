package component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ComponentConfig.xml");
		 Student s=(Student) context.getBean("s1");
		    s.m1();
	}

}
