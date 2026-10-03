package in;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("EmpConfig.xml");
		Employee e1=(Employee) context.getBean("e1");
		Employee e2=(Employee) context.getBean("e2");
		System.out.println(e1);
		System.out.println(e2);
	}

}
