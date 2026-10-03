package life;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("l")
public class LifeCycle {
	public void save() {
		System.out.println("Save logic!!!!!");
	}
	@PostConstruct
	public void init() {
		System.out.println("Connection Logic......");
		System.out.println("Hi this is init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Hi this is Destroy method");
	}
}
