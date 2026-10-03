package collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ZooConfig.class);
		Zoo z=(Zoo) context.getBean("z");
		System.out.println(z);
	}


}
