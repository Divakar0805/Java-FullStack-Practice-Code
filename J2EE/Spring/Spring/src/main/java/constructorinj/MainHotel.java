package constructorinj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHotel {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConstructorConfig.xml");
		Hotel h=(Hotel) context.getBean("h2");
		System.out.println(h);
	}

}
