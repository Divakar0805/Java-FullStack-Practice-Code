package inter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DinoConfig.class);
		JurassicPark park=(JurassicPark) context.getBean("j");
		park.getDinosaurSound();
	}

}
