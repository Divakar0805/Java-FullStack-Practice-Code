package inter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t")
@Qualifier("tt")
public class Trex implements Dinosaur {
	public void Sound() {
		System.out.println("Trex Sound");
	}
}
