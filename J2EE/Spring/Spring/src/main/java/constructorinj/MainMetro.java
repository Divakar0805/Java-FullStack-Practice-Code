package constructorinj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMetro {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ConstructorConfig.xml");
		Metro m=(Metro) context.getBean("m1");
		System.out.println(m);
	}
}
