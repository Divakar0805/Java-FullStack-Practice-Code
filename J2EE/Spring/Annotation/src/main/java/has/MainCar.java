package has;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCar {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CarConfig.class);
		Car c=(Car) context.getBean("c");
		System.out.println(c);
	}
}
