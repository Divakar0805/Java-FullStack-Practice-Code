package in;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProduct {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);
		Product p=(Product) context.getBean("p");
		System.out.println(p);
	}

}
