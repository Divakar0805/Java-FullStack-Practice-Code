package life;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLife {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LifeConfig.class);
		LifeCycle l=(LifeCycle) context.getBean("l");
		l.save();
		context.close();
	}

}
