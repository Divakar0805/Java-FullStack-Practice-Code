package bank;

import org.springframework.stereotype.Component;

@Component("b")
public class Balance implements Bank{
	public void balance() {
		System.out.println("100");
	}
}
