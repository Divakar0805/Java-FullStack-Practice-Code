package inter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("g")
@Qualifier("gg")
public class Godzilla  implements Dinosaur{
	@Override
	public void Sound() {
		System.out.println("Godzilla Sound🦍🦍🦍🦍🦍🦍🦍");
	}

}
