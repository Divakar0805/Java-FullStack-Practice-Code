package bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("s")
public class SBI {
	@Autowired
	private Balance b;
	void getBankBalance() {
		b.balance();
	}
	

}
